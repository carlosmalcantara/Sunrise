package com.example.pruebarestapi.data

data class Resumen_Temperatura(
    val Past6HourRange: Temperatura_Min_Max,
    val Past12HourRange: Temperatura_Min_Max,
    val Past24HourRange: Temperatura_Min_Max
)
