package com.example.touch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.touch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            root.setOnClickListener {
                Toast.makeText(this@MainActivity, "ROOT", Toast.LENGTH_SHORT).show()
            }

            btn.setOnClickListener {
                Toast.makeText(this@MainActivity, "CHILD", Toast.LENGTH_SHORT).show()
            }
        }
    }
}



