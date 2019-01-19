package learnturkish.lemonlab.com.learnturkish.items

import android.animation.Animator
import android.content.Context
import android.media.MediaPlayer
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.chat_to_item.view.*
import learnturkish.lemonlab.com.learnturkish.R
import learnturkish.lemonlab.com.learnturkish.module.chat

class chat_to_item(var chat_item: chat, var context: Context):Item<ViewHolder>() {

    var isTurkey = true

    override fun getLayout(): Int {
        return R.layout.chat_to_item
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.chat_text_view.text = chat_item.text

        viewHolder.itemView.chat_to_image.setImageResource(R.drawable.girl_1)

        // auto play sound
        YoYo.with(Techniques.Pulse).duration((500).toLong()).playOn(viewHolder.itemView)

        // change text from tu to ar OR at to tu
        viewHolder.itemView.setOnClickListener {

            YoYo.with(Techniques.FadeOut).withListener(object :Animator.AnimatorListener{
                override fun onAnimationRepeat(animation: Animator?) {

                }

                override fun onAnimationEnd(animation: Animator?) {
                    isTurkey = !isTurkey

                    if (isTurkey)
                        viewHolder.itemView.chat_text_view.text = chat_item.text
                    else
                        viewHolder.itemView.chat_text_view.text = chat_item.arabic

                    YoYo.with(Techniques.FadeIn).duration(200).playOn(viewHolder.itemView.chat_text_view)
                }

                override fun onAnimationCancel(animation: Animator?) {

                }

                override fun onAnimationStart(animation: Animator?) {

                }

            }).duration(200).playOn(viewHolder.itemView.chat_text_view)

        }
    }

}