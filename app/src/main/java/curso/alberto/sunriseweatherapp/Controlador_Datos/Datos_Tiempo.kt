package curso.alberto.sunriseweatherapp.Controlador_Datos

import java.util.Date

data class Datos_Tiempo(
    var ciudad: String? = "Madrid",
    var temperatura_actual: Double? = 18.0,
    var temperatura_maxima: Double? = 12.0,
    var temperatura_minima: Double? = 6.0,
    var unidades_temperatura: String? = "grados",
    var presion: Double? = 1020.0,
    var direccion_viento: String? = "Sur",
    var viento: Double? = 30.0,
    var humedad_relativa: Double? = 50.0,
    var icono: Int? = 1,
    var uv: Int?= 4,
    var lista_temperatura_hora: ArrayList<Double> = ArrayList(),
    var lista_hora: ArrayList<Date> = ArrayList(),
    var lista_icono_hora: ArrayList<Int> = ArrayList(),
    )
