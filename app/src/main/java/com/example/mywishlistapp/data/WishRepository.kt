package com.example.mywishlistapp.data

import kotlinx.coroutines.flow.Flow


class WishRepository(private val wishDao: WishDAO) {

    suspend fun addAWish(wish:Wish){
        wishDao.addAWish(wish)
    }

    fun getWish(): Flow<List<Wish>> = wishDao.getAllWishes() //It is a suspend function automatically as we are using Flow

    fun getAWishById(id:Long): Flow<Wish> {
        return wishDao.getAWishById(id)
    }

    suspend fun updateAWish(wish:Wish){
        wishDao.updateAWish(wish)
    }

    suspend fun deleteAWish(wish: Wish){
        wishDao.deleteAWish(wish)
    }
}