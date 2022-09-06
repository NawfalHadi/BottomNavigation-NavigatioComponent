package com.thatnawfal.binarc3t4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.thatnawfal.binarc3t4.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val aName = arguments?.getString(FirstFragment.EXTRA_NAME)
        binding.tvSecFragName.text = "Your Name $aName"

        binding.btnThirdFragment.setOnClickListener {
            if (binding.etSecFragName.text.isNullOrEmpty()) {
                Toast.makeText(requireContext(), "Empty Field", Toast.LENGTH_SHORT).show()
            } else {
                val actionToThirdFirstFragment = SecondFragmentDirections.actionSecondFragmentToThirdFragment()
                actionToThirdFirstFragment.name = binding.etSecFragName.text.toString()
                findNavController().navigate(actionToThirdFirstFragment)
            }

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}