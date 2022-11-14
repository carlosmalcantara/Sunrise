package com.carlosalcantara.sunrise.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.carlosalcantara.sunrise.presentation.data.Datos_Tiempo
import com.carlosalcantara.sunrise.ui.theme.SunriseTheme
import java.text.SimpleDateFormat
import java.util.Date


@Composable
fun WeatherDisplayDailyCard(
    daily: Datos_Tiempo,
    modifier: Modifier = Modifier

) {

    Column(Modifier.padding(8.dp)) {

        Row(Modifier.fillMaxWidth()) {
            Column() {
                Text(
                    text = "${daily.ciudad}",
                    style = TextStyle(
                        fontSize = 32.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                )
                val dateFormat = SimpleDateFormat("d MMM yyyy, EEEE")
                val date = dateFormat.format(Date())
                Text(
                    text = date,
                    style = TextStyle(fontSize = 14.sp)
                )
            }
        }

        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Column(Modifier.weight(2f),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "${daily.temperatura_actual}º",
                    style = TextStyle(
                        fontSize = 96.sp,
                        fontWeight = FontWeight.Light,
                        letterSpacing = -10.sp

                    )
                )
                Text(
                    text = "${daily.temperatura_minima}º / ${daily.temperatura_maxima}º",
                    style = TextStyle(
                        fontSize = 16.sp,

                        )
                )
            }
            Column(
                Modifier
                    .fillMaxWidth()
                    .weight(1f), horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val matrix = ColorMatrix()
                matrix.setToSaturation(0F)
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data("https://developer.accuweather.com/sites/default/files/01-s.png")
                        .crossfade(true)
                        .build(),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(130.dp)
                        .clip(CircleShape),
                    //colorFilter = ColorFilter.colorMatrix(matrix)
                )
                /*AsyncImage(
                    model = "https://developer.accuweather.com/sites/default/files/23-s.png",
                    contentDescription = "icono principal daily",
                    modifier = Modifier.size(130.dp)
                )*/
                Text(
                    text = "Sunny",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Light
                    )
                )

            }

        }
    }
}


@Preview(
    showBackground = true
)
@Composable
fun WeatherDisplayDailyCardPreview() {
    SunriseTheme() {
        WeatherDisplayDailyCard(
            daily = Datos_Tiempo()
        )
    }
}

