package com.example.newhomework5.vmmv.domain.use_cases

import com.example.newhomework5.vmmv.data.remote.dto.toDomainPost
import com.example.newhomework5.vmmv.data.repository.PostsRepositoryImpl

class GetPostInfoUseCase {
    fun getPostInfo() = PostsRepositoryImpl().getPostInfo().toDomainPost()
}