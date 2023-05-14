package com.example.newhomework5.vmmv.data.repository

import com.example.newhomework5.vmmv.data.remote.dto.PostModel
import com.example.newhomework5.vmmv.data.repository.remote.PostsRemoteImpl
import com.example.newhomework5.vmmv.domain.repositories.PostRepository

class PostsRepositoryImpl : PostRepository {
    override fun getPosts(): List<PostModel> = PostsRemoteImpl().getPosts()
    override fun getPostInfo(): PostModel = PostsRemoteImpl().getPostInfo()
}