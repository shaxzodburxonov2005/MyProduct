package com.example.myproduct1.Product

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Product(var name:String,
                   var price:Int,
                   var img:String,
                   var number:Int,
                   @PrimaryKey(autoGenerate = true)
                   var id: Int? = null,)
