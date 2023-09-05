package com.komzak.myapplication.data.source.local.roomdb.converter

import androidx.room.TypeConverter
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import com.komzak.myapplication.data.source.local.roomdb.entity.MovieEntity
import com.komzak.myapplication.data.source.local.roomdb.entity.PopularMoviesEntity

class PopularMoviesEntityConverter {
    @TypeConverter
    fun fromStringToMovieList(data: String): List<PopularMoviesEntity> {
        val listType = object : TypeToken<ArrayList<PopularMoviesEntity>>() {}.type
        return GsonBuilder().create().fromJson(data, listType)
    }

    @TypeConverter
    fun fromMovieListTypeToString(breed: ArrayList<PopularMoviesEntity>): String {
        return GsonBuilder().create().toJson(breed)
    }

    @TypeConverter
    fun fromStringToMovieEntityList(data: String): List<MovieEntity> {
        val listType = object : TypeToken<ArrayList<MovieEntity>>() {}.type
        return GsonBuilder().create().fromJson(data, listType)
    }

    @TypeConverter
    fun fromMovieEntityListTypeToString(breed: List<MovieEntity>): String {
        return GsonBuilder().create().toJson(breed)
    }
}