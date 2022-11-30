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
    var lista_temperatura_hora: Double = 12.5,
    var lista_hora: String = "12:00",
    var lista_icono_hora: Int = 35,

    /*
       var lista_hora: String = ArrayList<String>().toString(),
       var lista_icono_hora: Int = ArrayList<Int>().size,
       var lista_temperatura_hora: Int = ArrayList<Double>().size,
    */



       // 5 dias

     var date_5days : String = "28 Nov",
     var icon_5days : Int = 18,
     var temperature_min_5days : Double = 18.2,
     var temperature_max_5days : Double = 23.0,
     var icon_frase_5days : String = "Sunny"

/*
    var date_5days : ArrayList<String> = ArrayList<String>(),
    var icon_5days : ArrayList<Int> = ArrayList<Int>(),
    var temperature_min_5days : ArrayList<Double> = ArrayList<Double>(),
    var temperature_max_5days : ArrayList<Double> = ArrayList<Double>(),
    var icon_frase_5days : ArrayList<String> = ArrayList()
            */



       )





