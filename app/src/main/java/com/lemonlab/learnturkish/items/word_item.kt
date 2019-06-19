package com.lemonlab.learnturkish.items

import android.app.Activity
import android.media.MediaPlayer
import android.util.Log
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.word_item.view.*
import com.lemonlab.learnturkish.R

class word_item(var text:String, var arabic:String, var sound:Int, var activity:Activity):Item<ViewHolder>() {

    override fun getLayout(): Int {
        return R.layout.word_item
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.word_text_view.text = text

        viewHolder.itemView.arabic_word_text_view.text = arabic

        YoYo.with(Techniques.FadeInUp).duration(500).playOn(viewHolder.itemView)
        viewHolder.itemView.play_sound_letter_btn.progress = 0.0f

        viewHolder.itemView.play_sound_letter_btn.setOnClickListener {
            if (activity.applicationContext != null){
                val player = MediaPlayer.create(activity.applicationContext, sound)
                player.start()
                viewHolder.itemView.play_sound_letter_btn.playAnimation()
                player.setOnCompletionListener {
                    it.release()
                    viewHolder.itemView.play_sound_letter_btn.reverseAnimationSpeed()
                    Log.i("word_item", "player released")
                }
            }
        }
    }
}