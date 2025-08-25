package com.example.aqua_self_care

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ResetPasswordActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)
        
        setupClickListeners()
    }
    
    private fun setupClickListeners() {
        val btnSendOtp = findViewById<Button>(R.id.btnSendOtp)
        
        btnSendOtp.setOnClickListener {
            // TODO: Add send OTP logic here
            // For now, navigate to OTP verification
            val intent = Intent(this, OtpActivity::class.java)
            startActivity(intent)
        }
    }
}
