package com.example.aqua_self_care

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.aqua_self_care.fragments.HomeFragment
import com.example.aqua_self_care.fragments.GoalsFragment
import com.example.aqua_self_care.fragments.ActivityFragment
import com.example.aqua_self_care.fragments.ProfileFragment

class MainPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    
    override fun getItemCount(): Int = 4
    
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> GoalsFragment()
            2 -> ActivityFragment()
            3 -> ProfileFragment()
            else -> HomeFragment()
        }
    }
}
