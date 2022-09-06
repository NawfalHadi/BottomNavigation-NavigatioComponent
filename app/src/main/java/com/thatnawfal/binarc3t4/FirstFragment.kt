package com.thatnawfal.binarc3t4

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.thatnawfal.binarc3t4.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding : FragmentFirstBinding? = null
    private val binding get() = _binding!!

    companion object {
        const val EXTRA_NAME = "EXTRA_NAME"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSecondFragment.setOnClickListener {
            val mBundle = Bundle()
            mBundle.putString(EXTRA_NAME, "Nawfal")
            findNavController().navigate(R.id.secondFragment, mBundle)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}