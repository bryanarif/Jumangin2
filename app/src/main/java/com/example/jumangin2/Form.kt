package com.example.jumangin2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.card.MaterialCardView

class Form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val Button = findViewById<Button>(R.id.button2)
        Button.setOnClickListener {
            val intent = Intent(this, PengisianAwal::class.java)
            startActivity(intent)
        }
        val Button3 = findViewById<Button>(R.id.button3)
        Button3.setOnClickListener {
            val intent = Intent(this, PengisianBulan::class.java)
            startActivity(intent)
        }
    }
}