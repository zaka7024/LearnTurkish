package com.lemonlab.learnturkish

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity() {

    //useless variable
    //var UserImageUrl:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        createuser_btn.setOnClickListener {
            if (username_edittext.text.isEmpty()) {
                Toast.makeText(this, "الرجاء ادخال الاسم الشخصي", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            createUser()
            this.finish()
        }

    }

    private fun createUser() {
        val pref = getSharedPreferences("app_data", 0).edit()
        with(pref) {
            putBoolean("LOGED", true)
            putString("USER_NAME", username_edittext.text.toString())
            apply()
        }

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
