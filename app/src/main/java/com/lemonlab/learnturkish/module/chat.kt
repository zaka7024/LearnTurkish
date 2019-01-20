package com.lemonlab.learnturkish.module

data class chat(var text:String, var arabic:String, var sound:Int) {
    constructor():this("", "", 0)
}