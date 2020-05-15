package myway.myapplication.data.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ShoppingDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
   suspend fun upsert(Item: ShoppingItem)

    @Delete()
    suspend fun delete(Item: ShoppingItem)

    @Query("SELECT * FROM shopping_items")
    fun getAllShoppingItem(): LiveData<List<ShoppingItem>>
}