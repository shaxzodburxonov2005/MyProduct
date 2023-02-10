package com.example.myproduct1.`interface`

import androidx.room.*
import com.example.myproduct1.Product.Product

@Dao
interface ProductDao {
    @Query("select * from news where typeNews = :type")
    fun getAllNews(type: String): List<Product>

    @Insert
    fun addNews(product: Product)

    @Delete
    fun deleteNews(product: Product)

    @Update
    fun update(product: Product)

    @Query("select * from news where id=:id")
    fun getNewsById(id: Int): Product

    @Insert
    fun addAllNews(vararg users: Product)
}