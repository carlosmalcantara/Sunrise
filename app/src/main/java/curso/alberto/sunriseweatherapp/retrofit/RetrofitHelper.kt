package alfredo.retrofit.retrofit

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitHelper {

    val baseUrl = "http://dataservice.accuweather.com/"

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(MoshiConverterFactory.create())
            // we need to add converter factory to
            // convert JSON object to Java object
            .build()
    }
}

object RetrofitHelper_ip {

    val baseUrl2 = "https://api.myip.com"

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl2)
            .addConverterFactory(MoshiConverterFactory.create())
            // we need to add converter factory to
            // convert JSON object to Java object
            .build()
    }
}

object RetrofitHelper_geolocalizacion {

    val baseUrl3 = "http://ip-api.com/json/"

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl3)
            .addConverterFactory(MoshiConverterFactory.create())
            // we need to add converter factory to
            // convert JSON object to Java object
            .build()
    }
}




