package com.lemonlab.learnturkish.module

data class QuestionsLetterWord(var sound:Int, var options:ArrayList<String>, var answer:Int) {
    constructor():this(0,ArrayList(),0)
}