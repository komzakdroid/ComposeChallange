package com.komzak.myapplication.presentation.screens.MoviesScreen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.komzak.myapplication.presentation.components.MovieItem

@Composable
fun MoviesScreen(moviesViewModel: MoviesViewModel = hiltViewModel()) {
    val state = moviesViewModel.state.value

    LazyColumn(modifier = Modifier.fillMaxSize(), contentPadding = PaddingValues(bottom = 16.dp)) {
        items(state.moviesList.size) { index ->
            MovieItem(movie = state.moviesList[index], onItemClick = {})
        }
    }
}