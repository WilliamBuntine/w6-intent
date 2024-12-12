package au.edu.swin.sdmd.w05_myfirstintent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val resultText : TextView = findViewById(R.id.textView3)

        val pair = intent.getParcelableExtra<IntPair>("pair")

        pair?.let {
        val result = pair.firstInt * pair.secondInt

        val resultString = result.toString()

        resultText.text = resultString
        }
    }
}