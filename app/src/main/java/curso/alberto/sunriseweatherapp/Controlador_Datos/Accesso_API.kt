package curso.alfredo.controlador.Controlador_Datos

import alfredo.retrofit.retrofit.QuotesApi_Tiempo
import alfredo.retrofit.retrofit.RetrofitHelper
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class Accesso_API {

    /*
         Atributos de la clase
       -------------------------
    */

    /*
        Objeto de tipo Datos_Tiempo. Su función es entregar los datos obtenidos a la vista
     */
    var resultado: Datos_Tiempo = Datos_Tiempo()

    /*
        Bandera que indica que ya se ha adquirido los datos
    */
    var datos_adquiridos: Boolean = false

    /*
        Listas de api_key utilizadas para desarrollar el programa.
        Se poseen varias debido a la limitación en el número de llamadas diarias del servicio
        rest API, accuwheather.com .
     */
    //  val api_key = "0DwZcASkZifPFGyFHmaqzlgABglN1XG8"
    // val api_key = "sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5"
    //  val api_key = "FmuqdvGl48RxeNdzFSXGloPP2K36WJeA"
    // val api_key = "XVcZkQ5dxOjRGEHTU4daioSKlKVTLu5S"
    //  val api_key = "0DwZcASkZifPFGyFHmaqzlgABglN1XG8"
    //  val api_key = "sTXnwQ9l1WqKnDEZasnRTY4VYyRXb4R5"
    val api_key = "FmuqdvGl48RxeNdzFSXGloPP2K36WJeA"
    // val api_key = "XVcZkQ5dxOjRGEHTU4daioSKlKVTLu5S"
    // val api_key = "Nik2Iq1iV0ME7ipjITGWlrQDS04tZgbw"


    /*
        Funciones que sirven de interface para acceder a los datos
      --------------------------------------------------------------
     */

    /*
        Función para pedir los datos entregando como parametros la latitud y longitud.
     */
    @RequiresApi(Build.VERSION_CODES.O)
    fun coger_tiempo_posicion_gps(longitud: Float, latitud: Float) {
        coger_datos("", longitud,latitud,"")
    }

    /*
        Función para pedir los datos entregando como parametro el nombre de una localidad
     */
    @RequiresApi(Build.VERSION_CODES.O)
    fun coger_tiempo_nombre(nombre: String) {
        coger_datos(nombre, 0.0f,0.0f,"")
    }

    /*
        Función para pedir los datos entregando como parametro la eky de la localidad
        Nota: función pensada para cuando se terminé de implementar la bbdd, si se implementa
        esté dato en dicha bbdd.
     */
    @RequiresApi(Build.VERSION_CODES.O)
    fun coger_tiempo_key(key: String) {
        coger_datos("", 0.0f,0.0f,key)
    }


    /*
        Función que implementa la recogida de datos según los parametros de entrada.
        Entrega estos en el objeto resultado.
     */
    @RequiresApi(Build.VERSION_CODES.O)
    private fun coger_datos(nombre: String,longitud: Float, latitud: Float,p_key: String) {
        // Iniciamos la función por lo que aún no se ha traido los datos
        datos_adquiridos = false

        val quotesApi = RetrofitHelper.getInstance().create(QuotesApi_Tiempo::class.java)

        // Se lanza la corrutina que recoge los datos de la rest API
        GlobalScope.launch {

            /*
                Si no se accede correctamente a la ciudad para coger la key se establece
                ,por defecto, Madrid.
             */
            var key = "308526"
            var ciudad_texto = "Madrid"
            //Log.println(Log.ASSERT, "", "Ciudad entregada:"+nombre)

            /*
                Procesamiento de los parametros de entrada.
                Si se recibe un nombre se accede desde la función: coger_tiempo_nombre, que
                solamente envía el nombre de la localidad a buscar.
                Si se recibe una longitud y una latitud se accede desde la función:
                coger_tiempo_posicion_gps, que envía esos dos datos dejando vácios el nombre y la key.
                En estos dos casos se debe buscar la key de la localidad para poder buscar las
                condiciones actuales y la previciones climatológicas
                Si se recibe solamente la key se accede desde la función: coger_tiempo_key, en
                esté caso únicamente se recibe la key de la localidad por lo que no se realiza
                ninguna busqueda para buscar la key de la localidad.

             */
            if (nombre != "") {
                Log.println(Log.ASSERT, "", "Ciudad entregada por nombre:"+nombre)
                // Coger la respuesta del rest API de la consulta de localidad por nombre
                var respuesta = quotesApi.get_localidad_nombre(nombre, apikey = api_key)
                // Convertir la respuesta al objeto: List<Localidad>
                var ciudades = respuesta.body()
                key = ciudades?.get(0)?.Key.toString()
                ciudad_texto = ciudades?.get(0)?.localizedName.toString()
            } else {
                if (p_key == "") {
                    // Coger la respuesta del rest API de la consulta de localidad por geoposición (longitud y latitud)
                    var respuesta = quotesApi.get_localidad_geoposition(
                        q = longitud.toString() + "," + latitud.toString(),
                        apikey = api_key
                    )
                    // Convertir la respuesta al objeto: Localidad
                    var ciudad = respuesta.body()
                    key = ciudad?.Key.toString()
                    ciudad_texto = ciudad?.localizedName.toString()
                } else {
                    key = p_key
                }
            }

            /*
                Lectura de los datos necesarios para la vista del rest api
                * Se realiza la llamada al endpoint de condiciones actuales para recoger los
                  siguientes datos:
                    temperatura_actual, unidades_temperatura, icono, icono_frase, presion
                    uv, uv_text, humedad_relativa, viento,direccion_viento
                * Se realiza la llamada al endpoint de previccion 1 dia para recoger los siquientes
                  datos:
                    temperatura_maxima, temperatura_minima
                * Se realiza la llamada al endpoint de previccion 12 horas para recoger los
                  siquientes datos:
                    hora_1, temperatura_hora_1, icono_hora_1, hora_2, temperatura_hora_2, icono_hora_2,
                    hora_3, temperatura_hora_3, icono_hora_3, hora_4, temperatura_hora_4, icono_hora_4,
                    hora_6, temperatura_hora_5, icono_hora_5, hora_6, temperatura_hora_6, icono_hora_6,
                    hora_7, temperatura_hora_7, icono_hora_7, hora_8, temperatura_hora_8, icono_hora_8,
                    hora_9, temperatura_hora_9, icono_hora_9, hora_10, temperatura_hora_10, icono_hora_10,
                    hora_11, temperatura_hora_11, icono_hora_11, hora_12, temperatura_hora_12, icono_hora_12,
                    lista_hora, lista_temperatura_hora, icono_hora

                * Se realiza la llamada al endpoint de previccion 5dias para recoger los siquientes
                  datos:
                    fecha_dia_1, frase_dia_1, icono_dia_1, Temp_max_dia_1, Temp_min_dia_1,
                    fecha_dia_2, frase_dia_2, icono_dia_2, Temp_max_dia_2, Temp_min_dia_2,
                    fecha_dia_3, frase_dia_3, icono_dia_3, Temp_max_dia_3, Temp_min_dia_3,
                    fecha_dia_4, frase_dia_4, icono_dia_4, Temp_max_dia_4, Temp_min_dia_4,
                    fecha_dia_5, frase_dia_5, icono_dia_5, Temp_max_dia_5, Temp_min_dia_5
                    lista_fecha_dia, lista_frase_dia, lista_icono_dia, lista_Temp_max_dia,
                    lista_Temp_min_dia

             */

            // Coger la respuesta del rest API de la consulta de las condiciones actuales
            val respuesta_cond_act = quotesApi.get_condiciones_actuales(localidad = key, apikey = api_key, details = true, metric = true)
            // Convertir la respuesta al objeto: List<Condiciones>
            val cond_act = respuesta_cond_act.body()

            // Coger la respuesta del rest API de la consulta de la previción de 1 dia
            val respuesta_prev_1day = quotesApi.get_prevision_1_dia(localidad = key, apikey = api_key, details = true, metric = true)
            // Convertir la respuesta al objeto: Previccion
            val prev_1day = respuesta_prev_1day.body()

            // Coger la respuesta del rest API de la consulta de la previcción de 5 dias
            val respuesta_prev_5d = quotesApi.get_prevision_5_dias(localidad = key, apikey = api_key, details = true, metric = true)
            // Convertir la respuesta al objeto: Previccion_5dias
            val prev_5d = respuesta_prev_5d.body()

            // Coger la respuesta del rest API de la consulta de la previcción de 12 horas
            val respuesta_prev_12h = quotesApi.get_prevision_12_horas(localidad = key, apikey = api_key, details = true, metric = true)
            // Convertir la respuesta al objeto: List<Previccion_12Horas>
            val prev_12h = respuesta_prev_12h.body()


            /*
                A continuación se copia los datos necesarios obtenidos de las anteriores llamadas
                a los atributos del objeto resultado. Esté objeto se utiliza para pasar los datos
                a la capa de la vista.
             */

            resultado.ciudad = ciudad_texto

            // Pasar datos para la CARTA PRICIPAL
            if (cond_act?.get(0) != null) {
                resultado.temperatura_actual = cond_act?.get(0)?.Temperature?.Metric?.Value
                resultado.unidades_temperatura = cond_act?.get(0)?.Temperature?.Metric?.UnitType.toString()
                resultado.icono = cond_act?.get(0)?.WeatherIcon
                resultado.icono_frase = cond_act?.get(0)?.WeatherText
            }
            if (prev_1day != null) {
                resultado.temperatura_maxima = prev_1day?.DailyForecasts?.get(0)?.Temperature?.Maximum?.Value
                resultado.temperatura_minima = prev_1day?.DailyForecasts?.get(0)?.Temperature?.Minimum?.Value
            }

             // Pasar datos para los DETALLES
            if (cond_act?.get(0) != null) {
                resultado.presion = cond_act?.get(0)?.Pressure?.Metric?.Value
                resultado.uv = cond_act?.get(0)?.UVIndex
                resultado.uv_text = cond_act?.get(0)?.UVIndexText
                resultado.humedad_relativa = cond_act?.get(0)?.RelativeHumidity
                resultado.viento = cond_act?.get(0)?.Wind?.Speed?.Metric?.Value
                resultado.direccion_viento = cond_act?.get(0)?.Wind?.Direction?.Localized
            }

            // Pasar datos para las 12 HORAS
            if (prev_12h != null) {
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
            }

            // Pasar datos para los 5 dias
            if (prev_5d != null) {
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
            }

            /*
                Estos datos son los datos de las 12 horas y 5 días, en caso de que se implemente
                está parte de la vista con un bucle

             */
            if (prev_12h != null) {
                for (previccion_hora in prev_12h) {
                    resultado.lista_hora.add(prev_12h?.get(4)?.DateTime.toString())
                    resultado.lista_temperatura_hora.add(prev_12h?.get(4)?.Temperature?.Value!!)
                    resultado.icono_hora.add(prev_12h?.get(4)?.WeatherIcon!!)
                }
            }

            if (prev_5d != null) {
                for (previccion in prev_5d?.DailyForecasts) {
                    resultado.lista_fecha_dia.add(previccion?.Date.toString())
                    resultado.lista_frase_dia.add(previccion?.Day?.ShortPhrase.toString())
                    resultado.lista_icono_dia.add(previccion?.Day?.Icon!!)
                    resultado.lista_Temp_max_dia.add(previccion?.Temperature?.Maximum?.Value!!)
                    resultado.lista_Temp_min_dia.add(previccion?.Temperature?.Minimum?.Value!!)
                }
            }

            datos_adquiridos = true
        } // Llave de cierre de la corutina
    } // Llave de cierre de la función coger_datos


} // Llave de cierre de la clase