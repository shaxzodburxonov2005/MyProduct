package com.example.myproduct1.Product

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Product(
    var name: String,
    var price: Int,
    var tayp: String,
    var img: String,
    var number: Int,
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
)
