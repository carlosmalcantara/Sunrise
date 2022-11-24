package curso.alberto.sunriseweatherapp.Controlador_Datos


import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

import curso.alberto.sunriseweatherapp.ui.theme.GreyCard
import java.util.Date

data class Datos_Tiempo(
    var ciudad: String? = "",
    var temperatura_actual: Double? = 18.0,
    var temperatura_maxima: Double? = 12.0,
    var temperatura_minima: Double? = 6.0,
    var unidades_temperatura: String? = "grados",


    var icono: Int? = 1,
    var icono_frase: String? = "Cloudy",


    //12horas
    var lista_temperatura_hora: Double = 18.3,
    var lista_hora: String = "12:00",
    var lista_icono_hora: Int = 3,



    // Detalles
    var presion: Double? = 1020.0,
    var direccion_viento: String? = "Sur",
    var viento: Double? = 30.0,
    var uv: Int?= 4,
    var uv_text: String? = "Low",
    var humedad_relativa: Double? = 50.0,

    //@DrawableRes val icon: Int? = 4,
    val data: String? = "45",
    val units:String? = "km/h",
    val color: Color? = GreyCard,




    )
