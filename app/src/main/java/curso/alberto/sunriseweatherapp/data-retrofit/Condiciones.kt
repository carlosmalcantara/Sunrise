package com.alfredo.pruebarestapi.data_retrofit

import com.squareup.moshi.Json

data class Condiciones(

    @Json(name = "LocalObservationDateTime")
    var LocalObservationDateTime: String? = null,
    @Json(name = "EpochTime")
    var EpochTime: Int? = null,
    @Json(name = "WeatherText")
    var WeatherText: String? = null,
    @Json(name = "WeatherIcon")
    var WeatherIcon: Int? = null,
    @Json(name = "HasPrecipitation")
    var HasPrecipitation: Boolean? = null,
    @Json(name = "PrecipitationType")
    var PrecipitationType: String? = null,
    @Json(name = "IsDayTime")
    var IsDayTime: Boolean? = null,
    @Json(name = "Temperature")
    var Temperature: Temperature? = Temperature(),
    @Json(name = "MobileLink")
    var MobileLink: String? = null,
    @Json(name = "Link")
    var Link: String? = null
)

data class Temperature (

    @Json(name = "Metric")
    var Metric: MetricB? = MetricB(),
    @Json(name = "Imperial")
    var Imperial: MetricB? = MetricB()

)

data class MetricB (

    @Json(name = "Value")
    var Value: Double? = null,
    @Json(name = "Unit")
    var Unit: String? = null,
    @Json(name = "UnitType")
    var UnitType: Int? = null

)



