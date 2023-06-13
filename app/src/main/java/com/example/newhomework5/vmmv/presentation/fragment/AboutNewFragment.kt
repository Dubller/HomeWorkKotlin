package com.example.newhomework5.vmmv.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.myapplication.databinding.FragmentAboutNewBinding
import com.example.newhomework5.vmmv.domain.model.DomainPost
import com.example.newhomework5.vmmv.presentation.view_model.AboutNewViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AboutNewFragment: Fragment() {

    private lateinit var binding: FragmentAboutNewBinding
    private val viewModel: AboutNewViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAboutNewBinding.inflate(inflater, container, false);

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {

    val postInfo = viewModel.postInfo.value ?: DomainPost()

        binding.apply {
        postTitle.text =postInfo.title
        postDescription.text =postInfo.description
        }
}



}


//        super.onViewCreated(view, savedInstanceState)
//        binding.btnBackToRecycler.setOnClickListener{
//            findNavController().navigate(R.id.action_detailFragment_to_newRoomFragment)
//        }//