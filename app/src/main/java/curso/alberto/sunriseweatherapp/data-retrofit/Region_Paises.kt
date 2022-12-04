package com.alfredo.pruebarestapi.data_retrofit

import com.squareup.moshi.Json


data class Region_Paises (

    @Json(name = "ID")
    var ID: String? = null,

    @Json(name = "LocalizedName")
    var LocalizedName: String? = null,

    @Json(name = "EnglishName")
    var EnglishName: String? = null
)