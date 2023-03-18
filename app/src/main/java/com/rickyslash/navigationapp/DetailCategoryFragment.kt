package com.rickyslash.navigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rickyslash.navigationapp.databinding.FragmentDetailCategoryBinding
import java.util.zip.Inflater


class DetailCategoryFragment : Fragment() {

    // 'make binding' for 'fragment_detail_category' XML
    // the default value of Fragment's 'binding' is null, before inflated
    private var _binding: FragmentDetailCategoryBinding? = null
    // 'get()' is Kotlin idiom that means it could 'get' a 'private' value (_binding)
    // '!!' asserts that the 'value' is 'not null'
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // assign inflated 'FragmentHomeBinding' to '_binding' variable
        _binding = FragmentDetailCategoryBinding.inflate(inflater, container, false)
        // create 'View' based on 'binding.root'
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // get 'arguments' passed by 'bundle' from 'CategoryFragment'
        val dataName = arguments?.getString(CategoryFragment.EXTRA_NAME)
        val dataDesc = arguments?.getLong(CategoryFragment.EXTRA_STOCK)

        binding.tvCategoryName.text = dataName
        binding.tvCategoryDescription.text = "Stock: $dataDesc"
    }

    // set '_binding' to null if the 'Fragment' is 'destroyed'
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}