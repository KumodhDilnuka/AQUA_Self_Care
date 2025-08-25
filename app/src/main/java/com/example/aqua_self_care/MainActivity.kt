package com.example.aqua_self_care

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.aqua_self_care.fragments.HomeFragment
import com.example.aqua_self_care.fragments.GoalsFragment
import com.example.aqua_self_care.fragments.ActivityFragment
import com.example.aqua_self_care.fragments.ProfileFragment

class MainActivity : AppCompatActivity() {
    
    private lateinit var viewPager: ViewPager2
    private lateinit var bottomNavigation: BottomNavigationView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        initializeViews()
        setupViewPager()
        setupBottomNavigation()
    }
    
    private fun initializeViews() {
        viewPager = findViewById(R.id.viewPager)
        bottomNavigation = findViewById(R.id.bottomNavigation)
    }
    
    private fun setupViewPager() {
        val adapter = MainPagerAdapter(this)
        viewPager.adapter = adapter
        
        // Disable ViewPager2 swipe gestures
        viewPager.isUserInputEnabled = false
    }
    
    private fun setupBottomNavigation() {
        bottomNavigation.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigation_home -> {
                    viewPager.currentItem = 0
                    true
                }
                R.id.navigation_goals -> {
                    viewPager.currentItem = 1
                    true
                }
                R.id.navigation_activity -> {
                    viewPager.currentItem = 2
                    true
                }
                R.id.navigation_profile -> {
                    viewPager.currentItem = 3
                    true
                }
                else -> false
            }
        }
    }
}
