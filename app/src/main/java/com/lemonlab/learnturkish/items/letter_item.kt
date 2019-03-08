package com.lemonlab.learnturkish.items

import android.content.Context
import android.media.MediaPlayer
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.letter_item.view.*
import com.lemonlab.learnturkish.R

class letter_item(var big:String, var small:String,var examples:String, var sound:Int, var context: Context?):Item<ViewHolder>() {
    override fun getLayout(): Int {
        return R.layout.letter_item
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        // set value to layout
        viewHolder.itemView.big_letter_text_view.text = big
        viewHolder.itemView.small_letter_text_view.text = small
        viewHolder.itemView.letter_example.text = examples

        YoYo.with(Techniques.FadeInUp).duration(500).playOn(viewHolder.itemView)
        viewHolder.itemView.play_sound_letter_btn.progress = 0.0f

        // create sound for_word letter


        viewHolder.itemView.play_sound_letter_btn.setOnClickListener{
            var sound:MediaPlayer = MediaPlayer.create(context, sound)
            if(context!=null && !sound.isPlaying){
                sound.start()
                viewHolder.itemView.play_sound_letter_btn.playAnimation()
                sound.setOnCompletionListener {
                    sound.release()
                    viewHolder.itemView.play_sound_letter_btn.reverseAnimationSpeed()
                }
            }
        }
    }
}