package com.example.myproduct1

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TaypAll(
    var nameTayp: String,
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
)