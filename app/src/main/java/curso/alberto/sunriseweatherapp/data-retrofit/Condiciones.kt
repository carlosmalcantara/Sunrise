package com.example.pruebarestapi.data

import java.util.Objects

data class Condiciones(
    val LocalObservationDateTime: String,
    val EpochTime: Long,
    val WeatherText: String,
    val WeatherIcon: Int,
    val LocalSource:Local_Source,
    val IsDayTime: Boolean,
    val Temperature: Temperatura,
    val RealFeelTemperature: Object,
    val RealFeelTemperatureShade: Object,
    val RelativeHumidity: Int,
    val DewPoint: Object,
    val wind: Viento,
    val WindGust: Object,
    val UVIndex: Int,
    val UVIndexText: String,
    val Visibility:	Object,
    val ObstructionsToVisibility:String,
    val CloudCover:Int,
    val Ceiling: Object,
    val Pressure: Object,
    val PressureTendency: Tendencia_Presion,
    val Past24HourTemperatureDeparture: Object,
    val ApparentTemperature: Object,
    val WindChillTemperature: Object,
    val WetBulbTemperature: Object,
    val Precip1hr: Object,
    val PrecipitationSummary: Resumen_Precipitaciones,
    val TemperatureSummary: Resumen_Temperatura,
    val MobileLink: String,
    val Link: String,
    val HasPrecipitation: Boolean,
    val PrecipitationType:String,
    val IndoorRelativeHumidity:Boolean
)
