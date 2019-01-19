package learnturkish.lemonlab.com.learnturkish

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_result.*
import learnturkish.lemonlab.com.learnturkish.keys.Keys

class ResultActivity : AppCompatActivity() {

    var result_score:Int? = null
    var type:String = ""
    var quiz_name_score = ""
    var quiz_name_locked = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // play correct sound effect
        var player = MediaPlayer.create(this, R.raw.correct)
        player.start()
        player.setOnCompletionListener {
            it.release()
        }

        result_score = intent?.extras?.getInt(Keys.RESULT_SCORE)
        type = intent?.extras?.getString(Keys.LESSON_TYPE)!!

        // unlock the lesson lesson
        getQuizName()
        unlockTheNextLesson()
        score_text_view_result_activity.text = result_score.toString()

        correct_animation.setAnimation("tick_reveal.json")
        correct_animation.playAnimation()
        correct_animation.loop(true)

        home_btn.setOnClickListener {
            goToHome()
            saveUserScore()
            this.finish()
        }

    }

    fun goToHome(){
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun saveUserScore():Int{
        val ref = getSharedPreferences("app_data", 0)
        var prev_score = ref.getInt(Keys.SCORE, 0)

        // check if user does not play this quiz
        if(!checkIfThisQuizPassed()){
            with(ref.edit()){
                putInt(Keys.SCORE, prev_score + result_score!!)
                apply()
            }
        }

        prev_score = ref.getInt(Keys.SCORE, 0)
        Log.i("ResultActivity", "user score after quiz end: ${prev_score}")

        passQuiz() // save in sharedPref that the user complete this quiz

        return prev_score
    }

    fun passQuiz(){
        val ref = getSharedPreferences("app_data", 0)
        with(ref.edit()){
            putBoolean(quiz_name_score, true)
            apply()
        }
    }

    fun checkIfThisQuizPassed():Boolean{

        val ref = getSharedPreferences("app_data", 0)
        val isPassed = ref.getBoolean(quiz_name_score, false)
        Log.i("ResultActivity", "user pass the quiz: ${isPassed}")
        return isPassed
    }

    fun getQuizName(){
        when(type){
            Keys.LESSON_ONE ->{
                quiz_name_score = Keys.LESSON_QUIZ_ONE
                quiz_name_locked = Keys.LESSON_QUIZ_TWO_LOCKED
            }

            Keys.LESSON_TWO ->{
                quiz_name_score = Keys.LESSON_QUIZ_TWO
                quiz_name_locked = Keys.LESSON_QUIZ_THREE_LOCKED
            }

            Keys.LESSON_THREE ->{
                quiz_name_score = Keys.LESSON_QUIZ_THREE
                quiz_name_locked = Keys.LESSON_QUIZ_FOUR_LOCKED
            }

            Keys.LESSON_FOUR ->{
                quiz_name_score = Keys.LESSON_QUIZ_FOUR
                quiz_name_locked = Keys.LESSON_QUIZ_FIVE_LOCKED
            }

            Keys.LESSON_FIVE ->{
                quiz_name_score = Keys.LESSON_QUIZ_FIVE
                quiz_name_locked = Keys.LESSON_QUIZ_SIX_LOCKED
            }

            Keys.LESSON_SIX ->{
                quiz_name_score = Keys.LESSON_QUIZ_SIX
                quiz_name_locked = Keys.LESSON_QUIZ_SEVEN_LOCKED
            }

            Keys.LESSON_SEVEN ->{
                quiz_name_score = Keys.LESSON_QUIZ_SEVEN
                quiz_name_locked = Keys.LESSON_QUIZ_EIGHT_LOCKED
            }
            Keys.LESSON_EIGHT ->{
                quiz_name_score = Keys.LESSON_QUIZ_EIGHT
                quiz_name_locked = Keys.LESSON_QUIZ_NINE_LOCKED
            }

            Keys.LESSON_NINE ->{
                quiz_name_score = Keys.LESSON_QUIZ_NINE
                quiz_name_locked = Keys.LESSON_QUIZ_TEN_LOCKED
            }

            Keys.LESSON_TEN ->{
                quiz_name_score = Keys.LESSON_QUIZ_TEN
                quiz_name_locked = Keys.LESSON_QUIZ_ELEVEN_LOCKED
            }

            Keys.LESSON_ELEVEN ->{
                quiz_name_score = Keys.LESSON_QUIZ_ELEVEN
                quiz_name_locked = Keys.LESSON_QUIZ_ELEVEN_LOCKED
            }


        }
        Log.i("ResultActivity", "quiz name score: ${quiz_name_score}")
    }

    fun unlockTheNextLesson(){
        val ref = getSharedPreferences("app_data", 0)
        with(ref.edit()){
            putBoolean(quiz_name_locked, false)
            apply()
        }
    }
}
