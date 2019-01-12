package learnturkish.lemonlab.com.learnturkish.items

import android.app.Activity
import android.content.Intent
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.subject_item.view.*
import learnturkish.lemonlab.com.learnturkish.LearnLetters
import learnturkish.lemonlab.com.learnturkish.R
import learnturkish.lemonlab.com.learnturkish.module.LearnWords

class subject_item(var title:String, var description:String,var image:Int, var type:String, var activity: Activity?):Item<ViewHolder>() {

    override fun getLayout(): Int {
        return R.layout.subject_item
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {

        // change layout title and description

        viewHolder.itemView.subject_title.text = title
        viewHolder.itemView.subject_description.text = description

        Picasso.get().load(image).into(viewHolder.itemView.subject_image)

        if (type == "letters") { // open LearnLetters activity if item type is letters
            viewHolder.itemView.setOnClickListener {
                if(activity != null){
                    val intent = Intent(activity, LearnLetters::class.java)
                    activity!!.startActivity(intent)
                }

            }
        }else if (type == "words"){
            viewHolder.itemView.setOnClickListener {
                if(activity != null){
                    val intent = Intent(activity, LearnWords::class.java)
                    activity!!.startActivity(intent)
                }

            }
        }
    }

}
