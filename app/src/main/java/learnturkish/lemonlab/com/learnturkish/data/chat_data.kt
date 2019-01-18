package learnturkish.lemonlab.com.learnturkish.data

import learnturkish.lemonlab.com.learnturkish.R
import learnturkish.lemonlab.com.learnturkish.module.chat

object chat_data {
    var chatData = ArrayList<chat>().apply {
        add(chat("Selam lyla. Nasılsın?", "واحد", R.raw.chat_1))
        add(chat("Merhaba Rola. Nasılsınız?", "اثنين", R.raw.chat_2))
        add(chat("Çok iyi teşekkür ederim. Son görüşmemizden çok zaman geçti.", "ثلاث", R.raw.chat_3))
        add(chat("Doğru. Uzun zaman sonra görmek güzel.", "اربعة", R.raw.chat_4))
        add(chat("Gerçekten seni görmek güzel", "", R.raw.chat_5))
        add(chat("Buraya yeni bir bilgisayar almaya geldim. Neden buraya geldin?", "", R.raw.chat_6))
        add(chat("Ailem beni onlara katılmaya zorladı. Yani, onlarla buradayım.", "", R.raw.chat_7))
        add(chat("Bekleyin. Evlendin mi?", "", R.raw.chat_8))
        add(chat("Hayır. Evlenmek için daha yaşlı değilim.", "", R.raw.chat_9))
        add(chat("Ben bir trene bineceğim. Bana katılacak mısın?", "", R.raw.chat_10))
        add(chat("Yok hayır . İlgilenmiyorum.", "", R.raw.chat_11))
        add(chat("Senin ailen nerede? Onlarla tanışmama izin ver.", "", R.raw.chat_12))
        add(chat("Nerede olduklarını bilmiyorum. Ne yapıyorsun?", "", R.raw.chat_13))
        add(chat("Şu anda bilgisayar bilimi okuyorum", "", R.raw.chat_14))
        add(chat("Ah! Kulağa hoş geliyor. Ben matematik okuyorum", "", R.raw.chat_15))
        add(chat("Bu harika. Babam çağırıyor", "", R.raw.chat_16))
        add(chat("Annem aniden eve gitmek istiyor. Sonra görüşürüz. Hoşçakal", "", R.raw.chat_17))
        add(chat("Hoşçakal lyla", "", R.raw.chat_18))
    }
}