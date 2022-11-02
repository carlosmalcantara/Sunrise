package curso.alberto.sunriseweatherapp.Controlador_Datos

import alfredo.retrofit.retrofit.QuotesApi
import alfredo.retrofit.retrofit.RetrofitHelper
import android.util.Log
import curso.alberto.sunriseweatherapp.data.WeatherApi.Main
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

//val result = quotesApi.get_Regions("sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
//val result = quotesApi.get_Paises("EUR","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
//val result = quotesApi.get_regiones_Paises("ES","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
//val result = quotesApi.get_autocomplete( "mad","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
//val result = quotesApi.get_localidad_locationkey( "308526","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
//val result = quotesApi.get_localidad_nombre("madrid","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
//val result = quotesApi.get_condiciones_actuales("308526","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
//val result = quotesApi.get_condiciones_actuales_6("308526","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
//val result = quotesApi.get_condiciones_actuales_24("308526","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
//val result = quotesApi.get_localidad_geoposition("40.4,-3.5","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
//val result = quotesApi.get_prevision_1_dia("308526","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
//val result = quotesApi.get_prevision_5_dias("308526","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
//val result = quotesApi.get_prevision_1_hora("308526","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")
//val result = quotesApi.get_prevision_12_horas("308526","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")

class Accesso_API {

    val api_key = "sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5"

    fun coger_tiempo_nombre(nombre: String): Main {

        val resultado: Main = Main(0,0,0,0.0,0.0,0.0)

        val quotesApi = RetrofitHelper.getInstance().create(QuotesApi::class.java)

        // launching a new coroutine
        GlobalScope.launch {
            Log.println(Log.ASSERT,"ll","ll")

            val result = quotesApi.get_localidad_nombre("madrid","sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5")

            val ciudades = result.body()
            val loc_key = ciudades?.get(0)?.key
            val key: String
            if (loc_key != null) {
                key = loc_key
            } else {
                key=""
            }

            val cond_act = quotesApi.get_condiciones_actuales(key,api_key)
            val cond_act_6 = quotesApi.get_condiciones_actuales_6(key,api_key)
            val cond_act_24 = quotesApi.get_condiciones_actuales_24(key,api_key)
            val prev_1h = quotesApi.get_prevision_1_hora(key,api_key)
            val prev_12h = quotesApi.get_prevision_12_horas(key,api_key)
            //val prev_1d = quotesApi.get_prevision_1_dia(key,api_key)
            //val prev_5d = quotesApi.get_prevision_5_dias(key,api_key)

        }
        return resultado

    }

} // Fin clase