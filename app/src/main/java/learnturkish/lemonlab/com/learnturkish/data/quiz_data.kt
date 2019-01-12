package learnturkish.lemonlab.com.learnturkish.data

import learnturkish.lemonlab.com.learnturkish.R
import learnturkish.lemonlab.com.learnturkish.module.question_letter_word
class QuizData{
    companion object {
        var letters_question_data = ArrayList<question_letter_word>().apply {
            add(question_letter_word(R.raw.a_char, arrayListOf("c", "a", "f","z"), 1))
            add(question_letter_word(R.raw.b_char, arrayListOf("v", "b", "e","a"), 1))
            add(question_letter_word(R.raw.c_char, arrayListOf("Z", "C", "L","A"), 1))
        }

        var words_question_data = ArrayList<question_letter_word>().apply {
            add(question_letter_word(R.raw.word_4, arrayListOf("أب","أم","طفل","أخ"), 0))
            add(question_letter_word(R.raw.word_3, arrayListOf("أب","أم","طفل","أخ"), 2))
            add(question_letter_word(R.raw.word_9, arrayListOf("أب","أم","طفل","أخ"), 3))
        }
    }
}