package com.example.newhomework5.vmmv.di.module.repositories

import com.example.newhomework5.vmmv.data.remote.api.PostApi
import com.example.newhomework5.vmmv.data.repository.remote.PostsRemote
import com.example.newhomework5.vmmv.data.repository.remote.PostsRemoteImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)

class RemoteRepositoriesModule {
    @Provides
    fun providePostsRemote(postsApi: PostApi): PostsRemote = PostsRemoteImpl(postsApi = postsApi)
}