package curso.alberto.sunriseweatherapp.data

import com.squareup.moshi.Json

data class Datos_Tiempo(
    var ciudad: String? = "Madrid",
    var temperatura_actual: Double? = 18.0,
    var temperatura_maxima: Int? = 18,
    var temperatura_minima: Int? = 18,
    var unidades_temperatura: String? = "grados",
    var direccion_viento: String? = "Sur",
    var humedad_relativa: Double? = 50.0,
    var icono: Int? = 1,
    //var lista_temperatura_hora: List<Int>? = List<Int>()
    )
