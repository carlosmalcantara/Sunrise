package com.example.pruebarestapi.data

import curso.alberto.sunriseweatherapp.`data-retrofit`.DailyForecasts

data class Previccion_Diaria(
    val Sources: String,
    val MobileLink: String,
    val Link: String,
    val Date: String,
    val EpochDate: Long,
    val sun: Sun,
    val dailyForecasts: DailyForecasts
)
