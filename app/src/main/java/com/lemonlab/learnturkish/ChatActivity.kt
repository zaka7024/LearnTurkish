package com.lemonlab.learnturkish

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lemonlab.learnturkish.data.chat_data
import com.lemonlab.learnturkish.items.chat_from_item
import com.lemonlab.learnturkish.items.chat_to_item
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_chat.*

class ChatActivity : AppCompatActivity() {

    private var adapter = GroupAdapter<ViewHolder>()
    private var chatData = chat_data.chatData
    private var index = -1
    private var chatFrom = true
    private var player:MediaPlayer? = null
    private var isPlaying = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        initChatRV()

        playChat()

    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_to_up, R.anim.no_animation)
    }

    private fun initChatRV(){
        adapter.clear()
        chat_activity_rv.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false
        )
        chat_activity_rv.adapter = adapter
    }

    private fun selectChatItem():Item<ViewHolder>{
        return if (chatFrom){
            chat_from_item(chatData[index], this)
        }else{
            chat_to_item(chatData[index], this)
        }
    }

    private fun playChat(){
        index++
        if (index >= chatData.size){
            index = -1
            return
        }

        val sound = chatData[index].sound

        player = MediaPlayer.create(this , sound)
        player!!.start()
        adapter.add(selectChatItem())
        slideToLast()

        chatFrom = !chatFrom
        player!!.setOnCompletionListener {

            player!!.release()
            if (index >= chatData.size && isPlaying){
                isPlaying = false
                return@setOnCompletionListener
            }
            Log.i("ChatActivity", "playChat(): isPlaying -> $isPlaying")
            playChat()
        }
    }

    private fun slideToLast(){
        chat_activity_rv.scrollToPosition(adapter.itemCount - 1)
    }



}
