package com.lemonlab.learnturkish

import android.animation.Animator
import android.content.DialogInterface
import android.content.Intent
import android.media.MediaPlayer
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.google.android.gms.ads.AdRequest
import kotlinx.android.synthetic.main.quiz_listen.*
import com.lemonlab.learnturkish.data.QuizData
import com.lemonlab.learnturkish.keys.Keys
import com.lemonlab.learnturkish.module.question_letter_word
import com.lemonlab.learnturkish.R

class ListenQuiz : AppCompatActivity() {

    lateinit var question_data:ArrayList<question_letter_word>
    var sound:Int? = null
    var index = 0
    var score = 0
    var prog_change = 0
    var type:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_listen)

        // init adview

        var request = AdRequest.Builder().build()
        adView.loadAd(request)


        type = intent?.extras?.getString(Keys.QUIZ_TYPE)!!

        getQuestions()
        setQuesstion(index)

        question_sound_btn.progress = 0.0f

        question_sound_btn.setOnClickListener {
            var player = MediaPlayer.create(this, sound!!)
            question_sound_btn.playAnimation()
            player.start()
            player.setOnCompletionListener {
                it.release()
                question_sound_btn.resumeReverseAnimation()
            }
        }

        next_btn.setOnClickListener {

            // play sound effect
            playSoundClick()

            // check if user select one option at least

            if(!checkIfOneIsCheckedAtLeast() && index <= question_data.size - 1){
                Toast.makeText(this, "اختر الاجابة الصيحية للانتقال", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // check if user select the correct answer


            if(index < question_data.size){
                if (checkIfCorrect(index)){
                    Toast.makeText(this, "True", Toast.LENGTH_SHORT).show()
                    score++
                    letter_quiz_progress.progress = letter_quiz_progress.progress + prog_change
                    letter_quiz_progress.secondaryProgress += prog_change
                }
                else{ // help user to select the correct answer

                    with(selectedRadioButton()!!.animate()){
                        alpha(0.5f)
                    }
                    selectedRadioButton()!!.setTextColor(resources.getColor(R.color.red))
                    Toast.makeText(this, "إجابة خاطئة", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                index++
                setQuesstion(index)

            }else if(index >= question_data.size){ // user solve all problems
                showResult()
            }
        }

        // exit quiz

        exit_btn.setOnClickListener {
            // ask user before close this activity
            var dialog:AlertDialog.Builder? = null

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                dialog = AlertDialog.Builder(this, android.R.style.Theme_Material_Dialog_Alert)
            }else{
                dialog = AlertDialog.Builder(this)
            }

            dialog.setTitle("تاكيد")
            dialog.setMessage("هل تريد الخروج من الاختبار؟")
            dialog.setPositiveButton("نعم", DialogInterface.OnClickListener{ dialogInterface: DialogInterface, i: Int ->
                this@ListenQuiz.finish()
            })
            dialog.setNegativeButton("لا", DialogInterface.OnClickListener{
                dialog, which ->
                dialog.cancel()
            })

            dialog.show()
        }

    }

    fun getQuestions(){

        // select data set

        if (type == Keys.LESSON_ONE){
            question_data =  QuizData.letters_question_data

        }else if (type == Keys.LESSON_TWO){
            question_data =  QuizData.words_question_data
        }else if (type == Keys.LESSON_THREE){
            question_data = QuizData.lesson_three_data
        }else if (type == Keys.LESSON_FOUR){
            question_data = QuizData.lesson_four_data
        }else if (type == Keys.LESSON_FIVE){
            question_data = QuizData.lesson_five_data
        }else if (type == Keys.LESSON_SIX){
            question_data = QuizData.lesson_six_data
        }else if (type == Keys.LESSON_SEVEN){
            question_data = QuizData.lesson_seven_data
        }else if (type == Keys.LESSON_EIGHT){
            question_data = QuizData.lesson_eight_data
        }

        letter_quiz_progress.max = 100.0f
        prog_change = (letter_quiz_progress.max /question_data.size).toInt()
        letter_quiz_progress.secondaryProgress = letter_quiz_progress.max
        Log.i("LetterQuiz", "prog_change: ${prog_change}")
        Log.i("LetterQuiz", "letter_quiz_progress.max: ${letter_quiz_progress.max}")
        Log.i("LetterQuiz", "letter_quiz_progress.secondaryProgress: ${letter_quiz_progress.secondaryProgress}")
    }

    fun setQuesstion(index:Int){

        clearColor() // reset default colors for_word radio buttons

        if(index >= question_data.size){
            next_btn.text = "النتيجة"
            quiz_card_view.visibility = View.GONE
            quiz_compelte_view.visibility = View.VISIBLE
            quiz_compelte_view.playAnimation()

            Toast.makeText(this, "اضغط على النتيجة للحصول على النقاط", Toast.LENGTH_SHORT).show()

            return
        }

        sound = question_data[index].sound
        var options = question_data[index].options
        radio_ans_btn1.text = options[0]
        radio_ans_btn2.text = options[1]
        radio_ans_btn3.text = options[2]
        radio_ans_btn4.text = options[3]

        // play fade out animation after that play fade on animation with new content
        YoYo.with(Techniques.SlideOutLeft).withListener(object:Animator.AnimatorListener{
            override fun onAnimationRepeat(animation: Animator?) {

            }

            override fun onAnimationEnd(animation: Animator?) {
                YoYo.with(Techniques.SlideInRight).duration(300).playOn(quiz_card_view)
            }

            override fun onAnimationCancel(animation: Animator?) {

            }

            override fun onAnimationStart(animation: Animator?) {

            }


        }).duration(300).playOn(quiz_card_view)
    }

    fun checkIfCorrect(index:Int):Boolean{

        var radio_btn_index:Int = 0

        if (radio_ans_btn1.isChecked){
            radio_btn_index = 0
        }else if(radio_ans_btn2.isChecked){
            radio_btn_index = 1
        }else if(radio_ans_btn3.isChecked){
            radio_btn_index = 2
        }else if(radio_ans_btn4.isChecked){
            radio_btn_index = 3
        }

        return radio_btn_index == question_data[index].answer
    }

    fun checkIfOneIsCheckedAtLeast():Boolean{

        var result = false
        if (radio_ans_btn1.isChecked){
            result = true
            return result
        }else if(radio_ans_btn2.isChecked){
            result = true
            return result
        }else if(radio_ans_btn3.isChecked){
            result = true
            return result
        }else if(radio_ans_btn4.isChecked){
            result = true
            return result
        }

        return false
    }

    fun selectedRadioButton():RadioButton?{
        if (radio_ans_btn1.isChecked){
            return radio_ans_btn1
        }else if(radio_ans_btn2.isChecked){
            return radio_ans_btn2
        }else if(radio_ans_btn3.isChecked){
            return radio_ans_btn3
        }else if(radio_ans_btn4.isChecked){
            return radio_ans_btn4
        }
        return null
    }

    fun clearColor(){
        radio_ans_btn1.setTextColor(resources.getColor(R.color.black))
        radio_ans_btn1.alpha = 1f
//        radio_ans_btn1.isSelected = false_word

        radio_ans_btn2.setTextColor(resources.getColor(R.color.black))
        radio_ans_btn2.alpha = 1f
//        radio_ans_btn2.isSelected = false_word

        radio_ans_btn3.setTextColor(resources.getColor(R.color.black))
        radio_ans_btn3.alpha = 1f
//        radio_ans_btn3.isSelected = false_word

        radio_ans_btn4.setTextColor(resources.getColor(R.color.black))
        radio_ans_btn4.alpha = 1f
//        radio_ans_btn4.isSelected = false_word
    }

    fun showResult(){
        var intent = Intent(this, ResultActivity::class.java)
        intent.putExtra(Keys.RESULT_SCORE, score)
        intent.putExtra(Keys.LESSON_TYPE, type)
        startActivity(intent)
        this.finish()
    }

    fun playSoundClick(){
        var player = MediaPlayer.create(this, R.raw.click)
        player.start()
        player.setOnCompletionListener {
            it.release()
        }
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
    }

}
