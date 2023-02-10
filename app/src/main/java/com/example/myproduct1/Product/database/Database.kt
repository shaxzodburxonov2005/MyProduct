package com.example.myproduct1.Product.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myproduct1.Product.Product
import com.example.myproduct1.`interface`.ProductDao

@Database(entities = [Product::class], version = 1)
abstract class AppDatabase:RoomDatabase() {

    abstract fun productDao():ProductDao

    companion object{
        private var instance:AppDatabase?=null
        @Synchronized
        fun getInstance(context: Context):AppDatabase{
            if (instance==null){
                instance=Room.databaseBuilder(context,AppDatabase::class.java,"product.dp")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()

            }
            return instance!!
        }
    }

}