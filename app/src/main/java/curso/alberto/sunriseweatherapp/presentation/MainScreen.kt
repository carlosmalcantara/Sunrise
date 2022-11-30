package curso.alberto.sunriseweatherapp.presentation

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import curso.alberto.sunriseweatherapp.Controlador_Datos.Accesso_API
import curso.alberto.sunriseweatherapp.R
import curso.alberto.sunriseweatherapp.presentation.composables.*
import curso.alberto.sunriseweatherapp.ui.theme.GreyCard


@RequiresApi(Build.VERSION_CODES.O)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val acceso = Accesso_API()
    acceso.coger_tiempo_nombre("")
    while (acceso.datos_adquiridos == false) {
    }


    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxSize()
    ) {


        Scaffold(
            modifier = Modifier
                .fillMaxSize(),

            topBar = { TopBarMenu() },
        ) {


            Column(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .padding(20.dp)
                    .verticalScroll(rememberScrollState())

            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth(),
                    backgroundColor = GreyCard,
                    elevation = 0.dp,
                    shape = RoundedCornerShape(10.dp)
                ) {
                    WeatherDisplayDailyCard(acceso.resultado)
                }


                Row(
                    modifier = Modifier
                        .padding(
                            top = 5.dp,
                            bottom = 0.dp
                        )
                        .align(Alignment.CenterHorizontally),
                    horizontalArrangement = Arrangement.SpaceBetween,


                    ) {

                    DetailsItem(
                        details = WeatherDetails(
                            units = "Pressure",
                            data = "${acceso.resultado.presion.toString()} mb",
                            R.drawable.pressure,
                            color = GreyCard
                        )
                    )
                    DetailsItem(
                        details = WeatherDetails(
                            units = "Wind",
                            data = "${acceso.resultado.viento.toString()} km/h",
                            R.drawable.wind2,
                            color = GreyCard
                        )
                    )
                }

                Row(
                    modifier = Modifier
                        // .fillMaxWidth()
                        .padding(
                            top = 0.dp,
                            bottom = 0.dp
                        )
                        .align(Alignment.CenterHorizontally),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {


                    DetailsItem(
                        details = WeatherDetails(
                            units = "UV Index",
                            data = acceso.resultado.uv_text.toString(),
                            R.drawable.rays,
                            color = GreyCard
                        )
                    )
                    DetailsItem(
                        details = WeatherDetails(
                            units = "Humidity",
                            data = "${acceso.resultado.humedad_relativa.toString()} %",
                            R.drawable.water,
                            color = GreyCard
                        )
                    )


                }




                Spacer(modifier = Modifier.height(16.dp))

                HourlyForecastSheet(hourlyForecast = List(12) {
                    HourlyDetails(

                        hour = acceso.resultado.lista_hora,
                        icon = acceso.resultado.lista_icono_hora,
                        temperature = acceso.resultado.lista_temperatura_hora,
                    )
                })


                Spacer(modifier = Modifier.height(8.dp))

                /*
                Next5daysForecastSheet(next5daysForecast = List(5) {
                    next5daysForecast(
                        date = "25 Nov",
                        R.drawable.img,
                        temperature_min = 5,
                        temperature_max = 18
                    )
                })
                */
/*
                Column() {
                    Next5daysForecastItem()
                    Next5daysForecastItem()
                    Next5daysForecastItem()
                    Next5daysForecastItem()
                    Next5daysForecastItem()

                }
*/
                Next5daysForecastSheet(next5daysForecast = List(5) {

                    Next5daysForecast(
                        date_5days = acceso.resultado.date_5days,
                        icon_frase_5days = acceso.resultado.icon_frase_5days,
                        icon_5days = acceso.resultado.icon_5days,
                        temperature_min_5days = acceso.resultado.temperature_min_5days,
                        temperature_max_5days = acceso.resultado.temperature_max_5days
                    )

                })


            }
        }
    }

}




