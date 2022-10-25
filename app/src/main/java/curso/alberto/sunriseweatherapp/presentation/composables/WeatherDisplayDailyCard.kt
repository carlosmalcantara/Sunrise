package curso.alberto.sunriseweatherapp.presentation.composables

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



@Composable
fun WeatherDisplayDailyCard(

) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Column() {
            Text(
                text = "Madrid",
                style = TextStyle(fontSize = 35.sp)
            )
            Text(
                text = "16 Oct 2022",
                style = TextStyle(fontSize = 18.sp)
            )
            Text(
                text = "18º",
                style = TextStyle(
                    fontSize = 100.sp,
                    fontWeight = FontWeight.Light,
                    fontFamily = FontFamily.SansSerif
                )
            )
            Text(
                text = "8º / 18º",
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
                    model = "https://developer.accuweather.com/sites/default/files/14-s.png",
                    contentDescription = "icono principal daily",
                    modifier = Modifier
                        .padding(
                            top = 10.dp,
                            end = 15.dp
                        )
                        .size(135.dp)
                )
                Text(
                    text = "Partly Sunny",
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

