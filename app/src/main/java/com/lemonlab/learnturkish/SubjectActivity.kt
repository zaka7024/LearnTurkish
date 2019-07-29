package com.lemonlab.learnturkish

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lemonlab.learnturkish.items.SubjectItem
import com.lemonlab.learnturkish.keys.Keys
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_subject.*


class SubjectActivity : AppCompatActivity() {

    private var adapter = GroupAdapter<ViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subject)


        // init subject rv
        initSubjectRV()

        // add our subject to subject rv using groupie adapter
        addSubjectToRV()


    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_to_up, R.anim.no_animation)
    }

    private fun initSubjectRV() {
        subject_rv.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false
        )
        subject_rv.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )
        subject_rv.adapter = adapter
    }

    private fun addSubjectToRV() {
        adapter.clear()

        adapter.add(
            SubjectItem(
                "الحروف التركية",
                "تعلم الحروف التركية بطريقة تفاعلية",
                R.drawable.letters_icon,
                type = Keys.LESSON_ONE,
                activity = this@SubjectActivity,
                min_score = 0
            )
        )
        adapter.add(
            SubjectItem(
                "مفردات اساسية",
                "تعلم المفردات الاساسية في اللغة",
                R.drawable.chat_icon,
                type = Keys.LESSON_TWO,
                activity = this@SubjectActivity,
                min_score = 10
            )
        )
        adapter.add(
            SubjectItem(
                "الارقام والايام التركية",
                "تعلم الارقام التركية بطريقة تفاعلية",
                R.drawable.time_icon,
                type = Keys.LESSON_THREE,
                activity = this@SubjectActivity,
                min_score = 20
            )
        )
        adapter.add(
            SubjectItem(
                "الالوان في التركية",
                "تعلم الالوان الاساسية في اللغة التركية",
                R.drawable.colors,
                type = Keys.LESSON_FOUR,
                activity = this@SubjectActivity,
                min_score = 30
            )
        )

        adapter.add(
            SubjectItem(
                "اجزاء الجسم",
                "تعلم اجزاء جسم الانسان بالتركية",
                R.drawable.brain_icon,
                type = Keys.LESSON_FIVE,
                activity = this@SubjectActivity,
                min_score = 40
            )
        )

        adapter.add(
            SubjectItem(
                "الادوات في التركية",
                "تعلم الادوات المنزلية و الزراعية في اللغة التركية",
                R.drawable.tools_icon,
                type = Keys.LESSON_SIX,
                activity = this@SubjectActivity,
                min_score = 50
            )
        )

        adapter.add(
            SubjectItem(
                "المفردات التعليمية",
                "تعلم المفردات التعليمية في المدرسة والجامعة",
                R.drawable.school,
                type = Keys.LESSON_SEVEN,
                activity = this@SubjectActivity,
                min_score = 60
            )
        )

        adapter.add(
            SubjectItem(
                "الصفات و النعت",
                "تعلم كيف تصف شخص ما بالتركية",
                R.drawable.adjectives,
                type = Keys.LESSON_EIGHT,
                activity = this@SubjectActivity,
                min_score = 80
            )
        )

        adapter.add(
            SubjectItem(
                "حروف الجر و الإتجاهات",
                "تعلم حروف الجر والاتجاهات بطريقة تفاعلية",
                R.drawable.prepositions_icon,
                type = Keys.LESSON_NINE,
                activity = this@SubjectActivity,
                min_score = 100
            )
        )

        adapter.add(
            SubjectItem(
                "الضمائر في التركية",
                "تعلم الضمائر المنفصلة و المتصلة و الملكية في اللغة التركية",
                R.drawable.pronouns,
                type = Keys.LESSON_TEN,
                activity = this@SubjectActivity,
                min_score = 110
            )
        )

        adapter.add(
            SubjectItem(
                "محادثة صوتية 1",
                "اسمع محادثة صوتية كاملة بين ليلى و رولا",
                R.drawable.chat_2_icon,
                type = Keys.CHAT_LESSON_ONE,
                activity = this@SubjectActivity,
                min_score = 120
            )
        )

        adapter.add(
            SubjectItem(
                "الملابس في التركية",
                "تعلم مفردات الملابس في التركية بطريقة تفاعلية",
                R.drawable.clothes,
                type = Keys.LESSON_ELEVEN,
                activity = this@SubjectActivity,
                min_score = 130
            )
        )

        adapter.add(
            SubjectItem(
                "الافعال في التركية",
                "تعرف على الافعال الرئيسية في اللغة التركية",
                R.drawable.idea_icon,
                type = Keys.LESSON_TWELVE,
                activity = this@SubjectActivity,
                min_score = 150
            )
        )

        adapter.add(
            SubjectItem(
                "الفعل المضارع",
                "تعلم الفعل المضارع في اللغة التركية بطريقة تفاعلية",
                R.drawable.marketing,
                type = Keys.LESSON_THIRTEEN,
                activity = this@SubjectActivity,
                min_score = 160
            )
        )

    }
}

