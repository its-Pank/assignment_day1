package com.example.assignment_day1

import android.app.ProgressDialog
import android.content.Intent
import android.media.tv.TvContract.Programs
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.example.assignment_day1.databinding.ActivityAboutAppBinding

class about_App : AppCompatActivity() {
    lateinit var binding: ActivityAboutAppBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityAboutAppBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}