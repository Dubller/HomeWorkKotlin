package com.example.newhomework5.vmmv.di.module

import com.example.newhomework5.vmmv.domain.repositories.PostRepository
import com.example.newhomework5.vmmv.domain.use_cases.GetPostInfoUseCase
import com.example.newhomework5.vmmv.domain.use_cases.PostsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class UseCasesModule {

    @Provides
    fun providePostInfoUseCase(postRepository: PostRepository) =
        GetPostInfoUseCase(postRepository = postRepository)

    fun providePostsUseCase(postRepository: PostRepository) =
        PostsUseCase(postRepository = postRepository)

}