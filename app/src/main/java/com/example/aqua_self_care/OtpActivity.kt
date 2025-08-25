package com.example.aqua_self_care

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OtpActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)
        
        setupClickListeners()
    }
    
    private fun setupClickListeners() {
        val btnVerifyOtp = findViewById<Button>(R.id.btnVerifyOtp)
        val tvResendOtp = findViewById<TextView>(R.id.tvResendOtp)
        
        btnVerifyOtp.setOnClickListener {
            // TODO: Add OTP verification logic here
            // For now, navigate to main activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        
        tvResendOtp.setOnClickListener {
            // TODO: Add resend OTP logic here
        }
    }
}
