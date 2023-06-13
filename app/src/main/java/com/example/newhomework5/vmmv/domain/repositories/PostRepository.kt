package com.example.newhomework5.vmmv.domain.repositories

import com.example.newhomework5.vmmv.data.remote.dto.PostDto

interface PostRepository {
suspend fun getPosts(): List<PostDto>
}