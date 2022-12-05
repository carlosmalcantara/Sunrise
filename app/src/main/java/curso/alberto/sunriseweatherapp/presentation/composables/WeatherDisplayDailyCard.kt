package curso.alberto.sunriseweatherapp.presentation.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.compose.SubcomposeAsyncImage
import coil.request.ImageRequest
import curso.alberto.sunriseweatherapp.R
import curso.alfredo.controlador.Controlador_Datos.Datos_Tiempo
import java.text.SimpleDateFormat
import java.util.Date
import kotlin.math.roundToInt


@Composable
fun WeatherDisplayDailyCard(
    daily: Datos_Tiempo
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Column(
            modifier = Modifier.padding(start= 20.dp)
        ) {
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
                text = "${daily.temperatura_actual?.roundToInt()}º",
                style = TextStyle(
                    fontSize = 100.sp,
                    fontWeight = FontWeight.Light,
                    fontFamily = FontFamily.SansSerif
                )
            )
            Text(
                text = "${daily.temperatura_minima?.roundToInt()}º / ${daily.temperatura_maxima?.roundToInt()}º",
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

                    SubcomposeAsyncImage(
                        model = "https://developer.accuweather.com/sites/default/files/${"%02d".format(daily.icono)}-s.png",
                        loading = {
                            CircularProgressIndicator()
                        },
                        contentDescription = stringResource(R.string.app_name),
                        modifier = Modifier
                            .padding(
                                top = 10.dp,
                                end = 15.dp
                            )
                            .size(180.dp)
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




