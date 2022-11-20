package curso.alberto.sunriseweatherapp.`data-retrofit`

import com.squareup.moshi.Json

data class Previccion_12Horas(
    @Json(name = "DateTime") var DateTime: String? = null,
    @Json(name = "EpochDateTime") var EpochDateTime: Int? = null,
    @Json(name = "WeatherIcon") var WeatherIcon: Int? = null,
    @Json(name = "IconPhrase") var IconPhrase: String? = null,
    @Json(name = "HasPrecipitation") var HasPrecipitation: Boolean?= null,
    @Json(name = "IsDaylight") var IsDaylight: Boolean?= null,
    @Json(name = "Temperature") var Temperature: Temperature?= Temperature(),
    @Json(name = "RealFeelTemperature") var RealFeelTemperature: RealFeelTemperature?= RealFeelTemperature(),
    @Json(name = "RealFeelTemperatureShade") var RealFeelTemperatureShade: RealFeelTemperatureShade? = RealFeelTemperatureShade(),
    @Json(name = "WetBulbTemperature") var WetBulbTemperature: WetBulbTemperature? = WetBulbTemperature(),
    @Json(name = "DewPoint") var DewPoint: DewPoint? = DewPoint(),
    @Json(name = "Wind") var Wind: Wind? = Wind(),
    @Json(name = "WindGust") var WindGust: WindGust? = WindGust(),
    @Json(name = "RelativeHumidity") var RelativeHumidity: Int? = null,
    @Json(name = "IndoorRelativeHumidity") var IndoorRelativeHumidity: Int? = null,
    @Json(name = "Visibility") var Visibility: Visibility? = Visibility(),
    @Json(name = "Ceiling") var Ceiling: Ceiling?= Ceiling(),
    @Json(name = "UVIndex") var UVIndex: Int? = null,
    @Json(name = "UVIndexText") var UVIndexText: String? = null,
    @Json(name = "PrecipitationProbability") var PrecipitationProbability: Int? = null,
    @Json(name = "ThunderstormProbability") var ThunderstormProbability: Int? = null,
    @Json(name = "RainProbability") var RainProbability: Int? = null,
    @Json(name = "SnowProbability") var SnowProbability: Int? = null,
    @Json(name = "IceProbability") var IceProbability: Int? = null,
    @Json(name = "TotalLiquid") var TotalLiquid: TotalLiquid?= TotalLiquid(),
    @Json(name = "Rain") var Rain: Rain? = Rain(),
    @Json(name = "Snow") var Snow: Snow? = Snow(),
    @Json(name = "Ice" ) var Ice: Ice? = Ice(),
    @Json(name = "CloudCover") var CloudCover: Int? = null,
    @Json(name = "Evapotranspiration") var Evapotranspiration: Evapotranspiration? = Evapotranspiration(),
    @Json(name = "SolarIrradiance") var SolarIrradiance: SolarIrradiance?= SolarIrradiance(),
    @Json(name = "MobileLink") var MobileLink: String? = null,
    @Json(name = "Link") var Link: String? = null
)
data class Temperature (
    @Json(name = "Value") var Value: Double = 0.0,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int?= null
)
data class RealFeelTemperature (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int?= null,
    @Json(name = "Phrase") var Phrase: String? = null
)
data class RealFeelTemperatureShade (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int?= null,
    @Json(name = "Phrase") var Phrase: String? = null
)
data class WetBulbTemperature (
    @Json(name = "Value") var Value: Double = 0.0,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int?= null
)
data class DewPoint (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int?= null
)
data class Speed11 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int?= null
)
data class Direction11 (
    @Json(name = "Degrees") var Degrees: Int?= null,
    @Json(name = "Localized") var Localized: String? = null,
    @Json(name = "English") var English: String? = null
)
data class Wind (
    @Json(name = "Speed") var Speed: Speed11? = Speed11(),
    @Json(name = "Direction") var Direction: Direction11? = Direction11()
)
data class Speed12 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int?= null
)
data class Direction (
    @Json(name = "Degrees") var Degrees: Int?= null,
    @Json(name = "Localized") var Localized: String? = null,
    @Json(name = "English") var English: String? = null
)
data class WindGust (
    @Json(name = "Speed") var Speed: Speed12? = Speed12(),
    @Json(name = "Direction") var Direction: Direction? = Direction()
)
data class Visibility (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int?= null
)
data class Ceiling (
    @Json(name = "Value") var Value: Int?= null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int?= null
)
data class TotalLiquid (
    @Json(name = "Value") var Value: Int?= null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int?= null
)
data class Rain (
    @Json(name = "Value") var Value: Int?= null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int?= null
)
data class Snow (
    @Json(name = "Value") var Value: Int?= null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int?= null
)
data class Ice (
    @Json(name = "Value") var Value: Int?= null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int?= null
)
data class Evapotranspiration (
    @Json(name = "Value") var Value: Double?= null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int?= null
)
data class SolarIrradiance (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int?= null
)



