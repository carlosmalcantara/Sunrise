package curso.alberto.sunriseweatherapp.presentation.composables


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.SubcomposeAsyncImage
import curso.alberto.sunriseweatherapp.ui.theme.GreyCard
import kotlin.math.roundToInt

data class Next5daysForecast(

    var date_5days: String,
    val icon_5days: Int,
    var temperature_min_5days: Double,
    var temperature_max_5days: Double,
    var icon_frase_5days: String,
)



val forecast5days = listOf(
    Next5daysForecast("15 Nov", 18, 10.2, 16.4, "Rain"),
    Next5daysForecast("16 Nov", 22, 9.2, 15.0, "Snow"),
    Next5daysForecast("17 Nov", 19, 14.6, 20.8, "Flurries"),
    Next5daysForecast("18 Nov", 16, 13.0, 19.0, "Mostly Cloudy w/ T-Storms"),
    Next5daysForecast("19 Nov", 15, 12.2, 18.4, "T-Storms"),
    )


@Composable
fun Next5daysForecastItem(

    next5daysForecast:  Next5daysForecast,

    ) = Card(
    modifier = Modifier
        .fillMaxWidth(),
    elevation = 0.dp,
    shape = RoundedCornerShape(5.dp)
) {
    Row(
        modifier = Modifier
            .size(width = 200.dp, height = 60.dp)
            .padding(
                top = 5.dp,
                bottom = 0.dp
            )
            .background(GreyCard),

        horizontalArrangement = Arrangement.SpaceBetween,
    )
    {
        Column(
            modifier = Modifier
                .padding(
                    start = 15.dp,
                )

        ) {
            Text(
                text =  next5daysForecast.date_5days,
                style = MaterialTheme.typography.body2,
                color = Color.DarkGray,
                modifier = Modifier
                    .padding(
                        top = 8.dp
                    )
            )
            Text(
                text = next5daysForecast.icon_frase_5days,
                style = MaterialTheme.typography.body2,
                color = Color.DarkGray,
                modifier = Modifier
                    .padding(
                        top = 0.dp
                    ),
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Light,
                fontSize = 12.sp
            )
        }
        SubcomposeAsyncImage(
            model = "https://developer.accuweather.com/sites/default/files/${"%02d".format(next5daysForecast.icon_5days)}-s.png",
            loading = {
                CircularProgressIndicator()
            },
            contentDescription = "icon_5days",
            modifier = Modifier
                .size(48.dp)
        )
        Text(
            //  text = "${next5daysForecast.temperature_min} / ${next5daysForecast.temperature_max}",
            text = "${next5daysForecast.temperature_min_5days.roundToInt()}º / ${next5daysForecast.temperature_max_5days.roundToInt()}º",
            style = MaterialTheme.typography.body2,
            color = Color.DarkGray,
            modifier = Modifier
                .padding(
                    top = 18.dp,
                    end = 15.dp
                )
        )
    }
}



