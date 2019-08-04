package com.teckudos.programmingcenter.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.teckudos.programmingcenter.R
import com.teckudos.programmingcenter.databinding.ActivitySplashBinding
import com.teckudos.programmingcenter.utils.CustomTab

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivitySplashBinding>(
            this, R.layout.activity_splash
        )
        init(binding)
    }

    private fun init(binding: ActivitySplashBinding) {
        binding.btnW3School.setOnClickListener {
            CustomTab(this).showTab("https://www.w3schools.com/")
        }
        binding.btnJavaTpoint.setOnClickListener {
            CustomTab(this).showTab("https://www.javatpoint.com/")
        }
        binding.btnTutorialsPoint.setOnClickListener {
            CustomTab(this).showTab("https://www.tutorialspoint.com/")
        }
    }
}
