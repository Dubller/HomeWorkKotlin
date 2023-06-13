package com.example.newhomework5.vmmv.data.repository.remote



import com.example.newhomework5.vmmv.data.remote.dto.ResponseDto


interface PostsRemote {
    suspend fun getPosts(): ResponseDto
}