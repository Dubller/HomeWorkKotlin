package com.example.newhomework5.vmmv.data.remote.dto

import com.example.newhomework5.vmmv.domain.model.DomainPost
import com.google.gson.annotations.SerializedName

data class PostDto(
    @SerializedName("title")
    val title: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("url")
    val url: String,

    @SerializedName("urlToImage")
    val urlToImage: String,

    @SerializedName("publishedAt")
    val publishedAt: String
)

fun PostDto.toDomainPost() = DomainPost(
    title = title,
    description = description,
    url = url,
    urlToImage = urlToImage,
    publishedAt = publishedAt
)