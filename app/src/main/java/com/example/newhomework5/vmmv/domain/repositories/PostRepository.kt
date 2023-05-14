package com.example.newhomework5.vmmv.domain.repositories

import com.example.newhomework5.vmmv.data.remote.dto.PostModel

interface PostRepository {
    fun getPosts(): List<PostModel>
    fun getPostInfo(): PostModel
}