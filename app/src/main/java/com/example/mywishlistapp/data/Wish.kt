package com.example.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String="",
    val description:String=""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch Pixel 2", description = "An android watch "),
        Wish(title = "Oneplus 12R", description = "An android mobile "),
        Wish(title = "Xbox", description = "A game "),
        Wish(title = "Money", description = "Paisa")
    )
}
