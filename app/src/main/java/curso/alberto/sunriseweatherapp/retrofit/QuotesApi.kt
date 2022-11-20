package alfredo.retrofit.retrofit

import com.alfredo.pruebarestapi.data_retrofit.*
import curso.alberto.sunriseweatherapp.`data-retrofit`.Previccion_12Horas
import curso.alberto.sunriseweatherapp.`data-retrofit`.Previccion_5dias
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface QuotesApi {
    @GET("locations/v1/Regions")
    suspend fun get_Regions(
        @Query("apikey") apikey: String

    ) : Response<List<Region_Paises>>

    @GET("locations/v1/countries/{region}")
    suspend fun get_Paises(
        @Path("region") region: String,
        @Query("apikey") apikey: String,

    ) : Response<List<Pais>>

    @GET("locations/v1/adminareas/{pais}")
    suspend fun get_regiones_Paises(
        @Path("pais") pais: String,
        @Query("apikey") apikey: String,
    ): Response<List<Region>>

    @GET("locations/v1/cities/autocomplete")
    suspend fun  get_autocomplete(
        @Query("q") q: String,
        @Query("apikey") apikey: String,
    ): Response<List<Autocompletado>>


    @GET("locations/v1/{localidad}")
    suspend fun get_localidad_locationkey(
        @Path("localidad") localidad: String,
        @Query("apikey") apikey: String,
    ): Response<Localidad>

    @GET("locations/v1/cities/search")
    suspend fun get_localidad_nombre(
        @Query("q") q: String,
        @Query("apikey") apikey: String,
    ): Response<List<Localidad>>

    @GET("locations/v1/cities/geoposition/search")
    suspend fun get_localidad_geoposition(
        @Query("q") q: String, //lon,lat
        @Query("apikey") apikey: String,
    ): Response<Localidad>

    @GET("currentconditions/v1/{localidad}")
    suspend fun get_condiciones_actuales(
        @Path("localidad") localidad: String,
        @Query("apikey") apikey: String,
        @Query("details") details: Boolean,
        @Query("metric") metric: Boolean
    ): Response<List<Condiciones>>

    @GET("currentconditions/v1/{localidad}/historical/24")
    suspend fun get_condiciones_actuales_24(
        @Path("localidad") localidad: String,
        @Query("apikey") apikey: String,
        @Query("details") details: Boolean,
        @Query("metric") metric: Boolean
    ): Response<List<Condiciones>>
    @GET("currentconditions/v1/{localidad}")
    suspend fun get_condiciones_actuales_6(
        @Path("localidad") localidad: String,
        @Query("apikey") apikey: String,
        @Query("details") details: Boolean,
        @Query("metric") metric: Boolean
    ): Response<List<Condiciones>>
    // Sin probar sin respuesta asignada
    @GET("forecasts/v1/daily/1day/{localidad}")
    suspend fun get_prevision_1_dia(
        @Path("localidad") localidad: String,
        @Query("apikey") apikey: String,
        @Query("details") details: Boolean,
        @Query("metric") metric: Boolean
    ): Response<Previccion>
    @GET("forecasts/v1/daily/5day/{localidad}")
    suspend fun get_prevision_5_dias(
        @Path("localidad") localidad: String,
        @Query("apikey") apikey: String,
        @Query("details") details: Boolean,
        @Query("metric") metric: Boolean
    ): Response<Previccion_5dias>
    @GET("forecasts/v1/hourly/1hour/{localidad}")
    suspend fun get_prevision_1_hora(
        @Path("localidad") localidad: String,
        @Query("apikey") apikey: String,
        @Query("details") details: Boolean,
        @Query("metric") metric: Boolean
    ): Response<List<Previccion_Hora>>
    @GET("forecasts/v1/hourly/12hour/{localidad}")
    suspend fun get_prevision_12_horas(
        @Path("localidad") localidad: String,
        @Query("apikey") apikey: String,
        @Query("details") details: Boolean,
        @Query("metric") metric: Boolean
    ): Response<List<Previccion_12Horas>>

} // Final interface



