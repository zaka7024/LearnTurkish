package com.lemonlab.learnturkish

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lemonlab.learnturkish.items.LetterItem
import com.lemonlab.learnturkish.items.NativeAdItem
import com.lemonlab.learnturkish.items.StartQuiz
import com.lemonlab.learnturkish.items.WordItem
import com.lemonlab.learnturkish.keys.Keys
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_learn_letters.*

class LearnListen : AppCompatActivity() {

    private var adapter = GroupAdapter<ViewHolder>()
    private var lessonType = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_letters)

        // get the lesson type from SubjectItem
        lessonType = intent?.extras?.getString(Keys.LESSON_TYPE)!!

        // init letters rv
        initLearnLettersRV()

        // add items(letters with sound) to rv
        when (lessonType) {
            Keys.LESSON_ONE -> addLetters()
            Keys.LESSON_TWO -> addWords()
            Keys.LESSON_THREE -> addNumbers()
            Keys.LESSON_FOUR -> addColors()
            Keys.LESSON_FIVE -> addParts()
            Keys.LESSON_SIX -> addHome()
            Keys.LESSON_SEVEN -> addSchool()
            Keys.LESSON_EIGHT -> addSefat()
            Keys.LESSON_NINE -> addPrepositions()
            Keys.LESSON_TEN -> addPronouns()
            Keys.LESSON_ELEVEN -> addClothes()
            Keys.LESSON_TWELVE -> addVerbs()
            Keys.LESSON_THIRTEEN -> addPresent()
        }

    }

    private fun initLearnLettersRV() {
        learn_letters_rv.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false
        )
        learn_letters_rv.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )
        learn_letters_rv.adapter = adapter
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.no_animation, R.anim.slide_to_down)
    }

    // LESSON ONE
    private fun addLetters() {

        adapter.add(
            StartQuiz(
                "استمع الى جميع الحروف ثم انتقل الى الاختبار", R.drawable.letters_icon,
                this, Keys.LESSON_ONE
            )
        )

        adapter.add(
            LetterItem(
                "A",
                "a",
                "alaska",
                R.raw.a_char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "B",
                "b",
                "bravo",
                R.raw.b_char,
                this@LearnListen
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            LetterItem(
                "C",
                "c",
                "Chat",
                R.raw.c_char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "Ç",
                "ç",
                "çay",
                R.raw.c__char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "D",
                "d",
                "david",
                R.raw.d_char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "E",
                "e",
                "emma",
                R.raw.e_char,
                this@LearnListen
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            LetterItem(
                "F",
                "f",
                "cafe",
                R.raw.f_char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "G",
                "g",
                "gym",
                R.raw.g_char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "Ğ",
                "ğ",
                "yağmur",
                R.raw.g__char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "H",
                "h",
                "havlu",
                R.raw.h_char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "I",
                "i",
                "ıspanak",
                R.raw.i_char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "J",
                "j",
                "jimnastik ",
                R.raw.j_char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "K",
                "k",
                "kitap ",
                R.raw.k_char,
                this@LearnListen
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            LetterItem(
                "L",
                "l",
                "limon",
                R.raw.l_char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "M",
                "m",
                "masa ",
                R.raw.m_char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "N",
                "n",
                "Namaz",
                R.raw.n_char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "O",
                "o",
                "okul",
                R.raw.o_char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "Ö",
                "ö",
                "ördek",
                R.raw.o__char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "P",
                "p",
                "parmak",
                R.raw.p_char,
                this@LearnListen
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            LetterItem(
                "R",
                "r",
                "resim",
                R.raw.r_char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "S",
                "s",
                "su",
                R.raw.s_char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "Ş",
                "ş",
                "şeker",
                R.raw.s__char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "T",
                "t",
                "top",
                R.raw.t_char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "U",
                "u",
                "uçak",
                R.raw.u_char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "Ü",
                "ü",
                "ülke",
                R.raw.u__char,
                this@LearnListen
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            LetterItem(
                "V",
                "v",
                "vazo",
                R.raw.v_char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "Y",
                "y",
                "yemek",
                R.raw.y_char,
                this@LearnListen
            )
        )
        adapter.add(
            LetterItem(
                "Z",
                "z",
                "zambak",
                R.raw.z_char,
                this@LearnListen
            )
        )
    }

    // LESSON TWO
    private fun addWords() {

        adapter.add(
            StartQuiz(
                "استمع الى جميع الكلمات ثم انتقل الى الاختبار", R.drawable.chat_icon,
                this, Keys.LESSON_TWO
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "Baba",
                "أب",
                R.raw.word_4,
                this
            )
        )
        adapter.add(
            WordItem(
                "Anne",
                "أم",
                R.raw.word_3,
                this
            )
        )
        adapter.add(
            WordItem(
                "Erkek kardeş",
                "أخ",
                R.raw.word_9,
                this
            )
        )
        adapter.add(
            WordItem(
                "Kız kardeş",
                "أخت",
                R.raw.word_12,
                this
            )
        )
        adapter.add(
            WordItem(
                "Amca",
                "عم",
                R.raw.word_2,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "Hala",
                "عمه",
                R.raw.word_10,
                this
            )
        )
        adapter.add(
            WordItem(
                "Dayı",
                "خال",
                R.raw.word_8,
                this
            )
        )
        adapter.add(
            WordItem(
                "Teyze",
                "خاله",
                R.raw.word_13,
                this
            )
        )
        adapter.add(
            WordItem(
                "yenge",
                "الكنه",
                R.raw.word_15,
                this
            )
        )
        adapter.add(
            WordItem(
                "çocuk",
                "طفل",
                R.raw.word_7,
                this
            )
        )
        adapter.add(
            WordItem(
                "aile",
                "اسره",
                R.raw.word_1,
                this
            )
        )
        adapter.add(
            WordItem(
                "büyükanne",
                "جدة",
                R.raw.word_5,
                this
            )
        )
        adapter.add(
            WordItem(
                "büyükbaba",
                "جد",
                R.raw.word_6,
                this
            )
        )
        adapter.add(
            WordItem(
                "torun",
                "حفيد",
                R.raw.word_14,
                this
            )
        )
        adapter.add(
            WordItem(
                "ikiz",
                "توأم",
                R.raw.word_11,
                this
            )
        )
        adapter.add( // quiz point
            WordItem(
                "Yer",
                "أرض",
                R.raw.word_16,
                this
            )
        )
        adapter.add(
            WordItem(
                "Deniz",
                "بحر",
                R.raw.word_17,
                this
            )
        )
        adapter.add(
            WordItem(
                "Toprak",
                "تراب",
                R.raw.word_18,
                this
            )
        )
        adapter.add(
            WordItem(
                "Dağ",
                "جبل",
                R.raw.word_19,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "Ada",
                "جزيرة",
                R.raw.word_20,
                this
            )
        )
        adapter.add(
            WordItem(
                "Bulut",
                "سحاب",
                R.raw.word_21,
                this
            )
        )
        adapter.add(
            WordItem(
                "Gök",
                "سماء",
                R.raw.word_22,
                this
            )
        )
        adapter.add(
            WordItem(
                "Güneş",
                "شمس",
                R.raw.word_23,
                this
            )
        )
        adapter.add(
            WordItem(
                "Ay",
                "قمر",
                R.raw.word_24,
                this
            )
        )
        adapter.add(
            WordItem(
                "Su",
                "مـاء",
                R.raw.word_25,
                this
            )
        )
        adapter.add(
            WordItem(
                "Hava ",
                "هواء",
                R.raw.word_26,
                this
            )
        )
        adapter.add(
            WordItem(
                "Aslan",
                "أسد",
                R.raw.word_27,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "inek",
                "بقرة",
                R.raw.word_28,
                this
            )
        )
        adapter.add(
            WordItem(
                "Deve",
                "جمل",
                R.raw.word_29,
                this
            )
        )
        adapter.add(
            WordItem(
                "At",
                "حصان",
                R.raw.word_30,
                this
            )
        )
        adapter.add(
            WordItem(
                "Eşek",
                "حمار",
                R.raw.word_31,
                this
            )
        )
        adapter.add(
            WordItem(
                "Hayvan",
                "حيوان",
                R.raw.word_32,
                this
            )
        )
        adapter.add(
            WordItem(
                "Tavuk",
                "دجاجة",
                R.raw.word_33,
                this
            )
        )
        adapter.add(
            WordItem(
                "Kelebek",
                "فراشة",
                R.raw.word_34,
                this
            )
        )
        adapter.add(
            WordItem(
                "Maymun",
                "قرد",
                R.raw.word_35,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "Arı",
                "نحلة",
                R.raw.word_36,
                this
            )
        )
        adapter.add(
            WordItem(
                "Kedi",
                "قطة",
                R.raw.word_37,
                this
            )
        )
        adapter.add(
            WordItem(
                "Ne",
                "ماذا",
                R.raw.word_38,
                this
            )
        )
        adapter.add(
            WordItem(
                "Nasıl",
                "كيف؟",
                R.raw.word_39,
                this
            )
        )
        adapter.add(
            WordItem(
                "Sabah",
                "صباح",
                R.raw.word_40,
                this
            )
        )
        adapter.add(
            WordItem(
                "akşam",
                "مساء",
                R.raw.word_41,
                this
            )
        )
        adapter.add(
            WordItem(
                "Gece",
                "الليل",
                R.raw.word_42,
                this
            )
        )
        adapter.add(
            WordItem(
                "Gündüz",
                "",
                R.raw.word_43,
                this
            )
        )
        adapter.add(
            WordItem(
                "Oğle",
                "الظهر",
                R.raw.word_44,
                this
            )
        )
        adapter.add(
            WordItem(
                "Sabahleyin",
                "في صباح",
                R.raw.word_45,
                this
            )
        )
        adapter.add(
            WordItem(
                "akşamleyin",
                "في المساء",
                R.raw.word_46,
                this
            )
        )
        adapter.add(
            WordItem(
                "şimdi",
                "الآن",
                R.raw.word_47,
                this
            )
        )
        adapter.add(
            WordItem(
                "Sonra",
                "لاحقا",
                R.raw.word_48,
                this
            )
        )
        adapter.add(
            WordItem(
                "önce",
                "قبل",
                R.raw.word_49,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "Erken",
                "مبكرا",
                R.raw.word_50,
                this
            )
        )
        adapter.add(
            WordItem(
                "Geç",
                "متأخر",
                R.raw.word_51,
                this
            )
        )
        adapter.add(
            WordItem(
                "bugün",
                "اليوم",
                R.raw.word_52,
                this
            )
        )
        adapter.add(
            WordItem(
                "yarın",
                "غداً",
                R.raw.word_53,
                this
            )
        )
        adapter.add(
            WordItem(
                "dün",
                "أمس",
                R.raw.word_54,
                this
            )
        )
        adapter.add(
            WordItem(
                "sağda",
                "على اليمين",
                R.raw.word_55,
                this
            )
        )
        adapter.add(
            WordItem(
                "solda",
                "على اليسار",
                R.raw.word_56,
                this
            )
        )
        adapter.add(
            WordItem(
                "içerde",
                "في الداخل",
                R.raw.word_57,
                this
            )
        )
        adapter.add(
            WordItem(
                "dışarda",
                "في الخارج",
                R.raw.word_58,
                this
            )
        )
        adapter.add(
            WordItem(
                "gerekir",
                "يجب",
                R.raw.word_59,
                this
            )
        )
        adapter.add(
            WordItem(
                "gerekmez",
                "لايجب",
                R.raw.word_60,
                this
            )
        )
        adapter.add(
            WordItem(
                "burada",
                "هنـا",
                R.raw.word_61,
                this
            )
        )
        adapter.add(
            WordItem(
                "Orada",
                "هنـاك",
                R.raw.word_62,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "yakın",
                "قريب",
                R.raw.word_63,
                this
            )
        )
        adapter.add(
            WordItem(
                "uzak",
                "بعيد",
                R.raw.word_64,
                this
            )
        )
        adapter.add(
            WordItem(
                "erkek",
                "ذكر",
                R.raw.word_65,
                this
            )
        )
        adapter.add(
            WordItem(
                "kadın",
                "انثى",
                R.raw.word_66,
                this
            )
        )
        adapter.add(
            WordItem(
                "ne zaman",
                "متى؟",
                R.raw.word_67,
                this
            )
        )
        adapter.add(
            WordItem(
                "nasıl",
                "كيف؟",
                R.raw.word_68,
                this
            )
        )
        adapter.add(
            WordItem(
                "istiyorum",
                "أريد",
                R.raw.word_69,
                this
            )
        )
        adapter.add(
            WordItem(
                "istemiyorum",
                "لا اريد",
                R.raw.word_70,
                this
            )
        )
        adapter.add(
            WordItem(
                "beğendim",
                "أعجبني",
                R.raw.word_71,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "alt",
                "تحت",
                R.raw.word_72,
                this
            )
        )
        adapter.add(
            WordItem(
                "üst",
                "فوق",
                R.raw.word_73,
                this
            )
        )
    }

    // LESSON THREE
    private fun addNumbers() {

        adapter.add(
            StartQuiz(
                "استمع الى جميع الكلمات ثم انتقل الى الاختبار", R.drawable.time_icon,
                this, Keys.LESSON_THREE
            )
        )

        adapter.add(
            WordItem(
                "sıfır",
                "صفر",
                R.raw.zero,
                this
            )
        )
        adapter.add(
            WordItem(
                "bir",
                "واحد",
                R.raw.one,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "iki",
                "اثنين",
                R.raw.two,
                this
            )
        )
        adapter.add(
            WordItem(
                "üç ",
                "ثلاث",
                R.raw.three,
                this
            )
        )
        adapter.add(
            WordItem(
                "dört ",
                "اربعة",
                R.raw.four,
                this
            )
        )
        adapter.add(
            WordItem(
                "beş ",
                "خمسة",
                R.raw.five,
                this
            )
        )
        adapter.add(
            WordItem(
                "altı ",
                "ستة",
                R.raw.six,
                this
            )
        )
        adapter.add(
            WordItem(
                "yedi ",
                "سبعة",
                R.raw.seven,
                this
            )
        )
        adapter.add(
            WordItem(
                "sekiz ",
                "ثمانية",
                R.raw.eight,
                this
            )
        )
        adapter.add(
            WordItem(
                "dokuz ",
                "تسعة",
                R.raw.nine,
                this
            )
        )
        adapter.add(
            WordItem(
                "on ",
                "عشرة",
                R.raw.ten,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "Cumarttesi",
                "السبت",
                R.raw.saturday,
                this
            )
        )
        adapter.add(
            WordItem(
                "Pazar ",
                "الاحد",
                R.raw.sunday,
                this
            )
        )
        adapter.add(
            WordItem(
                "Pazartesi ",
                "الاثنين",
                R.raw.monday,
                this
            )
        )
        adapter.add(
            WordItem(
                "Salı ",
                "الثلاثاء",
                R.raw.tuesday,
                this
            )
        )
        adapter.add(
            WordItem(
                "çarşamba ",
                "الاربعاء",
                R.raw.wednesday,
                this
            )
        )
        adapter.add(
            WordItem(
                "Perşembe ",
                "الخميس",
                R.raw.thursday,
                this
            )
        )
        adapter.add(
            WordItem(
                "Cuma ",
                "الجمعة",
                R.raw.friday,
                this
            )
        )
        adapter.add(
            WordItem(
                "Gün ",
                "يوم",
                R.raw.day,
                this
            )
        )
        adapter.add(
            WordItem(
                "Hafta ",
                "اسبوع",
                R.raw.week,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "Ay ",
                "شهر",
                R.raw.month,
                this
            )
        )
        adapter.add(
            WordItem(
                "Sene ",
                "سنة",
                R.raw.year,
                this
            )
        )
        adapter.add(
            WordItem(
                "Yaz",
                "صيف",
                R.raw.summer,
                this
            )
        )
        adapter.add(
            WordItem(
                "kış",
                "شتاء",
                R.raw.winter,
                this
            )
        )
        adapter.add(
            WordItem(
                "Sonbahar",
                "خريف",
                R.raw.autumn,
                this
            )
        )
        adapter.add(
            WordItem(
                "Ilkbahar",
                "ربيع",
                R.raw.spring,
                this
            )
        )
        adapter.add(
            WordItem(
                "Ocak",
                "كانون ثاني",
                R.raw.january,
                this
            )
        )
        adapter.add(
            WordItem(
                "Şubat",
                "شباط",
                R.raw.february,
                this
            )
        )
        adapter.add(
            WordItem(
                "Mart",
                "اذار",
                R.raw.march,
                this
            )
        )
        adapter.add(
            WordItem(
                "Nisan",
                "نيسان",
                R.raw.april,
                this
            )
        )
        adapter.add(
            WordItem(
                "Mayıs",
                "أيّار",
                R.raw.may,
                this
            )
        )
        adapter.add(
            WordItem(
                "Haziran",
                "حزيران",
                R.raw.june,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "Temmuz",
                "تمّوز",
                R.raw.july,
                this
            )
        )
        adapter.add(
            WordItem(
                "Ağustos",
                "آب",
                R.raw.august,
                this
            )
        )
        adapter.add(
            WordItem(
                "Eylül",
                "أيلول",
                R.raw.september,
                this
            )
        )
        adapter.add(
            WordItem(
                "Ekim",
                "تشرين أول",
                R.raw.october,
                this
            )
        )
        adapter.add(
            WordItem(
                "Kasım",
                "تشرين ثاني",
                R.raw.november,
                this
            )
        )
        adapter.add(
            WordItem(
                "Aralık",
                "كانون أول",
                R.raw.december,
                this
            )
        )
        adapter.add(
            WordItem(
                "Zaman",
                "وقت",
                R.raw.time,
                this
            )
        )
        adapter.add(
            WordItem(
                "Saat",
                "ساعة",
                R.raw.hour,
                this
            )
        )
        adapter.add(
            WordItem(
                "Dakika",
                "دقيقة",
                R.raw.minute,
                this
            )
        )
        adapter.add(
            WordItem(
                "Saniye",
                "ثانية",
                R.raw.second,
                this
            )
        )

    }

    // LESSON FOUR
    private fun addColors() {

        adapter.add(
            StartQuiz(
                "استمع الى جميع الكلمات ثم انتقل الى الاختبار", R.drawable.colors,
                this, Keys.LESSON_FOUR
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "renk",
                "لون",
                R.raw.color,
                this
            )
        )
        adapter.add(
            WordItem(
                "mavi",
                "ازرق",
                R.raw.blue,
                this
            )
        )
        adapter.add(
            WordItem(
                "gri",
                "رمادي",
                R.raw.grey,
                this
            )
        )
        adapter.add(
            WordItem(
                "sarı",
                "اصفر",
                R.raw.yellow,
                this
            )
        )
        adapter.add(
            WordItem(
                "siyah",
                "أسود",
                R.raw.black,
                this
            )
        )
        adapter.add(
            WordItem(
                "turuncu",
                "برتقالي",
                R.raw.orange,
                this
            )
        )
        adapter.add(
            WordItem(
                "pembe",
                "وردي",
                R.raw.pink,
                this
            )
        )
        adapter.add(
            WordItem(
                "kırmızı",
                "احمر",
                R.raw.red,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "yeşil",
                "اخضر",
                R.raw.green,
                this
            )
        )
        adapter.add(
            WordItem(
                "mor",
                "ارجواني",
                R.raw.purple,
                this
            )
        )
        adapter.add(
            WordItem(
                "beyaz",
                "ابيض",
                R.raw.white,
                this
            )
        )
        adapter.add(
            WordItem(
                "açık",
                "فاتح",
                R.raw.lighter,
                this
            )
        )
        adapter.add(
            WordItem(
                "koyu",
                "غامق",
                R.raw.darker,
                this
            )
        )
        adapter.add(
            WordItem(
                "parlak",
                "لامع",
                R.raw.bright,
                this
            )
        )
    }

    // LESSON FIVE
    private fun addParts() {

        adapter.add(
            StartQuiz(
                "استمع الى جميع الكلمات ثم انتقل الى الاختبار", R.drawable.brain_icon,
                this, Keys.LESSON_FIVE
            )
        )

        adapter.add(
            WordItem(
                "vucut",
                "جسم",
                R.raw.body,
                this
            )
        )
        adapter.add(
            WordItem(
                "baş",
                "راس",
                R.raw.head,
                this
            )
        )
        adapter.add(
            WordItem(
                "saç",
                "شغر",
                R.raw.hair,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "beyin",
                "عقل",
                R.raw.brian,
                this
            )
        )
        adapter.add(
            WordItem(
                "alın",
                "جبين",
                R.raw.front,
                this
            )
        )
        adapter.add(
            WordItem(
                "kulak",
                "اذن",
                R.raw.ear,
                this
            )
        )
        adapter.add(
            WordItem(
                "göz",
                "عين",
                R.raw.eye,
                this
            )
        )
        adapter.add(
            WordItem(
                "kirpik",
                "رمش",
                R.raw.eyelash,
                this
            )
        )
        adapter.add(
            WordItem(
                "kaş",
                "حاجب",
                R.raw.eyebrow,
                this
            )
        )
        adapter.add(
            WordItem(
                "burun",
                "انف",
                R.raw.nose,
                this
            )
        )
        adapter.add(
            WordItem(
                "yanak",
                "خد",
                R.raw.cheek,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "yüz",
                "وجه",
                R.raw.face,
                this
            )
        )
        adapter.add(
            WordItem(
                "omuz",
                "كتف",
                R.raw.shoulder,
                this
            )
        )
        adapter.add(
            WordItem(
                "boyun",
                "رقبه",
                R.raw.neck,
                this
            )
        )
        adapter.add(
            WordItem(
                "kol",
                "ذراع",
                R.raw.arm,
                this
            )
        )
        adapter.add(
            WordItem(
                "el",
                "يد",
                R.raw.hand,
                this
            )
        )
        adapter.add(
            WordItem(
                "parmak",
                "اصبح",
                R.raw.finger,
                this
            )
        )
        adapter.add(
            WordItem(
                "tırnak",
                "اظفر",
                R.raw.nail,
                this
            )
        )
        adapter.add(
            WordItem(
                "sırt",
                "ظهر",
                R.raw.back,
                this
            )
        )
        adapter.add(
            WordItem(
                "göğüs",
                "صدر",
                R.raw.breast,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "karın",
                "بطن",
                R.raw.abdomen,
                this
            )
        )
        adapter.add(
            WordItem(
                "yürek",
                "قلب",
                R.raw.heart,
                this
            )
        )
        adapter.add(
            WordItem(
                "kara ciğer",
                "كبد",
                R.raw.liver,
                this
            )
        )
        adapter.add(
            WordItem(
                "ak ciğer",
                "رئة",
                R.raw.lungs,
                this
            )
        )
        adapter.add(
            WordItem(
                "bıyık",
                "شارب",
                R.raw.whiskers,
                this
            )
        )
        adapter.add(
            WordItem(
                "sakal",
                "لحية",
                R.raw.beard,
                this
            )
        )
        adapter.add(
            WordItem(
                "dudak",
                "شفّة",
                R.raw.lip,
                this
            )
        )
        adapter.add(
            WordItem(
                "ağız",
                "فم",
                R.raw.month,
                this
            )
        )
        adapter.add(
            WordItem(
                "diş ",
                "سن",
                R.raw.tooth,
                this
            )
        )
        adapter.add(
            WordItem(
                "dil",
                "لسان",
                R.raw.tongue,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "ayak",
                "قدم",
                R.raw.foot,
                this
            )
        )
        adapter.add(
            WordItem(
                "kan",
                "دم",
                R.raw.blood,
                this
            )
        )
        adapter.add(
            WordItem(
                "deri ",
                "جلد",
                R.raw.skin,
                this
            )
        )
    }

    // LESSON SIX
    private fun addHome() {

        adapter.add(
            StartQuiz(
                "استمع الى جميع الكلمات ثم انتقل الى الاختبار", R.drawable.tools_icon,
                this, Keys.LESSON_SIX
            )
        )

        adapter.add(
            WordItem(
                "kapı",
                "باب",
                R.raw.door,
                this
            )
        )
        adapter.add(
            WordItem(
                "masa",
                "طاولة",
                R.raw.table,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "telefon",
                "هاتف",
                R.raw.phone,
                this
            )
        )
        adapter.add(
            WordItem(
                "radyo",
                "راديو",
                R.raw.radio,
                this
            )
        )
        adapter.add(
            WordItem(
                "sandalye",
                "كرسي",
                R.raw.chair,
                this
            )
        )
        adapter.add(
            WordItem(
                "ocak",
                "فرن الغاز",
                R.raw.furnace,
                this
            )
        )
        adapter.add(
            WordItem(
                "koltuk",
                "كنب",
                R.raw.armchair,
                this
            )
        )
        adapter.add(
            WordItem(
                "bulaşık yıkama makinesi",
                "غسالة صحون",
                R.raw.dish_washing_machine,
                this
            )
        )
        adapter.add(
            WordItem(
                "yatak",
                "سرير",
                R.raw.bed,
                this
            )
        )
        adapter.add(
            WordItem(
                "buzdolabı",
                "ثلاجة",
                R.raw.refrigerator,
                this
            )
        )
        adapter.add(
            WordItem(
                "daire",
                "شقة",
                R.raw.apartment,
                this
            )
        )
        adapter.add(
            WordItem(
                "kablo",
                "كابل",
                R.raw.cabel,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "merdiven",
                "درج",
                R.raw.stairs,
                this
            )
        )
        adapter.add(
            WordItem(
                "mum",
                "شمعة",
                R.raw.candle,
                this
            )
        )
        adapter.add(
            WordItem(
                "halı",
                "سجادة",
                R.raw.carpet,
                this
            )
        )
        adapter.add(
            WordItem(
                "çöp",
                "نفايات",
                R.raw.garbage,
                this
            )
        )
        adapter.add(
            WordItem(
                "televizyon",
                "تلفاز",
                R.raw.telev,
                this
            )
        )
        adapter.add(
            WordItem(
                "resim",
                "صورة",
                R.raw.picture,
                this
            )
        )
        adapter.add(
            WordItem(
                "balkon",
                "بلكونة",
                R.raw.balkon,
                this
            )
        )
        adapter.add(
            WordItem(
                "pencere",
                "نافذة",
                R.raw.window,
                this
            )
        )
        adapter.add(
            WordItem(
                "yatak odası",
                "غرفة النوم",
                R.raw.bedroom,
                this
            )
        )
        adapter.add(
            WordItem(
                "mutfak",
                "مطبخ",
                R.raw.kitchen,
                this
            )
        )
        adapter.add(
            WordItem(
                "ev",
                "بيت",
                R.raw.home,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "yemek odası",
                "غرفة الطعام",
                R.raw.diningroom,
                this
            )
        )
        adapter.add(
            WordItem(
                "salon",
                "صالون",
                R.raw.salon,
                this
            )
        )
        adapter.add(
            WordItem(
                "tabak",
                "طبق",
                R.raw.plate,
                this
            )
        )
        adapter.add(
            WordItem(
                "duş",
                "دُش",
                R.raw.shower,
                this
            )
        )
        adapter.add(
            WordItem(
                "ayna ",
                "مرآة",
                R.raw.mirror,
                this
            )
        )
        adapter.add(
            WordItem(
                "yastık",
                "وسادة",
                R.raw.pillow,
                this
            )
        )
        adapter.add(
            WordItem(
                "perde",
                "ستارة",
                R.raw.curtain,
                this
            )
        )
        adapter.add(
            WordItem(
                "alet",
                "أداة",
                R.raw.tool,
                this
            )
        )
        adapter.add(
            WordItem(
                "kürek",
                "مجرفة",
                R.raw.shovel,
                this
            )
        )
        adapter.add(
            WordItem(
                "iğne ",
                "إبرة",
                R.raw.needle,
                this
            )
        )
        adapter.add(
            WordItem(
                "çekiç",
                "مطرقة",
                R.raw.hammer,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "testere",
                "منشار",
                R.raw.saw,
                this
            )
        )
        adapter.add(
            WordItem(
                "makas",
                "مقص",
                R.raw.cuter,
                this
            )
        )
    }

    // LESSON SEVEN
    private fun addSchool() {

        adapter.add(
            StartQuiz(
                "استمع الى جميع الكلمات ثم انتقل الى الاختبار", R.drawable.school,
                this, Keys.LESSON_SEVEN
            )
        )

        adapter.add(
            WordItem(
                "öğrenci",
                "طالب",
                R.raw.student,
                this
            )
        )
        adapter.add(
            WordItem(
                "hoca",
                "معلم",
                R.raw.teacher,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "okul",
                "مدرسة",
                R.raw.school,
                this
            )
        )
        adapter.add(
            WordItem(
                "üniversite",
                "جامعة",
                R.raw.university,
                this
            )
        )
        adapter.add(
            WordItem(
                "ilk okul",
                "المدرسة الابتدائية",
                R.raw.primary_school,
                this
            )
        )
        adapter.add(
            WordItem(
                "lise",
                "ثانوية",
                R.raw.high_school,
                this
            )
        )
        adapter.add(
            WordItem(
                "öğretmek",
                "التعليم",
                R.raw.teach,
                this
            )
        )
        adapter.add(
            WordItem(
                "bilgisayar",
                "حاسوب",
                R.raw.computer,
                this
            )
        )
        adapter.add(
            WordItem(
                "hesap makinesi",
                "الة حاسبة",
                R.raw.calculator,
                this
            )
        )
        adapter.add(
            WordItem(
                "kitap",
                "كتاب",
                R.raw.book,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "defter",
                "دفتر",
                R.raw.book_2,
                this
            )
        )
        adapter.add(
            WordItem(
                "kalem",
                "قلم",
                R.raw.pen,
                this
            )
        )
        adapter.add(
            WordItem(
                "silgi",
                "ممحاة",
                R.raw.eraser,
                this
            )
        )
        adapter.add(
            WordItem(
                "ödev",
                "واجب",
                R.raw.homework,
                this
            )
        )
        adapter.add(
            WordItem(
                "sınıf",
                "قاعة الدرس",
                R.raw.school_class,
                this
            )
        )
        adapter.add(
            WordItem(
                "sözlük",
                "قاموس",
                R.raw.dictionary,
                this
            )
        )
        adapter.add(
            WordItem(
                "kütüphane",
                "مكتبة",
                R.raw.library,
                this
            )
        )
        adapter.add(
            WordItem(
                "sınav",
                "امتحان",
                R.raw.exam,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "alıştırma",
                "تمرين",
                R.raw.exercise,
                this
            )
        )
        adapter.add(
            WordItem(
                "dönem",
                "فصل دراسي",
                R.raw.period,
                this
            )
        )
        adapter.add(
            WordItem(
                "yorum",
                "تعليق",
                R.raw.comment,
                this
            )
        )
        adapter.add(
            WordItem(
                "kolej",
                "كلية",
                R.raw.college,
                this
            )
        )
    }

    // LESSON EIGHT
    private fun addSefat() {

        adapter.add(
            StartQuiz(
                "استمع الى جميع الكلمات ثم انتقل الى الاختبار", R.drawable.adjectives,
                this, Keys.LESSON_EIGHT
            )
        )

        adapter.add(
            WordItem(
                "uzun",
                "طويل",
                R.raw.long_word,
                this
            )
        )
        adapter.add(
            WordItem(
                "kısa",
                "قصير",
                R.raw.short_word,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "büyük",
                "كبير",
                R.raw.big,
                this
            )
        )
        adapter.add(
            WordItem(
                "geniş",
                "واسع",
                R.raw.broad,
                this
            )
        )
        adapter.add(
            WordItem(
                "küçük",
                "صفير",
                R.raw.small,
                this
            )
        )
        adapter.add(
            WordItem(
                "kalın",
                "سميك",
                R.raw.thick,
                this
            )
        )
        adapter.add(
            WordItem(
                "ince",
                "رقيق",
                R.raw.thin,
                this
            )
        )
        adapter.add(
            WordItem(
                "yeni",
                "جديد",
                R.raw.new_word,
                this
            )
        )
        adapter.add(
            WordItem(
                "eski",
                "قديم",
                R.raw.old,
                this
            )
        )
        adapter.add(
            WordItem(
                "ucuz",
                "رخيص",
                R.raw.cheap,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "pahalı",
                "غالي",
                R.raw.expensive,
                this
            )
        )
        adapter.add(
            WordItem(
                "genç",
                "شاب",
                R.raw.young,
                this
            )
        )
        adapter.add(
            WordItem(
                "Yaşlı",
                "عجوز",
                R.raw.old_2,
                this
            )
        )
        adapter.add(
            WordItem(
                "yanlış",
                "خاطئ",
                R.raw.false_word,
                this
            )
        )
        adapter.add(
            WordItem(
                "doğru",
                "صحيح",
                R.raw.true_word,
                this
            )
        )
        adapter.add(
            WordItem(
                "iyi",
                "جيد",
                R.raw.good,
                this
            )
        )
        adapter.add(
            WordItem(
                "kötü",
                "سيئ",
                R.raw.bad,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "zor",
                "صعب",
                R.raw.difficult,
                this
            )
        )
        adapter.add(
            WordItem(
                "kolay",
                "سهل",
                R.raw.easy,
                this
            )
        )
    }

    // LESSON NINE
    private fun addPrepositions() {

        adapter.add(
            StartQuiz(
                "استمع الى جميع الكلمات ثم انتقل الى الاختبار",
                R.drawable.prepositions_icon,
                this,
                Keys.LESSON_NINE
            )
        )

        adapter.add(
            WordItem(
                "önünde",
                "امام",
                R.raw.in_front_of,
                this
            )
        )
        adapter.add(
            WordItem(
                "arkasında",
                "خلف",
                R.raw.behind,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "önce",
                "قبل",
                R.raw.before,
                this
            )
        )
        adapter.add(
            WordItem(
                "sonra",
                "بعد",
                R.raw.after,
                this
            )
        )
        adapter.add(
            WordItem(
                "içinde",
                "داخل",
                R.raw.in_word,
                this
            )
        )
        adapter.add(
            WordItem(
                "ile",
                "مع",
                R.raw.with,
                this
            )
        )
        adapter.add(
            WordItem(
                "olmadan",
                "بدون",
                R.raw.without,
                this
            )
        )
        adapter.add(
            WordItem(
                "dışında",
                "خارج",
                R.raw.outside,
                this
            )
        )
        adapter.add(
            WordItem(
                "üzerinde",
                "فوق",
                R.raw.over,
                this
            )
        )
        adapter.add(
            WordItem(
                "altında",
                "تحت",
                R.raw.under,
                this
            )
        )
        adapter.add(
            WordItem(
                "hakkında",
                "حول",
                R.raw.about,
                this
            )
        )
        adapter.add(
            WordItem(
                "karşısında",
                "ضد",
                R.raw.against,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "ve",
                "و",
                R.raw.and,
                this
            )
        )
        adapter.add(
            WordItem(
                "gibi",
                "مثل",
                R.raw.as_word,
                this
            )
        )
        adapter.add(
            WordItem(
                "arasında",
                "بين",
                R.raw.between,
                this
            )
        )
        adapter.add(
            WordItem(
                "ama",
                "لكن",
                R.raw.but,
                this
            )
        )
        adapter.add(
            WordItem(
                "için",
                "لـ (من اجل )",
                R.raw.for_word,
                this
            )
        )
        adapter.add(
            WordItem(
                "itibaren",
                "من",
                R.raw.day,
                this
            )
        )
        adapter.add(
            WordItem(
                "içinde",
                "في",
                R.raw.in_2,
                this
            )
        )
        adapter.add(
            WordItem(
                "yerine",
                "بدلا من",
                R.raw.instead,
                this
            )
        )
        adapter.add(
            WordItem(
                "yakınında",
                "قرب",
                R.raw.near,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "Veya",
                "أو",
                R.raw.or,
                this
            )
        )
        adapter.add(
            WordItem(
                "kadar",
                "حتى",
                R.raw.until,
                this
            )
        )
        adapter.add(
            WordItem(
                "Böylece",
                "لكي",
                R.raw.thus,
                this
            )
        )
        adapter.add(
            WordItem(
                "beri",
                "منذ",
                R.raw.since,
                this
            )
        )
    }

    // LESSON TEN
    private fun addPronouns() {

        adapter.add(
            StartQuiz(
                "استمع الى جميع الكلمات ثم انتقل الى الاختبار", R.drawable.pronouns,
                this, Keys.LESSON_TEN
            )
        )

        adapter.add(
            WordItem(
                "ben",
                "أنا",
                R.raw.i_word,
                this
            )
        )
        adapter.add(
            WordItem(
                "sen",
                "أنت",
                R.raw.you,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "o",
                "هو",
                R.raw.he_she_is,
                this
            )
        )
        adapter.add(
            WordItem(
                "o",
                "هي",
                R.raw.he_she_is,
                this
            )
        )
        adapter.add(
            WordItem(
                "biz",
                "نحن",
                R.raw.we,
                this
            )
        )
        adapter.add(
            WordItem(
                "Siz",
                "انتم",
                R.raw.you_siz,
                this
            )
        )
        adapter.add(
            WordItem(
                "onlar",
                "هم",
                R.raw.them,
                this
            )
        )
        adapter.add(
            WordItem(
                "Seni seviyorum",
                "أنا أحبك",
                R.raw.i_love_you,
                this
            )
        )
        adapter.add(
            WordItem(
                "O güzel",
                "هي جميلة",
                R.raw.she_is_beautiful,
                this
            )
        )
        adapter.add(
            WordItem(
                "Mutluyuz",
                "نحن سعداء",
                R.raw.we_are_happy,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "beni, bana",
                "ني( مثال اعطني )",
                R.raw.beni_bana,
                this
            )
        )
        adapter.add(
            WordItem(
                "seni, sana",
                "ك ( مثال اعطاك )",
                R.raw.seni_sana,
                this
            )
        )
        adapter.add(
            WordItem(
                "onu, ona",
                "ه ( مثال اعطاها )",
                R.raw.onu_ona,
                this
            )
        )
        adapter.add(
            WordItem(
                "onu, ona",
                "ها",
                R.raw.onu_ona,
                this
            )
        )
        adapter.add(
            WordItem(
                "bizi, bize",
                "نا ( مثال اعطانا )",
                R.raw.bizi_bize,
                this
            )
        )
        adapter.add(
            WordItem(
                "Sizi, size",
                "كم ( مثال اعطاكم )",
                R.raw.sizi_size,
                this
            )
        )
        adapter.add(
            WordItem(
                "onları, onlara",
                "هم ( مثال اعطاهم )",
                R.raw.onlari_onlara,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "Bizi arayablir misin?",
                "هل يمكنك الاتصال بنا؟",
                R.raw.can_you_call_us,
                this
            )
        )
        adapter.add(
            WordItem(
                "Bana telefon numaranı ver",
                "أعطني رقم هاتفك",
                R.raw.give_me_your_phone_number,
                this
            )
        )
        adapter.add(
            WordItem(
                "Ona beni aramasını söyle",
                "قل له أن يتصل بي",
                R.raw.tell_her_him_to_call_me,
                this
            )
        )
        adapter.add(
            WordItem(
                "benim",
                "ي ( مثال بلدك )",
                R.raw.benim,
                this
            )
        )
        adapter.add(
            WordItem(
                "senin",
                "ك ( مثال بلدك )",
                R.raw.your,
                this
            )
        )
        adapter.add(
            WordItem(
                "onun",
                "ه ( مثال بلده )",
                R.raw.his_her,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "onun",
                "ها ( مثال بلدها )",
                R.raw.his_her,
                this
            )
        )
        adapter.add(
            WordItem(
                "bizim",
                "نا ( مثال بلدنا )",
                R.raw.our,
                this
            )
        )
        adapter.add(
            WordItem(
                "Sizin",
                "كم ( مثال بلدكم )",
                R.raw.sizin,
                this
            )
        )
        adapter.add(
            WordItem(
                "onların",
                "هم ( مثال بلدهم )",
                R.raw.onlarin,
                this
            )
        )
        adapter.add(
            WordItem(
                "Onun e-postası...",
                "بريده الاركتروني هو...",
                R.raw.her_his_email,
                this
            )
        )
        adapter.add(
            WordItem(
                "Benim telefon numaram...",
                "رقهم هاتفي...",
                R.raw.my_phone_number_is,
                this
            )
        )
        adapter.add(
            WordItem(
                "Hayalimiz jordan ziyaret etmek",
                "حلمنا زيارة الاردن",
                R.raw.our_dream_is_to_visit_jordan,
                this
            )
        )
        adapter.add(
            WordItem(
                "benimki",
                "لي ( مثال كتاب لي )",
                R.raw.benimki,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "seninki",
                "لك ( مثال كتاب لك )",
                R.raw.seninki,
                this
            )
        )
        adapter.add(
            WordItem(
                "onunki",
                "له ( مثال كتاب لك )",
                R.raw.onunki,
                this
            )
        )
        adapter.add(
            WordItem(
                "onunki",
                "له ( مثال كتاب له )",
                R.raw.onunki,
                this
            )
        )
        adapter.add(
            WordItem(
                "bizimki",
                "لنا ( مثال حلوة لنا )",
                R.raw.bizimki,
                this
            )
        )
        adapter.add(
            WordItem(
                "Sizinki",
                "لكم ( مثال دروس لكم )",
                R.raw.sizinki,
                this
            )
        )
        adapter.add(
            WordItem(
                "onlarinki",
                "لهم ( مثال دروس لهم )",
                R.raw.onlarinki,
                this
            )
        )
        adapter.add(
            WordItem(
                "Bu kalem seninki mi?",
                "هل هذا القلم لك؟",
                R.raw.is_this_your_pencil,
                this
            )
        )
        adapter.add(
            WordItem(
                "Bu kitap benimki",
                "الكتاب هو لي",
                R.raw.this_book_is_for_me,
                this
            )
        )
        adapter.add(
            WordItem(
                "zafer bizimki",
                "النصر لنا",
                R.raw.zafer_bizimdir,
                this
            )
        )
    }

    // LESSON ELEVEN
    private fun addClothes() {

        adapter.add(
            StartQuiz(
                "استمع الى جميع الكلمات ثم انتقل الى الاختبار", R.drawable.pronouns,
                this, Keys.LESSON_ELEVEN
            )
        )

        adapter.add(
            WordItem(
                "Kemer", "حزام", R.raw.belt, this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "Elbiseler", "ملابس", R.raw.clothes, this
            )
        )

        adapter.add(
            WordItem(
                "Palto", "معطف", R.raw.coat, this
            )
        )

        adapter.add(
            WordItem(
                "Elbise", "فستان", R.raw.dress, this
            )
        )

        adapter.add(
            WordItem(
                "Gözlük", "نظارات", R.raw.glasses, this
            )
        )

        adapter.add(
            WordItem(
                "Eldiven", "قفازات", R.raw.glove, this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "Şapka", "قبعة", R.raw.hat, this
            )
        )

        adapter.add(
            WordItem(
                "Ceket", "معطف", R.raw.jacket, this
            )
        )

        adapter.add(
            WordItem(
                "Pantolon", "بنطلون", R.raw.trousers, this
            )
        )

        adapter.add(
            WordItem(
                "Yüzük", "خاتم", R.raw.ring, this
            )
        )

        adapter.add(
            WordItem(
                "Gömlek", "قميص", R.raw.shirt, this
            )
        )

        adapter.add(
            WordItem(
                "Ayakkabı", "احذية", R.raw.shoes, this
            )
        )

        adapter.add(
            WordItem(
                "Çorap", "جوارب ", R.raw.socks, this
            )
        )

        adapter.add(
            WordItem(
                "Takım elbise", "بذلة", R.raw.suit, this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "Süveter", "سترة", R.raw.sweater, this
            )
        )

        adapter.add(
            WordItem(
                "Kravat", "ربطة عنق", R.raw.tie, this
            )
        )

        adapter.add(
            WordItem(
                "Şemsiye", "شمسية", R.raw.umbrella, this
            )
        )

        adapter.add(
            WordItem(
                "İç çamaşırı", "ملابس داخلية", R.raw.underwear, this
            )
        )

        adapter.add(
            WordItem(
                "Cüzdan", "شمسية", R.raw.wallet, this
            )
        )

        adapter.add(
            WordItem(
                "Kol saati", "ساعة يد", R.raw.watch, this
            )
        )
    }

    // LESSON TWELVE
    private fun addVerbs() {
        adapter.add(
            WordItem(
                "Sürmek",
                "الدفع",
                R.raw.lead,
                this
            )
        )
        adapter.add(
            WordItem(
                "Bulmak",
                "العثور على",
                R.raw.find,
                this
            )
        )
        adapter.add(
            WordItem(
                "Vermek",
                "منح",
                R.raw.give,
                this
            )
        )
        adapter.add(
            WordItem(
                "Sahip olmak",
                "الامتلاك",
                R.raw.have,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "Bilmek",
                "المعرفة",
                R.raw.know,
                this
            )
        )
        adapter.add(
            WordItem(
                "Öğrenmek",
                "التعلم",
                R.raw.learn,
                this
            )
        )
        adapter.add(
            WordItem(
                "Sevmek",
                "حب",
                R.raw.love,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "Oynamak",
                "لعب",
                R.raw.play,
                this
            )
        )
        adapter.add(
            WordItem(
                "Okumak",
                "القراءة",
                R.raw.read,
                this
            )
        )
        adapter.add(
            WordItem(
                "Görmek",
                "رؤية",
                R.raw.see,
                this
            )
        )
        adapter.add(
            WordItem(
                "Gülümsemek",
                "الابتسامة",
                R.raw.smile,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "Konuşmak",
                "التكلم",
                R.raw.talk,
                this
            )
        )
        adapter.add(
            WordItem(
                "Düşünmek",
                "التفكير",
                R.raw.think,
                this
            )
        )
        adapter.add(
            WordItem(
                "Anlamak",
                "الفهم",
                R.raw.understand,
                this
            )
        )
        adapter.add(
            WordItem(
                "Çalışmak",
                "العمل",
                R.raw.work,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "Yazmak",
                "الكتابة",
                R.raw.write,
                this
            )
        )
    }

    private fun addPresent() {
        adapter.add(
            WordItem(
                "Seni görüyorum",
                "أنا أراك",
                R.raw.he_she_knows_my_friend,
                this
            )
        )

        adapter.add(
            WordItem(
                "Kalemle yazarım",
                "أنا أكتب بالقلم",
                R.raw.i_write_with_pencil,
                this
            )
        )

        adapter.add(
            WordItem(
                "Elmaları seviyorsun",
                "أنت تحب التفاح",
                R.raw.you_love_apples,
                this
            )
        )

        adapter.add(
            WordItem(
                "Para verirsin",
                "أنت تعطي المال",
                R.raw.you_give_a_money,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "Tenis oynarsın",
                "أنت تلعب كرة المضرب",
                R.raw.you_play_tennis,
                this
            )
        )

        adapter.add(
            WordItem(
                "Kitap okur",
                "هو يقرأ كتاب",
                R.raw.reading_a_book,
                this
            )
        )

        adapter.add(
            WordItem(
                "Beni anlıyor",
                "هو يفهمني",
                R.raw.understand_me,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "Kedisi var",
                "هي لديها قطة",
                R.raw.she_has_a_cat,
                this
            )
        )

        adapter.add(
            WordItem(
                "Arkadaşımı tanıyor",
                "هي تعرف صديقي",
                R.raw.he_she_knows_my_friend,
                this
            )
        )

        adapter.add(
            WordItem(
                "Öğrenmek istiyoruz",
                "نحن نريد أن نتعلم",
                R.raw.we_want_to_learn,
                this
            )
        )

        adapter.add(
            WordItem(
                "Burada çalışıyorsunuz",
                "أنتم تعملون هنا",
                R.raw.you_work_here,
                this
            )
        )

        adapter.add(NativeAdItem(this))

        adapter.add(
            WordItem(
                "Fransızca konuşuyorsunuz",
                "أنتم تتكلمون الفرنسية",
                R.raw.you_speak_french,
                this
            )
        )
        adapter.add(
            WordItem(
                "Gülümsüyorlar",
                "هم يتبسمون",
                R.raw.they_smiles,
                this
            )
        )
    }
}
