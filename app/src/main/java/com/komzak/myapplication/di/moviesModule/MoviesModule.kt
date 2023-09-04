package com.komzak.myapplication.di.moviesModule

import com.komzak.myapplication.data.source.local.roomdb.dao.MovieDao
import com.komzak.myapplication.data.source.local.roomdb.dao.PopularMoviesDao
import com.komzak.myapplication.data.source.remote.service.MovieApiService
import com.komzak.myapplication.domain.repository.MovieRepository
import com.komzak.myapplication.data.repository.MovieRepositoryImpl
import com.komzak.myapplication.domain.usecase.GetPopularMoviesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MoviesModule {

    @Provides
    @Singleton
    fun provideMovieRepositoryImpl(
        movieApiService: MovieApiService,
        popularMoviesDao: PopularMoviesDao,
        movieDao: MovieDao
    ): MovieRepository = MovieRepositoryImpl(movieApiService, popularMoviesDao, movieDao)


    @Provides
    @Singleton
    fun provideGetPopularMoviesUseCase(repository: MovieRepository): GetPopularMoviesUseCase =
        GetPopularMoviesUseCase(repository)

}