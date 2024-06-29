package com.example.mywishlistapp

import com.example.mywishlistapp.data.WishDatabase
import com.example.mywishlistapp.data.WishRepository

object Graph {
    lateinit var database:WishDatabase

    val wishRepository by lazy { //'BY LAZY' MAKES SURE THAT THE VARIABLE IS INITIALIZED WHEN IT IS NEEDED AND NOT BEFORE.
        WishRepository(wishDao = database.wishDao())
    }

}