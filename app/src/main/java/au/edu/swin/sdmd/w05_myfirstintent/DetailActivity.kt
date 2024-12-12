package au.edu.swin.sdmd.w05_myfirstintent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val resultText : TextView = findViewById(R.id.textView3)

        val leftInt = intent.getIntExtra("leftInt", 0)
        val rightInt = intent.getIntExtra("rightInt", 0)

        val result = leftInt * rightInt

        val resultString = result.toString()

        resultText.text = resultString

    }
}