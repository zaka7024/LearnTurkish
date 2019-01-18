package learnturkish.lemonlab.com.learnturkish

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity() {

    var UserImageUrl:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        createuser_btn.setOnClickListener {
            if(username_edittext.text.isEmpty()){
                Toast.makeText(this,"الرجاء ادخال الاسم الشخصي", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            CreateUser()
            this.finish()
        }

    }

    fun CreateUser(){
        var pref = getSharedPreferences("app_data", 0).edit()
        with(pref){
            putBoolean("LOGED",true)
            putString("USER_NAME",username_edittext.text.toString() )
            apply()
        }

        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
