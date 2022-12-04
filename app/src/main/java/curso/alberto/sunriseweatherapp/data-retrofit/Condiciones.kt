package com.alfredo.pruebarestapi.data_retrofit

import com.squareup.moshi.Json


data class Condiciones (

    @Json(name = "LocalObservationDateTime") var LocalObservationDateTime: String? = null,
    @Json(name = "EpochTime") var EpochTime: Int? = null,
    @Json(name = "WeatherText") var WeatherText: String? = null,
    @Json(name = "WeatherIcon") var WeatherIcon: Int? = null,
    @Json(name = "HasPrecipitation") var HasPrecipitation: Boolean? = null,
    @Json(name = "PrecipitationType") var PrecipitationType: String? = null,
    @Json(name = "IsDayTime") var IsDayTime: Boolean? = null,
    @Json(name = "Temperature") var Temperature: Metric_Imperial? = Metric_Imperial(),
    @Json(name = "RealFeelTemperature") var RealFeelTemperature: Metric_Imperial? = Metric_Imperial(),
    @Json(name = "RealFeelTemperatureShade") var RealFeelTemperatureShade: Metric_Imperial? = Metric_Imperial(),
    @Json(name = "RelativeHumidity") var RelativeHumidity: Double? = null,
    @Json(name = "IndoorRelativeHumidity") var IndoorRelativeHumidity: Double? = null,
    @Json(name = "DewPoint") var DewPoint: Metric_Imperial? = Metric_Imperial(),
    @Json(name = "Wind") var Wind: Wind_condiciones? = Wind_condiciones(),
    @Json(name = "WindGust") var WindGust: Wind_condiciones? = Wind_condiciones(),
    @Json(name = "UVIndex") var UVIndex: Int? = null,
    @Json(name = "UVIndexText") var UVIndexText: String? = null,
    @Json(name = "Visibility") var Visibility: Metric_Imperial? = Metric_Imperial(),
    @Json(name = "ObstructionsToVisibility") var ObstructionsToVisibility: String? = null,
    @Json(name = "CloudCover") var CloudCover: Int? = null,
    @Json(name = "Ceiling") var Ceiling: Metric_Imperial? = Metric_Imperial(),
    @Json(name = "Pressure") var Pressure: Metric_Imperial? = Metric_Imperial(),
    @Json(name = "PressureTendency") var PressureTendency: PressureTendency? = PressureTendency(),
    @Json(name = "Past24HourTemperatureDeparture") var Past24HourTemperatureDeparture: Metric_Imperial? = Metric_Imperial(),
    @Json(name = "ApparentTemperature") var ApparentTemperature: Metric_Imperial? = Metric_Imperial(),
    @Json(name = "WindChillTemperature") var WindChillTemperature: Metric_Imperial? = Metric_Imperial(),
    @Json(name = "WetBulbTemperature") var WetBulbTemperature: Metric_Imperial? = Metric_Imperial(),
    @Json(name = "Precip1hr") var Precip1hr: Metric_Imperial? = Metric_Imperial(),
    @Json(name = "PrecipitationSummary") var PrecipitationSummary: PrecipitationSummary? = PrecipitationSummary(),
    @Json(name = "TemperatureSummary") var TemperatureSummary: TemperatureSummary? = TemperatureSummary(),
    @Json(name = "MobileLink") var MobileLink: String? = null,
    @Json(name = "Link") var Link: String? = null
)
data class Wind_condiciones (
    @Json(name = "Direction") var Direction: Direction? = Direction(),
    @Json(name = "Speed") var Speed: Metric_Imperial? = Metric_Imperial()
)
data class PressureTendency (
    @Json(name = "LocalizedText") var LocalizedText: String? = null,
    @Json(name = "Code") var Code: String? = null
)
data class PrecipitationSummary (
    @Json(name = "Precipitation") var Precipitation: Metric_Imperial? = Metric_Imperial(),
    @Json(name = "PastHour") var PastHour: Metric_Imperial? = Metric_Imperial(),
    @Json(name = "Past3Hours") var Past3Hours: Metric_Imperial? = Metric_Imperial(),
    @Json(name = "Past6Hours") var Past6Hours: Metric_Imperial? = Metric_Imperial(),
    @Json(name = "Past9Hours") var Past9Hours: Metric_Imperial? = Metric_Imperial(),
    @Json(name = "Past12Hours") var Past12Hours: Metric_Imperial? = Metric_Imperial(),
    @Json(name = "Past18Hours") var Past18Hours: Metric_Imperial? = Metric_Imperial(),
    @Json(name = "Past24Hours") var Past24Hours: Metric_Imperial? = Metric_Imperial()
)
data class TemperatureSummary (
    @Json(name = "Past6HourRange") var Past6HourRange: HourRange? = HourRange(),
    @Json(name = "Past12HourRange") var Past12HourRange: HourRange? = HourRange(),
    @Json(name = "Past24HourRange") var Past24HourRange: HourRange? = HourRange()
)

