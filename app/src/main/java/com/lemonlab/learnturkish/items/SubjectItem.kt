package com.lemonlab.learnturkish.items

import android.app.Activity
import android.app.Dialog
import android.content.Intent
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.lemonlab.learnturkish.ChatActivity
import com.lemonlab.learnturkish.LearnListen
import com.lemonlab.learnturkish.R
import com.lemonlab.learnturkish.keys.Keys
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.dialog_layout.view.*
import kotlinx.android.synthetic.main.subject_item.view.*

class SubjectItem(
    private var title: String, private var description: String,
    private var image: Int, var type: String, var activity: Activity?
    , var min_score: Int = 0
) : Item<ViewHolder>() {

    //redundant variable
    //var quizNameLocked = ""

    override fun getLayout(): Int {
        return R.layout.subject_item
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {


        // change layout title and description

        viewHolder.itemView.subject_title.text = title
        viewHolder.itemView.subject_description.text = description

        //init
        viewHolder.itemView.back_layout.setBackgroundColor(ContextCompat.getColor(activity!!, R.color.white))

        Picasso.get().load(image).into(viewHolder.itemView.subject_image)

        // play animation on this item using YoYo

        YoYo.with(Techniques.FadeInUp).duration(1000).playOn(viewHolder.itemView)

        // check if lesson is locked or not
        if (getUserScore() < min_score) {
            viewHolder.itemView.back_layout.setBackgroundColor(ContextCompat.getColor(activity!!, R.color.darkGray))
        }

        viewHolder.itemView.setOnClickListener {

            // check if subject is special subject

            if (type == Keys.CHAT_LESSON_ONE) {

                if (checkIfUserReady()) return@setOnClickListener

                val intent = Intent(activity, ChatActivity::class.java)
                activity!!.startActivity(intent)
                activity!!.overridePendingTransition(R.anim.slide_to_up, R.anim.no_animation)
                activity!!.finish()
                return@setOnClickListener
            }

            if (activity != null) {

                if (checkIfUserReady()) return@setOnClickListener

                val intent = Intent(activity, LearnListen::class.java)
                intent.putExtra(Keys.LESSON_TYPE, type)
                activity!!.startActivity(intent)
                activity!!.overridePendingTransition(R.anim.slide_to_up, R.anim.no_animation)
                activity!!.finish()
            }

        }
    }

    private fun checkIfUserReady(): Boolean {
        // check if user has the min score for this lesson
        if (getUserScore() < min_score) {
            val dialog = Dialog(activity!!)
            val nullParent: ViewGroup? = null
            val view = activity!!.layoutInflater.inflate(R.layout.dialog_layout, nullParent)
            view.message_text_view.text = activity!!.getString(R.string.minimumPoints, min_score)
            view.exit_btn.setOnClickListener { dialog.dismiss() }

            dialog.setContentView(view)
            dialog.show()
            return true
        }

        return false
    }

    private fun getUserScore(): Int {
        val ref = activity!!.getSharedPreferences("app_data", 0)
        return ref.getInt(Keys.SCORE, 0)
    }

    //useless method
    /*
        fun getLesson(){
        when(type){
            Keys.LESSON_ONE ->{
                quizNameLocked = Keys.LESSON_QUIZ_ONE_LOCKED
            }

            Keys.LESSON_TWO ->{
                quizNameLocked = Keys.LESSON_QUIZ_TWO_LOCKED
            }

            Keys.LESSON_THREE ->{
                quizNameLocked = Keys.LESSON_QUIZ_THREE_LOCKED
            }

            Keys.LESSON_FOUR ->{
                quizNameLocked = Keys.LESSON_QUIZ_FOUR_LOCKED
            }

            Keys.LESSON_FIVE ->{
                quizNameLocked = Keys.LESSON_QUIZ_FIVE_LOCKED
            }

            Keys.LESSON_SIX ->{
                quizNameLocked = Keys.LESSON_QUIZ_SIX_LOCKED
            }

            Keys.LESSON_SEVEN ->{
                quizNameLocked = Keys.LESSON_QUIZ_SEVEN_LOCKED
            }
            Keys.LESSON_EIGHT ->{
                quizNameLocked = Keys.LESSON_QUIZ_EIGHT_LOCKED
            }

            Keys.LESSON_NINE ->{
                quizNameLocked = Keys.LESSON_QUIZ_NINE_LOCKED
            }

            Keys.LESSON_TEN ->{
                quizNameLocked = Keys.LESSON_QUIZ_TEN_LOCKED
            }

            Keys.LESSON_ELEVEN ->{
                quizNameLocked = Keys.LESSON_QUIZ_ELEVEN_LOCKED
            }

            Keys.CHAT_LESSON_ONE ->{
                quizNameLocked = Keys.LESSON_CHAT_ONE_LOCKED
            }

            Keys.LESSON_TWELVE ->{
                quizNameLocked = Keys.LESSON_CHAT_ONE_LOCKED
            }


        }
    }

     */

}
