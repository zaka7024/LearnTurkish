package learnturkish.lemonlab.com.learnturkish

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_letters_quiz.*
import learnturkish.lemonlab.com.learnturkish.data.letterQuizData
import learnturkish.lemonlab.com.learnturkish.module.question_letter
import kotlin.math.log

class LettersQuiz : AppCompatActivity() {

    lateinit var question_data:ArrayList<question_letter>
    var sound:Int? = null
    var index = 0
    var score = 0
    var prog_change = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letters_quiz)

        getQuestions()
        setQuesstion(index)



        question_sound_btn.setOnClickListener {
            var player = MediaPlayer.create(this, sound!!)
            player.start()
        }

        next_btn.setOnClickListener {
            if (checkIfCorrect(index)){
                Toast.makeText(this, "True", Toast.LENGTH_SHORT).show()
                score++
                letter_quiz_progress.progress = letter_quiz_progress.progress + prog_change
                letter_quiz_progress.secondaryProgress += prog_change
            }else{
                Toast.makeText(this, "False", Toast.LENGTH_SHORT).show()
            }
            index++
            setQuesstion(index)
        }

    }

    fun getQuestions(){
        question_data =  letterQuizData.question_data
        letter_quiz_progress.max = 100.0f
        prog_change = (letter_quiz_progress.max /question_data.size).toInt()
        letter_quiz_progress.secondaryProgress = letter_quiz_progress.max
        Log.i("LetterQuiz", "prog_change: ${prog_change}")
        Log.i("LetterQuiz", "letter_quiz_progress.max: ${letter_quiz_progress.max}")
        Log.i("LetterQuiz", "letter_quiz_progress.secondaryProgress: ${letter_quiz_progress.secondaryProgress}")
    }

    fun setQuesstion(index:Int){

        if(index >= question_data.size){
            return
        }else if(index == question_data.size - 1){
            next_btn.text = "النتيجة"
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
}
