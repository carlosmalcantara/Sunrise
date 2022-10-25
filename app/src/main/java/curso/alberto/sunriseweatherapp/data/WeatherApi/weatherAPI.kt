import retrofit2.http.GET
import retrofit2.http.Query

// package curso.alberto.sunriseweatherapp.data.WeatherApi


interface WeatherAPI {

    @GET("")
    suspend fun getWeatherData (

        @Query( "latitude" ) lat: Double,
        @Query ( "longitude" ) long: Double
    )
}