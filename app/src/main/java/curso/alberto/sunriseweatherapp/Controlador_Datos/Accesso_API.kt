package curso.alberto.sunriseweatherapp.Controlador_Datos

import alfredo.retrofit.retrofit.QuotesApi
import alfredo.retrofit.retrofit.RetrofitHelper
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class Accesso_API {

    val api_key1 = "0DwZcASkZifPFGyFHmaqzlgABglN1XG8"
    val api_key3 = "sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5"
    val api_key2 = "FmuqdvGl48RxeNdzFSXGloPP2K36WJeA"
    val api_key = "XVcZkQ5dxOjRGEHTU4daioSKlKVTLu5S"

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
            val busqueda = quotesApi.get_localidad_nombre(nombre, apikey = api_key)
            val ciudades = busqueda.body()
            var key = "308526"
            key = ciudades?.get(0)?.Key.toString()



            val cond_act = quotesApi.get_condiciones_actuales(key,api_key,true,true).body()
            val prev_1day = quotesApi.get_prevision_1_dia(key, api_key,true,true).body()
            val prev_1h = quotesApi.get_prevision_1_hora(key,api_key,true,true).body()
            val prev_5d = quotesApi.get_prevision_5_dias(key,api_key,true,true).body()
            val prev_12h = quotesApi.get_prevision_12_horas(key,api_key,true,true).body()


            // Parte de la función donde se transforma los datos obtenidos por la Rest api
            // al modelo de datos que necesita la vista


            resultado.ciudad = ciudades?.get(0)?.localizedName


            resultado.temperatura_actual = cond_act?.get(0)?.Temperature?.Metric?.Value

            resultado.temperatura_maxima =  prev_1day?.DailyForecasts?.get(0)?.Temperature?.Maximum?.Value
            resultado.temperatura_minima = prev_1day?.DailyForecasts?.get(0)?.Temperature?.Minimum?.Value

            /// Falta conver unittype a texto
            resultado.unidades_temperatura = cond_act?.get(0)?.Temperature?.Metric?.UnitType.toString()

            resultado.viento = cond_act?.get(0)?.Wind?.Speed?.Metric?.Value
            resultado.direccion_viento = cond_act?.get(0)?.Wind?.Direction?.Localized

            resultado.humedad_relativa = cond_act?.get(0)?.RelativeHumidity

            resultado.icono = 1

            resultado.presion = cond_act?.get(0)?.Pressure?.Metric?.Value
            resultado.uv=cond_act?.get(0)?.UVIndex

            if (prev_12h != null) {
                for (previccion_hora in prev_12h) {
                    val a = previccion_hora.Temperature?.Value
                    resultado.lista_temperatura_hora.add(previccion_hora.Temperature?.Value!!)
                    //resultado.lista_hora.add()
                    //resultado.lista_icono_hora.add(1)
                }
            }




            datos_adquiridos = true
            Log.println(Log.ASSERT,"", resultado.toString())
        }
    }


} // Fin clase