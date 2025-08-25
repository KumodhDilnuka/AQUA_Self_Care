package com.example.aqua_self_care

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        
        setupClickListeners()
    }
    
    private fun setupClickListeners() {
        val btnSignUp = findViewById<Button>(R.id.btnSignUp)
        val tvLogin = findViewById<TextView>(R.id.tvLogin)
        
        btnSignUp.setOnClickListener {
            // TODO: Add signup logic here
            // For now, navigate to main activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        
        tvLogin.setOnClickListener {
            finish() // Go back to login
        }
    }
}
