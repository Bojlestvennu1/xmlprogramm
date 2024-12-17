package com.example.xmlprogramm

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val name = intent.getStringExtra("name")
        val age = intent.getStringExtra("age")

        val textView = findViewById<TextView>(R.id.tvMessage)
        textView.text = "Добро пожаловать, $name. Ваш возраст: $age"

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }
    }
}