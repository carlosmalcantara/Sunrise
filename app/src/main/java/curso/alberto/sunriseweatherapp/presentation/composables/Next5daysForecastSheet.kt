package curso.alberto.sunriseweatherapp.presentation.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Next5daysForecastSheet(
    next5daysForecast:  Next5daysForecast
) {
    Column(
        modifier = Modifier
    ) {
      //  next5daysForecast.forEach { next5daysForecast ->
      //      Next5daysForecastItem(next5daysForecast)
        Next5daysForecastItem(next5daysForecast)
        }
    }
