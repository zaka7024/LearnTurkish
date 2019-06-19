package com.lemonlab.learnturkish

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lemonlab.learnturkish.items.option_item
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {

    private var adapter = GroupAdapter<ViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        initSettingsRv()
        setItems()
    }

    private fun initSettingsRv(){
        settings_rv.adapter = adapter
        settings_rv.addItemDecoration(DividerItemDecoration(this,  DividerItemDecoration.VERTICAL))
        settings_rv.layoutManager =LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false
        )
    }

    private fun setItems(){
        adapter.add(option_item("حول مختبر الليمون","ABOUT_US", this, R.drawable.ic_action_info))
        adapter.add(option_item("المزيد من التطبيقات","MORE_APPS", this, R.drawable.ic_action_more_apps))
        adapter.add(option_item("سياسة الاستخدام","PRIVACY", this, R.drawable.ic_action_privacy))
        adapter.add(option_item("لماذا لاعلانات؟","WHY_ADS", this, R.drawable.ic_action_ads))
        adapter.add(option_item("المصادر","CREDITS", this, R.drawable.ic_action_credits))
    }
}
