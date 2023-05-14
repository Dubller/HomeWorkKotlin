package com.example.newhomework5.vmmv.data.remote.dto

import com.example.newhomework5.vmmv.domain.model.DomainPost
import com.example.newhomework5.vmmv.domain.model.DomainPostList

data class PostModel (
    val id: Int,
    val title: String? = null,
    val description: String? = null
)


fun PostModel.toDomainPost() =
    DomainPost(
        id = id,
        title = title,
        description = description
    )

fun List<PostModel>.toDomainPostList() =
    DomainPostList(
        this.map {
            it.toDomainPost()
        }
    )