package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table") //Define the table name in which the wishes will be stored, in this table we have columns that store the data
data class Wish(
    //Define the primary key, id is the primary key in our case.
    @PrimaryKey(autoGenerate = true) //This automatically increments the id everytime a new wish is created.
    val id: Long = 0L,
    @ColumnInfo("wish-title")
    val title: String="",
    @ColumnInfo("wish-desc")
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
