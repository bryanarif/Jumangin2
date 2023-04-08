package com.example.jumangin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Kek : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kek)

        val myWebView: WebView = findViewById(R.id.webViewkek)
        myWebView.loadUrl("file:///android_asset/index.html")
    }
}