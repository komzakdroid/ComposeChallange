package com.komzak.myapplication.data.source.remote.dto


import com.google.gson.annotations.SerializedName
import com.komzak.myapplication.data.source.local.roomdb.entity.PopularMoviesEntity

data class PopularMoviesDto(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val results: List<MovieDto>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
) {

    fun toPopularMoviesEntity(): PopularMoviesEntity {
        return PopularMoviesEntity(
            page = page,
            results = results.map { it.toMovieEntity() }
        )
    }
}