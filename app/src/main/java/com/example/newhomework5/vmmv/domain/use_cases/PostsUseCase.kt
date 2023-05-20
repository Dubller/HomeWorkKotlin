package com.example.newhomework5.vmmv.domain.use_cases

import com.example.newhomework5.vmmv.data.remote.dto.toDomainPostList

import com.example.newhomework5.vmmv.domain.repositories.PostRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostsUseCase @Inject constructor(
    private val postRepository: PostRepository
    ) {
    fun getPosts() = postRepository.getPosts().toDomainPostList()
}