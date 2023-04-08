package com.example.jumangin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class PengisianBulan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengisian_bulan)

        val myWebView: WebView = findViewById(R.id.webView2)
        myWebView.loadUrl("https://forms.gle/irVCATA6yZSCKU797")
    }
}