package com.example.task2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.task2.databinding.FragmentProfileOpenedBinding

class profile_opened : Fragment() {
    private var _binding:FragmentProfileOpenedBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileOpenedBinding.inflate(inflater, container, false)
        val root:View = binding.root

        val count = arguments?.getInt("count")?:0

        binding.textResult.text ="Likes: $count"

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}