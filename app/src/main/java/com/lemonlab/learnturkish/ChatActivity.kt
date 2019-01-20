package com.lemonlab.learnturkish

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_chat.*
import com.lemonlab.learnturkish.data.chat_data
import com.lemonlab.learnturkish.items.chat_from_item
import com.lemonlab.learnturkish.items.chat_to_item
import com.lemonlab.learnturkish.R

class ChatActivity : AppCompatActivity() {

    var adapter = GroupAdapter<ViewHolder>()
    var chatData = chat_data.chatData
    var index = -1
    var chat_from = true
    var player:MediaPlayer? = null
    var isPlaying = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        initChatRV()

        play_chat.setOnClickListener {

            if (index == -1){
                adapter.clear()
            }

            if (isPlaying || (player != null && player!!.isPlaying)){
                isPlaying = false
                play_chat.setImageResource(R.drawable.play_icon)
                return@setOnClickListener
            }
            play_chat.setImageResource(R.drawable.pause_icon)
            isPlaying = true
            playChat()
        }

    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_to_up, R.anim.no_animation)
    }

    fun initChatRV(){
        adapter.clear()
        chat_activity_rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        chat_activity_rv.adapter = adapter
    }

    fun selectChatItem():Item<ViewHolder>{
        var item = if (chat_from){
            chat_from_item(chatData[index], this)
        }else{
            chat_to_item(chatData[index], this)
        }
        return item
    }

    fun playChat(){
        index++
        if (index >= chatData.size){
            index = -1
            return
        }

        var sound = chatData[index].sound

        player = MediaPlayer.create(this , sound)
        player!!.start()
        adapter.add(selectChatItem())
        slideToLast()

        if(!isPlaying){
            return
        }

        chat_from = !chat_from
        player!!.setOnCompletionListener {

            player!!.release()
            if (index >= chatData.size && isPlaying){
                isPlaying = false
                return@setOnCompletionListener
            }
            Log.i("ChatActivity", "playChat(): isPlaying -> ${isPlaying}")
            playChat()
        }
    }

    fun slideToLast(){
        chat_activity_rv.scrollToPosition(adapter.itemCount - 1)
    }




}
