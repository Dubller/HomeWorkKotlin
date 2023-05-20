package com.example.newhomework5.vmmv.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentAboutNewBinding
import com.example.newhomework5.vmmv.domain.model.DomainPost
import com.example.newhomework5.vmmv.presentation.view_model.AboutNewViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AboutNewFragment: Fragment() {

    private lateinit var binding: FragmentAboutNewBinding
    private var viewModel: AboutNewViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(owner = this)[AboutNewViewModel::class.java]
        binding = FragmentAboutNewBinding.inflate(inflater, container, false);
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initView()
    }

    private fun initView() {
        initToolbar()
        initRecycler()
    }
    private fun initRecycler() {
        val postInfo = viewModel?.postInfo?.value ?: DomainPost()

        binding.apply {
            postTitle.text = postInfo.title
            postDescription.text = postInfo.description
        }
    }

    private fun initToolbar() {
        binding.toolbar.setNavigationOnClickListener {
            findNavController().navigate(resId = R.id.action_d1d_to_newRoomFragment)
        }
    }

}


//        super.onViewCreated(view, savedInstanceState)
//        binding.btnBackToRecycler.setOnClickListener{
//            findNavController().navigate(R.id.action_detailFragment_to_newRoomFragment)
//        }//