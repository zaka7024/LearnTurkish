package learnturkish.lemonlab.com.learnturkish.items

import android.content.Context
import android.media.MediaPlayer
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.chat_from_item.view.*
import learnturkish.lemonlab.com.learnturkish.R
import learnturkish.lemonlab.com.learnturkish.module.chat

class chat_from_item(var chat_item:chat, var context: Context, var player: MediaPlayer?):Item<ViewHolder>() {
    override fun getLayout(): Int {
        return R.layout.chat_from_item
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.chat_text_view.text = chat_item.text
        viewHolder.itemView.chat_text_view_arabic.text = chat_item.arabic

        // auto play sound
        if (player != null)
            player!!.start()
    }

}
