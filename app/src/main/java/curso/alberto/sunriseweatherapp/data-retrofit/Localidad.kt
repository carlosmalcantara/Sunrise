package com.alfredo.pruebarestapi.data_retrofit

import com.squareup.moshi.Json

data class Localidad(
    @Json(name = "Version")
    val Version: String,
    @Json(name = "Key")
    val Key: String,
    @Json(name = "Type")
    var Type: String,
    @Json(name = "Rank")
    val Rank: Long,
    @Json(name = "LocalizedName") var localizedName: String,
    @Json(name = "EnglishName") var EnglishName: String,
    @Json(name = "PrimaryPostalCode") var PrimaryPostalCode: String,
    @Json(name = "Region") var Region: RegionB? = RegionB(),
    @Json(name = "Country") var Country: CountryB?                          = CountryB(),
    @Json(name = "AdministrativeArea") var adminArea: AdministrativeAreaB?               = AdministrativeAreaB(),
    @Json(name = "TimeZone") var TimeZone               : TimeZone?                         = TimeZone(),
    @Json(name = "GeoPosition") var GeoPosition            : GeoPosition?                      = GeoPosition(),
    @Json(name = "IsAlias") var IsAlias                : Boolean?                          = null,
    //@Json(name = "SupplementalAdminAreas" ) var SupplementalAdminAreas : ArrayList<SupplementalAdminAreas> = arrayListOf(),
    //@Json(name = "DataSets") var dataSets: ArrayList<String>                 = arrayListOf()
)

data class RegionB (

    @Json(name = "ID") var ID            : String? = null,
    @Json(name = "LocalizedName" ) var LocalizedName : String? = null,
    @Json(name = "EnglishName"   ) var EnglishName   : String? = null

)

data class CountryB (

    @Json(name = "ID"            ) var ID            : String? = null,
    @Json(name = "LocalizedName" ) var LocalizedName : String? = null,
    @Json(name = "EnglishName"   ) var EnglishName   : String? = null

)

data class AdministrativeAreaB (

    @Json(name = "ID"            ) var ID            : String? = null,
    @Json(name = "LocalizedName" ) var LocalizedName : String? = null,
    @Json(name = "EnglishName"   ) var EnglishName   : String? = null,
    @Json(name = "Level"         ) var Level         : Int?    = null,
    @Json(name = "LocalizedType" ) var LocalizedType : String? = null,
    @Json(name = "EnglishType"   ) var EnglishType   : String? = null,
    @Json(name = "CountryID"     ) var CountryID     : String? = null

)

data class TimeZone (

    @Json(name = "Code"             ) var Code             : String?  = null,
    @Json(name = "Name"             ) var Name             : String?  = null,
    @Json(name = "GmtOffset"        ) var GmtOffset        : Int?     = null,
    @Json(name = "IsDaylightSaving" ) var IsDaylightSaving : Boolean? = null,
    @Json(name = "NextOffsetChange" ) var NextOffsetChange : String?  = null

)

data class Metric (

    @Json(name = "Value"    ) var Value    : Int?    = null,
    @Json(name = "Unit"     ) var Unit     : String? = null,
    @Json(name = "UnitType" ) var UnitType : Int?    = null

)

data class Elevation (

    @Json(name = "Metric"   ) var Metric   : Metric?   = Metric(),
    @Json(name = "Imperial" ) var Imperial : Metric? = Metric()

)

data class SupplementalAdminAreas (

    @Json(name = "Level"         ) var Level         : Int?    = null,
    @Json(name = "LocalizedName" ) var LocalizedName : String? = null,
    @Json(name = "EnglishName"   ) var EnglishName   : String? = null

)

data class GeoPosition (

    @Json(name = "Latitude"  ) var Latitude  : Double?    = null,
    @Json(name = "Longitude" ) var Longitude : Double?    = null,
    @Json(name = "Elevation" ) var Elevation : Elevation? = Elevation()

)





























