package com.example.pruebarestapi.data

import java.util.Date

data class TimeZone(
    val Code:String,
    val Name:String,
    val GmtOffset: Int,
    val IsDaylightSaving: Boolean,
    val NextOffsetChange: Date
)
