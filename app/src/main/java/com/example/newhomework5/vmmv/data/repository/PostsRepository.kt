package com.example.newhomework5.vmmv.data.repository

import com.example.newhomework5.vmmv.data.remote.dto.PostModel


interface PostsRepository {
    suspend fun getPosts(): List<PostModel>
}