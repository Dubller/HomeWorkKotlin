package com.example.newhomework5.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentAboutNewBinding




class AboutNewFragment: Fragment() {

    private lateinit var binding: FragmentAboutNewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAboutNewBinding.inflate(inflater, container, false);
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
 
        val btnBack = binding.btnBackToRecycler
        btnBack.setOnClickListener{
            findNavController().navigate(R.id.action_detailFragment_to_loginFragment)
        }
    }
}