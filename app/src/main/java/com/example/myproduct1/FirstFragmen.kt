package com.example.myproduct1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myproduct1.databinding.FragmentFirstBinding

class FirstFragmen : Fragment() {
    lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        binding = FragmentFirstBinding.bind(view)

        binding.add.setOnClickListener {
            findNavController().navigate(R.id.twoFragment)
        }
        binding.all.setOnClickListener {
            findNavController().navigate(R.id.allFragment)
        }
        binding.type.setOnClickListener {
            findNavController().navigate(R.id.typeFragment)
        }
        return view
    }
}