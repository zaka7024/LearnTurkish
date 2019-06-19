package com.lemonlab.learnturkish

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lemonlab.learnturkish.items.OptionItem
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

    private fun initSettingsRv() {
        settings_rv.adapter = adapter
        settings_rv.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        settings_rv.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false
        )
    }

    private fun setItems() {
        adapter.add(OptionItem("حول مختبر الليمون", "ABOUT_US", this, R.drawable.ic_action_info))
        adapter.add(OptionItem("المزيد من التطبيقات", "MORE_APPS", this, R.drawable.ic_action_more_apps))
        adapter.add(OptionItem("سياسة الاستخدام", "PRIVACY", this, R.drawable.ic_action_privacy))
        adapter.add(OptionItem("لماذا لاعلانات؟", "WHY_ADS", this, R.drawable.ic_action_ads))
        adapter.add(OptionItem("المصادر", "CREDITS", this, R.drawable.ic_action_credits))
    }
}
