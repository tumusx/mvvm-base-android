package com.tumusx.core_database.dao

import MyEntity
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MyDAO {
    @Insert
    suspend fun insertItem(entity: MyEntity)

    @Delete
    suspend fun removeItem(vararg entity: MyEntity)

    @Query("SELECT * FROM entity WHERE id = :id")
    suspend fun findMyItem(id: Long)
}