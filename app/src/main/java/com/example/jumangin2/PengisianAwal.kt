package com.example.jumangin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class PengisianAwal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengisian_awal)

        val myWebView: WebView = findViewById(R.id.webView)
        myWebView.loadUrl("https://forms.gle/MJfvE2Q8z4wYq1hn9")

    }
}