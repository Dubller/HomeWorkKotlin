package com.example.newhomework5.vmmv.data.remote.api

import com.example.newhomework5.vmmv.data.remote.dto.ResponseDto
import retrofit2.http.GET
import retrofit2.http.Query


interface PostApi {
    companion object {
        const val GET_POSTS_REQUEST = "top-headlines"

        const val СOUNTRY_PARAM = "country"
        const val СOUNTRY_CONST = "us"

        const val CATEGORY_PARAM = "category"
        const val CATEGORY_CONST = "business"

        const val KEY_PARAM = "apiKey"
        const val API_KEY = "7e8ab7dbadb64a2bb29bcee93ff587ee"
    }

    @GET(GET_POSTS_REQUEST)
    suspend fun getLatestNews(
        @Query(СOUNTRY_PARAM) country: String = СOUNTRY_CONST,
        @Query(CATEGORY_PARAM) category: String = CATEGORY_CONST,
        @Query(KEY_PARAM) apiKey: String = API_KEY
    ): ResponseDto
}