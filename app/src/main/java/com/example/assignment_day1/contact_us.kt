package com.example.assignment_day1

import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.PackageManager.PERMISSION_GRANTED
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.assignment_day1.databinding.ActivityContactUsBinding

class contact_us : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityContactUsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactUsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dialBtn.setOnClickListener(this)
        binding.callBtn.setOnClickListener(this)
        binding.emailBtn.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.dial_btn -> {
                val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel: 7080807381"))
                startActivity(intent)
            }

            R.id.email_btn -> {
                val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:kaushikshatakshi427@gmail.com"))
                startActivity(intent)
            }

            R.id.call_btn -> {
                if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE) == PERMISSION_GRANTED ){
                    val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:7080807811"))
                    startActivity(intent)
                }

                else{
                    ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CALL_PHONE), 1001)
                }

            }



        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 1001){
            if (grantResults.isNotEmpty() && permissions[0].equals(PackageManager.PERMISSION_GRANTED)){
                if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE) == PERMISSION_GRANTED ){
                    val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:7080807811"))
                    startActivity(intent)
                }

                else{
                    ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CALL_PHONE), 1001)
                }
            }
            else{
                Toast.makeText(this, "Please give the permission", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
