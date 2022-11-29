package com.ieee.events.ui.OnBoardingFragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ieee.events.databinding.FragmentOnBoardingSecondScreenBinding

class OnBoardingSecondScreen : Fragment() {
   lateinit var binding : FragmentOnBoardingSecondScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding = FragmentOnBoardingSecondScreenBinding.inflate(inflater)
        binding.skipTextView.paint.isUnderlineText = true
        return binding.root
    }

}