package com.example.newhomework5.vmmv.data.repository.remote

import com.example.newhomework5.vmmv.data.remote.dto.PostModel


class PostsRemoteImpl() : PostsRemote {

    override fun getPosts(): List<PostModel> =
        mutableListOf(
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

    override fun getPostInfo(): PostModel =
        PostModel(
            id = 1,
            title = "French dog",
            description = "Tulips (Tulipa) are a genus of spring-blooming perennial herbaceous bulbiferous geophytes (having bulbs as storage organs). The flowers are usually large, showy and brightly coloured, generally red, pink, yellow, or white (usually in warm colours).\u009D They often have a different coloured blotch at the base of the tepals (petals and sepals, collectively), internally. Because of a degree of variability within the populations, and a long history of cultivation, classification has been complex and controversial. The tulip is a member of the lily family, Liliaceae, along with 14 other genera, where it is most closely related to Amana, Erythronium and Gagea in the tribe Lilieae."
        )
}