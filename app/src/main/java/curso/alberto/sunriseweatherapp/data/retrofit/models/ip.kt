package com.alfredo.data.data_retrofit

import com.squareup.moshi.Json

data class Ip(
    @Json(name = "ip")
    val ip: String = "2a02:2e02:26c6:5f00:e875:615e:70c1:f773",
    @Json(name = "country")
    val country: String = "Spain",
    @Json(name = "cc")
    val cc: String = "ES",
    )
