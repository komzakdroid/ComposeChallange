package com.komzak.myapplication.domain.usecase

import com.komzak.myapplication.data.source.remote.Resource
import com.komzak.myapplication.domain.domain.Movie
import com.komzak.myapplication.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetPopularMoviesUseCase @Inject constructor(private val movieRepository: MovieRepository) {
    operator fun invoke(): Flow<Resource<List<Movie>>> {
        return movieRepository.getPopularMovies()
    }
}