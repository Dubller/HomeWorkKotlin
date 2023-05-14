package com.example.newhomework5.vmmv.data.repository.remote


import com.example.newhomework5.vmmv.data.remote.dto.PostModel


interface PostsRemote {
    fun getPosts(): List<PostModel>
    fun getPostInfo(): PostModel
}