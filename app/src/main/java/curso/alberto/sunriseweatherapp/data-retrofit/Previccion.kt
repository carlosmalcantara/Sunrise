package com.alfredo.pruebarestapi.data_retrofit

import com.squareup.moshi.Json


data class Previccion (

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
data class Minimum4 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Maximum4 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Temperature2 (
    @Json(name = "Minimum") var Minimum: Minimum4? = Minimum4(),
    @Json(name = "Maximum") var Maximum: Maximum4? = Maximum4()
)
data class Minimum5 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null,
    @Json(name = "Phrase") var Phrase: String? = null
)
data class Maximum5 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null,
    @Json(name = "Phrase") var Phrase: String? = null
)
data class RealFeelTemperature2 (
    @Json(name = "Minimum") var Minimum: Minimum5? = Minimum5(),
    @Json(name = "Maximum") var Maximum: Maximum5? = Maximum5()
)
data class Minimum6 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null,
    @Json(name = "Phrase") var Phrase: String? = null
)
data class Maximum6 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null,
    @Json(name = "Phrase") var Phrase: String? = null
)
data class RealFeelTemperatureShade2 (
    @Json(name = "Minimum") var Minimum: Minimum6? = Minimum6(),
    @Json(name = "Maximum") var Maximum: Maximum6? = Maximum6()
)
data class Heating (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Cooling (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class DegreeDaySummary (
    @Json(name = "Heating") var Heating: Heating? = Heating(),
    @Json(name = "Cooling") var Cooling: Cooling? = Cooling()
)
data class AirAndPollen (
    @Json(name = "Name") var Name: String? = null,
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Category") var Category: String? = null,
    @Json(name = "CategoryValue") var CategoryValue: Int? = null,
    @Json(name = "Type") var Type: String? = null
)
data class Speed5 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Direction5 (
    @Json(name = "Degrees") var Degrees: Int? = null,
    @Json(name = "Localized") var Localized: String? = null,
    @Json(name = "English") var English: String? = null
)
data class Wind3 (

    @Json(name = "Speed") var Speed: Speed5? = Speed5(),
    @Json(name = "Direction") var Direction: Direction5? = Direction5()

)
data class Speed6 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Direction6 (
    @Json(name = "Degrees") var Degrees: Int? = null,
    @Json(name = "Localized") var Localized: String? = null,
    @Json(name = "English") var English: String? = null
)
data class WindGust3 (
    @Json(name = "Speed") var Speed: Speed6? = Speed6(),
    @Json(name = "Direction") var Direction: Direction6? = Direction6()
)

data class TotalLiquid3 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Rain3 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Snow3 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Ice3 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Evapotranspiration3 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class SolarIrradiance3 (
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
    @Json(name = "Wind") var Wind: Wind3? = Wind3(),
    @Json(name = "WindGust") var WindGust: WindGust3? = WindGust3(),
    @Json(name = "TotalLiquid") var TotalLiquid: TotalLiquid? = TotalLiquid(),
    @Json(name = "Rain") var Rain: Rain3? = Rain3(),
    @Json(name = "Snow") var Snow: Snow3? = Snow3(),
    @Json(name = "Ice") var Ice: Ice3? = Ice3(),
    @Json(name = "HoursOfPrecipitation") var HoursOfPrecipitation: Double? = null,
    @Json(name = "HoursOfRain") var HoursOfRain: Double? = null,
    @Json(name = "HoursOfSnow") var HoursOfSnow: Int? = null,
    @Json(name = "HoursOfIce") var HoursOfIce: Int? = null,
    @Json(name = "CloudCover") var CloudCover: Int? = null,
    @Json(name = "Evapotranspiration") var Evapotranspiration: Evapotranspiration3? = Evapotranspiration3(),
    @Json(name = "SolarIrradiance") var SolarIrradiance: SolarIrradiance3? = SolarIrradiance3()
)
data class Speed7 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Direction7 (
    @Json(name = "Degrees") var Degrees: Int? = null,
    @Json(name = "Localized") var Localized: String? = null,
    @Json(name = "English") var English: String? = null
)
data class Wind4 (
    @Json(name = "Speed") var Speed: Speed7? = Speed7(),
    @Json(name = "Direction") var Direction: Direction7? = Direction7()
)
data class Speed8 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Direction8 (
    @Json(name = "Degrees") var Degrees: Int? = null,
    @Json(name = "Localized") var Localized: String? = null,
    @Json(name = "English") var English: String? = null
)
data class WindGust4 (
    @Json(name = "Speed") var Speed: Speed8? = Speed8(),
    @Json(name = "Direction") var Direction: Direction8? = Direction8()
)
data class TotalLiquid4 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Rain4 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Snow4 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Ice4 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Evapotranspiration4 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class SolarIrradiance4 (
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
    @Json(name = "Wind") var Wind: Wind4? = Wind4(),
    @Json(name = "WindGust") var WindGust: WindGust4? = WindGust4(),
    @Json(name = "TotalLiquid") var TotalLiquid: TotalLiquid4? = TotalLiquid4(),
    @Json(name = "Rain") var Rain: Rain4? = Rain4(),
    @Json(name = "Snow") var Snow: Snow4? = Snow4(),
    @Json(name = "Ice") var Ice: Ice4? = Ice4(),
    @Json(name = "HoursOfPrecipitation") var HoursOfPrecipitation: Double? = null,
    @Json(name = "HoursOfRain") var HoursOfRain: Double? = null,
    @Json(name = "HoursOfSnow") var HoursOfSnow: Double? = null,
    @Json(name = "HoursOfIce") var HoursOfIce: Double? = null,
    @Json(name = "CloudCover") var CloudCover: Double? = null,
    @Json(name = "Evapotranspiration") var Evapotranspiration: Evapotranspiration4? = Evapotranspiration4(),
    @Json(name = "SolarIrradiance") var SolarIrradiance: SolarIrradiance4? = SolarIrradiance4()
)
data class DailyForecasts (
    @Json(name = "Date") var Date: String? = null,
    @Json(name = "EpochDate") var EpochDate: Int? = null,
    @Json(name = "Sun") var Sun: Sun? = Sun(),
    @Json(name = "Moon") var Moon: Moon? = Moon(),
    @Json(name = "Temperature") var Temperature: Temperature2? = Temperature2(),
    @Json(name = "RealFeelTemperature") var RealFeelTemperature: RealFeelTemperature2? = RealFeelTemperature2(),
    @Json(name = "RealFeelTemperatureShade") var RealFeelTemperatureShade: RealFeelTemperatureShade2? = RealFeelTemperatureShade2(),
    @Json(name = "HoursOfSun") var HoursOfSun: Double? = null,
    @Json(name = "DegreeDaySummary") var DegreeDaySummary: DegreeDaySummary? = DegreeDaySummary(),
    @Json(name = "AirAndPollen") var AirAndPollen: List<AirAndPollen> = arrayListOf(),
    @Json(name = "Day") var Day: Day? = Day(),
    @Json(name = "Night") var Night: Night? = Night(),
    @Json(name = "Sources") var Sources: List<String> = arrayListOf(),
    @Json(name = "MobileLink") var MobileLink: String? = null,
    @Json(name = "Link") var Link: String? = null
)





