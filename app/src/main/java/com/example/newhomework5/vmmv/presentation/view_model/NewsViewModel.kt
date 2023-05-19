package com.example.newhomework5.vmmv.presentation.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newhomework5.vmmv.domain.model.DomainPostList
import com.example.newhomework5.vmmv.domain.use_cases.PostsUseCase

class NewsViewModel : ViewModel() {

    private val _postList = MutableLiveData<DomainPostList>()
    val postList: LiveData<DomainPostList> = _postList

    init {
        getPosts()
    }

    private fun getPosts() {
        _postList.value = PostsUseCase().getPosts()

    }
}