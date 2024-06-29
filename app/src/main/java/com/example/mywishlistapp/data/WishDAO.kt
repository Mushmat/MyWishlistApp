package com.example.mywishlistapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


//ABSTRACT CLASS IS WHERE THE FUNCTIONS NEED NOT BE IMPLEMENTED.
@Dao
abstract class WishDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE) //The addAWish function will take care of the insertion.
    abstract suspend fun addAWish(wishEntity: Wish) //IT DOESNT NEED A BODY {}. IT IS AN ABSTRACT FUNCTION.

    @Query("Select * from `wish-table`") //LOADS ALL WISHES FROM THE WISH TABLE
    abstract fun getAllWishes(): Flow<List<Wish>>

    @Update
    abstract suspend fun updateAWish(wishEntity: Wish)

    @Delete
    abstract suspend fun deleteAWish(wishEntity: Wish)

    @Query("Select * from `wish-table` where id =:id") //Get the wish of that specific id
    abstract fun getAWishById(id:Long): Flow<Wish>
}