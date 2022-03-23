package com.example.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.profile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateUI()
    }

    private fun updateUI(name: String = "Luis Daniel Mateos",
                         email: String = "luisdmateos@gmail.com",
                         website: String = "www.google.com",
                         phone: String = "5540374031") {
    binding.tvName.text = name
    binding.tvEmail.text = email
    binding.tvWebSite.text = website
    binding.tvPhone.text = phone

    }
}