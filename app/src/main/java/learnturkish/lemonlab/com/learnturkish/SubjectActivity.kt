package learnturkish.lemonlab.com.learnturkish

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_subject.*
import learnturkish.lemonlab.com.learnturkish.items.subject_item
import learnturkish.lemonlab.com.learnturkish.keys.Keys


class SubjectActivity : AppCompatActivity() {

    var adapter = GroupAdapter<ViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subject)

        // init subject rv
        initSubjectRV()

        // add our subject to subject rv using groupie adapter
        addSubjectToRV()

    }

    fun initSubjectRV(){
        subject_rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        subject_rv.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL ))
        subject_rv.adapter = adapter
    }

    fun addSubjectToRV(){
        adapter.clear()

        adapter.add(subject_item("الحروف التركية", "تعلم الحروف التركية بطريقة تفاعلية",
            R.drawable.letters_icon, type = Keys.LESSON_ONE, activity = this@SubjectActivity, min_score = 0))
        adapter.add(subject_item("مفردات اساسية", "تعلم المفردات الاساسية في اللغة",
            R.drawable.chat_icon, type = Keys.LESSON_TWO, activity = this@SubjectActivity, min_score = 3))
        adapter.add(subject_item("الارقام والايام التركية", "تعلم الارقام التركية بطريقة تفاعلية",
            R.drawable.time_icon, type = Keys.LESSON_THREE, activity = this@SubjectActivity, min_score = 6))
        adapter.add(subject_item("الالوان في التركية", "تعلم الالوان الاساسية في اللغة التركية",
            R.drawable.colors, type = Keys.LESSON_FOUR, activity = this@SubjectActivity, min_score = 90))

        adapter.add(subject_item("اجزاء الجسم", "تعلم اجزاء جسم الانسان بالتركية",
            R.drawable.brain_icon, type = Keys.LESSON_FIVE, activity = this@SubjectActivity))

        adapter.add(subject_item("الادوات في التركية", "تعلم الادوات المنزلية و الزراعية في اللغة التركية",
            R.drawable.tools_icon, type = Keys.LESSON_SIX, activity = this@SubjectActivity))

        adapter.add(subject_item("المفردات التعليمية", "تعلم المفردات التعليمية في المدرسة والجامعة",
            R.drawable.school, type = Keys.LESSON_SEVEN, activity = this@SubjectActivity))

        adapter.add(subject_item("الصفات و النعت", "تعلم كيف تصف شخص ما بالتركية",
            R.drawable.adjectives, type = Keys.LESSON_EIGHT, activity = this@SubjectActivity))

        adapter.add(subject_item("حروف الجر و الإتجاهات", "تعلم حروف الجر والاتجاهات بطريقة تفاعلية",
            R.drawable.prepositions_icon, type = Keys.LESSON_NINE, activity = this@SubjectActivity))

        adapter.add(subject_item("الضمائر في التركية", "تعلم الضمائر المنفصلة و المتصلة و الملكية في اللغة التركية",
            R.drawable.pronouns, type = Keys.LESSON_TEN, activity = this@SubjectActivity))

        adapter.add(subject_item("محادثة صوتية 1", "اسمع محادثة صوتية كاملة بين ليلى و رولا",
            R.drawable.chat_2_icon, type = Keys.CHAT_LESSON_ONE, activity = this@SubjectActivity))

    }
}

