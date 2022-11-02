package com.alfredo.pruebarestapi.data_retrofit

import com.squareup.moshi.Json


data class Previccion(

    @Json(name = "Headline"       ) var Headline       : Headline?                 = Headline(),
    @Json(name = "DailyForecasts" ) var DailyForecasts : ArrayList<DailyForecasts> = arrayListOf()

)

data class Headline (

    @Json(name = "EffectiveDate"      ) var EffectiveDate      : String? = null,
    @Json(name = "EffectiveEpochDate" ) var EffectiveEpochDate : Int?    = null,
    @Json(name = "Severity"           ) var Severity           : Int?    = null,
    @Json(name = "Text"               ) var Text               : String? = null,
    @Json(name = "Category"           ) var Category           : String? = null,
    @Json(name = "EndDate"            ) var EndDate            : String? = null,
    @Json(name = "EndEpochDate"       ) var EndEpochDate       : Int?    = null,
    @Json(name = "MobileLink"         ) var MobileLink         : String? = null,
    @Json(name = "Link"               ) var Link               : String? = null

)

data class Minimum (

    @Json(name = "Value"    ) var Value    : Int?    = null,
    @Json(name = "Unit"     ) var Unit     : String? = null,
    @Json(name = "UnitType" ) var UnitType : Int?    = null

)

data class Maximum (

    @Json(name = "Value"    ) var Value    : Int?    = null,
    @Json(name = "Unit"     ) var Unit     : String? = null,
    @Json(name = "UnitType" ) var UnitType : Int?    = null

)

data class DailyForecasts (

    @Json(name = "Date") var date: String?           = null,
    @Json(name = "EpochDate") var epochDate   : Int?              = null,
    @Json(name = "Temperature" ) var temperature : TemperatureC?      = TemperatureC(),
    @Json(name = "Day"         ) var day         : Day?              = Day(),
    @Json(name = "Night"       ) var night       : Night?            = Night(),
    @Json(name = "Sources"     ) var sources     : ArrayList<String> = arrayListOf(),
    @Json(name = "MobileLink"  ) var mobileLink  : String?           = null,
    @Json(name = "Link"        ) var link        : String?           = null

)
data class TemperatureC (

    @Json(name = "Minimum" ) var Minimum : Minimum? = Minimum(),
    @Json(name = "Maximum" ) var Maximum : Maximum? = Maximum()

)

data class Day (

    @Json(name = "Icon"             ) var Icon             : Int?     = null,
    @Json(name = "IconPhrase"       ) var IconPhrase       : String?  = null,
    @Json(name = "HasPrecipitation" ) var HasPrecipitation : Boolean? = null

)

data class Night (

    @Json(name = "Icon"             ) var icon             : Int?     = null,
    @Json(name = "IconPhrase"       ) var iconPhrase       : String?  = null,
    @Json(name = "HasPrecipitation" ) var hasPrecipitation : Boolean? = null

)



