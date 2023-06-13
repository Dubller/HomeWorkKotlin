package com.example.newhomework5.vmmv.data.repository

import com.example.newhomework5.vmmv.data.remote.dto.PostDto
import com.example.newhomework5.vmmv.data.repository.remote.PostsRemote
import com.example.newhomework5.vmmv.domain.repositories.PostRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostsRepositoryImpl @Inject constructor(
    private val postsRemote: PostsRemote
) : PostRepository {
    override suspend fun getPosts(): List<PostDto> = postsRemote.getPosts().posts.orEmpty()
}