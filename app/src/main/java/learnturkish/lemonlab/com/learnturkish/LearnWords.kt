package learnturkish.lemonlab.com.learnturkish

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_learn_words.*
import learnturkish.lemonlab.com.learnturkish.R
import learnturkish.lemonlab.com.learnturkish.items.native_ad_item
import learnturkish.lemonlab.com.learnturkish.items.start_quiz
import learnturkish.lemonlab.com.learnturkish.items.word_item

class LearnWords : AppCompatActivity() {

    var adapter:GroupAdapter<ViewHolder> = GroupAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_words)

        initLearnWordRV()

        addWords()
    }

    fun initLearnWordRV(){
        learn_words_rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        learn_words_rv.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        learn_words_rv.adapter = adapter
    }

    fun addWords(){

        adapter.add(start_quiz("استمع الى جميع الكلمات لفتح الاختبار", R.drawable.chat_icon,this,"lesson_2"))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("Baba","أب", R.raw.word_4, this))
        adapter.add(word_item("Anne","أم", R.raw.word_3, this))
        adapter.add(word_item("Erkek kardeş","أخ", R.raw.word_9, this))
        adapter.add(word_item("Kız kardeş","أخت", R.raw.word_12, this))
        adapter.add(word_item("Amca","عم", R.raw.word_2, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("Hala","عمه", R.raw.word_10, this))
        adapter.add(word_item("Dayı","خال", R.raw.word_8, this))
        adapter.add(word_item("Teyze","خاله", R.raw.word_13, this))
        adapter.add(word_item("yenge","الكنه", R.raw.word_15, this))
        adapter.add(word_item("çocuk","طفل", R.raw.word_7, this))
        adapter.add(word_item("aile","اسره", R.raw.word_1, this))
        adapter.add(word_item("büyükanne","جدة", R.raw.word_5, this))
        adapter.add(word_item("büyükbaba","جد", R.raw.word_6, this))
        adapter.add(word_item("torun","حفيد", R.raw.word_14, this))
        adapter.add(word_item("ikiz","توأم", R.raw.word_11, this))
        adapter.add(word_item("Yer","أرض", R.raw.word_16, this))
        adapter.add(word_item("Deniz","بحر", R.raw.word_17, this))
        adapter.add(word_item("Toprak","تراب", R.raw.word_18, this))
        adapter.add(word_item("Dağ","جبل", R.raw.word_19, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("Ada","جزيرة", R.raw.word_20, this))
        adapter.add(word_item("Bulut","سحاب", R.raw.word_21, this))
        adapter.add(word_item("Gök","سماء", R.raw.word_22, this))
        adapter.add(word_item("Güneş","شمس", R.raw.word_23, this))
        adapter.add(word_item("Ay","قمر", R.raw.word_24, this))
        adapter.add(word_item("Su","مـاء", R.raw.word_25, this))
        adapter.add(word_item("Hava ","هواء", R.raw.word_26, this))
        adapter.add(word_item("Aslan","أسد", R.raw.word_27, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("inek","بقرة", R.raw.word_28, this))
        adapter.add(word_item("Deve","جمل", R.raw.word_29, this))
        adapter.add(word_item("At","حصان", R.raw.word_30, this))
        adapter.add(word_item("Eşek","حمار", R.raw.word_31, this))
        adapter.add(word_item("Hayvan", "حيوان",R.raw.word_32, this))
        adapter.add(word_item("Tavuk","دجاجة", R.raw.word_33, this))
        adapter.add(word_item("Kelebek","فراشة", R.raw.word_34, this))
        adapter.add(word_item("Maymun", "قرد",R.raw.word_35, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("Arı","نحلة", R.raw.word_36, this))
        adapter.add(word_item("Kedi","قطة", R.raw.word_37, this))
        adapter.add(word_item("Ne","ماذا", R.raw.word_38, this))
        adapter.add(word_item("Nasıl","كيف؟", R.raw.word_39, this))
        adapter.add(word_item("Sabah","صباح", R.raw.word_40, this))
        adapter.add(word_item("akşam","مساء", R.raw.word_41, this))
        adapter.add(word_item("Gece","الليل", R.raw.word_42, this))
        adapter.add(word_item("Gündüz","", R.raw.word_43, this))
        adapter.add(word_item("Oğle","الظهر", R.raw.word_44, this))
        adapter.add(word_item("Sabahleyin","في صباح", R.raw.word_45, this))
        adapter.add(word_item("akşamleyin","في المساء", R.raw.word_46, this))
        adapter.add(word_item("şimdi","الآن", R.raw.word_47, this))
        adapter.add(word_item("Sonra","لاحقا", R.raw.word_48, this))
        adapter.add(word_item("önce","قبل", R.raw.word_49, this))
        adapter.add(word_item("Erken","مبكرا", R.raw.word_50, this))
        adapter.add(word_item("Geç","متأخر", R.raw.word_51, this))
        adapter.add(word_item("bugün","اليوم", R.raw.word_52, this))
        adapter.add(word_item("yarın","غداً", R.raw.word_53, this))
        adapter.add(word_item("dün","أمس", R.raw.word_54, this))
        adapter.add(word_item("sağda","على اليمين", R.raw.word_54, this))
        adapter.add(word_item("solda","على اليسار", R.raw.word_55, this))
        adapter.add(word_item("içerde","في الداخل", R.raw.word_56, this))
        adapter.add(word_item("dışarda","في الخارج", R.raw.word_57, this))
        adapter.add(word_item("gerekir","يجب", R.raw.word_58, this))
        adapter.add(word_item("gerekmez","لايجب", R.raw.word_59, this))
        adapter.add(word_item("burada","هنـا", R.raw.word_60, this))
        adapter.add(word_item("Orada","هنـاك", R.raw.word_61, this))
        adapter.add(word_item("yakın","قريب", R.raw.word_62, this))
        adapter.add(word_item("uzak","بعيد", R.raw.word_63, this))
        adapter.add(word_item("erkek","ذكر", R.raw.word_64, this))
        adapter.add(word_item("kadın","انثى", R.raw.word_65, this))
        adapter.add(word_item("ne zaman","متى؟", R.raw.word_66, this))
        adapter.add(word_item("nasıl","كيف؟", R.raw.word_67, this))
        adapter.add(word_item("istiyorum","أريد", R.raw.word_68, this))
        adapter.add(word_item("istemiyorum","لا اريد", R.raw.word_69, this))
        adapter.add(word_item("beğendim","أعجبني", R.raw.word_71, this))
        adapter.add(word_item("alt","تحت", R.raw.word_72, this))
        adapter.add(word_item("üst","فوق", R.raw.word_73, this))
    }
}
