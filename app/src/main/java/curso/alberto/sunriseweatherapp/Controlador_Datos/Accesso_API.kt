package curso.alberto.sunriseweatherapp.Controlador_Datos

import alfredo.retrofit.retrofit.QuotesApi
import alfredo.retrofit.retrofit.RetrofitHelper
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.alfredo.pruebarestapi.data_retrofit.Localidad
import com.alfredo.pruebarestapi.data_retrofit.Temperature
import curso.alberto.sunriseweatherapp.data.Datos_Tiempo
import curso.alberto.sunriseweatherapp.data.WeatherApi.Main
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class Accesso_API {

    val api_key = "sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5"

    var resultado: Datos_Tiempo = Datos_Tiempo()

    var datos_adquiridos: Boolean = false

    // Falta implementarlo
    fun cor_tiempo_posicion_gps(longitud: Float ,latitud: Float){

        val quotesApi = RetrofitHelper.getInstance().create(QuotesApi::class.java)


    }

    fun coger_tiempo_nombre(nombre: String) {


        val quotesApi = RetrofitHelper.getInstance().create(QuotesApi::class.java)

        // launching a new coroutine
        GlobalScope.launch {
            val nombreb="Segovia"
            val busqueda = quotesApi.get_localidad_nombre(nombreb, apikey = api_key)

            val ciudades = busqueda.body()
            var key = ""
            key = ciudades?.get(0)?.Key.toString()



            val cond_act = quotesApi.get_condiciones_actuales(key,api_key).body()
            //val prev_1day = quotesApi.get_prevision_1_dia(key, api_key).body()
            //val prev_1h = quotesApi.get_prevision_1_hora(key,api_key).body()

            // Parte de la función donde se transforma los datos obtenidos por la Rest api
            // al modelo de datos que necesita la vista

            resultado.temperatura_actual = cond_act?.get(0)?.Temperature?.Metric?.Value
            resultado.ciudad = ciudades?.get(0)?.EnglishName

            //val prev_5d = quotesApi.get_prevision_5_dias(key,api_key)
            poner_datos()
            Log.println(Log.ASSERT,"ciudades",ciudades.toString())
            //Log.println(Log.ASSERT,"", key.toString())
            Log.println(Log.ASSERT,"", key.toString())
            Log.println(Log.ASSERT,"", resultado.toString())
            Log.println(Log.ASSERT,"", busqueda.toString())
            Log.println(Log.ASSERT,"", cond_act.toString())
            //Log.println(Log.ASSERT,"", prev_1h.toString())
            //Log.println(Log.ASSERT,"", prev_5d.toString())
        }
    }

    fun poner_datos() {
        resultado.direccion_viento="Norte superNorte"
        datos_adquiridos = true
    }

} // Fin clase