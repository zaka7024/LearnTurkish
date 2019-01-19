package learnturkish.lemonlab.com.learnturkish.items

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AlertDialog
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

class subject_item(var title:String, var description:String,var image:Int, var type:String, var activity: Activity?
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
            viewHolder.itemView.back_layout.setBackgroundColor(activity!!.resources.getColor(R.color.darkGray))
        }

        viewHolder.itemView.setOnClickListener {
            // check if subject is special subject

            if (type == Keys.CHAT_LESSON_ONE){
                var intent = Intent(activity, ChatActivity::class.java)
                activity!!.startActivity(intent)
                activity!!.finish()
                return@setOnClickListener
            }

            if(activity != null){
                // check if user has the min score for this lesson
                if(getUserScore() < min_score){
                    val dialog = AlertDialog.Builder(activity!!)
                    dialog.setTitle("متطلبات")
                    dialog.setMessage("تحتاج الى المزيد من النقاط للتمكن من الدخول الى الدرس.\n" +
                            "النقاط الحالية: ${getUserScore()}\n" +
                            "يتطلب الدرس: ${min_score}")
                    dialog.show()
                    return@setOnClickListener
                }

                val intent = Intent(activity, LearnListen::class.java)
                intent.putExtra(Keys.LESSON_TYPE, type)
                activity!!.startActivity(intent)
                activity!!.finish()
            }

        }
    }
    fun getUserScore():Int{
        val ref = activity!!.getSharedPreferences("app_data", 0)
        return ref.getInt(Keys.SCORE, 0)
    }

    fun getLesson(){
        when(type){
            Keys.LESSON_ONE ->{
                quiz_name_locked = Keys.LESSON_QUIZ_ONE_LOCKED
            }

            Keys.LESSON_TWO ->{
                quiz_name_locked = Keys.LESSON_QUIZ_TWO_LOCKED
            }

            Keys.LESSON_THREE ->{
                quiz_name_locked = Keys.LESSON_QUIZ_THREE_LOCKED
            }

            Keys.LESSON_FOUR ->{
                quiz_name_locked = Keys.LESSON_QUIZ_FOUR_LOCKED
            }

            Keys.LESSON_FIVE ->{
                quiz_name_locked = Keys.LESSON_QUIZ_FIVE_LOCKED
            }

            Keys.LESSON_SIX ->{
                quiz_name_locked = Keys.LESSON_QUIZ_SIX_LOCKED
            }

            Keys.LESSON_SEVEN ->{
                quiz_name_locked = Keys.LESSON_QUIZ_SEVEN_LOCKED
            }
            Keys.LESSON_EIGHT ->{
                quiz_name_locked = Keys.LESSON_QUIZ_EIGHT_LOCKED
            }

            Keys.LESSON_NINE ->{
                quiz_name_locked = Keys.LESSON_QUIZ_NINE_LOCKED
            }

            Keys.LESSON_TEN ->{
                quiz_name_locked = Keys.LESSON_QUIZ_TEN_LOCKED
            }

            Keys.LESSON_ELEVEN ->{
                quiz_name_locked = Keys.LESSON_QUIZ_ELEVEN_LOCKED
            }

            Keys.CHAT_LESSON_ONE ->{
                quiz_name_locked = Keys.LESSON_CHAT_ONE_LOCKED
            }


        }
    }

    fun isLockOrNot():Boolean{
        getLesson()
        val ref = activity!!.getSharedPreferences("app_data", 0)
        val isLocked = ref.getBoolean(quiz_name_locked, true)
        Log.i("subject_item", "lesson is locked: ${isLocked}")
        return isLocked
    }

}
