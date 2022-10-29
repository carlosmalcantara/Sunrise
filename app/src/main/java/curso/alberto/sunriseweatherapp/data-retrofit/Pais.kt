package com.alfredo.pruebarestapi.data_retrofit

import com.google.gson.annotations.SerializedName

data class Pais(
    @SerializedName("ID")
    var ID: String? = null,

    @SerializedName("LocalizedName")
    var LocalizedName: String? = null,

    @SerializedName("EnglishName")
    var EnglishName: String? = null

)