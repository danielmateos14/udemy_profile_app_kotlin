package com.example.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import com.example.profile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var lat = 0.0
    private var long = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateUI()

        binding.tvLocation.setOnClickListener {

        }

    }

    private fun updateUI(
        name: String = "Luis Daniel Mateos",
        email: String = "luisdmateos@gmail.com",
        website: String = "www.google.com",
        phone: String = "5540374031"
    ) {
        binding.tvName.text = name
        binding.tvEmail.text = email
        binding.tvWebSite.text = website
        binding.tvPhone.text = phone

        lat = 19.633397167523707
        long = -99.12184445830947

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_edit) {
            val intent: Intent = Intent(this, EditActivity::class.java)
            intent.putExtra("llaveNombre", binding.tvName.text)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}