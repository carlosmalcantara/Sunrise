package curso.alberto.sunriseweatherapp.presentation

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import curso.alberto.sunriseweatherapp.Controlador_Datos.Accesso_API
import curso.alberto.sunriseweatherapp.R
import curso.alberto.sunriseweatherapp.presentation.composables.*
import curso.alberto.sunriseweatherapp.ui.theme.GreyCard


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
                .padding(20.dp),
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


            /***
             *  TODO -> WeatherForecastHourly()
             */


        }


    }
}






