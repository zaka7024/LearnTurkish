package com.lemonlab.learnturkish

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.lemonlab.learnturkish.items.option_item
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {

    var adapter = GroupAdapter<ViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        initSettingsRv()
        setItems()
    }

    fun initSettingsRv(){
        settings_rv.adapter = adapter
        settings_rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    fun setItems(){
        adapter.add(option_item("حول التطبيق","ABOUT_US", this))
        adapter.add(option_item("سياسة الاستخدام","PRIVACY", this))
    }
}
