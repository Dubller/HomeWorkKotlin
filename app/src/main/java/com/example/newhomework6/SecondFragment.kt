package com.example.newhomework6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.newhomework6.databinding.SecondFragmentBinding


class SecondFragment : Fragment() {
    private var replase_binding: SecondFragmentBinding? = null
    private val binding get() = replase_binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        replase_binding = SecondFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}