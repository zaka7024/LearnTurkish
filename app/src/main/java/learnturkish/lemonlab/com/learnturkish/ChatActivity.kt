package learnturkish.lemonlab.com.learnturkish

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_chat.*
import learnturkish.lemonlab.com.learnturkish.data.chat_data
import learnturkish.lemonlab.com.learnturkish.items.chat_from_item
import learnturkish.lemonlab.com.learnturkish.items.chat_to_item
import learnturkish.lemonlab.com.learnturkish.module.chat

class ChatActivity : AppCompatActivity() {

    var adapter = GroupAdapter<ViewHolder>()
    var chatData = chat_data.chatData
    var index = 0
    var chat_from = true
    var player:MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        initChatRV()
        playChat()

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
        var sound = chatData[index].sound

        player = MediaPlayer.create(this , sound)
        player!!.start()
        adapter.add(selectChatItem())
        slideToLast()


        chat_from = !chat_from
        player!!.setOnCompletionListener {
            index++
            player!!.release()
            if (index >= chatData.size)return@setOnCompletionListener
            playChat()
        }
    }

    fun slideToLast(){
        chat_activity_rv.scrollToPosition(adapter.itemCount - 1)
    }




}
