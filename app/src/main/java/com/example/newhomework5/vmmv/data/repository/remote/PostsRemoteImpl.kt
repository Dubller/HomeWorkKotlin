package com.example.newhomework5.vmmv.data.repository.remote

import com.example.newhomework5.vmmv.data.remote.api.PostApi
import com.example.newhomework5.vmmv.data.remote.dto.ResponseDto
import javax.inject.Inject


class PostsRemoteImpl @Inject constructor(
    private val postsApi: PostApi
) : PostsRemote {

    override suspend fun getPosts(): ResponseDto =
        postsApi.getLatestNews()
    }