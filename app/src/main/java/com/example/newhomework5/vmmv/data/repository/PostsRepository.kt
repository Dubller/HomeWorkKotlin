package com.example.newhomework5.vmmv.data.repository

import com.example.newhomework5.vmmv.data.remote.dto.PostDto

interface PostsRepository {
    suspend fun getPosts(): List<PostDto>
}