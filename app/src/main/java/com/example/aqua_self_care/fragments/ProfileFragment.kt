package com.example.aqua_self_care.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.aqua_self_care.LoginActivity
import com.example.aqua_self_care.R

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        // Set up logout button click listener
        setupLogoutButton()
    }

    private fun setupLogoutButton() {
        view?.findViewById<Button>(R.id.btnLogout)?.setOnClickListener {
            // Navigate to Login page
            val intent = Intent(requireContext(), LoginActivity::class.java)
            
            // Clear the activity stack so user can't go back to main app
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            
            startActivity(intent)
            
            // Finish the current activity (MainActivity)
            requireActivity().finish()
        }
    }
}
