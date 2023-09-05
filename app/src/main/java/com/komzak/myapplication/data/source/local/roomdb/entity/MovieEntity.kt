package com.komzak.myapplication.data.source.local.roomdb.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.komzak.myapplication.domain.domain.Movie
import java.io.Serializable

@Entity(tableName = MovieEntity.TABLE_NAME)
data class MovieEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val title: String,
    val overview: String,
    val posterUrl: String?,
    val releaseDate: String,
) : Serializable {
    fun toMovie(): Movie {
        return Movie(
            title = title,
            overview = overview,
            posterUrl = posterUrl,
            releaseDate = releaseDate
        )
    }

    companion object {
        const val TABLE_NAME = "movie"
    }
}