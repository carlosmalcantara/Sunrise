package alfredo.retrofit.retrofit

import alfredo.retrofit.data.Localidad
import com.example.pruebarestapi.data.*
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
    ): Response<Localidad>

    @GET("locations/v1/cities/geoposition/search")
    suspend fun get_localidad_geoposition(
        @Query("q") q: String, //lon,lat
        @Query("apikey") apikey: String,
    ): Response<Localidad>

    @GET("currentconditions/v1/{localidad}")
    suspend fun get_condiciones_actuales(
        @Path("localidad") localidad: String,
        @Query("apikey") apikey: String,
    ): Response<List<Condiciones>>

    @GET("currentconditions/v1/{localidad}/historical/24")
    suspend fun get_condiciones_actuales_24(
        @Path("localidad") localidad: String,
        @Query("apikey") apikey: String,
    ): Response<List<Condiciones>>

    @GET("currentconditions/v1/{localidad}/historical")
    suspend fun get_condiciones_actuales_6(
        @Path("localidad") localidad: String,
        @Query("apikey") apikey: String,
    ): Response<List<Condiciones>>

    // Sin probar sin respuesta asignada
    @GET("forecasts/v1/daily/1day/{localidad}")
    suspend fun get_previcion_1_dia(
        @Path("localidad") localidad: String,
        @Query("apikey") apikey: String,
    ): Response<Previccion>

    @GET("forecasts/v1/daily/5day/{localidad}")
    suspend fun get_previcion_5_dias(
        @Path("localidad") localidad: String,
        @Query("apikey") apikey: String,
    ): Response<Previccion>



    @GET("forecasts/v1/hourly/1hour/{localidad}")
    suspend fun get_previcion_1_hora(
        @Path("localidad") localidad: String,
        @Query("apikey") apikey: String,
    ): Response<Previccion_Hora>
    @GET("forecasts/v1/hourly/12hour/{localidad}")
    suspend fun get_previcion_12_horas(
        @Path("localidad") localidad: String,
        @Query("apikey") apikey: String,
    ): Response<List<Previccion_Hora>>









} // Final interface


/*

            val quotesApi = RetrofitHelper.getInstance().create(QuotesApi::class.java)
            // launching a new coroutine
            GlobalScope.launch {
                // Llamadas de prueba. Se vializa el resultado en el log
                //val result = quotesApi.get_Regions("sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
                //val result = quotesApi.get_Paises("EUR","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
                //val result = quotesApi.get_regiones_Paises("ES","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
                //val result = quotesApi.get_autocomplete( "mad","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
                //val result = quotesApi.get_localidad_locationkey( "308526","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
                //val result = quotesApi.get_condiciones_actuales("308526","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
                //val result = quotesApi.get_condiciones_actuales_6("308526","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
                //val result = quotesApi.get_condiciones_actuales_24("308526","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
                //val result = quotesApi.get_localidad_geoposition("40.4,-3.5","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
                //val result = quotesApi.get_previcion_1_dia("308526","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")


                val result = quotesApi.get_previcion_5_dias("308526","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
                if (result != null) Log.d("resultado: ", result.body().toString())
            }



 */

