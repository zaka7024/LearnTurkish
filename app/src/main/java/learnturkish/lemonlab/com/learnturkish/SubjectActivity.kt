package learnturkish.lemonlab.com.learnturkish

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
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
            R.drawable.letters_icon, type = Keys.LESSON_ONE, activity = this@SubjectActivity))
        adapter.add(subject_item("مفردات اساسية", "تعلم المفردات الاساسية في اللغة",
            R.drawable.chat_icon, type = Keys.LESSON_TWO, activity = this@SubjectActivity))
        adapter.add(subject_item("الارقام والايام التركية", "تعلم الارقام التركية بطريقة تفاعلية",
            R.drawable.time_icon, type = Keys.LESSON_THREE, activity = this@SubjectActivity))
        adapter.add(subject_item("الالوان في التركية", "تعلم الالوان الاساسية في اللغة التركية",
            R.drawable.colors, type = Keys.LESSON_FOUR, activity = this@SubjectActivity))
    }
}

