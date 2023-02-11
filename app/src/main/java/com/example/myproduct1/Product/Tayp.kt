package com.example.myproduct1.Product

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Tayp(
    var nameTayp: String,
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
) : java.io.Serializable