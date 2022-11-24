package com.alfredo.pruebarestapi.data_retrofit

import com.squareup.moshi.Json

data class Previccion (
    @Json(name = "Headline") var Headline: Headline? = Headline(),
    @Json(name = "DailyForecasts") var DailyForecasts: List<DailyForecasts> = arrayListOf()
)





