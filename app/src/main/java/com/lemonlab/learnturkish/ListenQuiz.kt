package com.lemonlab.learnturkish

import android.animation.Animator
import android.content.DialogInterface
import android.content.Intent
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.google.android.gms.ads.AdRequest
import com.lemonlab.learnturkish.data.QuizData
import com.lemonlab.learnturkish.keys.Keys
import com.lemonlab.learnturkish.module.QuestionsLetterWord
import kotlinx.android.synthetic.main.quiz_listen.*

class ListenQuiz : AppCompatActivity() {

    private lateinit var questionData: ArrayList<QuestionsLetterWord>
    var sound: Int? = null
    private var index = 0
    private var score = 0
    private var progChange = 0
    var type: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_listen)

        // init adview

        val request = AdRequest.Builder().build()
        adView.loadAd(request)


        type = intent?.extras?.getString(Keys.QUIZ_TYPE)!!

        getQuestions()
        setQuestion(index)

        question_sound_btn.progress = 0.0f

        question_sound_btn.setOnClickListener {
            val player = MediaPlayer.create(this, sound!!)
            question_sound_btn.playAnimation()
            player.start()
            player.setOnCompletionListener {
                it.release()
                question_sound_btn.reverseAnimationSpeed()
            }
        }

        next_btn.setOnClickListener {

            // play sound effect
            playSoundClick()

            // check if user select one option at least

            if (!checkIfOneIsCheckedAtLeast() && index <= questionData.size - 1) {
                Toast.makeText(this, "اختر الاجابة الصيحية للانتقال", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // check if user select the correct answer


            if (index < questionData.size) {
                if (checkIfCorrect(index)) {
                    Toast.makeText(this, "True", Toast.LENGTH_SHORT).show()
                    score++
                    letter_quiz_progress.progress = letter_quiz_progress.progress + progChange
                    letter_quiz_progress.secondaryProgress += progChange
                } else { // help user to select the correct answer

                    with(selectedRadioButton()!!.animate()) {
                        alpha(0.5f)
                    }
                    selectedRadioButton()!!.setTextColor(ContextCompat.getColor(applicationContext, R.color.red))
                    Toast.makeText(this, "إجابة خاطئة", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                index++
                setQuestion(index)

            } else if (index >= questionData.size) { // user solve all problems
                showResult()
            }
        }

        // exit quiz

        exit_btn.setOnClickListener {
            // ask user before close this activity

            val dialog: AlertDialog.Builder = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                AlertDialog.Builder(this, android.R.style.Theme_Material_Dialog_Alert)
            } else {
                AlertDialog.Builder(this)
            }

            dialog.setTitle("تاكيد")
            dialog.setMessage("هل تريد الخروج من الاختبار؟")
            dialog.setPositiveButton("نعم") { _: DialogInterface, _: Int ->
                this@ListenQuiz.finish()
            }
            dialog.setNegativeButton("لا") { theDialog, _ ->
                theDialog.cancel()
            }

            dialog.show()
        }

    }

    private fun getQuestions() {

        // select data set
        Log.i("ListenQuiz", "lesson type: $type")
        when (type) {
            Keys.LESSON_ONE -> questionData = QuizData.letters_question_data
            Keys.LESSON_TWO -> questionData = QuizData.words_question_data
            Keys.LESSON_THREE -> questionData = QuizData.lesson_three_data
            Keys.LESSON_FOUR -> questionData = QuizData.lesson_four_data
            Keys.LESSON_FIVE -> questionData = QuizData.lesson_five_data
            Keys.LESSON_SIX -> questionData = QuizData.lesson_six_data
            Keys.LESSON_SEVEN -> questionData = QuizData.lesson_seven_data
            Keys.LESSON_EIGHT -> questionData = QuizData.lesson_eight_data
            Keys.LESSON_NINE -> questionData = QuizData.lesson_nine_data
            Keys.LESSON_TEN -> questionData = QuizData.lesson_ten_data
            Keys.LESSON_ELEVEN -> questionData = QuizData.lesson_eleven_data
        }


        Log.i("ListenQuiz", "lesson data size: ${questionData.size}")

        letter_quiz_progress.max = 100.0f
        progChange = (letter_quiz_progress.max / questionData.size).toInt()
        letter_quiz_progress.secondaryProgress = letter_quiz_progress.max
        Log.i("LetterQuiz", "progChange: $progChange")
        Log.i("LetterQuiz", "letter_quiz_progress.max: ${letter_quiz_progress.max}")
        Log.i("LetterQuiz", "letter_quiz_progress.secondaryProgress: ${letter_quiz_progress.secondaryProgress}")
    }

    private fun setQuestion(index: Int) {

        clearColor() // reset default colors for_word radio buttons

        if (index >= questionData.size) {
            next_btn.text = "النتيجة"
            quiz_card_view.visibility = View.GONE
            quiz_compelte_view.visibility = View.VISIBLE
            quiz_compelte_view.playAnimation()

            Toast.makeText(this, "اضغط على النتيجة للحصول على النقاط", Toast.LENGTH_SHORT).show()

            return
        }

        sound = questionData[index].sound
        val options = questionData[index].options
        radio_ans_btn1.text = options[0]
        radio_ans_btn2.text = options[1]
        radio_ans_btn3.text = options[2]
        radio_ans_btn4.text = options[3]

        // play fade out animation after that play fade on animation with new content
        YoYo.with(Techniques.SlideOutLeft).withListener(object : Animator.AnimatorListener {
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

    private fun checkIfCorrect(index: Int): Boolean {

        var radioButtonIndex = 0

        when {
            radio_ans_btn1.isChecked -> radioButtonIndex = 0
            radio_ans_btn2.isChecked -> radioButtonIndex = 1
            radio_ans_btn3.isChecked -> radioButtonIndex = 2
            radio_ans_btn4.isChecked -> radioButtonIndex = 3
        }

        return radioButtonIndex == questionData[index].answer
    }

    private fun checkIfOneIsCheckedAtLeast(): Boolean {

        val result: Boolean
        when {
            radio_ans_btn1.isChecked -> {
                result = true
                return result
            }
            radio_ans_btn2.isChecked -> {
                result = true
                return result
            }
            radio_ans_btn3.isChecked -> {
                result = true
                return result
            }
            radio_ans_btn4.isChecked -> {
                result = true
                return result
            }
            else -> return false
        }

    }

    private fun selectedRadioButton(): RadioButton? {
        return when {
            radio_ans_btn1.isChecked -> radio_ans_btn1
            radio_ans_btn2.isChecked -> radio_ans_btn2
            radio_ans_btn3.isChecked -> radio_ans_btn3
            radio_ans_btn4.isChecked -> radio_ans_btn4
            else -> null
        }
    }

    private fun clearColor() {
        radio_ans_btn1.setTextColor(ContextCompat.getColor(applicationContext, R.color.black))
        radio_ans_btn1.alpha = 1f
//        radio_ans_btn1.isSelected = false_word

        radio_ans_btn2.setTextColor(ContextCompat.getColor(applicationContext, R.color.black))
        radio_ans_btn2.alpha = 1f
//        radio_ans_btn2.isSelected = false_word

        radio_ans_btn3.setTextColor(ContextCompat.getColor(applicationContext, R.color.black))
        radio_ans_btn3.alpha = 1f
//        radio_ans_btn3.isSelected = false_word

        radio_ans_btn4.setTextColor(ContextCompat.getColor(applicationContext, R.color.black))
        radio_ans_btn4.alpha = 1f
//        radio_ans_btn4.isSelected = false_word
    }

    private fun showResult() {
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra(Keys.RESULT_SCORE, score)
        intent.putExtra(Keys.LESSON_TYPE, type)
        startActivity(intent)
        this.finish()
    }

    private fun playSoundClick() {
        val player = MediaPlayer.create(this, R.raw.click)
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
