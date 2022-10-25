package curso.alberto.sunriseweatherapp.presentation.composables

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun WeatherForecastHourly (

    modifier: Modifier = Modifier
) {

    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Text (
            text = "Today",
            fontSize = 20.sp,
        )
        Spacer(modifier = Modifier.height(16.dp))
        LazyRow(content = {
            items(24) {
                (WeatherHourlyDetails(
                    modifier = Modifier
                        .height(100.dp)
                        .padding(horizontal = 16.dp)
                ))

            }

        })

    }
}