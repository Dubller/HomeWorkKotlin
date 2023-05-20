package com.example.newhomework5.vmmv.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentNewRoomBinding
import com.example.newhomework5.vmmv.domain.model.DomainPostList
import com.example.newhomework5.vmmv.presentation.adapter.RecyclerAdapter
import com.example.newhomework5.vmmv.presentation.view_model.NewsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewRoomFragment : Fragment() {

    private lateinit var binding: FragmentNewRoomBinding


    private val viewModel: NewsViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewRoomBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       initRecycler()
    }

private fun initRecycler() {
        val posts =viewModel.postList.value ?: DomainPostList()

    binding.recyclerView.apply {
    layoutManager = LinearLayoutManager(requireContext())
    adapter = RecyclerAdapter(
        item = posts,
        onItemClickEvent = {
            findNavController().navigate(R.id.action_newRoomFragment_to_aboutNewFragment)
        }
    )
}
}
}
