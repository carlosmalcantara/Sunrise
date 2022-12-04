package curso.alberto.sunriseweatherapp.presentation.composables

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color


data class WeatherDetails(
    val units:String,
    val data: String,
    @DrawableRes val icon: Int,
    val color: Color,

)




