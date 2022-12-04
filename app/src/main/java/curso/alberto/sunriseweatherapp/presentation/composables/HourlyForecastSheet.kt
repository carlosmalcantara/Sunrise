package curso.alberto.sunriseweatherapp.presentation.composables

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import curso.alberto.sunriseweatherapp.ui.theme.GreyCard


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun HourlyForecastSheet(
    //hourlyForecast: List<HourlyForecast>,
    hourlyForecast: List<HourlyDetails>,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
           .fillMaxWidth(),
        backgroundColor = GreyCard,
        elevation = 0.dp

    ) {
        Column (
            modifier = Modifier.padding(
                bottom = 5.dp,

                )
        ){
            Text(
                text = "Hourly 12h",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(
                        start = 18.dp,
                        top = 5.dp),
            )
            LazyRow(
                contentPadding = PaddingValues(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(hourlyForecast) { forecast ->
                    HourlyForecastCard(hourlyDetails = forecast)

                }

            }
        }

    }
}
/*
@Composable
private fun TopRow(modifier: Modifier = Modifier) = Row(
    modifier = modifier
        .fillMaxWidth()
        .padding(
            start = 16.dp,
            end = 16.dp
        ),
    horizontalArrangement = Arrangement.SpaceBetween,
    verticalAlignment = Alignment.CenterVertically
) {
    Text(
        text = "Today",
        style = MaterialTheme.typography.h6.copy(fontSize = 16.sp),

        )
    Text(
        text = "Daily 12h",
        style = MaterialTheme.typography.subtitle2.copy(fontSize = 12.sp),
    )
}
*/



/*
@Preview
@Composable
fun HourlyForecastSheetPreview() {
    val forecast = List(12) {
        HourlyDetails(
           // descriptor = "Cloudy",
            hour = "19:00",
            icon = curso.alberto.sunriseweatherapp.R.drawable.img,
            temperature = 20.5
        )
    }
    //   SunriseTheme() {
    //       HourlyForecastSheet(hourlyForecast = forecast)
    //   }

}

@Preview
@Composable
fun HourlyForecastSheetPreviewDark() {
    val forecast = List(12) {
        HourlyDetails(
         //   descriptor = "Cloudy",
            icon = curso.alberto.sunriseweatherapp.R.drawable.img,
            hour = "19:00",
            temperature = 20.5
        )
    }
    //  SunriseTheme(darkTheme = true) {
    //      HourlyForecastSheet(hourlyForecast = forecast)
    //  }

}

 */