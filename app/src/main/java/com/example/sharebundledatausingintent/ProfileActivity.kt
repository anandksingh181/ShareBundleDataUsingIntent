package com.example.sharebundledatausingintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharebundledatausingintent.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent

        val name = intent.getStringExtra("name")
        val fatherName = intent.getStringExtra("fName")
        val rollNumber = intent.getStringExtra("rNumber")
        val phoneNumber = intent.getStringExtra("pNumber")

        binding.showName.text = "Name : $name"
        binding.showFatherName.text = "FatherName : $fatherName"
        binding.showRollNumber.text = "RollNo : $rollNumber"
        binding.showPhoneNumber.text = "PhoneNo : $phoneNumber"


    }
}