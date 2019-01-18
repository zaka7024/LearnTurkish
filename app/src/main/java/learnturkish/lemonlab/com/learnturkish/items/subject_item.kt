package learnturkish.lemonlab.com.learnturkish.items

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.util.Log
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.subject_item.view.*
import learnturkish.lemonlab.com.learnturkish.ChatActivity
import learnturkish.lemonlab.com.learnturkish.LearnListen
import learnturkish.lemonlab.com.learnturkish.R
import learnturkish.lemonlab.com.learnturkish.keys.Keys

class subject_item(var title:String, var description:String,var image:Int, var type:String, var context: Context?
, var min_score:Int = 0):Item<ViewHolder>() {


    var quiz_name_locked = ""

    override fun getLayout(): Int {
        return R.layout.subject_item
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {


        // change layout title and description

        viewHolder.itemView.subject_title.text = title
        viewHolder.itemView.subject_description.text = description

        Picasso.get().load(image).into(viewHolder.itemView.subject_image)

        // play animation on this item using YoYo

        YoYo.with(Techniques.FadeInUp).duration(1000).playOn(viewHolder.itemView)

        // check if lesson is locked or not
        if (isLockOrNot()){
            viewHolder.itemView.back_layout.setBackgroundColor(context!!.resources.getColor(R.color.darkGray))
        }

        viewHolder.itemView.setOnClickListener {
            // check if subject is special subject

            if (type == Keys.CHAT_LESSON){
                var intent = Intent(context, ChatActivity::class.java)
                context!!.startActivity(intent)
                return@setOnClickListener
            }

            if(context != null){
                // check if user has the min score for this lesson
                if(getUserScore() < min_score){
                    val dialog = AlertDialog.Builder(context)
                    dialog.setTitle("متطلبات")
                    dialog.setMessage("تحتاج الى المزيد من النقاط للتمكن من الدخول الى الدرس.\n" +
                            "النقاط الحالية: ${getUserScore()}\n" +
                            "يتطلب الدرس: ${min_score}")
                    dialog.show()
                    return@setOnClickListener
                }

                val intent = Intent(context, LearnListen::class.java)
                intent.putExtra(Keys.LESSON_TYPE, type)
                context!!.startActivity(intent)
            }

        }
    }
    fun getUserScore():Int{
        val ref = context!!.getSharedPreferences("app_data", 0)
        return ref.getInt(Keys.SCORE, 0)
    }

    fun getLesson(){
        when(type){
            Keys.LESSON_ONE ->{
                quiz_name_locked = Keys.LESSON_QUIZ_ONE_LOCKED
            }

            Keys.LESSON_TWO ->{
                quiz_name_locked = Keys.LESSON_QUIZ_TWO_LOCEED
            }

        }
    }

    fun isLockOrNot():Boolean{
        getLesson()
        val ref = context!!.getSharedPreferences("app_data", 0)
        val isLocked = ref.getBoolean(quiz_name_locked, true)
        Log.i("subject_item", "lesson is locked: ${isLocked}")
        return isLocked
    }

}
