package com.example.newhomework5.vmmv.di.base

import com.example.newhomework5.vmmv.data.remote.api.PostApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {
    private const val BASE_UTL = "https://newsapi.org/v2/"

    @Singleton
    @Provides
    fun providesHttpLogginInterception() = HttpLoggingInterceptor()
        .apply {
            level =HttpLoggingInterceptor.Level.BODY
        }

    @Singleton
    @Provides
    fun providesOkHttpsClient(httpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient =
        OkHttpClient
            .Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()


    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
        Retrofit
        .Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_UTL)
        .client(okHttpClient)
        .build()


    @Singleton
    @Provides
    fun providePostApiService(retrofit: Retrofit): PostApi = retrofit.create(PostApi::class.java)
}