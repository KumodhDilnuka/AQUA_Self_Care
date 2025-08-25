package com.example.aqua_self_care

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class OnboardingActivity : AppCompatActivity() {
    
    private lateinit var viewPager: ViewPager2
    private lateinit var btnPrevious: Button
    private lateinit var btnSkip: Button
    private lateinit var btnNext: Button
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
        
        initializeViews()
        setupViewPager()
        setupNavigation()
    }
    
    private fun initializeViews() {
        viewPager = findViewById(R.id.viewPager)
        btnPrevious = findViewById(R.id.btnPrevious)
        btnSkip = findViewById(R.id.btnSkip)
        btnNext = findViewById(R.id.btnNext)
    }
    
    private fun setupViewPager() {
        val adapter = OnboardingPagerAdapter(this)
        viewPager.adapter = adapter
        
        // Update button states based on current page
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                updateButtonStates(position)
            }
        })
    }
    
    private fun setupNavigation() {
        btnPrevious.setOnClickListener {
            if (viewPager.currentItem > 0) {
                viewPager.currentItem = viewPager.currentItem - 1
            }
        }
        
        btnSkip.setOnClickListener {
            navigateToLogin()
        }
        
        btnNext.setOnClickListener {
            if (viewPager.currentItem < 2) {
                viewPager.currentItem = viewPager.currentItem + 1
            } else {
                navigateToLogin()
            }
        }
    }
    
    private fun updateButtonStates(position: Int) {
        // Show/hide Previous button
        btnPrevious.visibility = if (position == 0) View.GONE else View.VISIBLE
        
        // Update Next button text
        btnNext.text = if (position == 2) getString(R.string.onboarding_get_started) else getString(R.string.onboarding_next)
    }
    
    private fun navigateToLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}
