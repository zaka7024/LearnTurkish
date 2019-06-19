package com.lemonlab.learnturkish.module

data class Chat(var text:String, var arabic:String, var sound:Int) {
    constructor():this("", "", 0)
}