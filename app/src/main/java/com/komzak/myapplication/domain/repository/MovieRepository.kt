package com.komzak.myapplication.domain.repository

import com.komzak.myapplication.data.source.remote.Resource
import com.komzak.myapplication.domain.domain.Movie
import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    fun getPopularMovies(): Flow<Resource<List<Movie>>>
}