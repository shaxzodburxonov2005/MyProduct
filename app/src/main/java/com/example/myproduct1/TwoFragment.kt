package com.example.myproduct1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myproduct1.Product.database.AppDatabase
import com.example.myproduct1.databinding.FragmentTwoBinding
import com.example.myproduct1.spinner.SpinnerAdapter


class TwoFragment : Fragment() {
    lateinit var binding: FragmentTwoBinding
    lateinit var spinnerAdapter: SpinnerAdapter
    lateinit var appDatabase: AppDatabase
    lateinit var listString: ArrayList<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_two, container, false)
        appDatabase=AppDatabase.getInstance(requireContext())

        binding.SaveBtn.setOnClickListener {
            val name=binding.nomiTv.text.toString()
            val price=binding.narxiTv.text.toString().toInt()
            val Type=binding.soniTv.text.toString()


        }



        return view
    }
//    private fun loadSpinner():ArrayList<String>{
//        listString=ArrayList()
//    }


}