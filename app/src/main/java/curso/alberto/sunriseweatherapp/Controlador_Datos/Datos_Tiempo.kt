package curso.alberto.sunriseweatherapp.Controlador_Datos


import android.os.Build
import androidx.annotation.DrawableRes
import androidx.annotation.RequiresApi
import androidx.compose.ui.graphics.Color
import curso.alberto.sunriseweatherapp.R
import curso.alberto.sunriseweatherapp.ui.theme.GreyCard

data class Datos_Tiempo @RequiresApi(Build.VERSION_CODES.O) constructor(

    // Card principal
    var ciudad: String? = "Madrid",
    var temperatura_actual: Double? = 18.0,
    var temperatura_maxima: Double? = 12.0,
    var temperatura_minima: Double? = 6.0,
    var unidades_temperatura: String? = "grados",
    var icono: Int? = 1,
    var icono_frase: String? = "Cloudy",


    // Detalles
    var presion: Double? = 1020.0,
    var direccion_viento: String? = "Sur",
    var viento: Double? = 30.0,
    var uv: Int?= 4,
    var uv_text: String? = "Low",
    var humedad_relativa: Double? = 50.0,
    @DrawableRes val icon: Int? = R.drawable.img,
    val data: String? = "45",
    val units:String? = "km/h",
    val color: Color? = GreyCard,

    //12horas

    var hora_1: String = "12:00",
    var icono_hora_1: Int = 6,
    var temperatura_hora_1: Double = 22.5,

    var temperatura_hora_2: Double = 18.3,
    var hora_2: String = "12:00",
    var icono_hora_2: Int = 3,

    var temperatura_hora_3: Double = 18.3,
    var hora_3: String = "12:00",
    var icono_hora_3: Int = 3,

    var temperatura_hora_4: Double = 18.3,
    var hora_4: String = "12:00",
    var icono_hora_4: Int = 3,

    var temperatura_hora_5: Double = 18.3,
    var hora_5: String = "12:00",
    var icono_hora_5: Int = 3,

    var temperatura_hora_6: Double = 18.3,
    var hora_6: String = "12:00",
    var icono_hora_6: Int = 3,

    var temperatura_hora_7: Double = 18.3,
    var hora_7: String = "12:00",
    var icono_hora_7: Int = 3,

    var temperatura_hora_8: Double = 18.3,
    var hora_8: String = "12:00",
    var icono_hora_8: Int = 3,

    var temperatura_hora_9: Double = 18.3,
    var hora_9: String = "12:00",
    var icono_hora_9: Int = 3,

    var temperatura_hora_10: Double = 18.3,
    var hora_10: String = "12:00",
    var icono_hora_10: Int = 3,

    var temperatura_hora_11: Double = 18.3,
    var hora_11: String = "12:00",
    var icono_hora_11: Int = 3,

    var temperatura_hora_12: Double = 18.3,
    var hora_12: String = "12:00",
    var icono_hora_12: Int = 3,


    //5dias
    var fecha_dia_1: String = "",
    var frase_dia_1: String = "",
    var icono_dia_1: Int = 3,
    var Temp_max_dia_1: Double = 20.0,
    var Temp_min_dia_1: Double = 10.0,

    var fecha_dia_2: String = "",
    var frase_dia_2: String = "",
    var icono_dia_2: Int = 3,
    var Temp_max_dia_2: Double = 20.0,
    var Temp_min_dia_2: Double = 10.0,

    var fecha_dia_3: String = "",
    var frase_dia_3: String = "",
    var icono_dia_3: Int = 3,
    var Temp_max_dia_3: Double = 20.0,
    var Temp_min_dia_3: Double = 10.0,

    var fecha_dia_4: String = "",
    var frase_dia_4: String = "",
    var icono_dia_4: Int = 3,
    var Temp_max_dia_4: Double = 20.0,
    var Temp_min_dia_4: Double = 10.0,

    var fecha_dia_5: String = "",
    var frase_dia_5: String = "",
    var icono_dia_5: Int = 3,
    var Temp_max_dia_5: Double = 20.0,
    var Temp_min_dia_5: Double = 10.0,






       )





