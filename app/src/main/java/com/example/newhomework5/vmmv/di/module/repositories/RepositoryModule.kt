package com.example.newhomework5.vmmv.di.module.repositories

import com.example.newhomework5.vmmv.data.repository.PostsRepository
import com.example.newhomework5.vmmv.data.repository.PostsRepositoryImpl
import com.example.newhomework5.vmmv.data.repository.remote.PostsRemote
import com.example.newhomework5.vmmv.domain.repositories.PostRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    fun providePostsRepository(postsRemote: PostsRemote): PostRepository =
        PostsRepositoryImpl(postsRemote = postsRemote)
}