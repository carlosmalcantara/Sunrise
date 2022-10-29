package com.alfredo.pruebarestapi.data_retrofit

import com.squareup.moshi.Json

data class Autocompletado(
    @Json(name = "Version")
    var Version: Int? = null,

    @Json(name = "Key")
    var Key: String? = null,
    @Json(name = "Type")
    var Type: String? = null,
    @Json(name = "Rank")
    var Rank               : Int?                = null,
    @Json(name = "LocalizedName")
    var LocalizedName      : String?             = null,
    @Json(name = "Country")
    var Country            : Country?            = Country(),
    @Json(name = "AdministrativeArea")
    var AdministrativeArea : AdministrativeArea? = AdministrativeArea()
)


data class Country (

    @Json(name = "ID")
    var ID: String? = null,

    @Json(name = "LocalizedName")
    var LocalizedName : String? = null

)

data class AdministrativeArea (

    @Json(name = "ID")
    var ID: String? = null,

    @Json(name = "LocalizedName")
    var LocalizedName: String? = null

)



