package ma.ofppt.youtube_learning

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //explicitIntent

        var ExplicitButton = findViewById<Button>(R.id.ExpilicitButton)
        ExplicitButton.setOnClickListener {
            val excplicitIntent = Intent(this, MainActivity2::class.java)
            startActivity(excplicitIntent)
            finish() //for exit application
        }

        //implicitIntent
        val url = "https://www.google.com"
        var ImplicitButton:Button = findViewById(R.id.ImplicitIntent)
        ImplicitButton.setOnClickListener {
            var impilivcitIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(impilivcitIntent)
        }

    }
}