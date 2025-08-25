package com.example.aqua_self_care.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.aqua_self_care.R
import com.example.aqua_self_care.WaterIntakeActivity

class GoalsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_goals, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        // Set up Edit button click listeners
        setupEditButtons()
    }

    private fun setupEditButtons() {
        // Water Edit Button
        view?.findViewById<Button>(R.id.btnEditWater)?.setOnClickListener {
            val intent = Intent(requireContext(), WaterIntakeActivity::class.java)
            startActivity(intent)
        }


    }
}
