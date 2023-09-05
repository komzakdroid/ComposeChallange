package com.komzak.myapplication.data.source.local.roomdb.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.komzak.myapplication.data.source.local.roomdb.entity.PopularMoviesEntity

@Dao
interface PopularMoviesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPopularMovieList(movies: PopularMoviesEntity)

    @Query("DELETE FROM ${PopularMoviesEntity.TABLE_NAME}")
    fun delete()
}
