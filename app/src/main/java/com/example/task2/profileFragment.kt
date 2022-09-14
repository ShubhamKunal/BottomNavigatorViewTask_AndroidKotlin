package com.example.task2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.task2.databinding.FragmentProfileBinding

class profileFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding:FragmentProfileBinding? = null
    private val binding get() = _binding!!
    private var count = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentProfileBinding.inflate(inflater,container, false)
        val root:View=binding.root

        binding.friendsShowCounterButton.setOnClickListener{
            val bundle = bundleOf("count" to count)
            findNavController().navigate(
                R.id.PtoP,bundle
            )
        }
        binding.friendsCounterButton.setOnClickListener{
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