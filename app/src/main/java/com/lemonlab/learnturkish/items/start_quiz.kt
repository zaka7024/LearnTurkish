package com.lemonlab.learnturkish.items

import android.app.Activity
import android.content.Intent
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.start_quiz.view.*
import com.lemonlab.learnturkish.ListenQuiz
import com.lemonlab.learnturkish.R
import com.lemonlab.learnturkish.keys.Keys

class start_quiz(var text:String,var image:Int,var activity: Activity?,var lesson:String):Item<ViewHolder>(){
    override fun getLayout(): Int {
        return R.layout.start_quiz
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.start_quiz_text_view.text = text

        Picasso.get().load(image).into(viewHolder.itemView.start_quiz_image)

        if (lesson == "lesson_1"){
            viewHolder.itemView.start_quiz_image.setOnClickListener {
                startQuizActivity(Keys.LESSON_ONE)
            }
        }else if (lesson == "lesson_2"){
            viewHolder.itemView.start_quiz_image.setOnClickListener {
                startQuizActivity(Keys.LESSON_TWO)
            }
        }



    }

    fun startQuizActivity(extra:String){
        var intent = Intent(activity, ListenQuiz::class.java)
        intent.putExtra(Keys.QUIZ_TYPE, extra)
        activity!!.startActivity(intent)
        activity!!.finish()
    }

}