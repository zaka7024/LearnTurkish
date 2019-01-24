package com.lemonlab.learnturkish.data

import com.lemonlab.learnturkish.R
import com.lemonlab.learnturkish.module.question_letter_word
class QuizData{
    companion object {

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
                    arrayListOf("عم", "أم", "أحت", "أخ"),
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
                    arrayListOf("عم", "خالة", "أحت", "خال"),
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
                    arrayListOf("أخ", "عائلة", "أحت", "خال"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.word_7,
                    arrayListOf("اخي", "رضيع", "أحت", "طفل"),
                    3
                )
            )
            add(
                question_letter_word(
                    R.raw.word_6,
                    arrayListOf("اخي", "جد", "أحت", "طفل"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.word_14,
                    arrayListOf("أخت", "رضيع", "أحت", "حفيد"),
                    1
                )
            )
            add(
                question_letter_word(
                    R.raw.word_11,
                    arrayListOf("اخي", "طفل", "أحت", "توام"),
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


    }
}