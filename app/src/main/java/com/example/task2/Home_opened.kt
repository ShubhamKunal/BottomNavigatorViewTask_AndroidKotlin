package com.example.task2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.task2.databinding.FragmentHomeOpenedBinding

class Home_opened : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding:FragmentHomeOpenedBinding? = null
    private val binding get() = _binding!!

    @SuppressLint("SetTextI18n")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?
    ) : View {
        _binding = FragmentHomeOpenedBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val count = arguments?.getInt("count") ?: 0

        binding.textResult.text = "Likes: $count"

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}