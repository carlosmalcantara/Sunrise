package com.alfredo.pruebarestapi.data_retrofit

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json

data class Previccion_Hora(

    @SerializedName("DateTime" ) var DateTime: String? = null,
    @SerializedName("EpochDateTime") var EpochDateTime: Int? = null,
    @SerializedName("WeatherIcon") var WeatherIcon: Int? = null,
    @SerializedName("IconPhrase") var IconPhrase: String? = null,
    @SerializedName("HasPrecipitation" ) var HasPrecipitation: Boolean? = null,
    @SerializedName("IsDaylight") var IsDaylight: Boolean? = null,
    @SerializedName("Temperature") var Temperature: Temperature3? = Temperature3(),
    @SerializedName("RealFeelTemperature") var RealFeelTemperature: RealFeelTemperature3? = RealFeelTemperature3(),
    @SerializedName("RealFeelTemperatureShade" ) var RealFeelTemperatureShade: RealFeelTemperatureShade3? = RealFeelTemperatureShade3(),
    @SerializedName("WetBulbTemperature") var WetBulbTemperature: WetBulbTemperature1? = WetBulbTemperature1(),
    @SerializedName("DewPoint" ) var DewPoint: DewPoint1? = DewPoint1(),
    @SerializedName("Wind" ) var Wind: Wind5? = Wind5(),
    @SerializedName("WindGust" ) var WindGust: WindGust5? = WindGust5(),
    @SerializedName("RelativeHumidity" ) var RelativeHumidity: Int? = null,
    @SerializedName("IndoorRelativeHumidity") var IndoorRelativeHumidity: Int? = null,
    @SerializedName("Visibility") var Visibility: Visibility1? = Visibility1(),
    @SerializedName("Ceiling") var Ceiling: Ceiling1? = Ceiling1(),
    @SerializedName("UVIndex") var UVIndex: Int? = null,
    @SerializedName("UVIndexText") var UVIndexText: String? = null,
    @SerializedName("PrecipitationProbability" ) var PrecipitationProbability: Int? = null,
    @SerializedName("ThunderstormProbability") var ThunderstormProbability: Int? = null,
    @SerializedName("RainProbability") var RainProbability: Int? = null,
    @SerializedName("SnowProbability") var SnowProbability: Int? = null,
    @SerializedName("IceProbability") var IceProbability: Int? = null,
    @SerializedName("TotalLiquid") var TotalLiquid: TotalLiquid? = TotalLiquid(),
    @SerializedName("Rain" ) var Rain: Rain? = Rain(),
    @SerializedName("Snow" ) var Snow: Snow? = Snow(),
    @SerializedName("Ice") var Ice: Ice? = Ice(),
    @SerializedName("CloudCover") var CloudCover: Int? = null,
    @SerializedName("Evapotranspiration") var Evapotranspiration: Evapotranspiration? = Evapotranspiration(),
    @SerializedName("SolarIrradiance") var SolarIrradiance: SolarIrradiance? = SolarIrradiance(),
    @SerializedName("MobileLink") var MobileLink: String? = null,
    @SerializedName("Link" ) var Link: String? = null

)
data class Temperature3 (
    @SerializedName("Value") var Value: Double? = null,
    @SerializedName("Unit" ) var Unit: String? = null,
    @SerializedName("UnitType" ) var UnitType: Int? = null
)
data class RealFeelTemperature3 (
    @SerializedName("Value") var Value: Double? = null,
    @SerializedName("Unit" ) var Unit: String? = null,
    @SerializedName("UnitType" ) var UnitType: Int? = null,
    @SerializedName("Phrase") var Phrase: String? = null
)
data class RealFeelTemperatureShade3 (
    @SerializedName("Value") var Value: Double? = null,
    @SerializedName("Unit" ) var Unit: String? = null,
    @SerializedName("UnitType" ) var UnitType: Int? = null,
    @SerializedName("Phrase") var Phrase: String? = null
)
data class WetBulbTemperature1 (
    @SerializedName("Value") var Value: Double? = null,
    @SerializedName("Unit" ) var Unit: String? = null,
    @SerializedName("UnitType" ) var UnitType: Int? = null
)
data class DewPoint1 (
    @SerializedName("Value") var Value: Double? = null,
    @SerializedName("Unit" ) var Unit: String? = null,
    @SerializedName("UnitType" ) var UnitType: Int? = null
)
data class Speed9 (
    @SerializedName("Value") var Value: Double? = null,
    @SerializedName("Unit" ) var Unit: String? = null,
    @SerializedName("UnitType" ) var UnitType: Int? = null
)
data class Direction9 (
    @SerializedName("Degrees") var Degrees: Int? = null,
    @SerializedName("Localized" ) var Localized: String? = null,
    @SerializedName("English") var English: String? = null
)
data class Wind5 (
    @SerializedName("Speed" ) var Speed: Speed9? = Speed9(),
    @SerializedName("Direction" ) var Direction: Direction9? = Direction9()
)
data class Speed10 (
    @SerializedName("Value") var Value: Double? = null,
    @SerializedName("Unit" ) var Unit: String? = null,
    @SerializedName("UnitType" ) var UnitType: Int? = null
)
data class Direction10 (
    @SerializedName("Degrees") var Degrees: Int? = null,
    @SerializedName("Localized" ) var Localized: String? = null,
    @SerializedName("English") var English: String? = null
)
data class WindGust5 (
    @SerializedName("Speed" ) var Speed: Speed10? = Speed10(),
    @SerializedName("Direction" ) var Direction: Direction10? = Direction10()
)
data class Visibility1 (
    @SerializedName("Value") var Value: Double? = null,
    @SerializedName("Unit" ) var Unit: String? = null,
    @SerializedName("UnitType" ) var UnitType: Int? = null
)
data class Ceiling1 (
    @SerializedName("Value") var Value: Int? = null,
    @SerializedName("Unit" ) var Unit: String? = null,
    @SerializedName("UnitType" ) var UnitType: Int? = null
)
data class TotalLiquid (
    @SerializedName("Value") var Value: Int? = null,
    @SerializedName("Unit" ) var Unit: String? = null,
    @SerializedName("UnitType" ) var UnitType: Int? = null
)
data class Rain (
    @SerializedName("Value") var Value: Int? = null,
    @SerializedName("Unit" ) var Unit: String? = null,
    @SerializedName("UnitType" ) var UnitType: Int? = null
)
data class Snow (
    @SerializedName("Value") var Value: Int? = null,
    @SerializedName("Unit" ) var Unit: String? = null,
    @SerializedName("UnitType" ) var UnitType: Int? = null
)
data class Ice (
    @SerializedName("Value") var Value: Int? = null,
    @SerializedName("Unit" ) var Unit: String? = null,
    @SerializedName("UnitType" ) var UnitType: Int? = null
)
data class Evapotranspiration (
    @SerializedName("Value") var Value: Int? = null,
    @SerializedName("Unit" ) var Unit: String? = null,
    @SerializedName("UnitType" ) var UnitType: Int? = null
)
data class SolarIrradiance (
    @SerializedName("Value") var Value: Double? = null,
    @SerializedName("Unit" ) var Unit: String? = null,
    @SerializedName("UnitType" ) var UnitType: Int? = null
)
