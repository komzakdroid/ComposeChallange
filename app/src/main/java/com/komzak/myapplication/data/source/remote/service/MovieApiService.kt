package com.komzak.myapplication.data.source.remote.service

import com.komzak.myapplication.data.source.remote.dto.PopularMoviesDto
import retrofit2.http.GET

interface MovieApiService {
    @GET("movie/popular")
    suspend fun getPopularMovies(): PopularMoviesDto
}