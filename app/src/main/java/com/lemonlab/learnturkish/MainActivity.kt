package com.lemonlab.learnturkish

import android.app.Dialog
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_main.*
import com.lemonlab.learnturkish.keys.Keys
import kotlinx.android.synthetic.main.dialog_layout.view.*

class MainActivity : AppCompatActivity() {

    private lateinit var dialog: Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this, "ca-app-pub-9769401692194876~3476321522")
        //init
        dialog = Dialog(this)

        /*
        * Check if user does not log in_word using preferences from registration activity
        * */

        if (!checkIfNotLoged()) {
            startRegisterActivity()
        }

        initData()

        username_textview.text = getUserName()
        score_text_view.text = getString(R.string.cup, getUserScore().toString())

        start_btn.setOnClickListener {
            startLearn()
        }

        rate_btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://play.google.com/store/apps/details?id=com.lemonlab.learnturkish")
            startActivity(intent)
        }

        share_btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(
                Intent.EXTRA_TEXT,
                "تظبيق تعلم التركية مجانا - تطبيق يساعدك على تعلم اللغة التركية بطريقة تفعالية - يحتوي التطبيق على الكثير من المفردات و الاختبارات والمحادثات التي تساعد في رحلة تعلمك للغة\n" +
                        "https://bit.ly/2MpcpLW"
            )
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "مشاركة الى"))
        }

        settings_btn.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        score_icon.setOnClickListener {
            showDialog()
        }

    }

    private fun checkIfNotLoged(): Boolean {
        val pref = getSharedPreferences("app_data", 0)
        return pref.getBoolean("LOGED", false)
    }

    private fun startRegisterActivity() {
        val intent = Intent(this, RegistrationActivity::class.java)
        startActivity(intent)
        this.finish()
    }

    private fun getUserName(): String {
        val shared = getSharedPreferences("app_data", 0)
        return shared.getString("USER_NAME", "USER")!!
    }

    private fun startLearn() {
        val intent = Intent(this, SubjectActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
    }

    private fun getUserScore(): Int {
        val ref = getSharedPreferences("app_data", 0)
        return ref.getInt(Keys.SCORE, 0)
    }

    private fun showDialog() {
        val nullParent = null
        val view = layoutInflater.inflate(R.layout.dialog_layout, nullParent, false)
        view.message_text_view.text =
            "يمثل هذا الرقم عدد النقاط التي تمتلكها، من خلال اكمالك للاختبارات سوف تحصل على النقاط، كلما حصلت على نقاط اكثر سوف تتمكن من فتح الدروس المقفلة"
        view.exit_btn.setOnClickListener {
            dialog.dismiss()
        }
        dialog.setContentView(view)
        dialog.show()
    }

    private fun initData() {
        val ref = getSharedPreferences("app_data", 0)
        val saved = ref.getBoolean("init_data", false)
        if (!saved) {
            with(ref.edit()) {
                putBoolean("init_data", true)
                /*putBoolean(Keys.LESSON_QUIZ_ONE_LOCKED, false)
                putBoolean(Keys.LESSON_QUIZ_TWO_LOCKED, true)
                putBoolean(Keys.LESSON_QUIZ_THREE_LOCKED, true)
                putBoolean(Keys.LESSON_QUIZ_FOUR_LOCKED, true)
                putBoolean(Keys.LESSON_QUIZ_FIVE_LOCKED, true)
                putBoolean(Keys.LESSON_QUIZ_SIX_LOCKED, true)
                putBoolean(Keys.LESSON_QUIZ_SEVEN_LOCKED, true)
                putBoolean(Keys.LESSON_QUIZ_EIGHT_LOCKED, true)
                putBoolean(Keys.LESSON_QUIZ_NINE_LOCKED, true)
                putBoolean(Keys.LESSON_QUIZ_TEN_LOCKED, true)
                putBoolean(Keys.LESSON_QUIZ_ELEVEN_LOCKED, true)
                putBoolean(Keys.LESSON_CHAT_ONE_LOCKED, true)*/
                apply()
            }
        }

    }
}
