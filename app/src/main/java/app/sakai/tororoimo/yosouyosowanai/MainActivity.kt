package app.sakai.tororoimo.yosouyosowanai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val people = arrayOf<String>("おっちー", "まっすー", "しんぺー", "おんじ")
    val food = arrayOf<String>("かれー", "みそしる", "ちゃーはん", "えびちり")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


}
