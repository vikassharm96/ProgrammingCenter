package com.teckudos.programmingcenter.utils

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.databinding.BindingAdapter

@BindingAdapter("app:displayUrl")
fun displayUrl(
        webView: WebView,
        url: String?
) {
    url?.let {
        webView.loadUrl(it)
        webView.settings.domStorageEnabled = true
        webView.overScrollMode = WebView.OVER_SCROLL_NEVER
        webView.webViewClient = WebViewClient()
    }
}
