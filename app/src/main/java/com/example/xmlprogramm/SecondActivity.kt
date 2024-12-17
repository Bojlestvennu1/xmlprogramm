package com.example.xmlprogramm

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val userName = intent.getStringExtra("USER_NAME")
        val userAge = intent.getIntExtra("USER_AGE", -1)

        val tvMessage: TextView = findViewById(R.id.tvMessage)
        val btnBack: Button = findViewById(R.id.btnBack)

        tvMessage.text = "Добро пожаловать, $userName. Ваш возраст: $userAge"

        btnBack.setOnClickListener {
            finish()
        }
    }
}