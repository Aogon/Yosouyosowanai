package app.sakai.tororoimo.yosouyosowanai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val people = arrayOf<String>("おっちー", "まっすー", "しんぺー", "おんじ")
    val food = arrayOf<String>("かれー", "みそしる", "ちゃーはん", "えびちり", "ごはん")
    val state = arrayOf<String>("よそえました^^", "よそえませんでした")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun serveFood(view: View?) {
        val randomName = Random()
        val index = randomName.nextInt(4)
        val name = people[index]
        nameTextView.text = name+ "に"
        foodTextView.text = food[Random().nextInt(5)] + "を"
        verbTextView.text = state[Random().nextInt(2)]
    }


}
