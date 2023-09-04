package com.komzak.myapplication.domain.domain

data class PopularMovies(
    val page: Int,
    val results: List<Movie>
) {
}