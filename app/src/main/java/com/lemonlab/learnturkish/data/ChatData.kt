package com.lemonlab.learnturkish.data

import com.lemonlab.learnturkish.R
import com.lemonlab.learnturkish.module.Chat

object ChatData {
    var chatData = ArrayList<Chat>().apply {
        add(Chat("Selam lyla. Nasılsın?", "مرحبا ليلى، كيف حالك؟", R.raw.chat_1))
        add(
            Chat(
                "Merhaba Rola. Nasılsınız?",
                "مرحبا رولا، كيف حالك أنتِ؟",
                R.raw.chat_2
            )
        )
        add(
            Chat(
                "Çok iyi teşekkür ederim. Son görüşmemizden çok zaman geçti.",
                "بخير شكرًا لك، مر وقت طويل على آخر لقاء لنا",
                R.raw.chat_3
            )
        )
        add(
            Chat(
                "Doğru. Uzun zaman sonra görmek güzel.",
                "صحيح، رؤيتك بعد وقت طويل جميلة جدًا",
                R.raw.chat_4
            )
        )
        add(Chat("Gerçekten seni görmek güzel", "حقًا رويتك أنتِ جميلة", R.raw.chat_5))
        add(
            Chat(
                "Buraya yeni bir bilgisayar almaya geldim. Neden buraya geldin?",
                "أنا أتيت إلى هنا لشراء حاسوب جديد، لماذا أنتِ هنا؟",
                R.raw.chat_6
            )
        )
        add(
            Chat(
                "Ailem beni onlara katılmaya zorladı. Yani, onlarla buradayım.",
                "عائلني أخذوني غصبًا معهم، لذلك أنا هنا",
                R.raw.chat_7
            )
        )
        add(Chat("Bekleyin. Evlendin mi?", "انتظري!!، هل تزوجتي؟", R.raw.chat_8))
        add(
            Chat(
                "Hayır. Evlenmek için daha yaşlı değilim.",
                "لا، لست مستعدة للزواج بعد",
                R.raw.chat_9
            )
        )
        add(
            Chat(
                "Ben bir trene bineceğim. Bana katılacak mısın?",
                "أنا أريد ركوب قطار، هل سوف تنضمي إلي؟",
                R.raw.chat_10
            )
        )
        add(Chat("Yok hayır . İlgilenmiyorum.", "لا لا، لا أهتم", R.raw.chat_11))
        add(
            Chat(
                "Senin ailen nerede? Onlarla tanışmama izin ver.",
                "أين هي عائلتك؟، دعيني ألتقي بهم",
                R.raw.chat_12
            )
        )
        add(
            Chat(
                "Nerede olduklarını bilmiyorum. Ne yapıyorsun?",
                "لا أعلم أين هم، أنتِ ماذا تفعلي؟",
                R.raw.chat_13
            )
        )
        add(
            Chat(
                "Şu anda bilgisayar bilimi okuyorum",
                "حاليًا أدرس علوم الحاسوب",
                R.raw.chat_14
            )
        )
        add(
            Chat(
                "Ah! Kulağa hoş geliyor. Ben matematik okuyorum",
                "اووو، تبدو جيدة، أنا أدرس الرياضيات",
                R.raw.chat_15
            )
        )
        add(
            Chat(
                "Bu harika. Babam çağırıyor",
                "هذا جميل جدًا...، أبي يناديني",
                R.raw.chat_16
            )
        )
        add(
            Chat(
                "Annem aniden eve gitmek istiyor. Sonra görüşürüz. Hoşçakal",
                "وأمي تريد الذهاب الى المنزل، نلتقي فيما بعد، مع السلامة",
                R.raw.chat_17
            )
        )
        add(Chat("Hoşçakal lyla", "مع السلامة ليلى", R.raw.chat_18))
    }
}