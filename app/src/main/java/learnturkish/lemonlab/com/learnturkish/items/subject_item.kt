package learnturkish.lemonlab.com.learnturkish.items

import android.app.Activity
import android.content.Intent
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.subject_item.view.*
import learnturkish.lemonlab.com.learnturkish.LearnListen
import learnturkish.lemonlab.com.learnturkish.R
import learnturkish.lemonlab.com.learnturkish.LearnWords
import learnturkish.lemonlab.com.learnturkish.keys.Keys

class subject_item(var title:String, var description:String,var image:Int, var type:String, var activity: Activity?):Item<ViewHolder>() {

    override fun getLayout(): Int {
        return R.layout.subject_item
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {

        // change layout title and description

        viewHolder.itemView.subject_title.text = title
        viewHolder.itemView.subject_description.text = description

        Picasso.get().load(image).into(viewHolder.itemView.subject_image)

        viewHolder.itemView.setOnClickListener {
            if(activity != null){
                val intent = Intent(activity, LearnListen::class.java)
                intent.putExtra(Keys.LESSON_TYPE, type)
                activity!!.startActivity(intent)
            }

        }
    }

}
