package com.example.sharebundledatausingintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharebundledatausingintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.GoToNextActivity.setOnClickListener {
            val name = binding.name.text.toString()
            val fName = binding.fatherName.text.toString()
            val rNumber = binding.rollNumber.text.toString()
            val pNumber = binding.phoneNumber.text.toString()

            val intent = Intent(this ,ProfileActivity::class.java)
            intent.putExtra("name",name)
            intent.putExtra("fName",fName)
            intent.putExtra("rNumber",rNumber)
            intent.putExtra("pNumber",pNumber)
            startActivity(intent)
        }

    }
}