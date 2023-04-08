package com.example.jumangin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Stunt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stunt)
        val myWebView: WebView = findViewById(R.id.webViewstunt)
        myWebView.loadUrl("file:///android_asset/stunt.html")
    }
}