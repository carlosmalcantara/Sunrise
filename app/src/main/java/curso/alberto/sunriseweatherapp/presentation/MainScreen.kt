package curso.alberto.sunriseweatherapp.presentation

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import curso.alberto.sunriseweatherapp.Controlador_Datos.Accesso_API
import curso.alberto.sunriseweatherapp.Controlador_Datos.Datos_Tiempo
import curso.alberto.sunriseweatherapp.R
import curso.alberto.sunriseweatherapp.presentation.composables.*
import curso.alberto.sunriseweatherapp.ui.theme.GreyCard


@RequiresApi(Build.VERSION_CODES.O)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val acceso = Accesso_API()
    acceso.coger_tiempo_nombre("")
    while (acceso.datos_adquiridos == false) {}

    Scaffold(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        topBar = { TopBarMenu() },
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)

        ) {
            Card(
                modifier = Modifier
                   .fillMaxWidth(),
                backgroundColor  = GreyCard,
                elevation = 0.dp,
                shape = RoundedCornerShape(10.dp)
            ) {
                WeatherDisplayDailyCard(acceso.resultado)
            }
            WeatherDataInfo(

                details = listOf(
                    WeatherDetails(
                        units = "Pressure",
                        data = "${acceso.resultado.presion.toString()} mb",
                        R.drawable.pressure,
                        color = GreyCard
                    ),
                    WeatherDetails(
                        units = "Wind",
                        data = "${acceso.resultado.viento.toString()} km/h",
                        R.drawable.wind2,
                        color = GreyCard
                    ),
                    WeatherDetails(
                        units = "UV Index",
                        data = acceso.resultado.uv_text.toString(),
                        R.drawable.rays,
                        color = GreyCard
                    ),
                    WeatherDetails(
                        units = "Humidity",
                        data = "${acceso.resultado.humedad_relativa.toString()} %",
                        R.drawable.water,
                        color = GreyCard
                    )

                )
            )
            Spacer(modifier = Modifier.height(16.dp))


            HourlyForecastSheet(hourlyForecast = List(12) {
                HourlyForecast(
                 //   lista_hora = acceso.resultado.lista_hora,
                 //   lista_temperatura_hora = acceso.resultado.lista_temperatura_hora,
                 //   icon = acceso.resultado.lista_icono_hora,
                    descriptor = "hourly 12h",
                    hour = "12:00",
                    icon = R.drawable.img,
                    temperature = "18º"
                )
            })
            Spacer(modifier = Modifier.height(8.dp))


        }


    }
}








