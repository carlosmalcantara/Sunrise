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
