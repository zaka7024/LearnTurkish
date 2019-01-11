package learnturkish.lemonlab.com.learnturkish

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*
import learnturkish.lemonlab.com.learnturkish.keys.Keys

class ResultActivity : AppCompatActivity() {

   var result_score:Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        result_score = intent.extras.getInt(Keys.RESULT_SCORE)

        score_text_view_result_activity.text = result_score.toString()

        correct_animation.setAnimation("tick_reveal.json")
        correct_animation.playAnimation()
        correct_animation.loop(true)

        home_btn.setAnimation("home.json")
        home_btn.playAnimation()
        home_btn.loop(true)

        home_btn.setOnClickListener {
            goToHome()
        }

    }

    fun goToHome(){
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        this.finish()
    }
}
