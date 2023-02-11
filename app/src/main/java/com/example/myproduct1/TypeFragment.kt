package com.example.myproduct1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myproduct1.databinding.FragmentTypeBinding

class TypeFragment : Fragment() {
    lateinit var binding: FragmentTypeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_type, container, false)
        binding= FragmentTypeBinding.bind(view)

        return view
    }


}