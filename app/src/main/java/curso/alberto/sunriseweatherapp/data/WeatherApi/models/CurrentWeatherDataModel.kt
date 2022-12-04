package curso.alberto.sunriseweatherapp.data.WeatherApi.models



//Display Principal con Icono
data class CurrentWeatherDataModel(
    val name: String,
    val description: String,
    val icon: String,
    val temp: Double,
    val tempMax: Double,
    val tempMin: Double

)
