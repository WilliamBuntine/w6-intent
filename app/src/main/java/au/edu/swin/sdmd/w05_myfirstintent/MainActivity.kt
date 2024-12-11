package au.edu.swin.sdmd.w05_myfirstintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

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

        val image = findViewById<ImageView>(R.id.mainImage)

        image.setOnClickListener {
            Toast.makeText(this, "Set up the intent here and remove the toast",
                Toast.LENGTH_SHORT).show()
            /*
                the following was missing from manifest
                        <activity android:name=".DetailActivity"></activity>
             */
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
    }
}