package curso.alberto.sunriseweatherapp.presentation.composables

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

public data class WeatherDetails(
    val data: String,
    val units:String,
    @DrawableRes val icon: Int,
    val color: Color

)
