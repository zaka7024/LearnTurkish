package com.lemonlab.learnturkish.data

import com.lemonlab.learnturkish.R
import com.lemonlab.learnturkish.module.question_letter_word
class QuizData{
    companion object {

        // 28 score
        var letters_question_data = ArrayList<question_letter_word>().apply {
            add(question_letter_word(R.raw.a_char, arrayListOf("A", "B", "C", "Ç"), 0))
            add(question_letter_word(R.raw.b_char, arrayListOf("A", "C", "B", "E"), 2))
            add(question_letter_word(R.raw.c_char, arrayListOf("F", "C", "L", "V"), 1))
            add(question_letter_word(R.raw.d_char, arrayListOf("D", "F", "G","Ğ"), 0))
            add(question_letter_word(R.raw.c__char, arrayListOf("Z", "Ç", "S","Ü"), 1))
            add(question_letter_word(R.raw.d_char, arrayListOf("A", "D", "Y","Z"), 1))
            add(question_letter_word(R.raw.e_char, arrayListOf("E", "O", "Ö","M"), 0))
            add(question_letter_word(R.raw.f_char, arrayListOf("P", "R", "L","F"), 3))
            add(question_letter_word(R.raw.g_char, arrayListOf("Z", "G", "L","A"), 1))
            add(question_letter_word(R.raw.g__char, arrayListOf("Ğ", "C", "E","T"), 0))
            add(question_letter_word(R.raw.h_char, arrayListOf("S", "R", "H","A"), 2))
            add(question_letter_word(R.raw.i_char, arrayListOf("I", "D", "M","N"), 0))
            add(question_letter_word(R.raw.j_char, arrayListOf("T", "V", "C","J"), 3))
            add(question_letter_word(R.raw.k_char, arrayListOf("K", "B", "Ö","V"), 0))
            add(question_letter_word(R.raw.l_char, arrayListOf("Z", "C", "L","F"), 2))
            add(question_letter_word(R.raw.m_char, arrayListOf("E", "A", "Ş","M"), 3))
            add(question_letter_word(R.raw.n_char, arrayListOf("N", "Ğ", "D","Ü"), 0))
            add(question_letter_word(R.raw.o_char, arrayListOf("E", "O", "Ö","U"), 1))
            add(question_letter_word(R.raw.o__char, arrayListOf("Ö", "O", "F","R"), 0))
            add(question_letter_word(R.raw.p_char, arrayListOf("P", "H", "Ğ","T"), 0))
            add(question_letter_word(R.raw.r_char, arrayListOf("V", "R", "W","Z"), 1))
            add(question_letter_word(R.raw.s_char, arrayListOf("Ç", "S", "Ş","C"), 1))
            add(question_letter_word(R.raw.s__char, arrayListOf("Ş", "J", "S","K"), 0))
            add(question_letter_word(R.raw.t_char, arrayListOf("T", "U", "E","F"), 0))
            add(question_letter_word(R.raw.u_char, arrayListOf("R", "U", "P","R"), 1))
            add(question_letter_word(R.raw.u__char, arrayListOf("L", "J", "Ü","A"), 2))
            add(question_letter_word(R.raw.v_char, arrayListOf("V", "M", "I","Y"), 0))
            add(question_letter_word(R.raw.y_char, arrayListOf("Z", "S", "Y","U"), 2))
            add(question_letter_word(R.raw.z_char, arrayListOf("K", "L", "Z","I"), 2))
        }

        // 20 score
        var words_question_data = ArrayList<question_letter_word>().apply {
            add(
                question_letter_word(
                    R.raw.word_4,
                    arrayListOf("أب", "أم", "طفل", "أخ"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.word_3,
                    arrayListOf("أب", "أم", "طفل", "أخ"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.word_9,
                    arrayListOf("أب", "أم", "طفل", "أخ"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.word_10,
                    arrayListOf("أخ", "أم", "عمه", "عم"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.word_2,
                    arrayListOf("جدة", "عم", "عمة", "جد"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.word_12,
                    arrayListOf("عم", "أم", "أخت", "أخ"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.word_8,
                    arrayListOf("خال", "جد", "أم", "خالة"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.word_13,
                    arrayListOf("عم", "خالة", "أخت", "خال"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.word_15,
                    arrayListOf("عمة", "أب", "الكنة", "أخ"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.word_5,
                    arrayListOf("طفل", "جدة", "جد", "أب"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.word_1,
                    arrayListOf("أخ", "عائلة", "أخت", "خال"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.word_7,
                    arrayListOf("اخي", "رضيع", "أخت", "طفل"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.word_6,
                    arrayListOf("اخي", "جد", "أخت", "طفل"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.word_14,
                    arrayListOf("أخت", "رضيع", "أخت", "حفيد"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.word_11,
                    arrayListOf("اخي", "طفل", "أخت", "توام"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.word_23,
                    arrayListOf("شاب", "ارض", "شمس", "قمر"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.word_24,
                    arrayListOf("شاب", "قمر", "شمس", "ارض"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.word_25,
                    arrayListOf("ماء", "عصير", "ارض", "شمس"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.word_34,
                    arrayListOf("حيوان", "قرد", "نحلة", "فراشة"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.word_36,
                    arrayListOf("قرد", "حيوان", "نحلة", "فراشة"),
                    2
                )
            )
        }

        // 20 score
        var lesson_three_data = ArrayList<question_letter_word>().apply {
            add(
                question_letter_word(
                    R.raw.zero,
                    arrayListOf("صفر", "اثنين", "واحد", "خمسة"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.one,
                    arrayListOf("ثلاثة", "صفر", "واحد", "اربعة"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.three,
                    arrayListOf("عشر", "واحد", "صفر", "ثلاث"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.two,
                    arrayListOf("صفر", "اثنين", "واحد", "خمسة"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.ten,
                    arrayListOf("واحد", "عشرة", "اثنين", "تسعة"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.seven,
                    arrayListOf("صفر", "سبعة", "واحد", "خمسة"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.eight,
                    arrayListOf("ستة", "سبعة", "ثمنية", "واحد"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.monday,
                    arrayListOf("الاثنين", "الاربعاء", "الاحد", "الثلاثاء"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.sunday,
                    arrayListOf("الاحد", "الثلاثاء", "الاثنين", "الجمعة"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.friday,
                    arrayListOf("الثلاثاء", "سبعة", "الاحد", "الجمعة"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.day,
                    arrayListOf("الثلاثاء", "يوم", "اسبوع", "سنة"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.week,
                    arrayListOf("الجمعة", "سنة", "يوم", "اسبوع"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.month,
                    arrayListOf("شهر", "سنة", "اسبوع", "يوم"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.autumn,
                    arrayListOf("ربيع", "ثلج", "خريف", "شتاء"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.spring,
                    arrayListOf("خريف", "جليد", "شتاء", "ربيع"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.march,
                    arrayListOf("ربيع", "نيسان", "شباط", "أيّار"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.april,
                    arrayListOf("أيّار", "أيّار", "حزيران", "نيسان"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.time,
                    arrayListOf("وقت", "تاريخ", "يوم", "ساعة"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.second,
                    arrayListOf("ساعة", "ثانية", "تاريخ", "يوم"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.five,
                    arrayListOf("سبعة", "ستة", "خمسة", "تاريخ"),
                    2
                )
            )
        }

        // 9 score
        var lesson_four_data = ArrayList<question_letter_word>().apply {
            add(
                question_letter_word(
                    R.raw.color,
                    arrayListOf("احمر", "لون", "اصفر", "اسود"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.blue,
                    arrayListOf("لون", "اسود", "ازرق", "اصفر"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.green,
                    arrayListOf("اخضر", "اصفر", "ارجواني", "غامق"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.yellow,
                    arrayListOf("اصفر", "اسود", "احمر", "فاتح"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.black,
                    arrayListOf("اسود", "اصفر", "برتقالي", "غامق"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.red,
                    arrayListOf("برتقالي", "اصفر", "غامق", "احمر"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.white,
                    arrayListOf("اصفر", "زهري", "ابيض", "غامق"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.lighter,
                    arrayListOf("اسود", "غامق", "فاتح", "زهري"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.bright,
                    arrayListOf("فاتح", "زهري", "لامع", "غامق"),
                    3
                )
            )
        }

        // 16 score
        var lesson_five_data = ArrayList<question_letter_word>().apply {
            add(
                question_letter_word(
                    R.raw.body,
                    arrayListOf("جسم", "لون", "بطن", "قدم"),
                    0
                )
            )
            question_letter_word(
                R.raw.head,
                arrayListOf("جسم", "رجل", "راس", "بطن"),
                2
            )
            question_letter_word(
                R.raw.hair,
                arrayListOf("حاجب", "رمش", "شعر", "مقص"),
                2
            )
            question_letter_word(
                R.raw.brian,
                arrayListOf("بطن", "دماغ", "شعر", "عقل"),
                3
            )
            question_letter_word(
                R.raw.ear,
                arrayListOf("عين", "دماغ", "اذن", "أنف"),
                2
            )
            question_letter_word(
                R.raw.eye,
                arrayListOf("دماغ", "عين", "عقل", "اذن"),
                1
            )
            question_letter_word(
                R.raw.eyelash,
                arrayListOf("رمش", "عين", "عقل", "شعر"),
                0
            )
            question_letter_word(
                R.raw.eyebrow,
                arrayListOf("بطن", "عين", "حاجب", "اصبع"),
                2
            )
            question_letter_word(
                R.raw.nose,
                arrayListOf("انف", "عقل", "شعر", "اذن"),
                0
            )
            question_letter_word(
                R.raw.face,
                arrayListOf("عيون", "جلد", "رموش", "وجه"),
                3
            )
            question_letter_word(
                R.raw.skin,
                arrayListOf("مقص", "جلد", "دم", "اصبع"),
                1
            )
            question_letter_word(
                R.raw.blood,
                arrayListOf("قدم", "دم", "لسان", "رجل"),
                1
            )
            question_letter_word(
                R.raw.whiskers,
                arrayListOf("حاجب", "رمش", "ذقن", "شارب"),
                3
            )
            question_letter_word(
                R.raw.heart,
                arrayListOf("بطن", "قلب", "كبد", "رئة"),
                2
            )
            question_letter_word(
                R.raw.finger,
                arrayListOf("بطن", "اصبع", "ظهر", "اظفر"),
                1
            )
            question_letter_word(
                R.raw.nail,
                arrayListOf("رئة", "بطن", "اصبع", "اظفر"),
                3
            )
        }

        // 20 score
        var lesson_six_data = ArrayList<question_letter_word>().apply {
            add(
                question_letter_word(
                    R.raw.door,
                    arrayListOf("شباك", "باب", "هاتف", "طاولة"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.table,
                    arrayListOf("طاولة", "شباك", "هاتف ذكي", "باب"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.phone,
                    arrayListOf("هاتف ذكي", "باب", "هاتف", "طاولة"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.radio,
                    arrayListOf("راديو", "شباك", "هاتف ذكي", "كرسي"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.chair,
                    arrayListOf("شباك", "باب", "كتاب", "كرسي"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.bed,
                    arrayListOf("راديو", "شقة", "سرير", "ثلاجة"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.apartment,
                    arrayListOf("شباك", "باب", "شقة", "كرسي"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.refrigerator,
                    arrayListOf("ثلاجة", "درج", "شقة", "كرسي"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.stairs,
                    arrayListOf("ثلاجة", "باب", "كتاب", "درج"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.garbage,
                    arrayListOf("بلكونة", "مطبخ", "كتاب", "نفايات"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.telev,
                    arrayListOf("صورة", "تلفاز", "سرير", "بلكونة"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.carpet,
                    arrayListOf("بلكونة", "سجادة", "شقة", "صورة"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.home,
                    arrayListOf("شقى", "مطبخ", "بيت", "صورة"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.salon,
                    arrayListOf("شقى", "سجادة", "مرآة", "صالون"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.plate,
                    arrayListOf("وسادة", "طبق", "ستارة", "مرآة"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.cuter,
                    arrayListOf("مرآة", "منشار", "مقص", "إبرة"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.saw,
                    arrayListOf("مرآة", "مقص", "منشار", "إبرة"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.tool,
                    arrayListOf("ستارة", "طبق", "أداة", "مرآة"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.pillow,
                    arrayListOf("وسادة", "منشار", "مقص", "إبرة"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.diningroom,
                    arrayListOf("غرفة النوم", "غرفة الجلوس", "غرفة الطعام", "إبرة"),
                    2
                )
            )
        }

        // 18 score
        var lesson_seven_data = ArrayList<question_letter_word>().apply {
            add(
                question_letter_word(
                    R.raw.student,
                    arrayListOf("كتاب", "قلم", "معلم", "طالب"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.teacher,
                    arrayListOf("مدرسة", "معلم", "قلم", "جامعة"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.school,
                    arrayListOf("مدرسة", "قلم", "جامعة", "طالب"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.primary_school,
                    arrayListOf("مدرسة", "الثانوية", "مدرسة ابتدائية", "جامعة"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.high_school,
                    arrayListOf("التعليم", "قلم", "جامعة", "الثانوية"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.computer,
                    arrayListOf("كتاب", "قلم", "حاسوب", "دفتر"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.book,
                    arrayListOf("واجب", "قلم", "قاموس", "كتاب"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.pen,
                    arrayListOf("واجب", "قلم", "قاموس", "ممحاة"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.book_2,
                    arrayListOf("الة حاسبة", "دفتر", "قاموس", "ممحاة"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.calculator,
                    arrayListOf("ممحاة", "دفتر", "قاموس", "الة حاسبة"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.eraser,
                    arrayListOf("الة حاسبة", "دفتر", "قاموس", "ممحاة"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.homework,
                    arrayListOf("ممحاة", "واجب", "قاموس", "قاعة الدرس"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.library,
                    arrayListOf("امتحان", "قاعة الدرس", "قاموس", "مكتبة"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.dictionary,
                    arrayListOf("ممحاة", "واجب", "قاموس", "قاعة الدرس"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.exam,
                    arrayListOf("امتحان", "قاعة الدرس", "قاموس", "مكتبة"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.school_class,
                    arrayListOf("تعليق", "واجب", "كلية", "قاعة الدرس"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.college,
                    arrayListOf("جامعة", "كلية", "كلية", "قاعة الصف"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.university,
                    arrayListOf("جامعة", "كلية", "كلية", "قاعة الصف"),
                    0
                )
            )

        }

        // 17 score
        var lesson_eight_data = ArrayList<question_letter_word>().apply {
            add(
                question_letter_word(
                    R.raw.long_word,
                    arrayListOf("معدوم", "قصير", "طويل", "كثير"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.short_word,
                    arrayListOf("معدوم", "قصير", "طويل", "كثير"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.big,
                    arrayListOf("كبير", "واسع", "قليل", "كثير"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.broad,
                    arrayListOf("معدوم", "قصير", "طويل", "واسع"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.small,
                    arrayListOf("قديم", "صفير", "جديد", "معدوم"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.thick,
                    arrayListOf("قديم", "رقيق", "جديد", "سميك"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.thin,
                    arrayListOf("قديم", "رقيق", "جديد", "رخيص"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.old,
                    arrayListOf("قديم", "رخيص", "جديد", "سميك"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.new_word,
                    arrayListOf("غالي", "رخيص", "عجوز", "جديد"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.cheap,
                    arrayListOf("غالي", "رخيص", "عجوز", "جديد"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.expensive,
                    arrayListOf("شاب", "رخيص", "خاطئ", "غالي"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.true_word,
                    arrayListOf("صحيح", "رخيص", "عجوز", "جديد"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.false_word,
                    arrayListOf("شاب", "جيد", "خاطئ", "غالي"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.good,
                    arrayListOf("مستحيل", "سهل", "جيد", "صعب"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.bad,
                    arrayListOf("شاب", "جيد", "خاطئ", "غالي"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.difficult,
                    arrayListOf("مستحيل", "سهل", "جيد", "صعب"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.easy,
                    arrayListOf("سهل", "جيد", "خاطئ", "غالي"),
                    0
                )
            )
        }

        // 22 score
        var lesson_nine_data = ArrayList<question_letter_word>().apply {
            add(
                question_letter_word(
                    R.raw.in_front_of,
                    arrayListOf("بجانب", "امام", "خلف", "عند"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.behind,
                    arrayListOf("خلف", "في الداخل", "بعد", "كثير"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.before,
                    arrayListOf("معدوم", "قصير", "طويل", "قبل"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.after,
                    arrayListOf("قبل", "بعد", "خلف", "عند"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.in_word,
                    arrayListOf("خارج", "داخل", "بعد", "كثير"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.with,
                    arrayListOf("بدون", "ناقص", "مع", "الجميع"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.without,
                    arrayListOf("مع", "بجانب", "طويل", "بدون"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.outside,
                    arrayListOf("داخل", "بعد", "خارج", "عند"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.over,
                    arrayListOf("مع", "تحت", "فوق", "الاعلى"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.under,
                    arrayListOf("تحت", "ناقص", "مع", "الجميع"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.about,
                    arrayListOf("مع", "بجانب", "حول", "بدون"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.against,
                    arrayListOf("حول", "عدو", "صديق", "ضد"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.and,
                    arrayListOf("مع", "و", "او", "حرف"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.as_word,
                    arrayListOf("مثل", "عندما", "بين", "لكن"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.between,
                    arrayListOf("مع", "بين", "حول", "عندما"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.but,
                    arrayListOf("حول", "مع هذا", "لكن", "ضد"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.for_word,
                    arrayListOf("من اجل", "خارج", "في", "بدون سبب"),
                    0
                )
            )

            add(
                question_letter_word(
                    R.raw.near,
                    arrayListOf("او", "بقرب", "بعيد", "عندما"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.or,
                    arrayListOf("حول", "او", "لكن", "ضد"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.until,
                    arrayListOf("لـ", "منذ", "في", "حتى"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.since,
                    arrayListOf("منذ", "خارج", "في", "بدون سبب"),
                    0
                )
            )

            add(
                question_letter_word(
                    R.raw.thus,
                    arrayListOf("حتى يحصل", "بقرب", "بعيد", "لكي"),
                    3
                )
            )
        }

        // 17 score
        var lesson_ten_data = ArrayList<question_letter_word>().apply {
            add(
                question_letter_word(
                    R.raw.i_word,
                    arrayListOf("هي", "هو", "انا", "هم"),
                    2
                )
            )

            add(
                question_letter_word(
                    R.raw.you,
                    arrayListOf("هي", "انت", "هو", "انا"),
                    2
                )
            )

            add(
                question_letter_word(
                    R.raw.he_she_is,
                    arrayListOf("هما", "هو", "انا", "هم"),
                    1
                )
            )

            add(
                question_letter_word(
                    R.raw.he_she_is,
                    arrayListOf("هي", "امام", "خلف", "عند"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.we,
                    arrayListOf("بجانب", "هم", "نحن", "عند"),
                    2
                )
            )

            add(
                question_letter_word(
                    R.raw.you_siz,
                    arrayListOf("هما", "هو", "انا", "هم"),
                    1
                )
            )

            add(
                question_letter_word(
                    R.raw.them,
                    arrayListOf("انتم", "نحن", "هم", "هما"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.i_love_you,
                    arrayListOf("انا اكرهك", "انا بجانبك", "نحن", "انا احبك"),
                    3
                )
            )

            add(
                question_letter_word(
                    R.raw.she_is_beautiful,
                    arrayListOf("انا جميل", "هي جميلة", "شكرًا لك", "هم"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.we_are_happy,
                    arrayListOf("نحن حزينون", "نحن سعداء", "لا", "لماذا؟!"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.can_you_call_us,
                    arrayListOf("هل يمكنك الاتصال بنا؟", "أعطني رقم هاتفك", "نحن", "انا احبك"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.give_me_your_phone_number,
                    arrayListOf("انا جميل", "أعطني رقم هاتفك", "شكرًا لك", "هم"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.onlarin,
                    arrayListOf("انتم", "نحن", "هم", "هما"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.my_phone_number_is,
                    arrayListOf("لا اريد", "رقم هاتفي هو", "شكرًا لك", "هم"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.is_this_your_pencil,
                    arrayListOf("اللعنة", "النصر لنا", "هل هذا الكتاب لي؟", "هل هذا الكتاب لك؟"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.this_book_is_for_me,
                    arrayListOf("اللعنة", "هذا الكتاب لي", "هل هذا الكتاب لي؟", "هل هذا الكتاب لك؟"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.zafer_bizimdir,
                    arrayListOf("اللعنة", "النصر لنا", "هل هذا الكتاب لي؟", "هل هذا الكتاب لك؟"),
                    1
                )
            )
        }

        var lesson_eleven_data = ArrayList<question_letter_word>().apply {
            add(
                question_letter_word(
                    R.raw.belt,
                    arrayListOf("معطف", "ربطة عنق", "حزام", "زفاف"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.clothes,
                    arrayListOf("ملابس", "ربطة عنق", "حزام", "زفاف"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.coat,
                    arrayListOf("معطف", "ربطة عنق", "حزام", "زفاف"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.clothes,
                    arrayListOf("ملابس", "قبعة", "شريط", "قفازات"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.dress,
                    arrayListOf("معطف", "فستان", "حزام", "زفاف"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.glasses,
                    arrayListOf("ملابس", "قبعة", "نظارات", "زفاف"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.glove,
                    arrayListOf("بنطلون", "ربطة عنق", "حزام", "قفازات"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.hat,
                    arrayListOf("قبعة", "فستان", "حزام", "زفاف"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.jacket,
                    arrayListOf("بنطلون", "قبعة", "معطف", "خاتم"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.trousers,
                    arrayListOf("بنطلون", "ربطة عنق", "حزام", "قفازات"),
                    0
                )
            )
            add(
                question_letter_word(
                    R.raw.ring,
                    arrayListOf("احذية", "قبعة", "خاتم", "زفاف"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.shirt,
                    arrayListOf("قميص", "ربطة عنق", "بنطلون", "قفازات"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.socks,
                    arrayListOf("احذية", "بذلة", "جوارب", "قفازات"),
                    2
                )
            )
            add(
                question_letter_word(
                    R.raw.suit,
                    arrayListOf("قميص", "بذلة", "احذية", "سترة"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.sweater,
                    arrayListOf("احذية", "بذلة", "جوارب", "سترة"),
                    3
                )
            )
        }
    }
}