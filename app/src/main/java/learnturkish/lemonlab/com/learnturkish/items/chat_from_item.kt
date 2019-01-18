package learnturkish.lemonlab.com.learnturkish.items

import android.content.Context
import android.media.MediaPlayer
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.chat_from_item.view.*
import learnturkish.lemonlab.com.learnturkish.R
import learnturkish.lemonlab.com.learnturkish.module.chat

class chat_from_item(var chat_item:chat, var context: Context, var player: MediaPlayer?, var done:Boolean = false):Item<ViewHolder>() {
    override fun getLayout(): Int {
        return R.layout.chat_from_item
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.chat_text_view.text = chat_item.text
        viewHolder.itemView.chat_text_view_arabic.text = chat_item.arabic

        viewHolder.itemView.chat_from_image.setImageResource(R.drawable.girl_2)

        YoYo.with(Techniques.Pulse).duration((500).toLong()).playOn(viewHolder.itemView)

        // auto play sound
        if (player != null && !done && !player!!.isPlaying)
            done = true
            player!!.start()
    }

}
