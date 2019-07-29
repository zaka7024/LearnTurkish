package com.lemonlab.learnturkish.data

import com.lemonlab.learnturkish.R
import com.lemonlab.learnturkish.module.QuestionsLetterWord

class QuizData {
    companion object {

        // 28 score
        var letters_question_data = ArrayList<QuestionsLetterWord>().apply {
            add(QuestionsLetterWord(R.raw.a_char, arrayListOf("A", "B", "C", "Ç"), 0))
            add(QuestionsLetterWord(R.raw.b_char, arrayListOf("A", "C", "B", "E"), 2))
            add(QuestionsLetterWord(R.raw.c_char, arrayListOf("F", "C", "L", "V"), 1))
            add(QuestionsLetterWord(R.raw.d_char, arrayListOf("D", "F", "G", "Ğ"), 0))
            add(QuestionsLetterWord(R.raw.c__char, arrayListOf("Z", "Ç", "S", "Ü"), 1))
            add(QuestionsLetterWord(R.raw.d_char, arrayListOf("A", "D", "Y", "Z"), 1))
            add(QuestionsLetterWord(R.raw.e_char, arrayListOf("E", "O", "Ö", "M"), 0))
            add(QuestionsLetterWord(R.raw.f_char, arrayListOf("P", "R", "L", "F"), 3))
            add(QuestionsLetterWord(R.raw.g_char, arrayListOf("Z", "G", "L", "A"), 1))
            add(QuestionsLetterWord(R.raw.g__char, arrayListOf("Ğ", "C", "E", "T"), 0))
            add(QuestionsLetterWord(R.raw.u_char, arrayListOf("R", "U", "P", "R"), 1))
            add(QuestionsLetterWord(R.raw.u__char, arrayListOf("L", "J", "Ü", "A"), 2))
            add(QuestionsLetterWord(R.raw.v_char, arrayListOf("V", "M", "I", "Y"), 0))
            add(QuestionsLetterWord(R.raw.y_char, arrayListOf("Z", "S", "Y", "U"), 2))
            add(QuestionsLetterWord(R.raw.z_char, arrayListOf("K", "L", "Z", "I"), 2))
        }

        // 20 score
        var words_question_data = ArrayList<QuestionsLetterWord>().apply {
            add(
                QuestionsLetterWord(
                    R.raw.word_4,
                    arrayListOf("أب", "أم", "طفل", "أخ"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.word_3,
                    arrayListOf("أب", "أم", "طفل", "أخ"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.word_12,
                    arrayListOf("عم", "أم", "أخت", "أخ"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.word_8,
                    arrayListOf("خال", "جد", "أم", "خالة"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.word_13,
                    arrayListOf("عم", "خالة", "أخت", "خال"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.word_15,
                    arrayListOf("عمة", "أب", "الكنة", "أخ"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.word_5,
                    arrayListOf("طفل", "جدة", "جد", "أب"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.word_1,
                    arrayListOf("أخ", "عائلة", "أخت", "خال"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.word_7,
                    arrayListOf("اخي", "رضيع", "أخت", "طفل"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.word_6,
                    arrayListOf("اخي", "جد", "أخت", "طفل"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.word_14,
                    arrayListOf("أخت", "رضيع", "أخت", "حفيد"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.word_11,
                    arrayListOf("اخي", "طفل", "أخت", "توام"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.word_34,
                    arrayListOf("حيوان", "قرد", "نحلة", "فراشة"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.word_36,
                    arrayListOf("قرد", "حيوان", "نحلة", "فراشة"),
                    2
                )
            )
        }

        // 20 score
        var lesson_three_data = ArrayList<QuestionsLetterWord>().apply {
            add(
                QuestionsLetterWord(
                    R.raw.zero,
                    arrayListOf("صفر", "اثنين", "واحد", "خمسة"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.one,
                    arrayListOf("ثلاثة", "صفر", "واحد", "اربعة"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.three,
                    arrayListOf("عشر", "واحد", "صفر", "ثلاث"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.two,
                    arrayListOf("صفر", "اثنين", "واحد", "خمسة"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.ten,
                    arrayListOf("واحد", "عشرة", "اثنين", "تسعة"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.seven,
                    arrayListOf("صفر", "سبعة", "واحد", "خمسة"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.eight,
                    arrayListOf("ستة", "سبعة", "ثمنية", "واحد"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.monday,
                    arrayListOf("الاثنين", "الاربعاء", "الاحد", "الثلاثاء"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.sunday,
                    arrayListOf("الاحد", "الثلاثاء", "الاثنين", "الجمعة"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.friday,
                    arrayListOf("الثلاثاء", "سبعة", "الاحد", "الجمعة"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.day,
                    arrayListOf("الثلاثاء", "يوم", "اسبوع", "سنة"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.week,
                    arrayListOf("الجمعة", "سنة", "يوم", "اسبوع"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.month,
                    arrayListOf("شهر", "سنة", "اسبوع", "يوم"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.autumn,
                    arrayListOf("ربيع", "ثلج", "خريف", "شتاء"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.spring,
                    arrayListOf("خريف", "جليد", "شتاء", "ربيع"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.march,
                    arrayListOf("ربيع", "نيسان", "شباط", "أيّار"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.april,
                    arrayListOf("أيّار", "أيّار", "حزيران", "نيسان"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.time,
                    arrayListOf("وقت", "تاريخ", "يوم", "ساعة"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.second,
                    arrayListOf("ساعة", "ثانية", "تاريخ", "يوم"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.five,
                    arrayListOf("سبعة", "ستة", "خمسة", "تاريخ"),
                    2
                )
            )
        }

        // 9 score
        var lesson_four_data = ArrayList<QuestionsLetterWord>().apply {
            add(
                QuestionsLetterWord(
                    R.raw.color,
                    arrayListOf("احمر", "لون", "اصفر", "اسود"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.blue,
                    arrayListOf("لون", "اسود", "ازرق", "اصفر"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.green,
                    arrayListOf("اخضر", "اصفر", "ارجواني", "غامق"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.yellow,
                    arrayListOf("اصفر", "اسود", "احمر", "فاتح"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.black,
                    arrayListOf("اسود", "اصفر", "برتقالي", "غامق"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.red,
                    arrayListOf("برتقالي", "اصفر", "غامق", "احمر"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.white,
                    arrayListOf("اصفر", "زهري", "ابيض", "غامق"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.lighter,
                    arrayListOf("اسود", "غامق", "فاتح", "زهري"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.bright,
                    arrayListOf("فاتح", "زهري", "لامع", "غامق"),
                    3
                )
            )
        }

        // 16 score
        var lesson_five_data = ArrayList<QuestionsLetterWord>().apply {
            add(
                QuestionsLetterWord(
                    R.raw.body,
                    arrayListOf("جسم", "لون", "بطن", "قدم"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.head,
                    arrayListOf("جسم", "رجل", "راس", "بطن"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.hair,
                    arrayListOf("حاجب", "رمش", "شعر", "مقص"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.brian,
                    arrayListOf("بطن", "دماغ", "شعر", "عقل"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.ear,
                    arrayListOf("عين", "دماغ", "اذن", "أنف"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.eye,
                    arrayListOf("دماغ", "عين", "عقل", "اذن"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.eyelash,
                    arrayListOf("رمش", "عين", "عقل", "شعر"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.eyebrow,
                    arrayListOf("بطن", "عين", "حاجب", "اصبع"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.nose,
                    arrayListOf("انف", "عقل", "شعر", "اذن"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.face,
                    arrayListOf("عيون", "جلد", "رموش", "وجه"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.skin,
                    arrayListOf("مقص", "جلد", "دم", "اصبع"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.blood,
                    arrayListOf("قدم", "دم", "لسان", "رجل"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.whiskers,
                    arrayListOf("حاجب", "رمش", "ذقن", "شارب"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.heart,
                    arrayListOf("بطن", "قلب", "كبد", "رئة"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.finger,
                    arrayListOf("بطن", "اصبع", "ظهر", "اظفر"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.nail,
                    arrayListOf("رئة", "بطن", "اصبع", "اظفر"),
                    3
                )
            )
        }

        // 20 score
        var lesson_six_data = ArrayList<QuestionsLetterWord>().apply {
            add(
                QuestionsLetterWord(
                    R.raw.door,
                    arrayListOf("شباك", "باب", "هاتف", "طاولة"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.table,
                    arrayListOf("طاولة", "شباك", "هاتف ذكي", "باب"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.phone,
                    arrayListOf("هاتف ذكي", "باب", "هاتف", "طاولة"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.radio,
                    arrayListOf("راديو", "شباك", "هاتف ذكي", "كرسي"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.chair,
                    arrayListOf("شباك", "باب", "كتاب", "كرسي"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.bed,
                    arrayListOf("راديو", "شقة", "سرير", "ثلاجة"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.apartment,
                    arrayListOf("شباك", "باب", "شقة", "كرسي"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.refrigerator,
                    arrayListOf("ثلاجة", "درج", "شقة", "كرسي"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.stairs,
                    arrayListOf("ثلاجة", "باب", "كتاب", "درج"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.garbage,
                    arrayListOf("بلكونة", "مطبخ", "كتاب", "نفايات"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.telev,
                    arrayListOf("صورة", "تلفاز", "سرير", "بلكونة"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.carpet,
                    arrayListOf("بلكونة", "سجادة", "شقة", "صورة"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.home,
                    arrayListOf("شقى", "مطبخ", "بيت", "صورة"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.salon,
                    arrayListOf("شقى", "سجادة", "مرآة", "صالون"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.plate,
                    arrayListOf("وسادة", "طبق", "ستارة", "مرآة"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.cuter,
                    arrayListOf("مرآة", "منشار", "مقص", "إبرة"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.saw,
                    arrayListOf("مرآة", "مقص", "منشار", "إبرة"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.tool,
                    arrayListOf("ستارة", "طبق", "أداة", "مرآة"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.pillow,
                    arrayListOf("وسادة", "منشار", "مقص", "إبرة"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.diningroom,
                    arrayListOf("غرفة النوم", "غرفة الجلوس", "غرفة الطعام", "إبرة"),
                    2
                )
            )
        }

        // 18 score
        var lesson_seven_data = ArrayList<QuestionsLetterWord>().apply {
            add(
                QuestionsLetterWord(
                    R.raw.student,
                    arrayListOf("كتاب", "قلم", "معلم", "طالب"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.teacher,
                    arrayListOf("مدرسة", "معلم", "قلم", "جامعة"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.school,
                    arrayListOf("مدرسة", "قلم", "جامعة", "طالب"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.primary_school,
                    arrayListOf("مدرسة", "الثانوية", "مدرسة ابتدائية", "جامعة"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.high_school,
                    arrayListOf("التعليم", "قلم", "جامعة", "الثانوية"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.computer,
                    arrayListOf("كتاب", "قلم", "حاسوب", "دفتر"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.book,
                    arrayListOf("واجب", "قلم", "قاموس", "كتاب"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.pen,
                    arrayListOf("واجب", "قلم", "قاموس", "ممحاة"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.book_2,
                    arrayListOf("الة حاسبة", "دفتر", "قاموس", "ممحاة"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.calculator,
                    arrayListOf("ممحاة", "دفتر", "قاموس", "الة حاسبة"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.eraser,
                    arrayListOf("الة حاسبة", "دفتر", "قاموس", "ممحاة"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.homework,
                    arrayListOf("ممحاة", "واجب", "قاموس", "قاعة الدرس"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.library,
                    arrayListOf("امتحان", "قاعة الدرس", "قاموس", "مكتبة"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.dictionary,
                    arrayListOf("ممحاة", "واجب", "قاموس", "قاعة الدرس"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.exam,
                    arrayListOf("امتحان", "قاعة الدرس", "قاموس", "مكتبة"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.school_class,
                    arrayListOf("تعليق", "واجب", "كلية", "قاعة الدرس"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.college,
                    arrayListOf("جامعة", "كلية", "كلية", "قاعة الصف"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.university,
                    arrayListOf("جامعة", "كلية", "كلية", "قاعة الصف"),
                    0
                )
            )

        }

        // 17 score
        var lesson_eight_data = ArrayList<QuestionsLetterWord>().apply {
            add(
                QuestionsLetterWord(
                    R.raw.long_word,
                    arrayListOf("معدوم", "قصير", "طويل", "كثير"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.short_word,
                    arrayListOf("معدوم", "قصير", "طويل", "كثير"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.big,
                    arrayListOf("كبير", "واسع", "قليل", "كثير"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.broad,
                    arrayListOf("معدوم", "قصير", "طويل", "واسع"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.small,
                    arrayListOf("قديم", "صفير", "جديد", "معدوم"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.thick,
                    arrayListOf("قديم", "رقيق", "جديد", "سميك"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.thin,
                    arrayListOf("قديم", "رقيق", "جديد", "رخيص"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.old,
                    arrayListOf("قديم", "رخيص", "جديد", "سميك"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.new_word,
                    arrayListOf("غالي", "رخيص", "عجوز", "جديد"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.cheap,
                    arrayListOf("غالي", "رخيص", "عجوز", "جديد"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.expensive,
                    arrayListOf("شاب", "رخيص", "خاطئ", "غالي"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.true_word,
                    arrayListOf("صحيح", "رخيص", "عجوز", "جديد"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.false_word,
                    arrayListOf("شاب", "جيد", "خاطئ", "غالي"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.good,
                    arrayListOf("مستحيل", "سهل", "جيد", "صعب"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.bad,
                    arrayListOf("شاب", "جيد", "خاطئ", "غالي"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.difficult,
                    arrayListOf("مستحيل", "سهل", "جيد", "صعب"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.easy,
                    arrayListOf("سهل", "جيد", "خاطئ", "غالي"),
                    0
                )
            )
        }

        // 22 score
        var lesson_nine_data = ArrayList<QuestionsLetterWord>().apply {
            add(
                QuestionsLetterWord(
                    R.raw.in_front_of,
                    arrayListOf("بجانب", "امام", "خلف", "عند"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.behind,
                    arrayListOf("خلف", "في الداخل", "بعد", "كثير"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.before,
                    arrayListOf("معدوم", "قصير", "طويل", "قبل"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.after,
                    arrayListOf("قبل", "بعد", "خلف", "عند"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.in_word,
                    arrayListOf("خارج", "داخل", "بعد", "كثير"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.with,
                    arrayListOf("بدون", "ناقص", "مع", "الجميع"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.without,
                    arrayListOf("مع", "بجانب", "طويل", "بدون"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.outside,
                    arrayListOf("داخل", "بعد", "خارج", "عند"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.over,
                    arrayListOf("مع", "تحت", "فوق", "الاعلى"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.under,
                    arrayListOf("تحت", "ناقص", "مع", "الجميع"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.about,
                    arrayListOf("مع", "بجانب", "حول", "بدون"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.against,
                    arrayListOf("حول", "عدو", "صديق", "ضد"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.and,
                    arrayListOf("مع", "و", "او", "حرف"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.as_word,
                    arrayListOf("مثل", "عندما", "بين", "لكن"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.between,
                    arrayListOf("مع", "بين", "حول", "عندما"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.but,
                    arrayListOf("حول", "مع هذا", "لكن", "ضد"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.for_word,
                    arrayListOf("من اجل", "خارج", "في", "بدون سبب"),
                    0
                )
            )

            add(
                QuestionsLetterWord(
                    R.raw.near,
                    arrayListOf("او", "بقرب", "بعيد", "عندما"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.or,
                    arrayListOf("حول", "او", "لكن", "ضد"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.until,
                    arrayListOf("لـ", "منذ", "في", "حتى"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.since,
                    arrayListOf("منذ", "خارج", "في", "بدون سبب"),
                    0
                )
            )

            add(
                QuestionsLetterWord(
                    R.raw.thus,
                    arrayListOf("حتى يحصل", "بقرب", "بعيد", "لكي"),
                    3
                )
            )
        }

        // 17 score
        var lesson_ten_data = ArrayList<QuestionsLetterWord>().apply {
            add(
                QuestionsLetterWord(
                    R.raw.i_word,
                    arrayListOf("هي", "هو", "انا", "هم"),
                    2
                )
            )

            add(
                QuestionsLetterWord(
                    R.raw.you,
                    arrayListOf("هي", "انت", "هو", "انا"),
                    2
                )
            )

            add(
                QuestionsLetterWord(
                    R.raw.he_she_is,
                    arrayListOf("هما", "هو", "انا", "هم"),
                    1
                )
            )

            add(
                QuestionsLetterWord(
                    R.raw.he_she_is,
                    arrayListOf("هي", "امام", "خلف", "عند"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.we,
                    arrayListOf("بجانب", "هم", "نحن", "عند"),
                    2
                )
            )

            add(
                QuestionsLetterWord(
                    R.raw.you_siz,
                    arrayListOf("هما", "هو", "انا", "هم"),
                    1
                )
            )

            add(
                QuestionsLetterWord(
                    R.raw.them,
                    arrayListOf("انتم", "نحن", "هم", "هما"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.i_love_you,
                    arrayListOf("انا اكرهك", "انا بجانبك", "نحن", "انا احبك"),
                    3
                )
            )

            add(
                QuestionsLetterWord(
                    R.raw.she_is_beautiful,
                    arrayListOf("انا جميل", "هي جميلة", "شكرًا لك", "هم"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.we_are_happy,
                    arrayListOf("نحن حزينون", "نحن سعداء", "لا", "لماذا؟!"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.can_you_call_us,
                    arrayListOf("هل يمكنك الاتصال بنا؟", "أعطني رقم هاتفك", "نحن", "انا احبك"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.give_me_your_phone_number,
                    arrayListOf("انا جميل", "أعطني رقم هاتفك", "شكرًا لك", "هم"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.onlarin,
                    arrayListOf("انتم", "نحن", "هم", "هما"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.my_phone_number_is,
                    arrayListOf("لا اريد", "رقم هاتفي هو", "شكرًا لك", "هم"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.is_this_your_pencil,
                    arrayListOf("اللعنة", "النصر لنا", "هل هذا الكتاب لي؟", "هل هذا الكتاب لك؟"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.this_book_is_for_me,
                    arrayListOf("اللعنة", "هذا الكتاب لي", "هل هذا الكتاب لي؟", "هل هذا الكتاب لك؟"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.zafer_bizimdir,
                    arrayListOf("اللعنة", "النصر لنا", "هل هذا الكتاب لي؟", "هل هذا الكتاب لك؟"),
                    1
                )
            )
        }

        var lesson_eleven_data = ArrayList<QuestionsLetterWord>().apply {
            add(
                QuestionsLetterWord(
                    R.raw.belt,
                    arrayListOf("معطف", "ربطة عنق", "حزام", "زفاف"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.clothes,
                    arrayListOf("ملابس", "ربطة عنق", "حزام", "زفاف"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.coat,
                    arrayListOf("معطف", "ربطة عنق", "حزام", "زفاف"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.clothes,
                    arrayListOf("ملابس", "قبعة", "شريط", "قفازات"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.dress,
                    arrayListOf("معطف", "فستان", "حزام", "زفاف"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.glasses,
                    arrayListOf("ملابس", "قبعة", "نظارات", "زفاف"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.glove,
                    arrayListOf("بنطلون", "ربطة عنق", "حزام", "قفازات"),
                    3
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.hat,
                    arrayListOf("قبعة", "فستان", "حزام", "زفاف"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.jacket,
                    arrayListOf("بنطلون", "قبعة", "معطف", "خاتم"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.trousers,
                    arrayListOf("بنطلون", "ربطة عنق", "حزام", "قفازات"),
                    0
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.ring,
                    arrayListOf("احذية", "قبعة", "خاتم", "زفاف"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.shirt,
                    arrayListOf("قميص", "ربطة عنق", "بنطلون", "قفازات"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.socks,
                    arrayListOf("احذية", "بذلة", "جوارب", "قفازات"),
                    2
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.suit,
                    arrayListOf("قميص", "بذلة", "احذية", "سترة"),
                    1
                )
            )
            add(
                QuestionsLetterWord(
                    R.raw.sweater,
                    arrayListOf("احذية", "بذلة", "جوارب", "سترة"),
                    3
                )
            )
        }
    }
}