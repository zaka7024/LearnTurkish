package learnturkish.lemonlab.com.learnturkish

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        * Check if user does not log in using preferences from registration activity
        * */

        if(!CheckIfNotLoged()){
            StartRegisterActivity()
        }

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
}
