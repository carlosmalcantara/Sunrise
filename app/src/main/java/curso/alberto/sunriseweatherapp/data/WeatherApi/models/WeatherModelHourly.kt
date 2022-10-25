package curso.alberto.sunriseweatherapp.data.WeatherApi.models

import android.text.format.DateFormat


data class WeatherModelHourly(

    val dt_txt: DateFormat,
    val icon: String,
    val temp_max: Double
)