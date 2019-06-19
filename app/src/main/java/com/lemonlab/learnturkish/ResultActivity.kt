package com.lemonlab.learnturkish

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_result.*
import com.lemonlab.learnturkish.keys.Keys

class ResultActivity : AppCompatActivity() {

    private var resultScore: Int? = null
    var type: String = ""
    private var quizNameScore = ""
    private var quizNameLocked = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // play correct sound effect
        val player = MediaPlayer.create(this, R.raw.correct)
        player.start()
        player.setOnCompletionListener {
            it.release()
        }

        resultScore = intent?.extras?.getInt(Keys.RESULT_SCORE)
        type = intent?.extras?.getString(Keys.LESSON_TYPE)!!

        // unlock the lesson lesson
        getQuizName()
        unlockTheNextLesson()

        // play lottie animation
        correct_animation.setAnimation("tick_reveal.json")
        correct_animation.playAnimation()
        //See loop attribute in activity result xml
        //correct_animation.loop(true)

        // save user score if he does not play this quiz before
        saveUserScore()

        // go to home
        home_btn.setOnClickListener {
            this.finish()
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
    }

    private fun saveUserScore(): Int {
        val ref = getSharedPreferences("app_data", 0)
        var prevScore = ref.getInt(Keys.SCORE, 0)

        // check if user does not play this quiz before
        val isPassed = checkIfThisQuizPassed()
        if (!isPassed) {
            result_text_view.text = "احسنت لقيد انهيت الاختبار بنجاح و حصلت على"
            score_text_view_result_activity.text = resultScore.toString()
            with(ref.edit()) {
                putInt(Keys.SCORE, prevScore + resultScore!!)
                apply()
            }
        } else {
            result_text_view.text = "احسنت لقيد انهيت الاختبار بنجاح"
        }

        prevScore = ref.getInt(Keys.SCORE, 0)
        Log.i("ResultActivity", "user score after quiz end: $prevScore")

        passQuiz() // save in sharedPref that the user complete this quiz

        return prevScore
    }

    private fun passQuiz() {
        val ref = getSharedPreferences("app_data", 0)
        with(ref.edit()) {
            putBoolean(quizNameScore, true)
            apply()
        }
    }

    private fun checkIfThisQuizPassed(): Boolean {

        val ref = getSharedPreferences("app_data", 0)
        val isPassed = ref.getBoolean(quizNameScore, false)
        Log.i("ResultActivity", "user pass the quiz: $isPassed")
        return isPassed
    }

    private fun getQuizName() {
        when (type) {
            Keys.LESSON_ONE -> {
                quizNameScore = Keys.LESSON_QUIZ_ONE
                quizNameLocked = Keys.LESSON_QUIZ_TWO_LOCKED
            }

            Keys.LESSON_TWO -> {
                quizNameScore = Keys.LESSON_QUIZ_TWO
                quizNameLocked = Keys.LESSON_QUIZ_THREE_LOCKED
            }

            Keys.LESSON_THREE -> {
                quizNameScore = Keys.LESSON_QUIZ_THREE
                quizNameLocked = Keys.LESSON_QUIZ_FOUR_LOCKED
            }

            Keys.LESSON_FOUR -> {
                quizNameScore = Keys.LESSON_QUIZ_FOUR
                quizNameLocked = Keys.LESSON_QUIZ_FIVE_LOCKED
            }

            Keys.LESSON_FIVE -> {
                quizNameScore = Keys.LESSON_QUIZ_FIVE
                quizNameLocked = Keys.LESSON_QUIZ_SIX_LOCKED
            }

            Keys.LESSON_SIX -> {
                quizNameScore = Keys.LESSON_QUIZ_SIX
                quizNameLocked = Keys.LESSON_QUIZ_SEVEN_LOCKED
            }

            Keys.LESSON_SEVEN -> {
                quizNameScore = Keys.LESSON_QUIZ_SEVEN
                quizNameLocked = Keys.LESSON_QUIZ_EIGHT_LOCKED
            }
            Keys.LESSON_EIGHT -> {
                quizNameScore = Keys.LESSON_QUIZ_EIGHT
                quizNameLocked = Keys.LESSON_QUIZ_NINE_LOCKED
            }

            Keys.LESSON_NINE -> {
                quizNameScore = Keys.LESSON_QUIZ_NINE
                quizNameLocked = Keys.LESSON_QUIZ_TEN_LOCKED
            }

            Keys.LESSON_TEN -> {
                quizNameScore = Keys.LESSON_QUIZ_TEN
                quizNameLocked = Keys.LESSON_QUIZ_ELEVEN_LOCKED
            }

            Keys.LESSON_ELEVEN -> {
                quizNameScore = Keys.LESSON_QUIZ_ELEVEN
                quizNameLocked = Keys.LESSON_QUIZ_ELEVEN_LOCKED
            }


        }
        Log.i("ResultActivity", "quiz name score: $quizNameScore")
    }

    private fun unlockTheNextLesson() {
        val ref = getSharedPreferences("app_data", 0)
        with(ref.edit()) {
            putBoolean(quizNameLocked, false)
            apply()
        }
    }
}
