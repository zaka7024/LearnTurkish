package learnturkish.lemonlab.com.learnturkish.data

import learnturkish.lemonlab.com.learnturkish.R
import learnturkish.lemonlab.com.learnturkish.module.question_letter

class letterQuizData{
    companion object {
        var question_data = ArrayList<question_letter>().apply {
            add(question_letter(R.raw.a_char, arrayListOf("c", "a", "f","z"), 1))
            add(question_letter(R.raw.b_char, arrayListOf("v", "b", "e","a"), 1))
            add(question_letter(R.raw.c_char, arrayListOf("Z", "C", "L","A"), 1))
        }
    }
}