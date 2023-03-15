package com.example.assignment_day1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.assignment_day1.databinding.ActivityWebViewBinding

class webView : AppCompatActivity() {

    private lateinit var binding: ActivityWebViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webView.webViewClient = MyViewClient()

        binding.webView.loadUrl("https://www.calculator.net/bmi-calculator.html")

    }
    inner class MyViewClient : WebViewClient()
    {
        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            binding.progressBar.visibility= View.GONE
        }
    }
}