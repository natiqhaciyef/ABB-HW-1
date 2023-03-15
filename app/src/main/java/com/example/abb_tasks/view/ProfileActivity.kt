package com.example.abb_tasks.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.abb_tasks.R
import com.example.abb_tasks.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}