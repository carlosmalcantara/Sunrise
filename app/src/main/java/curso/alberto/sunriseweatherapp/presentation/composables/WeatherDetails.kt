package curso.alberto.sunriseweatherapp.presentation.composables

import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

public data class WeatherDetails(
    val data: Int,
    val units:String,
    @DrawableRes val icon: Int,
    val color: Color

)
