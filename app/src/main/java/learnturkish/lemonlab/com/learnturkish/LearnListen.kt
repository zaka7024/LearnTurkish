package learnturkish.lemonlab.com.learnturkish

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_learn_letters.*
import learnturkish.lemonlab.com.learnturkish.items.letter_item
import learnturkish.lemonlab.com.learnturkish.items.native_ad_item
import learnturkish.lemonlab.com.learnturkish.items.start_quiz
import learnturkish.lemonlab.com.learnturkish.items.word_item
import learnturkish.lemonlab.com.learnturkish.keys.Keys

class LearnListen : AppCompatActivity() {

    var adapter = GroupAdapter<ViewHolder>()
    var lesson_type = ""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_letters)

        // get the lesson type from subject_item
        lesson_type = intent?.extras?.getString(Keys.LESSON_TYPE)!!

        // init letters rv
        initLearnLettersRV()

        // add items(letters with sound) to rv
        if (lesson_type == Keys.LESSON_ONE){
            addLetters()
        }else if (lesson_type == Keys.LESSON_TWO){
            addWords()
        }else if (lesson_type == Keys.LESSON_THREE){
            addNumbers()
        }else if (lesson_type == Keys.LESSON_FOUR){
            addColors()
        }else if (lesson_type == Keys.LESSON_FIVE){
            addParts()
        }else if (lesson_type == Keys.LESSON_SIX){
            addHome()
        }else if (lesson_type == Keys.LESSON_SEVEN){
            addSchool()
        }

        val sharedPref = getSharedPreferences("app_data", 0)


    }

    fun initLearnLettersRV(){
        learn_letters_rv.layoutManager  = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        learn_letters_rv.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        learn_letters_rv.adapter = adapter
    }

    // LESSON ONE
    fun addLetters(){

        adapter.add(start_quiz("استمع الى جميع الحروف ثم انتقل الى الاختبار", R.drawable.letters_icon,
            this,"lesson_1"))

        adapter.add(letter_item("A", "a","alaska", R.raw.a_char, this@LearnListen))
        adapter.add(letter_item("B", "b","bravo", R.raw.b_char, this@LearnListen))
        adapter.add(letter_item("C", "c","chat", R.raw.c_char, this@LearnListen))
        adapter.add(letter_item("Ç", "ç","çay", R.raw.c__char, this@LearnListen))
        adapter.add(letter_item("D", "d","david", R.raw.d_char, this@LearnListen))
        adapter.add(letter_item("E", "e","emma", R.raw.e_char, this@LearnListen))
        adapter.add(letter_item("F", "f", "cafe",R.raw.f_char, this@LearnListen))
        adapter.add(letter_item("G", "g","gym", R.raw.g_char, this@LearnListen))
        adapter.add(letter_item("Ğ", "ğ", "yağmur",R.raw.g__char, this@LearnListen))
        adapter.add(letter_item("H", "h", "havlu",R.raw.h_char, this@LearnListen))
        adapter.add(letter_item("I", "i", "ıspanak",R.raw.i_char, this@LearnListen))
        adapter.add(letter_item("J", "j", "jimnastik ",R.raw.j_char, this@LearnListen))
        adapter.add(letter_item("K", "k", "kitap ",R.raw.k_char, this@LearnListen))
        adapter.add(letter_item("L", "l", "limon",R.raw.l_char, this@LearnListen))
        adapter.add(letter_item("M", "m", "masa ",R.raw.m_char, this@LearnListen))
        adapter.add(letter_item("N", "n", "Namaz",R.raw.n_char, this@LearnListen))
        adapter.add(letter_item("O", "o", "okul",R.raw.o_char, this@LearnListen))
        adapter.add(letter_item("Ö", "ö", "ördek",R.raw.o__char, this@LearnListen))
        adapter.add(letter_item("P", "p", "parmak",R.raw.p_char, this@LearnListen))
        adapter.add(letter_item("R", "r", "resim",R.raw.r_char, this@LearnListen))
        adapter.add(letter_item("S", "s","su", R.raw.s_char, this@LearnListen))
        adapter.add(letter_item("Ş", "ş","şeker", R.raw.s__char, this@LearnListen))
        adapter.add(letter_item("T", "t", "top",R.raw.t_char, this@LearnListen))
        adapter.add(letter_item("U", "u", "uçak",R.raw.u_char, this@LearnListen))
        adapter.add(letter_item("Ü", "ü", "ülke",R.raw.u__char, this@LearnListen))
        adapter.add(letter_item("V", "v", "vazo",R.raw.v_char, this@LearnListen))
        adapter.add(letter_item("Y", "y", "yemek",R.raw.y_char, this@LearnListen))
        adapter.add(letter_item("Z", "z", "zambak",R.raw.z_char, this@LearnListen))
    }

    // LESSON TWO
    fun addWords(){

        adapter.add(start_quiz("استمع الى جميع الكلمات ثم انتقل الى الاختبار", R.drawable.chat_icon,
            this,"lesson_2"))

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

        adapter.add(native_ad_item(this))

        adapter.add(word_item("Erken","مبكرا", R.raw.word_50, this))
        adapter.add(word_item("Geç","متأخر", R.raw.word_51, this))
        adapter.add(word_item("bugün","اليوم", R.raw.word_52, this))
        adapter.add(word_item("yarın","غداً", R.raw.word_53, this))
        adapter.add(word_item("dün","أمس", R.raw.word_54, this))
        adapter.add(word_item("sağda","على اليمين", R.raw.word_55, this))
        adapter.add(word_item("solda","على اليسار", R.raw.word_56, this))
        adapter.add(word_item("içerde","في الداخل", R.raw.word_57, this))
        adapter.add(word_item("dışarda","في الخارج", R.raw.word_58, this))
        adapter.add(word_item("gerekir","يجب", R.raw.word_59, this))
        adapter.add(word_item("gerekmez","لايجب", R.raw.word_60, this))
        adapter.add(word_item("burada","هنـا", R.raw.word_61, this))
        adapter.add(word_item("Orada","هنـاك", R.raw.word_62, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("yakın","قريب", R.raw.word_63, this))
        adapter.add(word_item("uzak","بعيد", R.raw.word_64, this))
        adapter.add(word_item("erkek","ذكر", R.raw.word_65, this))
        adapter.add(word_item("kadın","انثى", R.raw.word_66, this))
        adapter.add(word_item("ne zaman","متى؟", R.raw.word_67, this))
        adapter.add(word_item("nasıl","كيف؟", R.raw.word_68, this))
        adapter.add(word_item("istiyorum","أريد", R.raw.word_69, this))
        adapter.add(word_item("istemiyorum","لا اريد", R.raw.word_70, this))
        adapter.add(word_item("beğendim","أعجبني", R.raw.word_71, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("alt","تحت", R.raw.word_72, this))
        adapter.add(word_item("üst","فوق", R.raw.word_73, this))
    }

    // LESSON THREE
    fun addNumbers(){

        adapter.add(start_quiz("استمع الى جميع الكلمات ثم انتقل الى الاختبار", R.drawable.time_icon,
            this,"lesson_3"))

        adapter.add(word_item("sıfır", "صفر", R.raw.zero, this))
        adapter.add(word_item("bir", "واحد", R.raw.one, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("iki", "اثنين", R.raw.two, this))
        adapter.add(word_item("üç ", "ثلاث", R.raw.three, this))
        adapter.add(word_item("dört ", "اربعة", R.raw.four, this))
        adapter.add(word_item("beş ", "خمسة", R.raw.five, this))
        adapter.add(word_item("altı ", "ستة", R.raw.six, this))
        adapter.add(word_item("yedi ", "سبعة", R.raw.seven, this))
        adapter.add(word_item("sekiz ", "ثمانية", R.raw.eight, this))
        adapter.add(word_item("dokuz ", "تسعة", R.raw.nine, this))
        adapter.add(word_item("on ", "عشرة", R.raw.ten, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("Cumarttesi", "السبت", R.raw.saturday, this))
        adapter.add(word_item("Pazar ", "الاحد", R.raw.sunday, this))
        adapter.add(word_item("Pazartesi ", "الاثنين", R.raw.monday, this))
        adapter.add(word_item("Salı ", "الثلاثاء", R.raw.tuesday, this))
        adapter.add(word_item("çarşamba ", "الاربعاء", R.raw.wednesday, this))
        adapter.add(word_item("Perşembe ", "الخميس", R.raw.thursday, this))
        adapter.add(word_item("Cuma ", "الجمعة", R.raw.friday, this))
        adapter.add(word_item("Gün ", "يوم", R.raw.day, this))
        adapter.add(word_item("Hafta ", "اسبوع", R.raw.week, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("Ay ", "شهر", R.raw.month, this))
        adapter.add(word_item("Sene ", "سنة", R.raw.year, this))
        adapter.add(word_item("Yaz", "صيف", R.raw.summer, this))
        adapter.add(word_item("kış", "شتاء", R.raw.winter, this))
        adapter.add(word_item("Sonbahar", "خريف", R.raw.autumn, this))
        adapter.add(word_item("Ilkbahar", "ربيع", R.raw.spring, this))
        adapter.add(word_item("Ocak", "كانون ثاني", R.raw.january, this))
        adapter.add(word_item("Şubat", "شباط", R.raw.february, this))
        adapter.add(word_item("Mart", "ىذار", R.raw.march, this))
        adapter.add(word_item("Nisan", "نيسان", R.raw.april, this))
        adapter.add(word_item("Mayıs", "أيّار", R.raw.may, this))
        adapter.add(word_item("Haziran", "حزيران", R.raw.june, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("Temmuz", "تمّوز", R.raw.july, this))
        adapter.add(word_item("Ağustos", "آب", R.raw.august, this))
        adapter.add(word_item("Eylül", "أيلول", R.raw.september, this))
        adapter.add(word_item("Ekim", "تشرين أول", R.raw.october, this))
        adapter.add(word_item("Kasım", "تشرين ثاني", R.raw.november, this))
        adapter.add(word_item("Aralık", "كانون أول", R.raw.december, this))

    }

    // LESSON FOUR
    fun addColors(){

        adapter.add(start_quiz("استمع الى جميع الكلمات ثم انتقل الى الاختبار", R.drawable.colors,
            this,"lesson_4"))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("renk","لون",R.raw.color,this))
        adapter.add(word_item("mavi","ازرق",R.raw.blue,this))
        adapter.add(word_item("gri","رمادي",R.raw.grey,this))
        adapter.add(word_item("sarı","اصفر",R.raw.yellow,this))
        adapter.add(word_item("siyah","أسود",R.raw.black,this))
        adapter.add(word_item("turuncu","برتقالي",R.raw.orange,this))
        adapter.add(word_item("pembe","وردي",R.raw.pink,this))
        adapter.add(word_item("kırmızı","احمر",R.raw.red,this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("yeşil","اخضر",R.raw.green,this))
        adapter.add(word_item("mor","ارجواني",R.raw.purple,this))
        adapter.add(word_item("beyaz","ابيض",R.raw.white,this))
        adapter.add(word_item("açık","فاتح",R.raw.lighter,this))
        adapter.add(word_item("koyu","غامق",R.raw.darker,this))
        adapter.add(word_item("parlak","لامع",R.raw.bright,this))
    }

    // LESSON FIVE
    fun addParts(){

        adapter.add(start_quiz("استمع الى جميع الكلمات ثم انتقل الى الاختبار", R.drawable.brain_icon,
            this,"lesson_5"))

        adapter.add(word_item("vucut", "جسم", R.raw.body, this))
        adapter.add(word_item("baş", "راس", R.raw.head, this))
        adapter.add(word_item("saç", "شغر", R.raw.hair, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("beyin", "عقل", R.raw.brian, this))
        adapter.add(word_item("alın", "جبين", R.raw.front, this))
        adapter.add(word_item("kulak", "اذن", R.raw.ear, this))
        adapter.add(word_item("göz", "عين", R.raw.eye, this))
        adapter.add(word_item("kirpik", "رمش", R.raw.eyelash, this))
        adapter.add(word_item("kaş", "حاجب", R.raw.eyebrow, this))
        adapter.add(word_item("burun", "انف", R.raw.nose, this))
        adapter.add(word_item("yanak", "خد", R.raw.cheek, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("yüz", "وجه", R.raw.face, this))
        adapter.add(word_item("omuz", "كتف", R.raw.shoulder, this))
        adapter.add(word_item("boyun", "رقبه", R.raw.neck, this))
        adapter.add(word_item("kol", "ذراع", R.raw.arm, this))
        adapter.add(word_item("el", "يد", R.raw.hand, this))
        adapter.add(word_item("parmak", "اصبح", R.raw.finger, this))
        adapter.add(word_item("tırnak", "اظفر", R.raw.nail, this))
        adapter.add(word_item("sırt", "ظهر", R.raw.back, this))
        adapter.add(word_item("göğüs", "صدر", R.raw.breast, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("karın", "بطن", R.raw.abdomen, this))
        adapter.add(word_item("yürek", "قلب", R.raw.heart, this))
        adapter.add(word_item("kara ciğer", "كبد", R.raw.liver, this))
        adapter.add(word_item("ak ciğer", "رئة", R.raw.lungs, this))
        adapter.add(word_item("bıyık", "شارب", R.raw.whiskers, this))
        adapter.add(word_item("sakal", "لحية", R.raw.beard, this))
        adapter.add(word_item("dudak", "شفّة", R.raw.lip, this))
        adapter.add(word_item("ağız", "فم", R.raw.month, this))
        adapter.add(word_item("diş ", "سن", R.raw.tooth, this))
        adapter.add(word_item("dil", "لسان", R.raw.tongue, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("ayak", "ثدم", R.raw.foot, this))
        adapter.add(word_item("kan", "دم", R.raw.blood, this))
        adapter.add(word_item("deri ", "جلد", R.raw.skin, this))
    }

    // LESSON SIX
    fun addHome(){

        adapter.add(start_quiz("استمع الى جميع الكلمات ثم انتقل الى الاختبار", R.drawable.tools_icon,
            this,"lesson_6"))

        adapter.add(word_item("kapı", "باب", R.raw.door, this))
        adapter.add(word_item("masa", "طاولة", R.raw.table, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("telefon", "هاتف", R.raw.phone, this))
        adapter.add(word_item("radyo", "راديو", R.raw.radio, this))
        adapter.add(word_item("sandalye", "كرسي", R.raw.chair, this))
        adapter.add(word_item("ocak", "فرن الغاز", R.raw.furnace, this))
        adapter.add(word_item("koltuk", "كنب", R.raw.armchair, this))
        adapter.add(word_item("bulaşık yıkama makinesi", "غسالة صحون", R.raw.dish_washing_machine, this))
        adapter.add(word_item("yatak", "سرير", R.raw.bed, this))
        adapter.add(word_item("buzdolabı", "ثلاجة", R.raw.refrigerator, this))
        adapter.add(word_item("daire", "شقة", R.raw.apartment, this))
        adapter.add(word_item("kablo", "كابل", R.raw.cabel, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("merdiven", "درج", R.raw.stairs, this))
        adapter.add(word_item("mum", "شمعة", R.raw.candle, this))
        adapter.add(word_item("halı", "سجادة", R.raw.carpet, this)) //
        adapter.add(word_item("çöp", "نفايات", R.raw.garbage, this))
        adapter.add(word_item("televizyon", "تلفاز", R.raw.telev, this))
        adapter.add(word_item("resim", "صورة", R.raw.picture, this))
        adapter.add(word_item("balkon", "بلكونة", R.raw.balkon, this))
        adapter.add(word_item("pencere", "نافذة", R.raw.window, this))
        adapter.add(word_item("yatak odası", "غرفة النوم", R.raw.bedroom, this))
        adapter.add(word_item("mutfak", "مطبخ", R.raw.kitchen, this))
        adapter.add(word_item("ev", "بيت", R.raw.home, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("yemek odası", "غرفة الطعام", R.raw.diningroom, this))
        adapter.add(word_item("salon", "صالون", R.raw.salon, this))
        adapter.add(word_item("tabak", "طبق", R.raw.plate, this))
        adapter.add(word_item("duş", "دُش", R.raw.shower, this))
        adapter.add(word_item("ayna ", "مرآة", R.raw.mirror, this))
        adapter.add(word_item("yastık", "وسادة", R.raw.pillow, this))
        adapter.add(word_item("perde", "ستارة", R.raw.curtain, this))
        adapter.add(word_item("alet", "أداة", R.raw.tool, this))
        adapter.add(word_item("kürek", "مجرفة", R.raw.shovel, this))
        adapter.add(word_item("iğne ", "إبرة", R.raw.needle, this))
        adapter.add(word_item("çekiç", "مطرقة", R.raw.hammer, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("testere", "منشار", R.raw.saw, this))
        adapter.add(word_item("makas", "مقص", R.raw.cuter, this))
    }

    // LESSON SEVEN
    fun addSchool(){

        adapter.add(start_quiz("استمع الى جميع الكلمات ثم انتقل الى الاختبار", R.drawable.school,
            this,"lesson_7"))

        adapter.add(word_item("öğrenci", "طالب", R.raw.student, this))
        adapter.add(word_item("hoca", "معلم", R.raw.teacher, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("okul", "مدرسة", R.raw.school, this))
        adapter.add(word_item("üniversite", "جامعة", R.raw.university, this))
        adapter.add(word_item("ilk okul", "المدرسة الابتدائية", R.raw.primary_school, this))
        adapter.add(word_item("lise", "ثانوية", R.raw.high_school, this))
        adapter.add(word_item("öğretmek", "التعليم", R.raw.teach, this))
        adapter.add(word_item("bilgisayar", "حاسوب", R.raw.computer, this))
        adapter.add(word_item("hesap makinesi", "الة حاسبة", R.raw.calculator, this))
        adapter.add(word_item("kitap", "كتاب", R.raw.book, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("defter", "دفتر", R.raw.book_2, this))
        adapter.add(word_item("kalem", "قلم", R.raw.pen, this))
        adapter.add(word_item("silgi", "ممحاة", R.raw.eraser, this))
        adapter.add(word_item("ödev", "واجب", R.raw.homework, this))
        adapter.add(word_item("sınıf", "قاعة الدرس", R.raw.school_class, this))
        adapter.add(word_item("sözlük", "قاموس", R.raw.dictionary, this))
        adapter.add(word_item("kütüphane", "مكتبة", R.raw.library, this))
        adapter.add(word_item("sınav", "امتحان", R.raw.exam, this))

        adapter.add(native_ad_item(this))

        adapter.add(word_item("alıştırma", "تمرين", R.raw.exercise, this))
        adapter.add(word_item("dönem", "فصل دراسي", R.raw.period, this))
        adapter.add(word_item("yorum", "تعليق", R.raw.comment, this))
        adapter.add(word_item("kolej", "", R.raw.college, this))
    }

}
