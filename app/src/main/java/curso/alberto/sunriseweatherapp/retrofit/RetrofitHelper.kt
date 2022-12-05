package alfredo.retrofit.retrofit

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

/*
    Objeto que implementa el interface QuotesApi_Tiempo
 */
object RetrofitHelper {

    val baseUrl = "http://dataservice.accuweather.com/"

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
}

/*
    Objeto que implementa el interface QuotesApi_ip
 */
object RetrofitHelper_ip {

    val baseUrl2 = "https://api.myip.com"

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl2)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
}

/*
    Objeto que implementa el interface QuotesApi_Geolocalizacion
 */
object RetrofitHelper_geolocalizacion {

    val baseUrl3 = "http://ip-api.com/json/"

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl3)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
}




