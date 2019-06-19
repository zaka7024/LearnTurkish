package com.lemonlab.learnturkish.items

import android.content.Context
import com.google.android.gms.ads.AdRequest
import com.lemonlab.learnturkish.R
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.native_ad_layout.view.*

class NativeAdItem(var context: Context) : Item<ViewHolder>() {
    override fun getLayout(): Int {
        return R.layout.native_ad_layout
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.native_ad_view.loadAd(AdRequest.Builder().build())
    }

}