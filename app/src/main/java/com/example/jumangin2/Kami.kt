package com.example.jumangin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Kami : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kami)

        val myWebView: WebView = findViewById(R.id.webViewkami)
        myWebView.loadUrl("https://puskesmaspracimantoro1.com")
    }
}