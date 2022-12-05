package alfredo.retrofit.retrofit

import com.alfredo.data.data_retrofit.*
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/*
    Interface que representa la obtención de la IP pública del dispositivo
 */
interface QuotesApi_ip {
    @GET("/")
    suspend fun get_ip(
        ) : Response<Ip>
}

/*
    Interface que representa la obtención de la localidad de la IP
 */
interface  QuotesApi_Geolocalizacion {
    @GET("{ip}")
    suspend fun get_geolocalizacion(
        @Path("ip") ip: String,
        ) : Response<Geolocalizacion>
}