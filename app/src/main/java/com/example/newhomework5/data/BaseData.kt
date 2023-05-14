package com.example.newhomework5.data

import com.example.newhomework5.data.model.PostModel

open class BaseData {


    open fun elements(): List<PostModel> {
        val posts = mutableListOf(
            PostModel(
                id = 1,
                title = "Title",
                description = "Description"
            ),
            PostModel(
                id = 2,
                title = "Title",
                description = "Description"
            ),
            PostModel(
                id = 3,
                title = "Title",
                description = "Description"
            ),
            PostModel(
                id = 4,
                title = "Title",
                description = "Description"
            ),
            PostModel(
                id = 5,
                title = "Title",
                description = "Description"
            ),
            PostModel(
                id = 6,
                title = "Title",
                description = "Description"
            ),
            PostModel(
                id = 7,
                title = "Title",
                description = "Description"
            ),
            PostModel(
                id = 8,
                title = "Title",
                description = "Description"
            ),
            PostModel(
                id = 9,
                title = "Title",
                description = "Description"
            ),
            PostModel(
                id = 10,
                title = "Title",
                description = "Description"
            ), PostModel(
                id = 11,
                title = "Title",
                description = "Description"
            ), PostModel(
                id = 12,
                title = "Title",
                description = "Description"
            ), PostModel(
                id = 13,
                title = "Title",
                description = "Description"
            ), PostModel(
                id = 14,
                title = "Title",
                description = "Description"
            ), PostModel(
                id = 15,
                title = "Title",
                description = "Description"
            )
        )
        return posts
    }
}