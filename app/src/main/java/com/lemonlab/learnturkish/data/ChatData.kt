package com.lemonlab.learnturkish.data

import com.lemonlab.learnturkish.R
import com.lemonlab.learnturkish.module.Chat

object ChatData {
    var chatData = ArrayList<Chat>().apply {
        add(Chat("Selam lyla. Nasılsın?", "مرحبا ليلى، كيف حالك؟", R.raw.chat_1))
        add(
            Chat(
                "Merhaba Rola. Nasılsınız?",
                "مرحبا رولا، كيف حالك انتي؟",
                R.raw.chat_2
            )
        )
        add(
            Chat(
                "Çok iyi teşekkür ederim. Son görüşmemizden çok zaman geçti.",
                "بخير شكرًا لك، مر وقت طويل على اخر لقاء لنا",
                R.raw.chat_3
            )
        )
        add(
            Chat(
                "Doğru. Uzun zaman sonra görmek güzel.",
                "صحيح، رويتك بعد وقت طويل جميلة جدًا",
                R.raw.chat_4
            )
        )
        add(Chat("Gerçekten seni görmek güzel", "حقًا رويتك انتي جميلة", R.raw.chat_5))
        add(
            Chat(
                "Buraya yeni bir bilgisayar almaya geldim. Neden buraya geldin?",
                "انا اتيت الى هنا لشراء حاسوب جديد، لماذا انتي هنا؟",
                R.raw.chat_6
            )
        )
        add(
            Chat(
                "Ailem beni onlara katılmaya zorladı. Yani, onlarla buradayım.",
                "عائلني اخذوني غصبًا معهم، لذلك انا هنا",
                R.raw.chat_7
            )
        )
        add(Chat("Bekleyin. Evlendin mi?", "انتظري!!، هل تزوجتي؟", R.raw.chat_8))
        add(
            Chat(
                "Hayır. Evlenmek için daha yaşlı değilim.",
                "لا، لست متعدة لزواج بعد",
                R.raw.chat_9
            )
        )
        add(
            Chat(
                "Ben bir trene bineceğim. Bana katılacak mısın?",
                "انا اريد ركوب قطار، هل سوف تنضمي الي؟",
                R.raw.chat_10
            )
        )
        add(Chat("Yok hayır . İlgilenmiyorum.", "لا لا، لا اهتم", R.raw.chat_11))
        add(
            Chat(
                "Senin ailen nerede? Onlarla tanışmama izin ver.",
                "اين هي عائلتك؟، دعيني التقي بهم",
                R.raw.chat_12
            )
        )
        add(
            Chat(
                "Nerede olduklarını bilmiyorum. Ne yapıyorsun?",
                "لا اعلم اين هم، انتي ماذا تفعلي؟",
                R.raw.chat_13
            )
        )
        add(
            Chat(
                "Şu anda bilgisayar bilimi okuyorum",
                "حاليًا ادرس علوم الحاسوب",
                R.raw.chat_14
            )
        )
        add(
            Chat(
                "Ah! Kulağa hoş geliyor. Ben matematik okuyorum",
                "اووو، تبدو جيدة، انا ادرس الرياضيات",
                R.raw.chat_15
            )
        )
        add(
            Chat(
                "Bu harika. Babam çağırıyor",
                "هذا جميل جدا...، ابي يناديني",
                R.raw.chat_16
            )
        )
        add(
            Chat(
                "Annem aniden eve gitmek istiyor. Sonra görüşürüz. Hoşçakal",
                "وامي تريد الذهاب الى المنزل، نلتقي فيما بعد، مع السلامة",
                R.raw.chat_17
            )
        )
        add(Chat("Hoşçakal lyla", "مع السلامة ليلى", R.raw.chat_18))
    }
}