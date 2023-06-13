package com.example.newhomework5.vmmv.domain.use_cases

import com.example.newhomework5.vmmv.data.remote.dto.toDomainPost
import com.example.newhomework5.vmmv.domain.model.DomainPost

import com.example.newhomework5.vmmv.domain.repositories.PostRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostsUseCase @Inject constructor(
    private val postRepository: PostRepository
    ) {
    suspend fun getPosts(): List<DomainPost> = postRepository.getPosts().map {postDto ->
        postDto.toDomainPost()
    }
}