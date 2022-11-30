package com.ieee.events.ui.OnBoardingFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.ieee.events.R
import com.ieee.events.databinding.FragmentViewPagerBinding


class ViewPagerFragment : Fragment() {
     lateinit var binding : FragmentViewPagerBinding
    private val onBoardingFragments = arrayListOf(OnBoardingFirstScreen(),OnBoardingSecondScreen(),OnBoardingThirdScreen())
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewPagerBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewPager.adapter = ViewPagerAdapter(requireActivity(),onBoardingFragments)
        binding.dotsIndicator.attachTo(binding.viewPager)

    }


}