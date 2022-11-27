package com.ieee.events.ui.MainFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener
import com.ieee.events.R
import com.ieee.events.databinding.FragmentMainBinding

class MainFragment : Fragment(), OnNavigationItemSelectedListener {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.bottomNavigationView.setOnItemSelectedListener(this)


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.homeNavBar -> {

            }
            R.id.exploreNavBar -> {
                Toast.makeText(context, "Hi, man ", Toast.LENGTH_LONG).show()
            }
            R.id.favNavBar -> {

            }
            R.id.profileNavBar -> {

            }
        }
        return true
    }
}



