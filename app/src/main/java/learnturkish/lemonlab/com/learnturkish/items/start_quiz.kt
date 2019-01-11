package learnturkish.lemonlab.com.learnturkish.items

import android.content.Context
import android.content.Intent
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.start_quiz.view.*
import learnturkish.lemonlab.com.learnturkish.LttersQuiz
import learnturkish.lemonlab.com.learnturkish.R

class start_quiz(var text:String, var image:Int, var context: Context?):Item<ViewHolder>(){
    override fun getLayout(): Int {
        return R.layout.start_quiz
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.start_quiz_text_view.text = text

        Picasso.get().load(image).into(viewHolder.itemView.start_quiz_image)

        viewHolder.itemView.start_quiz_image.setOnClickListener {
            if(context != null){
                var intent = Intent(context,LttersQuiz::class.java)
                context!!.startActivity(intent)
            }
        }

    }

}