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

    // val api_key = "0DwZcASkZifPFGyFHmaqzlgABglN1XG8"
   // val api_key = "sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5"
    // val api_key = "FmuqdvGl48RxeNdzFSXGloPP2K36WJeA"
    // val api_key = "XVcZkQ5dxOjRGEHTU4daioSKlKVTLu5S"
    val api_key = "0DwZcASkZifPFGyFHmaqzlgABglN1XG8"
    // val api_key = "sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5"
    //val api_key = "FmuqdvGl48RxeNdzFSXGloPP2K36WJeA"
    // val api_key = "XVcZkQ5dxOjRGEHTU4daioSKlKVTLu5S"

    // val api_key = "jhaqd"

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
            /*
            if (prev_12h != null) {
                for (previccion_hora in prev_12h) {
                    val d = previccion_hora.DateTime
                    val i = previccion_hora.WeatherIcon!!
                    val t = previccion_hora.Temperature?.Value!!

                    resultado.lista_hora = d.toString()
                    if (i != null) resultado.lista_icono_hora = i
                    resultado.lista_temperatura_hora = t.toDouble().toInt()
                }
                return@launch
                resultado.lista_hora
                resultado.lista_icono_hora
                resultado.lista_temperatura_hora
                }
            }

             */


            // 5 dias
            /*
            val list_5days = ArrayList<Datos_Tiempo>()
            val mainObject = JSONObject()
            val days = mainObject.getJSONObject("Previccion_5dias").getJSONObject("DailyForecasts")
            if(prev_5d != null) {
                for (i in 0 until days.length()) {
                        resultado.date_5days = prev_5d.DailyForecasts[0].Date.toString()
                        resultado.icon_5days = prev_5d.DailyForecasts[0].Day?.Icon!!
                        resultado.temperature_min_5days = prev_5d.DailyForecasts[0].Temperature?.Minimum?.Value!!
                        resultado.temperature_max_5days = prev_5d.DailyForecasts[0].Temperature?.Maximum?.Value!!
                        resultado.icon_frase_5days = prev_5d.DailyForecasts[0].Day?.IconPhrase.toString()
                }
            }
*/
            var forecast5days = ArrayList<Previccion_5dias>()
            for (i in  forecast5days ) {
                if (prev_5d != null) {
                    resultado.date_5days = prev_5d.DailyForecasts[0].Date.toString()
                }
                if (prev_5d != null) {
                    resultado.icon_5days = prev_5d.DailyForecasts[0].Day?.Icon!!
                }
                if (prev_5d != null) {
                    resultado.temperature_min_5days =
                        prev_5d.DailyForecasts[0].Temperature?.Minimum?.Value!!
                }
                if (prev_5d != null) {
                    resultado.temperature_max_5days =
                        prev_5d.DailyForecasts[0].Temperature?.Maximum?.Value!!
                }
                if (prev_5d != null) {
                    resultado.icon_frase_5days =
                        prev_5d.DailyForecasts[0].Day?.IconPhrase.toString()
                }
            }



            datos_adquiridos = true
            Log.println(Log.ASSERT, "", resultado.toString())
        }
    }
}


/* Fin clase */




