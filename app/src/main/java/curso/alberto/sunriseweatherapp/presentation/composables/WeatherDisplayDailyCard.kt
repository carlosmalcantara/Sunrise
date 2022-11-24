package curso.alberto.sunriseweatherapp.presentation.composables

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import curso.alberto.sunriseweatherapp.Controlador_Datos.Datos_Tiempo
import java.text.SimpleDateFormat
import java.util.Date


@Composable
fun WeatherDisplayDailyCard(
    daily: Datos_Tiempo
) {
    Log.println(Log.ASSERT, "", "Ciudad dentro de WeatherDisplayDailyCard:"+daily.ciudad.toString())

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Column() {
            Text(
                text = "${daily.ciudad}",
                style = TextStyle(fontSize = 35.sp)
            )
            val dateFormat = SimpleDateFormat("d MMM yyyy, EEEE")
            val date = dateFormat.format(Date())
            Text(
                text = date,
                style = TextStyle(fontSize = 18.sp)
            )
            Text(
                text = "${daily.temperatura_actual}º",
                style = TextStyle(
                    fontSize = 100.sp,
                    fontWeight = FontWeight.Light,
                    fontFamily = FontFamily.SansSerif
                )
            )
            Text(
                text = "${daily.temperatura_minima}º / ${daily.temperatura_maxima}º",
                Modifier.padding(10.dp),
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Light,
                    fontFamily = FontFamily.SansSerif
                )
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Column() {
                AsyncImage(
                    model = "https://developer.accuweather.com/sites/default/files/${daily.icono}-s.png",
                    contentDescription = "icono principal daily",
                    modifier = Modifier
                        .padding(
                            top = 10.dp,
                            end = 15.dp
                        )
                        .size(135.dp)
                )
                Text(
                    text = "${daily.icono_frase}",
                    Modifier.padding(10.dp),
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Light,
                        fontFamily = FontFamily.SansSerif
                    )
                )

            }

        }

    }
}

