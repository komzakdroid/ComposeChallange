package com.komzak.myapplication.presentation.screens.moviesScreen

import com.komzak.myapplication.domain.domain.Movie

data class MovieUiState(
    val moviesList: List<Movie> = emptyList(),
    val isLoading: Boolean = false
)