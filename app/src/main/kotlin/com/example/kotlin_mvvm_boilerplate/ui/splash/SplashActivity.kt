package com.example.kotlin_mvvm_boilerplate.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin_mvvm_boilerplate.R
import com.example.kotlin_mvvm_boilerplate.ui.main.view.MainActivity


class SplashActivity : AppCompatActivity() {
    companion object {
        const val SPLASH_TIME_OUT = 2000L
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}