package com.example.jumangin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Anemia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anemia)

        val myWebView: WebView = findViewById(R.id.webViewanemia)
        myWebView.loadUrl("file:///android_asset/anemia.html")
    }
}