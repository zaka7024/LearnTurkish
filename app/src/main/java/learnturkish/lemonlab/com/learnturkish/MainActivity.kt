package learnturkish.lemonlab.com.learnturkish

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_main.*
import learnturkish.lemonlab.com.learnturkish.keys.Keys
import java.security.Key

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this, "ca-app-pub-9769401692194876~3476321522")

        /*
        * Check if user does not log in_word using preferences from registration activity
        * */

        if(!CheckIfNotLoged()){
            StartRegisterActivity()
        }

        initData()

        username_textview.text = getUserName()

        start_btn.setOnClickListener {
            startLearn()
        }
    }

    fun CheckIfNotLoged():Boolean{
        var pref = getSharedPreferences("app_data",0)
        var result = pref.getBoolean("LOGED",false)
        return result
    }

    fun StartRegisterActivity(){
        var intent = Intent(this,RegistrationActivity::class.java)
        startActivity(intent)
    }

    fun getUserName():String{
        val shared = getSharedPreferences("app_data", 0)
        var name = shared.getString("USER_NAME", "USER")
        return name
    }

    fun startLearn(){
        var intent = Intent(this, SubjectActivity::class.java)
        startActivity(intent)
    }

    fun initData(){
        val ref = getSharedPreferences("app_data",0)
        val saved = ref.getBoolean("init_data", false)
        if (!saved){
            with(ref.edit()){
                putBoolean("init_data", true)
                putBoolean(Keys.LESSON_QUIZ_ONE_LOCKED, false)
                putBoolean(Keys.LESSON_QUIZ_TWO_LOCEED, true)
                apply()
            }
        }

    }
}
