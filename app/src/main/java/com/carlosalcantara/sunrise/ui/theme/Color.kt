package com.carlosalcantara.sunrise.ui.theme

import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val SunnyGreen = Color(0xFF47AB2F)
val CloudyBlue = Color(0xFF54717A)
val RainyGrey = Color(0xFF57575D)
val GreyCard = Color(0xFFF5F5F5)

val SecondaryButton: ButtonColors
    @Composable
    get() = ButtonDefaults.buttonColors(MaterialTheme.colors.secondary)