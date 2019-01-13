package learnturkish.lemonlab.com.learnturkish.items

import android.app.Activity
import android.content.Context
import android.media.MediaPlayer
import android.util.Log
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.word_item.view.*
import learnturkish.lemonlab.com.learnturkish.R

class word_item(var text:String, var arabic:String, var sound:Int, var activity:Activity):Item<ViewHolder>() {
    override fun getLayout(): Int {
        return R.layout.word_item
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.word_text_view.text = text

        viewHolder.itemView.arabic_word_text_view.text = arabic

        viewHolder.itemView.word_sound_btn.setOnClickListener {
            if (activity.applicationContext != null){
                var player = MediaPlayer.create(activity.applicationContext, sound)
                player.start()
                player.setOnCompletionListener {
                    it.release()
                    Log.i("word_item", "player released")
                }
            }
        }
    }
}