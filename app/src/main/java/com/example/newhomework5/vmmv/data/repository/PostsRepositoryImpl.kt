package com.example.newhomework5.vmmv.data.repository

import com.example.newhomework5.vmmv.data.remote.dto.PostModel
import com.example.newhomework5.vmmv.data.repository.remote.PostsRemote
import com.example.newhomework5.vmmv.data.repository.remote.PostsRemoteImpl
import com.example.newhomework5.vmmv.domain.repositories.PostRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostsRepositoryImpl @Inject constructor(
    private val postsRemote: PostsRemote
) : PostRepository {
    override fun getPosts(): List<PostModel> = PostsRemoteImpl().getPosts()
    override fun getPostInfo(): PostModel = PostsRemoteImpl().getPostInfo()
}