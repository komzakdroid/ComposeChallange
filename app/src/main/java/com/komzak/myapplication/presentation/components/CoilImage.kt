package com.komzak.myapplication.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Scale
import coil.size.Size
import com.komzak.myapplication.R

@Composable
fun CoilImage(imageUrl: String?) {
    println("https://image.tmdb.org/t/p/w600_and_h900_bestv2${imageUrl}")
    Image(
        painter = rememberAsyncImagePainter(
            model = ImageRequest.Builder(LocalContext.current)
                .data("https://image.tmdb.org/t/p/w600_and_h900_bestv2${imageUrl}")
                .size(Size.ORIGINAL)
                .scale(Scale.FIT)
                .placeholder(R.drawable.image_placeholder)
                .build()
        ),
        contentDescription = "Coil Image",
        modifier = Modifier
            .size(80.dp)
            .clip(RoundedCornerShape(4.dp))
    )
}