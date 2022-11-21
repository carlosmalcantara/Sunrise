package curso.alberto.sunriseweatherapp.`data-retrofit`

import com.squareup.moshi.Json

data class Previccion_5dias(

    @Json(name = "Headline") var Headline: Headline? = Headline(),
    @Json(name = "DailyForecasts") var DailyForecasts: List<DailyForecasts> = arrayListOf()

)

data class Headline (
    @Json(name = "EffectiveDate") var EffectiveDate: String? = null,
    @Json(name = "EffectiveEpochDate") var EffectiveEpochDate: Int? = null,
    @Json(name = "Severity") var Severity: Int? = null,
    @Json(name = "Text") var Text: String? = null,
    @Json(name = "Category") var Category: String? = null,
    @Json(name = "EndDate") var EndDate: String? = null,
    @Json(name = "EndEpochDate") var EndEpochDate: Int? = null,
    @Json(name = "MobileLink") var MobileLink: String? = null,
    @Json(name = "Link") var Link: String? = null
)
data class Sun (
    @Json(name = "Rise") var Rise: String? = null,
    @Json(name = "EpochRise") var EpochRise: Int? = null,
    @Json(name = "Set") var Set: String? = null,
    @Json(name = "EpochSet") var EpochSet: Int? = null
)
data class Moon (
    @Json(name = "Rise") var Rise: String? = null,
    @Json(name = "EpochRise") var EpochRise: Int? = null,
    @Json(name = "Set") var Set: String? = null,
    @Json(name = "EpochSet") var EpochSet: Int? = null,
    @Json(name = "Phase") var Phase: String? = null,
    @Json(name = "Age") var Age: Int? = null
)
data class Minimum1 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Maximum1 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Temperature1 (
    @Json(name = "Minimum") var Minimum: Minimum1? = Minimum1(),
    @Json(name = "Maximum") var Maximum: Maximum1? = Maximum1()
)
data class Minimum2 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null,
    @Json(name = "Phrase") var Phrase: String? = null
)
data class Maximum2 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null,
    @Json(name = "Phrase") var Phrase: String? = null
)
data class RealFeelTemperature1 (
    @Json(name = "Minimum") var Minimum: Minimum2? = Minimum2(),
    @Json(name = "Maximum") var Maximum: Maximum2? = Maximum2()
)
data class Minimum3 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null,
    @Json(name = "Phrase") var Phrase: String? = null
)
data class Maximum3 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null,
    @Json(name = "Phrase") var Phrase: String? = null
)
data class RealFeelTemperatureShade1 (
    @Json(name = "Minimum") var Minimum: Minimum3? = Minimum3(),
    @Json(name = "Maximum") var Maximum: Maximum3? = Maximum3()
)
data class Heating (
    @Json(name = "Value") var Value: Int? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Cooling (
    @Json(name = "Value") var Value: Int? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class DegreeDaySummary (
    @Json(name = "Heating") var Heating: Heating? = Heating(),
    @Json(name = "Cooling") var Cooling: Cooling? = Cooling()
)
data class AirAndPollen (
    @Json(name = "Name") var Name: String? = null,
    @Json(name = "Value") var Value: Int? = null,
    @Json(name = "Category") var Category: String? = null,
    @Json(name = "CategoryValue") var CategoryValue: Int? = null,
    @Json(name = "Type") var Type: String? = null
)
data class Speed1 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Direction1 (
    @Json(name = "Degrees") var Degrees: Int? = null,
    @Json(name = "Localized") var Localized: String? = null,
    @Json(name = "English") var English: String? = null
)
data class Wind1 (
    @Json(name = "Speed") var Speed: Speed1? = Speed1(),
    @Json(name = "Direction") var Direction: Direction1? = Direction1()
)
data class Speed2 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)

data class Direction2 (
    @Json(name = "Degrees") var Degrees: Int? = null,
    @Json(name = "Localized") var Localized: String? = null,
    @Json(name = "English") var English: String? = null
)
data class WindGust1 (
    @Json(name = "Speed") var Speed: Speed2? = Speed2(),
    @Json(name = "Direction") var Direction: Direction2? = Direction2()
)
data class TotalLiquid1 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Rain1 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Snow1 (
    @Json(name = "Value") var Value: Int? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Ice1 (
    @Json(name = "Value") var Value: Int? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Evapotranspiration1 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class SolarIrradiance1 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)


data class Day (
    @Json(name = "Icon") var Icon: Int? = null,
    @Json(name = "IconPhrase") var IconPhrase: String? = null,
    @Json(name = "HasPrecipitation") var HasPrecipitation: Boolean? = null,
    @Json(name = "PrecipitationType") var PrecipitationType: String? = null,
    @Json(name = "PrecipitationIntensity") var PrecipitationIntensity: String? = null,
    @Json(name = "ShortPhrase") var ShortPhrase: String? = null,
    @Json(name = "LongPhrase") var LongPhrase: String? = null,
    @Json(name = "PrecipitationProbability") var PrecipitationProbability: Int? = null,
    @Json(name = "ThunderstormProbability") var ThunderstormProbability: Int? = null,
    @Json(name = "RainProbability") var RainProbability: Int? = null,
    @Json(name = "SnowProbability") var SnowProbability: Int? = null,
    @Json(name = "IceProbability") var IceProbability: Int? = null,
    @Json(name = "Wind") var Wind: Wind1? = Wind1(),
    @Json(name = "WindGust") var WindGust: WindGust1? = WindGust1(),
    @Json(name = "TotalLiquid") var TotalLiquid: TotalLiquid1? = TotalLiquid1(),
    @Json(name = "Rain") var Rain: Rain1? = Rain1(),
    @Json(name = "Snow") var Snow: Snow1? = Snow1(),
    @Json(name = "Ice") var Ice: Ice1? = Ice1(),
    @Json(name = "HoursOfPrecipitation") var HoursOfPrecipitation: Double? = null,
    @Json(name = "HoursOfRain") var HoursOfRain: Double? = null,
    @Json(name = "HoursOfSnow") var HoursOfSnow: Int? = null,
    @Json(name = "HoursOfIce") var HoursOfIce: Int? = null,
    @Json(name = "CloudCover") var CloudCover: Int? = null,
    @Json(name = "Evapotranspiration") var Evapotranspiration: Evapotranspiration1? = Evapotranspiration1(),
    @Json(name = "SolarIrradiance") var SolarIrradiance: SolarIrradiance1? = SolarIrradiance1()
)
data class Speed3 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Direction3 (
    @Json(name = "Degrees") var Degrees: Int? = null,
    @Json(name = "Localized") var Localized: String? = null,
    @Json(name = "English") var English: String? = null
)
data class Wind2 (
    @Json(name = "Speed") var Speed: Speed3? = Speed3(),
    @Json(name = "Direction") var Direction: Direction3? = Direction3()
)
data class Speed4 (

    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Direction4 (
    @Json(name = "Degrees") var Degrees: Int? = null,
    @Json(name = "Localized") var Localized: String? = null,
    @Json(name = "English") var English: String? = null
)
data class WindGust2 (
    @Json(name = "Speed") var Speed: Speed4? = Speed4(),
    @Json(name = "Direction") var Direction: Direction4? = Direction4()
)
data class TotalLiquid2 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Rain2 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Snow2 (
    @Json(name = "Value") var Value: Int? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Ice2 (
    @Json(name = "Value") var Value: Int? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Evapotranspiration2 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class SolarIrradiance2 (
    @Json(name = "Value") var Value: Int? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Night (
    @Json(name = "Icon") var Icon: Int? = null,
    @Json(name = "IconPhrase") var IconPhrase: String? = null,
    @Json(name = "HasPrecipitation") var HasPrecipitation: Boolean? = null,
    @Json(name = "PrecipitationType") var PrecipitationType: String? = null,
    @Json(name = "PrecipitationIntensity") var PrecipitationIntensity: String? = null,
    @Json(name = "ShortPhrase") var ShortPhrase: String? = null,
    @Json(name = "LongPhrase") var LongPhrase: String? = null,
    @Json(name = "PrecipitationProbability") var PrecipitationProbability: Int? = null,
    @Json(name = "ThunderstormProbability") var ThunderstormProbability: Int? = null,
    @Json(name = "RainProbability") var RainProbability: Int? = null,
    @Json(name = "SnowProbability") var SnowProbability: Int? = null,
    @Json(name = "IceProbability") var IceProbability: Int? = null,
    @Json(name = "Wind") var Wind: Wind2? = Wind2(),
    @Json(name = "WindGust") var WindGust: WindGust2? = WindGust2(),
    @Json(name = "TotalLiquid") var TotalLiquid: TotalLiquid2? = TotalLiquid2(),
    @Json(name = "Rain") var Rain: Rain2? = Rain2(),
    @Json(name = "Snow") var Snow: Snow2? = Snow2(),
    @Json(name = "Ice") var Ice: Ice2? = Ice2(),
    @Json(name = "HoursOfPrecipitation") var HoursOfPrecipitation: Double? = null,
    @Json(name = "HoursOfRain") var HoursOfRain: Double? = null,
    @Json(name = "HoursOfSnow") var HoursOfSnow: Double? = null,
    @Json(name = "HoursOfIce") var HoursOfIce: Double? = null,
    @Json(name = "CloudCover") var CloudCover: Int? = null,
    @Json(name = "Evapotranspiration") var Evapotranspiration: Evapotranspiration2? = Evapotranspiration2(),
    @Json(name = "SolarIrradiance") var SolarIrradiance: SolarIrradiance2? = SolarIrradiance2()
)
data class DailyForecasts (
    @Json(name = "Date") var Date: String? = null,
    @Json(name = "EpochDate") var EpochDate: Int? = null,
    @Json(name = "Sun") var Sun: Sun? = Sun(),
    @Json(name = "Moon") var Moon: Moon? = Moon(),
    @Json(name = "Temperature") var Temperature: Temperature1? = Temperature1(),
    @Json(name = "RealFeelTemperature") var RealFeelTemperature: RealFeelTemperature1? = RealFeelTemperature1(),
    @Json(name = "RealFeelTemperatureShade") var RealFeelTemperatureShade: RealFeelTemperatureShade1? = RealFeelTemperatureShade1(),
    @Json(name = "HoursOfSun") var HoursOfSun: Double? = null,
    @Json(name = "DegreeDaySummary") var DegreeDaySummary: DegreeDaySummary? = DegreeDaySummary(),
    @Json(name = "AirAndPollen") var AirAndPollen: List<AirAndPollen> = arrayListOf(),
    @Json(name = "Day") var Day: Day? = Day(),
    @Json(name = "Night") var Night: Night? = Night(),
    @Json(name = "Sources") var Sources: List<String> = arrayListOf(),
    @Json(name = "MobileLink") var MobileLink: String? = null,
    @Json(name = "Link") var Link: String? = null
)