package com.example.smarthouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.widget.ImageView
import java.util.logging.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val splashView : ImageView = findViewById(R.id.splashview)
        splashView.animate().rotation(360f).setDuration(3000).start()
        android.os.Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, pinCode::class.java)
       startActivity(intent)
            finish()
        },5000)

    }
}