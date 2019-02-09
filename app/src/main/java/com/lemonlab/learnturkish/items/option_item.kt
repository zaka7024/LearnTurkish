package com.lemonlab.learnturkish.items

import android.app.Activity
import com.lemonlab.learnturkish.R
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.option_item.view.*

class option_item(var title:String,var type:String, var activity: Activity):Item<ViewHolder>() {
    override fun getLayout(): Int {
        return R.layout.option_item
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.option_item_text_view.text = title
    }
}