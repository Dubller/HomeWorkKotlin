package com.example.newhomework5.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentNewRoomBinding
import com.example.newhomework5.adapter.RecyclerAdapter
import com.example.newhomework5.data.BaseData

class NewRoomFragment : Fragment() {

    private lateinit var binding: FragmentNewRoomBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewRoomBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }
    private fun initViews() {
        initRecycler()
    }

private fun initRecycler() {
binding.recyclerView.apply {
    layoutManager = LinearLayoutManager(requireContext())
    adapter = RecyclerAdapter(
        item = BaseData().elements(),
        onItemClickEvent = {
            findNavController().navigate(R.id.action_newRoomFragment_to_detailFragment)
        }
    )
}
}
}
