package learnturkish.lemonlab.com.learnturkish

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_letters_quiz.*
import learnturkish.lemonlab.com.learnturkish.data.QuizData
import learnturkish.lemonlab.com.learnturkish.keys.Keys
import learnturkish.lemonlab.com.learnturkish.module.question_letter_word

class ListenQuiz : AppCompatActivity() {

    lateinit var question_data:ArrayList<question_letter_word>
    var sound:Int? = null
    var index = 0
    var score = 0
    var prog_change = 0
    var type:String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letters_quiz)

        type = intent?.extras?.getString(Keys.QUIZ_TYPE)!!

        getQuestions()
        setQuesstion(index)



        question_sound_btn.setOnClickListener {
            var player = MediaPlayer.create(this, sound!!)
            player.start()
        }

        next_btn.setOnClickListener {

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
                }else{

                    with(selectedRadioButton()!!.animate()){
                        alpha(0.5f)
                    }
                    selectedRadioButton()!!.setTextColor(resources.getColor(R.color.red))
                    Toast.makeText(this, "إجابة خاطئة", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                index++
                setQuesstion(index)
            }else{ // user solve all problem
                showResult()
            }

        }

        // exit quiz

        exit_btn.setOnClickListener {
            // ask user before close this activity
            this.finish()
        }

    }

    fun getQuestions(){

        // select data set

        if (type == Keys.LETTER_QUIZ){
            question_data =  QuizData.letters_question_data

        }else if (type == Keys.WORDS_QUIZ){
            question_data =  QuizData.words_question_data
        }

        letter_quiz_progress.max = 100.0f
        prog_change = (letter_quiz_progress.max /question_data.size).toInt()
        letter_quiz_progress.secondaryProgress = letter_quiz_progress.max
        Log.i("LetterQuiz", "prog_change: ${prog_change}")
        Log.i("LetterQuiz", "letter_quiz_progress.max: ${letter_quiz_progress.max}")
        Log.i("LetterQuiz", "letter_quiz_progress.secondaryProgress: ${letter_quiz_progress.secondaryProgress}")
    }

    fun setQuesstion(index:Int){

        clearColor() // reset default colors for radio buttons

        if(index >= question_data.size){
            next_btn.text = "النتيجة"
            return
        }

        sound = question_data[index].sound
        var options = question_data[index].options
        radio_ans_btn1.text = options[0]
        radio_ans_btn2.text = options[1]
        radio_ans_btn3.text = options[2]
        radio_ans_btn4.text = options[3]
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
        radio_ans_btn1.isChecked = false

        radio_ans_btn2.setTextColor(resources.getColor(R.color.black))
        radio_ans_btn2.alpha = 1f
        radio_ans_btn2.isChecked = false

        radio_ans_btn3.setTextColor(resources.getColor(R.color.black))
        radio_ans_btn3.alpha = 1f
        radio_ans_btn3.isChecked = false

        radio_ans_btn4.setTextColor(resources.getColor(R.color.black))
        radio_ans_btn4.alpha = 1f
        radio_ans_btn4.isChecked = false
    }

    fun showResult(){
        var intent = Intent(this, ResultActivity::class.java)
        intent.putExtra(Keys.RESULT_SCORE, score)
        startActivity(intent)
    }
}
