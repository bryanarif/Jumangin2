package com.example.jumangin2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        supportActionBar?.hide()

//        if (supportActionBar != null) {
//            supportActionBar!!.hide()
//        }
////
//        mcDiagnosa!!.setOnClickListener {
//            val intent = Intent(applicationContext, DaftarPenyakit::class.java)
//            startActivity(intent)
//        }
        val MaterialCardView = findViewById<MaterialCardView>(R.id.mcDiagnosa)
        MaterialCardView.setOnClickListener {
            val intent = Intent(this, Form::class.java)
            startActivity(intent)
        }
        val MaterialCardView1 = findViewById<MaterialCardView>(R.id.mcKek)
        MaterialCardView1.setOnClickListener {
            val intent = Intent(this, Kek::class.java)
            startActivity(intent)
        }
        val MaterialCardView2 = findViewById<MaterialCardView>(R.id.mcAnemia)
        MaterialCardView2.setOnClickListener {
            val intent = Intent(this, Anemia::class.java)
            startActivity(intent)
        }
        val MaterialCardView3 = findViewById<MaterialCardView>(R.id.mcStunting)
        MaterialCardView3.setOnClickListener {
            val intent = Intent(this, Stunt::class.java)
            startActivity(intent)
        }
        val MaterialCardView4 = findViewById<MaterialCardView>(R.id.mcAbout)
        MaterialCardView4.setOnClickListener {
            val intent = Intent(this, Kami::class.java)
            startActivity(intent)
        }
        val MaterialCardView5 = findViewById<MaterialCardView>(R.id.mcInfo)
        MaterialCardView5.setOnClickListener {
            val intent = Intent(this, Info::class.java)
            startActivity(intent)
        }


    }
}