package curso.alfredo.controlador.Controlador_Datos

import alfredo.retrofit.retrofit.*
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Localizacion_IP() {
    //var url:String = "https://api.myip.com" // Coger ip
    // {"ip":"2a02:2e02:26c6:5f00:e875:615e:70c1:f773","country":"Spain","cc":"ES"}
    //var ulr_geo = "http://ip-api.com/json/2a02:2e02:26c6:5f00:e875:615e:70c1:f773" // coge geolocalizacion
    // {"status":"success","country":"Spain","countryCode":"ES","region":"MD","regionName":"Madrid","city":"Alcobendas","zip":"28100","lat":40.5458,"lon":-3.6443,"timezone":"Europe/Madrid","isp":"Orange Espagne SA","org":"Jazz Telecom S.A","as":"AS12479 Orange Espagne SA","query":"2a02:2e02:26c6:5f00:e875:615e:70c1:f773"}
    var datos_adquiridos: Boolean = false
    var nombre: String = ""

    fun localizar() {
        val quotesApi_ip = RetrofitHelper_ip.getInstance().create(QuotesApi_ip::class.java)
        val quotesApi_geo = RetrofitHelper_geolocalizacion.getInstance().create(QuotesApi_Geolocalizacion::class.java)


        GlobalScope.launch {
            var busqueda_ip = quotesApi_ip.get_ip().body()
            val ip = busqueda_ip?.ip
            var posicion = quotesApi_geo.get_geolocalizacion(ip).body()
            Log.println(Log.ASSERT, "", "ip:"+busqueda_ip.toString())
            Log.println(Log.ASSERT, "", "posicion:"+posicion.toString())
            if (posicion != null) {
                nombre = posicion.city
            }
            datos_adquiridos = true
        }

    }


}