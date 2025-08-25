package com.example.aqua_self_care

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AlphaAnimation
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

class SplashActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        
        val logoImageView = findViewById<ImageView>(R.id.logo_animation)
        
        // Load GIF animation using Glide
        Glide.with(this)
            .asGif()
            .load(R.drawable.logo_animation)
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(logoImageView)
        
        // Create fade-in animation with longer duration
        val fadeIn = AlphaAnimation(0.0f, 1.0f)
        fadeIn.duration = 4000 // 4 seconds for fade-in
        
        // Start the animation
        logoImageView.startAnimation(fadeIn)
        
        // Navigate to onboarding after longer delay to see full animation
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, OnboardingActivity::class.java)
            startActivity(intent)
            finish()
        }, 6000) // Wait 6 seconds total (4s fade-in + 2s viewing time)
    }
}
