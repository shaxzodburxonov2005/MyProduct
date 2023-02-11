package com.example.myproduct1.`interface`

import androidx.room.*
import com.example.myproduct1.Product.Product

@Dao
interface ProductDao {
    @Query("select * from news where typeNews = :type")
    fun getAllNews(type: String): List<Product>

    @Insert
    fun addNews(produkt: Product)

    @Delete
    fun deleteNews(produkt: Product)

    @Update
    fun update(produkt: Product)

    @Query("select * from news where id=:id")
    fun getNewsById(id: Int): Product

    @Insert
    fun addAllNews(vararg users: Product)
}