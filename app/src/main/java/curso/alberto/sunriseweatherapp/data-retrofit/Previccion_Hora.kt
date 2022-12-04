package com.alfredo.pruebarestapi.data_retrofit


import com.squareup.moshi.Json

data class Previccion_Hora(
    @Json(name = "DateTime" ) var DateTime: String? = null,
    @Json(name = "EpochDateTime") var EpochDateTime: Int? = null,
    @Json(name = "WeatherIcon") var WeatherIcon: Int? = null,
    @Json(name = "IconPhrase") var IconPhrase: String? = null,
    @Json(name = "HasPrecipitation" ) var HasPrecipitation: Boolean? = null,
    @Json(name = "IsDaylight") var IsDaylight: Boolean? = null,
    @Json(name = "Temperature") var Temperature: Dato_Double? = Dato_Double(),
    @Json(name = "RealFeelTemperature") var RealFeelTemperature: Dato_double_Frase? = Dato_double_Frase(),
    @Json(name = "RealFeelTemperatureShade" ) var RealFeelTemperatureShade: Dato_double_Frase? = Dato_double_Frase(),
    @Json(name = "WetBulbTemperature") var WetBulbTemperature: Dato_Double? = Dato_Double(),
    @Json(name = "DewPoint" ) var DewPoint: Dato_Double? = Dato_Double(),
    @Json(name = "Wind" ) var Wind: Wind? = Wind(),
    @Json(name = "WindGust" ) var WindGust: Wind? = Wind(),
    @Json(name = "RelativeHumidity" ) var RelativeHumidity: Int? = null,
    @Json(name = "IndoorRelativeHumidity") var IndoorRelativeHumidity: Int? = null,
    @Json(name = "Visibility") var Visibility: Dato_Double? = Dato_Double(),
    @Json(name = "Ceiling") var Ceiling: Dato_Double? = Dato_Double(),
    @Json(name = "UVIndex") var UVIndex: Int? = null,
    @Json(name = "UVIndexText") var UVIndexText: String? = null,
    @Json(name = "PrecipitationProbability" ) var PrecipitationProbability: Int? = null,
    @Json(name = "ThunderstormProbability") var ThunderstormProbability: Int? = null,
    @Json(name = "RainProbability") var RainProbability: Int? = null,
    @Json(name = "SnowProbability") var SnowProbability: Int? = null,
    @Json(name = "IceProbability") var IceProbability: Int? = null,
    @Json(name = "TotalLiquid") var TotalLiquid: Dato_Double? = Dato_Double(),
    @Json(name = "Rain" ) var Rain: Dato_Double? = Dato_Double(),
    @Json(name = "Snow" ) var Snow: Dato_Double? = Dato_Double(),
    @Json(name = "Ice") var Ice: Dato_Double? = Dato_Double(),
    @Json(name = "CloudCover") var CloudCover: Int? = null,
    @Json(name = "Evapotranspiration") var Evapotranspiration: Dato_Double? = Dato_Double(),
    @Json(name = "SolarIrradiance") var SolarIrradiance: Dato_Double? = Dato_Double(),
    @Json(name = "MobileLink") var MobileLink: String? = null,
    @Json(name = "Link" ) var Link: String? = null
)
