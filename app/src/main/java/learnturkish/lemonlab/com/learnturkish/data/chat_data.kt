package learnturkish.lemonlab.com.learnturkish.data

import learnturkish.lemonlab.com.learnturkish.R
import learnturkish.lemonlab.com.learnturkish.module.chat

object chat_data {
    var chatData = ArrayList<chat>().apply {
        add(chat("bir bir bir", "واحد", R.raw.one))
        add(chat("iki iki sad", "اثنين", R.raw.two))
        add(chat("uc asd ads ddd asd ", "ثلاث", R.raw.three))
        add(chat("dort", "اربعة", R.raw.four))
        add(chat("bish asd asd as dd asopfg l;dfmkgmdf kgm kldfmgk mlgkdfg ", "خمسة", R.raw.five))
    }
}