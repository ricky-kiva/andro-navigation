package com.rickyslash.navigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.rickyslash.navigationapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    // 'make binding' for 'Fragment_Home' XML
    // the default value of Fragment's 'binding' is null, before inflated
    private var _binding: FragmentHomeBinding? = null
    // 'get()' is Kotlin idiom that means it could 'get' a 'private' value (_binding)
    // '!!' asserts that the 'value' is 'not null'
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // assign inflated 'FragmentHomeBinding' to '_binding' variable
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        // create 'View' based on 'binding.root'
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // both of this 'setOnClickListener' method has the 'same purpose' of 'navigating to specific direction'
        binding.btnCategory.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_categoryFragment)
        )
        binding.btnProfile.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_homeFragment_to_profileActivity)
        }
    }

    // set '_binding' to null if the 'Fragment' is 'destroyed'
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}