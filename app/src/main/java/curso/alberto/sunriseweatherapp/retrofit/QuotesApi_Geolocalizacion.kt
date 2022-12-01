package alfredo.retrofit.retrofit

import com.alfredo.pruebarestapi.data_retrofit.*
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface QuotesApi_ip {
    @GET("/")
    suspend fun get_ip(
        ) : Response<Ip>
}

interface  QuotesApi_Geolocalizacion {
    @GET("{ip}")
    suspend fun get_geolocalizacion(
        @Path("ip") ip: String,
        ) : Response<Geolocalizacion>
}