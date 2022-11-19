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
    @Json(name = "Temperature") var Temperature: Temperature? = Temperature(),
    @Json(name = "RealFeelTemperature") var RealFeelTemperature: RealFeelTemperature? = RealFeelTemperature(),
    @Json(name = "RealFeelTemperatureShade") var RealFeelTemperatureShade: RealFeelTemperatureShade? = RealFeelTemperatureShade(),
    @Json(name = "RelativeHumidity") var RelativeHumidity: Double? = null,
    @Json(name = "IndoorRelativeHumidity") var IndoorRelativeHumidity: Double? = null,
    @Json(name = "DewPoint") var DewPoint: DewPoint? = DewPoint(),
    @Json(name = "Wind") var Wind: Wind? = Wind(),
    @Json(name = "WindGust") var WindGust: WindGust? = WindGust(),
    @Json(name = "UVIndex") var UVIndex: Int? = null,
    @Json(name = "UVIndexText") var UVIndexText: String? = null,
    @Json(name = "Visibility") var Visibility: Visibility? = Visibility(),
    @Json(name = "ObstructionsToVisibility") var ObstructionsToVisibility: String? = null,
    @Json(name = "CloudCover") var CloudCover: Int? = null,
    @Json(name = "Ceiling") var Ceiling: Ceiling? = Ceiling(),
    @Json(name = "Pressure") var Pressure: Pressure? = Pressure(),
    @Json(name = "PressureTendency") var PressureTendency: PressureTendency? = PressureTendency(),
    @Json(name = "Past24HourTemperatureDeparture") var Past24HourTemperatureDeparture: Past24HourTemperatureDeparture? = Past24HourTemperatureDeparture(),
    @Json(name = "ApparentTemperature") var ApparentTemperature: ApparentTemperature? = ApparentTemperature(),
    @Json(name = "WindChillTemperature") var WindChillTemperature: WindChillTemperature? = WindChillTemperature(),
    @Json(name = "WetBulbTemperature") var WetBulbTemperature: WetBulbTemperature? = WetBulbTemperature(),
    @Json(name = "Precip1hr") var Precip1hr: Precip1hr? = Precip1hr(),
    @Json(name = "PrecipitationSummary") var PrecipitationSummary: PrecipitationSummary? = PrecipitationSummary(),
    @Json(name = "TemperatureSummary") var TemperatureSummary: TemperatureSummary? = TemperatureSummary(),
    @Json(name = "MobileLink") var MobileLink: String? = null,
    @Json(name = "Link") var Link: String? = null
)
data class Metric1 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial1 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Temperature (
    @Json(name = "Metric") var Metric: Metric1? = Metric1(),
    @Json(name = "Imperial") var Imperial: Imperial1? = Imperial1()
)
data class Metric2 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null,
    @Json(name = "Phrase") var Phrase: String? = null
)
data class Imperial2 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null,
    @Json(name = "Phrase") var Phrase: String? = null
)
data class RealFeelTemperature (
    @Json(name = "Metric") var Metric: Metric2? = Metric2(),
    @Json(name = "Imperial") var Imperial: Imperial2? = Imperial2()
)
data class Metric3 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null,
    @Json(name = "Phrase") var Phrase: String? = null
)
data class Imperial3 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null,
    @Json(name = "Phrase") var Phrase: String? = null
)
data class RealFeelTemperatureShade (
    @Json(name = "Metric") var Metric: Metric3? = Metric3(),
    @Json(name = "Imperial") var Imperial: Imperial3? = Imperial3()
)
data class Metric4 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial4 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class DewPoint (
    @Json(name = "Metric") var Metric: Metric4? = Metric4(),
    @Json(name = "Imperial") var Imperial: Imperial4? = Imperial4()
)
data class Direction (
    @Json(name = "Degrees") var Degrees: Int? = null,
    @Json(name = "Localized") var Localized: String? = null,
    @Json(name = "English") var English: String? = null
)
data class Metric5 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial5 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Speed13 (
    @Json(name = "Metric") var Metric: Metric5? = Metric5(),
    @Json(name = "Imperial") var Imperial: Imperial5? = Imperial5()
)
data class Wind (
    @Json(name = "Direction") var Direction: Direction? = Direction(),
    @Json(name = "Speed") var Speed: Speed13? = Speed13()
)
data class Metric6 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial6 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Speed (
    @Json(name = "Metric") var Metric: Metric6? = Metric6(),
    @Json(name = "Imperial") var Imperial: Imperial6? = Imperial6()
)
data class WindGust (
    @Json(name = "Speed") var Speed: Speed? = Speed()
)
data class Metric7 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial7 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Visibility (
    @Json(name = "Metric") var Metric: Metric7? = Metric7(),
    @Json(name = "Imperial") var Imperial: Imperial7? = Imperial7()
)
data class Metric8 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial8 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Ceiling (
    @Json(name = "Metric") var Metric: Metric8? = Metric8(),
    @Json(name = "Imperial") var Imperial: Imperial8? = Imperial8()
)
data class Metric9 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial9 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Pressure (
    @Json(name = "Metric") var Metric: Metric9? = Metric9(),
    @Json(name = "Imperial") var Imperial: Imperial9? = Imperial9()
)
data class PressureTendency (
    @Json(name = "LocalizedText") var LocalizedText: String? = null,
    @Json(name = "Code") var Code: String? = null
)
data class Metric10 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial10 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Past24HourTemperatureDeparture (
    @Json(name = "Metric") var Metric: Metric10? = Metric10(),
    @Json(name = "Imperial") var Imperial: Imperial10? = Imperial10()
)
data class Metric11 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial11 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class ApparentTemperature (
    @Json(name = "Metric") var Metric: Metric11? = Metric11(),
    @Json(name = "Imperial") var Imperial: Imperial11? = Imperial11()
)
data class Metric12 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial12 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class WindChillTemperature (
    @Json(name = "Metric") var Metric: Metric12? = Metric12(),
    @Json(name = "Imperial") var Imperial: Imperial12? = Imperial12()
)
data class Metric13 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial13 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class WetBulbTemperature (
    @Json(name = "Metric") var Metric: Metric13? = Metric13(),
    @Json(name = "Imperial") var Imperial: Imperial13? = Imperial13()
)
data class Metric14 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial14 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Precip1hr (
    @Json(name = "Metric") var Metric: Metric14? = Metric14(),
    @Json(name = "Imperial") var Imperial: Imperial14? = Imperial14()
)
data class Metric15 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial15 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Precipitation (
    @Json(name = "Metric") var Metric: Metric15? = Metric15(),
    @Json(name = "Imperial") var Imperial: Imperial15? = Imperial15()
)
data class Metric16 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial16 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class PastHour (
    @Json(name = "Metric") var Metric: Metric16? = Metric16(),
    @Json(name = "Imperial") var Imperial: Imperial16? = Imperial16()
)
data class Metric17 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial17 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Past3Hours (
    @Json(name = "Metric") var Metric: Metric17? = Metric17(),
    @Json(name = "Imperial") var Imperial: Imperial17? = Imperial17()
)
data class Metric18 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial18 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Past6Hours (
    @Json(name = "Metric") var Metric: Metric18? = Metric18(),
    @Json(name = "Imperial") var Imperial: Imperial18? = Imperial18()
)
data class Metric19 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial19 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Past9Hours (
    @Json(name = "Metric") var Metric: Metric19? = Metric19(),
    @Json(name = "Imperial") var Imperial: Imperial19? = Imperial19()
)
data class Metric20 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial20 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Past12Hours (
    @Json(name = "Metric") var Metric: Metric20? = Metric20(),
    @Json(name = "Imperial") var Imperial: Imperial20? = Imperial20()
)
data class Metric21 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial21 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Past18Hours (
    @Json(name = "Metric") var Metric: Metric21? = Metric21(),
    @Json(name = "Imperial") var Imperial: Imperial21? = Imperial21()
)
data class Metric22 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial22 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Past24Hours (
    @Json(name = "Metric") var Metric: Metric22? = Metric22(),
    @Json(name = "Imperial") var Imperial: Imperial22? = Imperial22()
)
data class PrecipitationSummary (
    @Json(name = "Precipitation") var Precipitation: Precipitation? = Precipitation(),
    @Json(name = "PastHour") var PastHour: PastHour? = PastHour(),
    @Json(name = "Past3Hours") var Past3Hours: Past3Hours? = Past3Hours(),
    @Json(name = "Past6Hours") var Past6Hours: Past6Hours? = Past6Hours(),
    @Json(name = "Past9Hours") var Past9Hours: Past9Hours? = Past9Hours(),
    @Json(name = "Past12Hours") var Past12Hours: Past12Hours? = Past12Hours(),
    @Json(name = "Past18Hours") var Past18Hours: Past18Hours? = Past18Hours(),
    @Json(name = "Past24Hours") var Past24Hours: Past24Hours? = Past24Hours()
)
data class Metric23 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial23 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Minimum7 (
    @Json(name = "Metric") var Metric: Metric23? = Metric23(),
    @Json(name = "Imperial") var Imperial: Imperial23? = Imperial23()
)
data class Metric24 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial24 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Maximum7 (
    @Json(name = "Metric") var Metric: Metric24? = Metric24(),
    @Json(name = "Imperial") var Imperial: Imperial24? = Imperial24()
)
data class Past6HourRange (
    @Json(name = "Minimum") var Minimum: Minimum7? = Minimum7(),
    @Json(name = "Maximum") var Maximum: Maximum7? = Maximum7()
)
data class Metric25 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial25 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Minimum8 (
    @Json(name = "Metric") var Metric: Metric25? = Metric25(),
    @Json(name = "Imperial") var Imperial: Imperial25? = Imperial25()
)
data class Metric26 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial26 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Maximum8 (
    @Json(name = "Metric") var Metric: Metric26? = Metric26(),
    @Json(name = "Imperial") var Imperial: Imperial26? = Imperial26()
)
data class Past12HourRange (
    @Json(name = "Minimum") var Minimum: Minimum8? = Minimum8(),
    @Json(name = "Maximum") var Maximum: Maximum8? = Maximum8()
)
data class Metric27 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial27 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Minimum (
    @Json(name = "Metric") var Metric: Metric27? = Metric27(),
    @Json(name = "Imperial") var Imperial: Imperial27? = Imperial27()
)
data class Metric28 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Imperial28 (
    @Json(name = "Value") var Value: Double? = null,
    @Json(name = "Unit") var Unit: String? = null,
    @Json(name = "UnitType") var UnitType: Int? = null
)
data class Maximum (
    @Json(name = "Metric") var Metric: Metric28? = Metric28(),
    @Json(name = "Imperial") var Imperial: Imperial28? = Imperial28()
)
data class Past24HourRange (
    @Json(name = "Minimum") var Minimum: Minimum? = Minimum(),
    @Json(name = "Maximum") var Maximum: Maximum? = Maximum()
)
data class TemperatureSummary (
    @Json(name = "Past6HourRange") var Past6HourRange: Past6HourRange? = Past6HourRange(),
    @Json(name = "Past12HourRange") var Past12HourRange: Past12HourRange? = Past12HourRange(),
    @Json(name = "Past24HourRange") var Past24HourRange: Past24HourRange? = Past24HourRange()
)

