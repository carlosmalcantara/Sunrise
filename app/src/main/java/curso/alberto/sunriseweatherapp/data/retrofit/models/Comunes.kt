package com.alfredo.data.data_retrofit

import com.squareup.moshi.Json

data class Dato_Double (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Dato_double_Frase (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null,
    @Json(name = "Phrase") var Phrase: String? = null
)
data class Direction (
    @Json(name = "Degrees") var Degrees: Int?= null,
    @Json(name = "Localized") var Localized: String? = null,
    @Json(name = "English") var English: String? = null
)
data class Wind (
    @Json(name = "Speed") var Speed: Dato_Double? = Dato_Double(),
    @Json(name = "Direction") var Direction: Direction? = Direction()
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
data class DegreeDaySummary (
    @Json(name = "Heating") var Heating: Dato_Double? = Dato_Double(),
    @Json(name = "Cooling") var Cooling: Dato_Double? = Dato_Double()
)
data class AirAndPollen (
    @Json(name = "Name") var Name: String? = null,
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Category") var Category: String? = null,
    @Json(name = "CategoryValue") var CategoryValue: Int? = null,
    @Json(name = "Type") var Type: String? = null
)
data class Temperature (
    @Json(name = "Minimum") var Minimum: Dato_Double? = Dato_Double(),
    @Json(name = "Maximum") var Maximum: Dato_Double? = Dato_Double()
)
data class RealFeelTemperature (
    @Json(name = "Minimum") var Minimum: Dato_double_Frase? = Dato_double_Frase(),
    @Json(name = "Maximum") var Maximum: Dato_double_Frase? = Dato_double_Frase()
)
data class Metric_Imperial (
    @Json(name = "Metric") var Metric: Dato_Double? = Dato_Double(),
    @Json(name = "Imperial") var Imperial: Dato_Double? = Dato_Double()
)
data class HourRange (
    @Json(name = "Minimum") var Minimum: Metric_Imperial? = Metric_Imperial(),
    @Json(name = "Maximum") var Maximum: Metric_Imperial? = Metric_Imperial()
)
data class DailyForecasts (
    @Json(name = "Date") var Date: String? = null,
    @Json(name = "EpochDate") var EpochDate: Int? = null,
    @Json(name = "Sun") var Sun: Sun? = Sun(),
    @Json(name = "Moon") var Moon: Moon? = Moon(),
    @Json(name = "Temperature") var Temperature: Temperature? = Temperature(),
    @Json(name = "RealFeelTemperature") var RealFeelTemperature: RealFeelTemperature? = RealFeelTemperature(),
    @Json(name = "RealFeelTemperatureShade") var RealFeelTemperatureShade: RealFeelTemperature? = RealFeelTemperature(),
    @Json(name = "HoursOfSun") var HoursOfSun: Double? = null,
    @Json(name = "DegreeDaySummary") var DegreeDaySummary: DegreeDaySummary? = DegreeDaySummary(),
    @Json(name = "AirAndPollen") var AirAndPollen: List<AirAndPollen> = arrayListOf(),
    @Json(name = "Day") var Day: Day_Night? = Day_Night(),
    @Json(name = "Night") var Night: Day_Night? = Day_Night(),
    @Json(name = "Sources") var Sources: List<String> = arrayListOf(),
    @Json(name = "MobileLink") var MobileLink: String? = null,
    @Json(name = "Link") var Link: String? = null
)
data class Day_Night (
    @Json(name = "Icon") var Icon: Int? = null,
    @Json(name = "IconPhrase") var IconPhrase: String? = null,
    @Json(name = "HasPrecipitation") var HasPrecipitation: Boolean? = null,//this,day,night
    @Json(name = "PrecipitationType") var PrecipitationType: String? = null,
    @Json(name = "PrecipitationIntensity") var PrecipitationIntensity: String? = null,
    @Json(name = "ShortPhrase") var ShortPhrase: String? = null,
    @Json(name = "LongPhrase") var LongPhrase: String? = null,
    @Json(name = "PrecipitationProbability") var PrecipitationProbability: Int? = null,
    @Json(name = "ThunderstormProbability") var ThunderstormProbability: Int? = null,
    @Json(name = "RainProbability") var RainProbability: Int? = null,
    @Json(name = "SnowProbability") var SnowProbability: Int? = null,
    @Json(name = "IceProbability") var IceProbability: Int? = null,
    @Json(name = "Wind") var Wind: Wind? = Wind(),
    @Json(name = "WindGust") var WindGust: Wind? = Wind(),
    @Json(name = "TotalLiquid") var TotalLiquid: Dato_Double? = Dato_Double(),
    @Json(name = "Rain") var Rain: Dato_Double? = Dato_Double(),
    @Json(name = "Snow") var Snow: Dato_Double? = Dato_Double(),
    @Json(name = "Ice") var Ice: Dato_Double? = Dato_Double(),
    @Json(name = "HoursOfPrecipitation") var HoursOfPrecipitation: Double? = null,
    @Json(name = "HoursOfRain") var HoursOfRain: Double? = null,
    @Json(name = "HoursOfSnow") var HoursOfSnow: Int? = null,
    @Json(name = "HoursOfIce") var HoursOfIce: Int? = null,
    @Json(name = "CloudCover") var CloudCover: Int? = null,
    @Json(name = "Evapotranspiration") var Evapotranspiration: Dato_Double? = Dato_Double(),
    @Json(name = "SolarIrradiance") var SolarIrradiance: Dato_Double? = Dato_Double()
)






