package com.teckudos.programmingcenter.view

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.teckudos.programmingcenter.R
import com.teckudos.programmingcenter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
        )
        init(binding)
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun init(binding: ActivityMainBinding) {
        val webSiteUrl = intent.getStringExtra(W3_SCHOOL_URL)

        binding.apply {
            webView.settings.javaScriptEnabled = true

            url = webSiteUrl
            toolbarTitle = webSiteUrl
            setToolbarHomeNavClickListener {
                onBackPressed()
            }
        }
    }

    companion object {
        const val W3_SCHOOL_URL = "url"
    }
}
