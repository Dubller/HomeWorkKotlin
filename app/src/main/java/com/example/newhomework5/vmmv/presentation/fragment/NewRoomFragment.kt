package com.example.newhomework5.vmmv.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentNewRoomBinding
import com.example.newhomework5.vmmv.data.remote.dto.PostDto
import com.example.newhomework5.vmmv.domain.model.DomainPost
import com.example.newhomework5.vmmv.presentation.adapter.RecyclerAdapter
import com.example.newhomework5.vmmv.presentation.adapter.customItemDecoration.CustomItemDecoration
import com.example.newhomework5.vmmv.presentation.view_model.NewsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewRoomFragment : Fragment() {

    private var _binding: FragmentNewRoomBinding?= null
    private val binding get() = _binding!!
    private val viewModel: NewsViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNewRoomBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       super.onViewCreated(view, savedInstanceState)
        observePosts()
    }

    private fun observePosts() {
        viewModel.postList.observe(viewLifecycleOwner) {posts ->
            initRecycler(posts)
        }
    }

private fun initRecycler(posts: List<DomainPost>) {
        val customItemDecoration = CustomItemDecoration(requireContext())

    binding.recyclerView.apply {
    layoutManager = LinearLayoutManager(requireContext())
    addItemDecoration(customItemDecoration)
    adapter = RecyclerAdapter(
        item = posts,
        onItemClickEvent = {
            findNavController().navigate(R.id.action_newRoomFragment_to_aboutNewFragment)
        }
    )
}
}
}
