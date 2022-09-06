package com.thatnawfal.binarc3t4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.thatnawfal.binarc3t4.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val aName: String = if (ThirdFragmentArgs.fromBundle(arguments as Bundle).name.isNullOrEmpty()){
            ThirdFragmentArgs.fromBundle(arguments as Bundle).name.toString()
        } else {
            val args : ThirdFragmentArgs by navArgs()
            args.name.toString()
        }
        binding.tvThirdFragName.text = aName
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}