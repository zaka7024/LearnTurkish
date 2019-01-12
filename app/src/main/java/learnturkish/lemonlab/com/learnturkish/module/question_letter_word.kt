package learnturkish.lemonlab.com.learnturkish.module

data class question_letter_word(var sound:Int, var options:ArrayList<String>, var answer:Int) {
    constructor():this(0,ArrayList(),0)
}