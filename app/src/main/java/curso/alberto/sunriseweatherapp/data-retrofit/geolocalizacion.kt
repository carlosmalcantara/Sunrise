package com.alfredo.pruebarestapi.data_retrofit

import com.squareup.moshi.Json

data class Geolocalizacion(
    @Json(name = "status")
    val ip: String = "success",
    @Json(name = "country") val country:String = "Spain",
    @Json(name = "countryCode") val countryCode:String = "ES",
    @Json(name = "region") val region:String = "MD",
    @Json(name = "regionName") val regionName:String = "Madrid",
    @Json(name = "city") val city:String = "Alcobendas",
    @Json(name = "zip") val zip:String = "28100",
    @Json(name = "lat") val lat:Double = 40.5458,
    @Json(name = "lon") val lon:Double = -3.6443,
    @Json(name = "timezone") val timezone:String = "Europe/Madrid",
    @Json(name = "isp") val isp:String = "Orange Espagne SA",
    @Json(name = "org") val org:String = "Jazz Telecom S.A",
    @Json(name = "as") val ass:String = "AS12479 Orange Espagne SA",
    @Json(name = "query") val query:String = "2a02:2e02:26c6:5f00:e875:615e:70c1:f773"

)
