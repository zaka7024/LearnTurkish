package com.lemonlab.learnturkish.items

import android.app.Activity
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.lemonlab.learnturkish.R
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.option_item.view.*

class option_item(
    private var title: String, private var type: String,
    private var activity: Activity, private var icon: Int
) : Item<ViewHolder>() {
    override fun getLayout(): Int {
        return R.layout.option_item
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.option_item_text_view.text = title
        viewHolder.itemView.option_item_icon.setImageResource(icon)
    }

    private fun privacyPolicy() {
        val privacyPolicyText = activity.applicationContext.getString(R.string.privacyPolicyText)
        val privacyPolicyTextAr = activity.applicationContext.getString(R.string.privacyPolicyTextAr)
        val dialog: AlertDialog.Builder = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AlertDialog.Builder(activity, android.R.style.Theme_Material_Dialog_Alert)
        } else {
            AlertDialog.Builder(activity)
        }
        dialog.setPositiveButton(activity.applicationContext.getString(R.string.ok)) { firstDialog, _ ->
            firstDialog.dismiss()
        }

        dialog.setNegativeButton(activity.applicationContext.getString(R.string.changeLanguage)) { firstDialog, _ ->
            val anotherDialog: AlertDialog.Builder = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                AlertDialog.Builder(activity, android.R.style.Theme_Material_Dialog_Alert)
            } else {
                AlertDialog.Builder(activity)
            }
            anotherDialog.setPositiveButton(activity.applicationContext.getString(R.string.okAr)) { secondDialog, _ ->
                secondDialog.dismiss()
            }
            anotherDialog.setTitle("سياسة الخصوصية والاستخدام")
            anotherDialog.setMessage(privacyPolicyTextAr)
            anotherDialog.show()
            firstDialog.dismiss()
        }
        dialog.setTitle("Privacy Policy and Terms of Service")
        dialog.setMessage(privacyPolicyText)
        dialog.show()

    }

    private fun aboutUs() {
        val dialog: AlertDialog.Builder = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AlertDialog.Builder(activity, android.R.style.Theme_Material_Dialog_Alert)
        } else {
            AlertDialog.Builder(activity)
        }
        dialog.setPositiveButton(activity.applicationContext.getString(R.string.okAr)) { firstDialog, _ ->
            firstDialog.dismiss()
        }

        dialog.setTitle("عن مختبر الليمون")
        dialog.setMessage(activity.applicationContext.getString(R.string.aboutLemonLabAr))
        dialog.show()
    }

    private fun moreApps(){
        activity.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=Lemon+Lab")))
    }

    private fun whyAds(){
        val dialog: AlertDialog.Builder = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AlertDialog.Builder(activity, android.R.style.Theme_Material_Dialog_Alert)
        } else {
            AlertDialog.Builder(activity)
        }
        dialog.setPositiveButton(activity.applicationContext.getString(R.string.okAr)) { firstDialog, _ ->
            firstDialog.dismiss()
        }

        dialog.setTitle("لماذا الاعلانات؟")
        dialog.setMessage(activity.applicationContext.getString(R.string.whyAds))
        dialog.show()
    }

    private fun creditsDialog(){
        val dialog: AlertDialog.Builder = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AlertDialog.Builder(activity, android.R.style.Theme_Material_Dialog_Alert)
        } else {
            AlertDialog.Builder(activity)
        }
        dialog.setPositiveButton(activity.applicationContext.getString(R.string.ok)) { firstDialog, _ ->
            firstDialog.dismiss()
        }

        dialog.setTitle("Credits")
        dialog.setMessage(activity.applicationContext.getString(R.string.credits))
        dialog.show()
    }

    override fun createViewHolder(itemView: View): ViewHolder {
        itemView.setOnClickListener {
            when (type) {
                "ABOUT_US" ->  aboutUs()
                "MORE_APPS" ->  moreApps()
                "PRIVACY" ->  privacyPolicy()
                "WHY_ADS" ->  whyAds()
                "CREDITS" -> creditsDialog()
            }
        }
        return super.createViewHolder(itemView)
    }
}