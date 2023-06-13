package com.example.newhomework5.vmmv.domain.use_cases

import com.example.newhomework5.vmmv.data.remote.dto.toDomainPost
import com.example.newhomework5.vmmv.data.repository.PostsRepositoryImpl
import com.example.newhomework5.vmmv.domain.repositories.PostRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetPostInfoUseCase @Inject constructor(
    private val postRepository: PostRepository
    ) {
 //   fun getPostInfo() = postRepository.getPostInfo().toDomainPost()
}