package com.example.abb_tasks.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.example.abb_tasks.R
import com.example.abb_tasks.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val navHost = supportFragmentManager
//            .findFragmentById(R.id.fragmentContainerView) as NavHostFragment
//        val navController = navHost.navController

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val position = binding.tabLayout.selectedTabPosition
                navigation(position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })
    }

    fun navigation(position: Int) {
        when (position) {
            0 -> binding.fragmentContainerView.findNavController().navigate(R.id.homeFragment)
            1 -> binding.fragmentContainerView.findNavController().navigate(R.id.productFragment)
            2 -> binding.fragmentContainerView.findNavController().navigate(R.id.saleFragment)
            3 -> binding.fragmentContainerView.findNavController().navigate(R.id.settingFragment)
            else -> binding.fragmentContainerView.findNavController().navigate(R.id.settingFragment)
        }
    }
}