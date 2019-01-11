package learnturkish.lemonlab.com.learnturkish

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_learn_letters.*
import learnturkish.lemonlab.com.learnturkish.items.letter_item
import learnturkish.lemonlab.com.learnturkish.items.start_quiz

class LearnLetters : AppCompatActivity() {

    var adapter = GroupAdapter<ViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_letters)

        // init letters rv
        initLearnLettersRV()

        // add items(letters with sound) to rv
        addLettersToRV()

    }

    fun initLearnLettersRV(){
        learn_letters_rv.layoutManager  = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        learn_letters_rv.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        learn_letters_rv.adapter = adapter
    }

    fun addLettersToRV(){

        adapter.add(start_quiz("استمع الى جميع الحروف لفتح الاختبار", R.drawable.letters_icon,this))

        adapter.add(letter_item("A", "a","alaska", R.raw.a_char, this@LearnLetters))
        adapter.add(letter_item("B", "b","bravo", R.raw.b_char, this@LearnLetters))
        adapter.add(letter_item("C", "c","chat", R.raw.c_char, this@LearnLetters))
        adapter.add(letter_item("Ç", "ç","çay", R.raw.c__char, this@LearnLetters))
        adapter.add(letter_item("D", "d","david", R.raw.d_char, this@LearnLetters))
        adapter.add(letter_item("E", "e","emma", R.raw.e_char, this@LearnLetters))
        adapter.add(letter_item("F", "f", "cafe",R.raw.f_char, this@LearnLetters))
        adapter.add(letter_item("G", "g","gym", R.raw.g_char, this@LearnLetters))
        adapter.add(letter_item("Ğ", "ğ", "yağmur",R.raw.g__char, this@LearnLetters))
        adapter.add(letter_item("H", "h", "havlu",R.raw.h_char, this@LearnLetters))
        adapter.add(letter_item("I", "i", "ıspanak",R.raw.i_char, this@LearnLetters))
        adapter.add(letter_item("J", "j", "jimnastik ",R.raw.j_char, this@LearnLetters))
        adapter.add(letter_item("K", "k", "kitap ",R.raw.k_char, this@LearnLetters))
        adapter.add(letter_item("L", "l", "limon",R.raw.l_char, this@LearnLetters))
        adapter.add(letter_item("M", "m", "masa ",R.raw.m_char, this@LearnLetters))
        adapter.add(letter_item("N", "n", "Namaz",R.raw.n_char, this@LearnLetters))
        adapter.add(letter_item("O", "o", "okul",R.raw.o_char, this@LearnLetters))
        adapter.add(letter_item("Ö", "ö", "ördek",R.raw.o__char, this@LearnLetters))
        adapter.add(letter_item("P", "p", "parmak",R.raw.p_char, this@LearnLetters))
        adapter.add(letter_item("R", "r", "resim",R.raw.r_char, this@LearnLetters))
        adapter.add(letter_item("S", "s","su", R.raw.s_char, this@LearnLetters))
        adapter.add(letter_item("Ş", "ş","şeker", R.raw.s__char, this@LearnLetters))
        adapter.add(letter_item("T", "t", "top",R.raw.t_char, this@LearnLetters))
        adapter.add(letter_item("U", "u", "uçak",R.raw.u_char, this@LearnLetters))
        adapter.add(letter_item("Ü", "ü", "ülke",R.raw.u__char, this@LearnLetters))
        adapter.add(letter_item("V", "v", "vazo",R.raw.v_char, this@LearnLetters))
        adapter.add(letter_item("Y", "y", "yemek",R.raw.y_char, this@LearnLetters))
        adapter.add(letter_item("Z", "z", "zambak",R.raw.z_char, this@LearnLetters))
    }
}
