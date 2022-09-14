package com.example.task2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.task2.databinding.FragmentAboutBinding

class aboutFragment : Fragment() {
    private var _binding:FragmentAboutBinding? = null
    private val binding get() = _binding!!
    private var count = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAboutBinding.inflate(inflater,container,false)
        val root:View = binding.root

        binding.aboutShowCounterButton.setOnClickListener{
            val bundle = bundleOf("count" to count)
            findNavController().navigate(
                R.id.AtoA,bundle
            )
        }
        binding.aboutCounterButton.setOnClickListener{
            count++
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        count = 0
        _binding = null
    }
}