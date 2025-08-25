package com.example.aqua_self_care

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.NumberPicker
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WaterIntakeActivity : AppCompatActivity() {

    private lateinit var numberPicker: NumberPicker
    private lateinit var unitTextView: TextView
    private lateinit var btnAdd: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_water_intake)

        initializeViews()
        setupNumberPicker()
        setupClickListeners()
    }

    private fun initializeViews() {
        numberPicker = findViewById(R.id.numberPicker)
        unitTextView = findViewById(R.id.unitTextView)
        btnAdd = findViewById(R.id.btnAdd)
    }

    private fun setupNumberPicker() {
        // Set up the number picker
        numberPicker.minValue = 0
        numberPicker.maxValue = 20
        numberPicker.value = 1
        
        // Update unit text when picker value changes
        numberPicker.setOnValueChangedListener { _, oldVal, newVal ->
            updateUnitText(newVal)
        }
        
        // Set initial unit text
        updateUnitText(1)
    }

    private fun updateUnitText(value: Int) {
        val unit = when {
            value == 0 -> "oz"
            value <= 8 -> "cups"
            else -> "liters"
        }
        unitTextView.text = unit
    }

    private fun setupClickListeners() {
        // Back arrow click
        findViewById<ImageView>(R.id.btnBack).setOnClickListener {
            finish()
        }

        // Add button click
        btnAdd.setOnClickListener {
            // TODO: Handle water intake data
            // For now, just close the activity
            finish()
        }
    }
}
