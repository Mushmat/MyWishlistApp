package com.example.mywishlistapp.data

import androidx.room.Dao


//ABSTRACT CLASS IS WHERE THE FUNCTIONS NEED NOT BE IMPLEMENTED.
@Dao
abstract class WishDAO {

    abstract fun addAWish(wish: Wish) //IT DOESNT NEED A BODY {}. IT IS AN ABSTRACT FUNCTION.
}