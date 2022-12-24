package com.tumusx.core_database.dao

interface MyDAO {
    suspend fun insertItem()
    suspend fun removeItem()
    suspend fun updateItem()
    suspend fun findMyItem()
    suspend fun findMyItems()
}