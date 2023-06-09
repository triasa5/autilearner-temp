package stcet.project.autilearner.learn_emotion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import stcet.project.autilearner.R

class LearnEmotionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_emotion)
        clickListener()
    }

    public fun clickListener() {
        var lesson1 = findViewById<Button>(R.id.emotion_lesson1)
        lesson1.setOnClickListener {
            openLession1Activity()
        }
    }

    public fun openLession1Activity() {
        startActivity(Intent(this@LearnEmotionActivity, Lesson1Activity::class.java))
    }
}