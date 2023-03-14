package com.example.assignment_day1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.assignment_day1.databinding.ActivityAboutAppBinding

class about_App : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityAboutAppBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityAboutAppBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.aboutApp.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.about_app ->{
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Body_mass_index"))
                startActivity(intent)
            }
        }
    }
}