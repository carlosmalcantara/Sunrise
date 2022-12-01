package curso.alberto.sunriseweatherapp.Controlador_Datos

import alfredo.retrofit.retrofit.QuotesApi_Tiempo
import alfredo.retrofit.retrofit.RetrofitHelper
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class Accesso_API {

      val api_key = "0DwZcASkZifPFGyFHmaqzlgABglN1XG8"
     //val api_key = "sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5"
     //val api_key = "FmuqdvGl48RxeNdzFSXGloPP2K36WJeA"
    //val api_key = "XVcZkQ5dxOjRGEHTU4daioSKlKVTLu5S"

    var resultado: Datos_Tiempo = Datos_Tiempo()


    var datos_adquiridos: Boolean = false

    // Falta implementarlo
    fun coger_tiempo_posicion_gps(longitud: Float, latitud: Float) {
        coger_datos("", longitud,latitud)
    }

    fun coger_tiempo_nombre(nombre: String) {
        coger_datos(nombre, 0.0f,0.0f)
    }

    fun coger_datos(nombre: String,longitud: Float, latitud: Float) {
        val quotesApi = RetrofitHelper.getInstance().create(QuotesApi_Tiempo::class.java)
        // launching a new coroutine
        GlobalScope.launch {
            var key = "308526"
            Log.println(Log.ASSERT, "", "Ciudad entregada:"+nombre)
            var ciudad_texto = "";
            if (nombre !="") {
                Log.println(Log.ASSERT, "", "Ciudad entregada por nombre:"+nombre)
                var busqueda = quotesApi.get_localidad_nombre(nombre, apikey = api_key)
                var ciudades = busqueda.body()
                key = ciudades?.get(0)?.Key.toString()
                Log.println(Log.ASSERT, "", "Key cogida por nombre:"+key)
                Log.println(Log.ASSERT, "", "Ciudad cogida por nombre:"+ciudades?.get(0)?.EnglishName)
                ciudad_texto = ciudades?.get(0)?.localizedName.toString()
            } else {
                var busqueda = quotesApi.get_localidad_geoposition(q = longitud.toString()+","+latitud.toString(),apikey = api_key)
                var ciudad = busqueda.body()
                key = ciudad?.Key.toString()
                Log.println(Log.ASSERT, "", "Ciudad cogida por geolocalización:"+ciudad?.localizedName)
                ciudad_texto = ciudad?.localizedName.toString()
            }

            val cond_act = quotesApi.get_condiciones_actuales(localidad = key, apikey = api_key, details = true, metric = true).body()
            val prev_1day = quotesApi.get_prevision_1_dia(localidad = key, apikey = api_key, details = true, metric = true).body()
            //val prev_1h = quotesApi.get_prevision_1_hora(localidad = key, apikey = api_key, details = true, metric = true).body()
            val prev_5d = quotesApi.get_prevision_5_dias(localidad = key, apikey = api_key, details = true, metric = true).body()
            val prev_12h = quotesApi.get_prevision_12_horas(localidad = key, apikey = api_key, details = true, metric = true).body()
            Log.println(Log.ASSERT, "", "key despues de llamadas: "+key)


            // Parte de la función donde se transforma los datos obtenidos por la Rest api
            // al modelo de datos que necesita la vista




            resultado.ciudad = nombre

            // CARTA PRICIPAL
            resultado.temperatura_actual = cond_act?.get(0)?.Temperature?.Metric?.Value
            resultado.temperatura_maxima = prev_1day?.DailyForecasts?.get(0)?.Temperature?.Maximum?.Value
            resultado.temperatura_minima = prev_1day?.DailyForecasts?.get(0)?.Temperature?.Minimum?.Value
            resultado.unidades_temperatura = cond_act?.get(0)?.Temperature?.Metric?.UnitType.toString()
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
            resultado.hora_1 = prev_12h?.get(0)?.DateTime.toString()
            resultado.temperatura_hora_1 = prev_12h?.get(0)?.Temperature?.Value!!
            resultado.icono_hora_1 = prev_12h?.get(0)?.WeatherIcon!!

            resultado.hora_2 = prev_12h?.get(1)?.DateTime.toString()
            resultado.temperatura_hora_2 = prev_12h?.get(1)?.Temperature?.Value!!
            resultado.icono_hora_2 = prev_12h?.get(1)?.WeatherIcon!!

            resultado.hora_3 = prev_12h?.get(2)?.DateTime.toString()
            resultado.temperatura_hora_3 = prev_12h?.get(2)?.Temperature?.Value!!
            resultado.icono_hora_3 = prev_12h?.get(2)?.WeatherIcon!!

            resultado.hora_4 = prev_12h?.get(3)?.DateTime.toString()
            resultado.temperatura_hora_4 = prev_12h?.get(3)?.Temperature?.Value!!
            resultado.icono_hora_5 = prev_12h?.get(3)?.WeatherIcon!!

            resultado.hora_5 = prev_12h?.get(4)?.DateTime.toString()
            resultado.temperatura_hora_5 = prev_12h?.get(4)?.Temperature?.Value!!
            resultado.icono_hora_5 = prev_12h?.get(4)?.WeatherIcon!!

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


/*
            if (prev_12h != null) {
                for (previccion_hora in prev_12h) {
                    resultado.lista_temperatura_hora.add(previccion_hora.Temperature?.Value.toString())
                    resultado.lista_hora.add(prev_12h?.get(4)?.DateTime.toString())
                    resultado.lista_temperatura_hora.add(prev_12h?.get(4)?.Temperature?.Value!!)
                    resultado.icono_hora.add(prev_12h?.get(4)?.WeatherIcon!!)
                }
            }

            if (prev_5d != null) {
                for (previccion in prev_5d?.DailyForecasts) {
                    resultado.lista_fecha_dia.add(prev_5d?.DailyForecasts?.get(0)?.Date.toString())
                    resultado.lista_frase_dia_5.add(prev_5d?.DailyForecasts?.get(0)?.Day?.ShortPhrase.toString())
                    resultado.lista_icono_dia_5.add(prev_5d?.DailyForecasts?.get(0)?.Day?.Icon!!)
                    resultado.lista_Temp_max_dia_5.add(prev_5d?.DailyForecasts?.get(0)?.Temperature?.Maximum?.Value!!)
                    resultado.lista_Temp_min_dia_5.add(prev_5d?.DailyForecasts?.get(0)?.Temperature?.Minimum?.Value!!)
                }
            }
*/





            datos_adquiridos = true
            Log.println(Log.ASSERT, "", "Los datos cogidos son : "+resultado.toString())
        }
    }


} // Fin clase