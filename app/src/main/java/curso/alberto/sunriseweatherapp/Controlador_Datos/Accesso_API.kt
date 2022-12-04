package curso.alberto.sunriseweatherapp.Controlador_Datos

import alfredo.retrofit.retrofit.QuotesApi
import alfredo.retrofit.retrofit.RetrofitHelper
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import com.alfredo.pruebarestapi.data_retrofit.DailyForecasts
import curso.alberto.sunriseweatherapp.`data-retrofit`.Previccion_5dias
import curso.alberto.sunriseweatherapp.presentation.composables.Next5daysForecast
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.json.JSONObject


class Accesso_API {

   //  val api_key = "0DwZcASkZifPFGyFHmaqzlgABglN1XG8"
   // val api_key = "sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5"
   //  val api_key = "FmuqdvGl48RxeNdzFSXGloPP2K36WJeA"
   // val api_key = "XVcZkQ5dxOjRGEHTU4daioSKlKVTLu5S"
    // val api_key = "0DwZcASkZifPFGyFHmaqzlgABglN1XG8"
   //  val api_key = "sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5"
   //  val api_key = "FmuqdvGl48RxeNdzFSXGloPP2K36WJeA"
     val api_key = "XVcZkQ5dxOjRGEHTU4daioSKlKVTLu5S"

    // val api_key = "Nik2Iq1iV0ME7ipjITGWlrQDS04tZgbw"

    @RequiresApi(Build.VERSION_CODES.O)
    var resultado: Datos_Tiempo = Datos_Tiempo()


    var datos_adquiridos: Boolean = false

    // Falta implementarlo
    fun cor_tiempo_posicion_gps(longitud: Float, latitud: Float) {

        val quotesApi = RetrofitHelper.getInstance().create(QuotesApi::class.java)
    }



    @RequiresApi(Build.VERSION_CODES.O)
    fun coger_tiempo_nombre(nombre: String) {


        val quotesApi = RetrofitHelper.getInstance().create(QuotesApi::class.java)

        // launching a new coroutine
        GlobalScope.launch {
            //      val busqueda = quotesApi.get_localidad_nombre(nombre, apikey = api_key)
            var nombreB = "sevilla"
            val busqueda = quotesApi.get_localidad_nombre(nombreB, apikey = api_key)
            val ciudades = busqueda.body()
            var key = "308526"
            //        key = ciudades?.get(0)?.Key.toString()


            val cond_act = quotesApi.get_condiciones_actuales(key, api_key, true, true).body()
            val prev_1day = quotesApi.get_prevision_1_dia(key, api_key, true, true).body()
            val prev_1h = quotesApi.get_prevision_1_hora(key, api_key, true, true).body()
            val prev_5d = quotesApi.get_prevision_5_dias(key, api_key, true, true).body()
            val prev_12h = quotesApi.get_prevision_12_horas(key, api_key, true, true).body()


            // Parte de la función donde se transforma los datos obtenidos por la Rest api
            // al modelo de datos que necesita la vista


            resultado.ciudad = ciudades?.get(0)?.localizedName

            // CARTA PRICIPAL
            resultado.temperatura_actual = cond_act?.get(0)?.Temperature?.Metric?.Value
            resultado.temperatura_maxima =
                prev_1day?.DailyForecasts?.get(0)?.Temperature?.Maximum?.Value
            resultado.temperatura_minima =
                prev_1day?.DailyForecasts?.get(0)?.Temperature?.Minimum?.Value
            resultado.unidades_temperatura =
                cond_act?.get(0)?.Temperature?.Metric?.UnitType.toString()
            resultado.icono = cond_act?.get(0)?.WeatherIcon
            resultado.icono_frase = cond_act?.get(0)?.WeatherText

            // DETALLES
            resultado.presion = cond_act?.get(0)?.Pressure?.Metric?.Value
            resultado.uv = cond_act?.get(0)?.UVIndex
            resultado.uv_text = cond_act?.get(0)?.UVIndexText
            resultado.humedad_relativa = cond_act?.get(0)?.RelativeHumidity
            resultado.viento = cond_act?.get(0)?.Wind?.Speed?.Metric?.Value
            resultado.direccion_viento = cond_act?.get(0)?.Wind?.Direction?.Localized


            // 12 HORAS
            resultado.hora_1 = prev_12h?.get(0)?.DateTime?.toString().toString()
            resultado.temperatura_hora_1 = prev_12h?.get(0)?.Temperature?.Value!!
            resultado.icono_hora_1 = prev_12h.get(0).WeatherIcon!!

            resultado.hora_2 = prev_12h.get(1).DateTime.toString()
            resultado.temperatura_hora_2 = prev_12h.get(1).Temperature?.Value!!
            resultado.icono_hora_2 = prev_12h.get(1).WeatherIcon!!

            resultado.hora_3 = prev_12h.get(2).DateTime.toString()
            resultado.temperatura_hora_3 = prev_12h.get(2).Temperature?.Value!!
            resultado.icono_hora_3 = prev_12h.get(2).WeatherIcon!!

            resultado.hora_4 = prev_12h?.get(3)?.DateTime.toString()
            resultado.temperatura_hora_4 = prev_12h.get(3).Temperature?.Value!!
            resultado.icono_hora_4 = prev_12h.get(3).WeatherIcon!!

            resultado.hora_5 = prev_12h.get(4).DateTime.toString()
            resultado.temperatura_hora_5 = prev_12h?.get(4)?.Temperature?.Value!!
            resultado.icono_hora_5 = prev_12h?.get(4)?.WeatherIcon!!

            resultado.hora_6 = prev_12h?.get(5)?.DateTime.toString()
            resultado.temperatura_hora_6 = prev_12h?.get(5)?.Temperature?.Value!!
            resultado.icono_hora_6 = prev_12h?.get(5)?.WeatherIcon!!

            resultado.hora_7 = prev_12h?.get(6)?.DateTime.toString()
            resultado.temperatura_hora_7 = prev_12h?.get(6)?.Temperature?.Value!!
            resultado.icono_hora_7 = prev_12h?.get(6)?.WeatherIcon!!

            resultado.hora_8 = prev_12h?.get(7)?.DateTime.toString()
            resultado.temperatura_hora_8 = prev_12h?.get(7)?.Temperature?.Value!!
            resultado.icono_hora_8 = prev_12h?.get(7)?.WeatherIcon!!

            resultado.hora_9 = prev_12h?.get(8)?.DateTime.toString()
            resultado.temperatura_hora_9 = prev_12h?.get(8)?.Temperature?.Value!!
            resultado.icono_hora_9 = prev_12h?.get(8)?.WeatherIcon!!

            resultado.hora_10 = prev_12h?.get(9)?.DateTime.toString()
            resultado.temperatura_hora_10 = prev_12h?.get(9)?.Temperature?.Value!!
            resultado.icono_hora_10 = prev_12h?.get(9)?.WeatherIcon!!

            resultado.hora_11 = prev_12h?.get(10)?.DateTime.toString()
            resultado.temperatura_hora_11 = prev_12h?.get(10)?.Temperature?.Value!!
            resultado.icono_hora_11 = prev_12h?.get(10)?.WeatherIcon!!

            resultado.hora_12 = prev_12h?.get(11)?.DateTime.toString()
            resultado.temperatura_hora_12 = prev_12h?.get(11)?.Temperature?.Value!!
            resultado.icono_hora_12 = prev_12h?.get(11)?.WeatherIcon!!

            // 5 dias
            resultado.fecha_dia_1 = prev_5d?.DailyForecasts?.get(0)?.Date.toString()
            resultado.frase_dia_1 = prev_5d?.DailyForecasts?.get(0)?.Day?.ShortPhrase.toString()
            resultado.icono_dia_1 = prev_5d?.DailyForecasts?.get(0)?.Day?.Icon!!
            resultado.Temp_max_dia_1 = prev_5d?.DailyForecasts?.get(0)?.Temperature?.Maximum?.Value!!
            resultado.Temp_min_dia_1 = prev_5d?.DailyForecasts?.get(0)?.Temperature?.Minimum?.Value!!

            resultado.fecha_dia_2 = prev_5d?.DailyForecasts?.get(1)?.Date.toString()
            resultado.frase_dia_2 = prev_5d?.DailyForecasts?.get(1)?.Day?.ShortPhrase.toString()
            resultado.icono_dia_2 = prev_5d?.DailyForecasts?.get(1)?.Day?.Icon!!
            resultado.Temp_max_dia_2 = prev_5d?.DailyForecasts?.get(1)?.Temperature?.Maximum?.Value!!
            resultado.Temp_min_dia_2 = prev_5d?.DailyForecasts?.get(1)?.Temperature?.Minimum?.Value!!

            resultado.fecha_dia_3 = prev_5d?.DailyForecasts?.get(2)?.Date.toString()
            resultado.frase_dia_3 = prev_5d?.DailyForecasts?.get(2)?.Day?.ShortPhrase.toString()
            resultado.icono_dia_3 = prev_5d?.DailyForecasts?.get(2)?.Day?.Icon!!
            resultado.Temp_max_dia_3 = prev_5d?.DailyForecasts?.get(2)?.Temperature?.Maximum?.Value!!
            resultado.Temp_min_dia_3 = prev_5d?.DailyForecasts?.get(2)?.Temperature?.Minimum?.Value!!

            resultado.fecha_dia_4 = prev_5d?.DailyForecasts?.get(3)?.Date.toString()
            resultado.frase_dia_4 = prev_5d?.DailyForecasts?.get(3)?.Day?.ShortPhrase.toString()
            resultado.icono_dia_4 = prev_5d?.DailyForecasts?.get(3)?.Day?.Icon!!
            resultado.Temp_max_dia_4 = prev_5d?.DailyForecasts?.get(3)?.Temperature?.Maximum?.Value!!
            resultado.Temp_min_dia_4 = prev_5d?.DailyForecasts?.get(3)?.Temperature?.Minimum?.Value!!

            resultado.fecha_dia_5 = prev_5d?.DailyForecasts?.get(4)?.Date.toString()
            resultado.frase_dia_5 = prev_5d?.DailyForecasts?.get(4)?.Day?.ShortPhrase.toString()
            resultado.icono_dia_5 = prev_5d?.DailyForecasts?.get(4)?.Day?.Icon!!
            resultado.Temp_max_dia_5 = prev_5d?.DailyForecasts?.get(4)?.Temperature?.Maximum?.Value!!
            resultado.Temp_min_dia_5 = prev_5d?.DailyForecasts?.get(4)?.Temperature?.Minimum?.Value!!



            datos_adquiridos = true
            Log.println(Log.ASSERT, "", resultado.toString())
        }
    }
}


/* Fin clase */




