package com.ieee.events.ui.SignInFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ieee.events.databinding.FragmentSignUpVerifiedBinding


class SignUpVerified : Fragment() {

    lateinit var binding : FragmentSignUpVerifiedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpVerifiedBinding.inflate(inflater)
        return binding.root
    }

}