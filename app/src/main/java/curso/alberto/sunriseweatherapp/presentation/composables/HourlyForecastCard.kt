package curso.alberto.sunriseweatherapp.presentation.composables

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage
import kotlin.math.roundToInt


data class HourlyDetails(
    val hour: String,
    val icon: Int,
    val temperature: Double
)



@RequiresApi(Build.VERSION_CODES.O)
@SuppressLint("RememberReturnType")
@Composable
fun HourlyForecastCard(
    modifier: Modifier = Modifier,
    hourlyDetails: HourlyDetails,
) {

    Card(
        modifier = modifier,
    ) {

        Column(
            modifier = Modifier.padding(14.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = hourlyDetails.hour,
                style = MaterialTheme.typography.body2,
                color = Color.DarkGray
            )
            SubcomposeAsyncImage(
                model = "https://developer.accuweather.com/sites/default/files/${"%02d".format(hourlyDetails.icon)}-s.png",
                loading = {
                    CircularProgressIndicator()
                },
                contentDescription = null,
                modifier = Modifier.size(48.dp)
            )

            Text(
                text = "${hourlyDetails.temperature.roundToInt()}º",
                fontWeight = FontWeight.SemiBold,
                style = MaterialTheme.typography.body1
            )
        }
    }
}




/*
@Preview
@Composable
fun HourlyForecastCardPreview() {
    val hourlyForecast = HourlyDetails(
        //descriptor = "Cloudy",
        hour = "19:00",
        icon = R.drawable.img,
        temperature = 20.5
    )
    //  SunriseTheme(){
    //     HourlyForecastCard(hourlyForecast = hourlyForecast)
    //   }
}

@Preview
@Composable
fun HourlyForecastCardPreviewDark() {
    val hourlyForecast = HourlyDetails(
      //  descriptor = "Cloudy",
       hour = "19:00",
        icon = R.drawable.img,
       temperature = 20.5
    )
    //  SunriseTheme(darkTheme = true){
    //      HourlyForecastCard(hourlyForecast = hourlyForecast)
    //  }
}

 */