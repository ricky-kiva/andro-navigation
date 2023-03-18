package com.rickyslash.navigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.rickyslash.navigationapp.databinding.FragmentCategoryBinding

class CategoryFragment : Fragment() {

    // 'make binding' for 'fragment_category' XML
    // the default value of Fragment's 'binding' is null, before inflated
    private var _binding: FragmentCategoryBinding? = null
    // 'get()' is Kotlin idiom that means it could 'get' a 'private' value (_binding)
    // '!!' asserts that the 'value' is 'not null'
    private val binding get() = _binding!!

    // make 'companion object' for 'Bundle' 'key'
    companion object {
        val EXTRA_NAME = "extra_name"
        val EXTRA_STOCK = "extra_stock"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCategoryBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCategoryLifestyle.setOnClickListener { view ->

            /* This is unused because we are going to use 'SafeArgs'
            // send data using 'Bundle'
            val mBundle = Bundle()
            mBundle.putString(EXTRA_NAME, "Nike Airmax 270")
            mBundle.putLong(EXTRA_STOCK, 7)
            view.findNavController().navigate(R.id.action_categoryFragment_to_detailCategoryFragment, mBundle)*/

            // send data using 'safeArgs'
            val toDetailCategoryFragment = CategoryFragmentDirections.actionCategoryFragmentToDetailCategoryFragment()
            toDetailCategoryFragment.name = "Nike Air Max 270"
            toDetailCategoryFragment.stock = 7
            view.findNavController().navigate(toDetailCategoryFragment)

        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}