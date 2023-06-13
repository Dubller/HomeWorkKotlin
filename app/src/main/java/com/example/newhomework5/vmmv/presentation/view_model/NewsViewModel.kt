package com.example.newhomework5.vmmv.presentation.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newhomework5.vmmv.domain.model.DomainPost
import com.example.newhomework5.vmmv.domain.use_cases.PostsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val postsUseCase: PostsUseCase
) : ViewModel() {

    private val _postList = MutableLiveData<List<DomainPost>>()
    val postList: LiveData<List<DomainPost>> = _postList

    init {
        viewModelScope.launch {
            getPosts()
        }
    }

    private suspend fun getPosts() {
        _postList.value = postsUseCase.getPosts()

    }
}