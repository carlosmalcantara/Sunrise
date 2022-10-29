package com.alfredo.pruebarestapi.data_retrofit

import com.squareup.moshi.Json

data class Previccion_Hora(
    @Json(name = "DateTime"                 ) var DateTime: String?      = null,
    @Json(name = "EpochDateTime"            ) var EpochDateTime: Int?         = null,
    @Json(name = "WeatherIcon"              ) var WeatherIcon: Int?         = null,
    @Json(name = "IconPhrase"               ) var IconPhrase: String?      = null,
    @Json(name = "HasPrecipitation"         ) var HasPrecipitation: Boolean?     = null,
    @Json(name = "IsDaylight"               ) var IsDaylight: Boolean?     = null,
    @Json(name = "Temperature"              ) var Temperature: TemperatureB = TemperatureB(),
    @Json(name = "PrecipitationProbability" ) var PrecipitationProbability: Int?         = null,
    @Json(name = "MobileLink"               ) var MobileLink: String?      = null,
    @Json(name = "Link"                     ) var Link: String?      = null
)

data class TemperatureB (

    @Json(name = "Value"    ) var Value    : Int?    = null,
    @Json(name = "Unit"     ) var Unit     : String? = null,
    @Json(name = "UnitType" ) var UnitType : Int?    = null

)