package com.example.newhomework5.vmmv.domain.use_cases

import com.example.newhomework5.vmmv.data.remote.dto.toDomainPostList
import com.example.newhomework5.vmmv.data.repository.PostsRepositoryImpl

class PostsUseCase {
    fun getPosts() = PostsRepositoryImpl().getPosts().toDomainPostList()
}