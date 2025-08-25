package com.example.aqua_self_care

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OnboardingPagerAdapter(private val context: Context) : 
    RecyclerView.Adapter<OnboardingPagerAdapter.OnboardingViewHolder>() {
    
    private val onboardingData = listOf(
        OnboardingItem(
            R.drawable.onboarding_1,
            R.string.onboarding_title_1
        ),
        OnboardingItem(
            R.drawable.onboarding_2,
            R.string.onboarding_title_2
        ),
        OnboardingItem(
            R.drawable.onboarding_3,
            R.string.onboarding_title_3
        )
    )
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardingViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_onboarding_item, parent, false)
        return OnboardingViewHolder(view)
    }
    
    override fun onBindViewHolder(holder: OnboardingViewHolder, position: Int) {
        val item = onboardingData[position]
        holder.bind(item)
    }
    
    override fun getItemCount(): Int = onboardingData.size
    
    inner class OnboardingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.onboarding_image)
        private val titleTextView: TextView = itemView.findViewById(R.id.onboarding_title)
        
        fun bind(item: OnboardingItem) {
            imageView.setImageResource(item.imageResId)
            titleTextView.setText(item.titleResId)
        }
    }
    
    data class OnboardingItem(
        val imageResId: Int,
        val titleResId: Int
    )
}
