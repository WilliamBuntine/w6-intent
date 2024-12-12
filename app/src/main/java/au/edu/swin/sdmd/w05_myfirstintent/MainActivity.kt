package au.edu.swin.sdmd.w05_myfirstintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlin.random.Random
import android.widget.TextView

/**
 * Your task: create an intent that opens the DetailActivity when the image in MainActivity
 * is clicked.
 *
 * There is a UI test in MainActivityTest to check whether your code works.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val leftText : TextView = findViewById(R.id.textView)
        val rightText : TextView = findViewById(R.id.textView2)
        val button : Button = findViewById(R.id.button)

        val firstInt = Random.nextInt(from = 1, until = 13)
        val secondInt = Random.nextInt(from = 1, until = 13)

        val firstString = firstInt.toString()
        val secondString = secondInt.toString()

        val pair = IntPair(firstInt, secondInt)

        leftText.text = firstString
        rightText.text = secondString

        button.setOnClickListener {
            Toast.makeText(this, "Set up the intent here and remove the toast",
                Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("pair", pair)
            startActivity(intent)
        }
    }
}