package com.komzak.myapplication.data.source.local.roomdb.converter

import androidx.room.TypeConverter
import com.komzak.myapplication.domain.domain.Movie

class PopularMoviesEntityConverter {

    @TypeConverter
    fun fromStringToMovieList(value: String): List<Movie> {
        return
    }

    /*
        @TypeConverter
        fun fromStringToMovieList(value: String): List<Movie>? =
            Moshi.Builder()
                .add(KotlinJsonAdapterFactory())
                .build()
                .adapter<List<Movie>>(Types.newParameterizedType(List::class.java, Movie::class.java))
                .fromJson(value)

        @TypeConverter
        fun fromMovieListTypeToString(movieListType: List<Movie>?): String = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
            .adapter<List<Movie>>(Types.newParameterizedType(List::class.java, Movie::class.java))
            .toJson(movieListType)

        @TypeConverter
        fun fromStringToMovieEntityList(value: String): List<MovieEntity>? =
            Moshi.Builder()
                .add(KotlinJsonAdapterFactory())
                .build().adapter<List<MovieEntity>>(
                    Types.newParameterizedType(
                        List::class.java,
                        MovieEntity::class.java
                    )
                ).fromJson(value)

        @TypeConverter
        fun fromMovieEntityListTypeToString(movieEntityListType: List<MovieEntity>?): String =
            Moshi.Builder()
                .add(KotlinJsonAdapterFactory())
                .build().adapter<List<MovieEntity>>(
                    Types.newParameterizedType(
                        List::class.java,
                        MovieEntity::class.java
                    )
                ).toJson(movieEntityListType)*/
}