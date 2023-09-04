package com.komzak.myapplication.di.databaseModule

import android.app.Application
import com.komzak.myapplication.data.source.local.roomdb.MovieDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(application: Application) = MovieDatabase.getDatabase(application)

    @Singleton
    @Provides
    fun providePopularMoviesDao(database: MovieDatabase) =
        database.getPopularMoviesDao()

    @Singleton
    @Provides
    fun provideMovieDao(database: MovieDatabase) =
        database.getMovieDao()
}