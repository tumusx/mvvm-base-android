package com.tumusx.core_database.database

import MyEntity
import androidx.room.Database
import androidx.room.RoomDatabase
import com.tumusx.core_database.dao.MyDAO


@Database(entities = [MyEntity::class], version = 1)
abstract class MyDatabase : RoomDatabase() {
    abstract fun myDao(): MyDAO
}