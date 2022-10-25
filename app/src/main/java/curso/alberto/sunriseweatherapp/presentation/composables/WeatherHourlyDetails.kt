package curso.alberto.sunriseweatherapp.presentation.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun WeatherHourlyDetails(

    //weatherData: WeatherData

    modifier: Modifier = Modifier
) {

    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "12:00"
        )
        AsyncImage(
            model = "https://developer.accuweather.com/sites/default/files/14-s.png",
            contentDescription = "icono principal daily",
            modifier = Modifier.width((40.dp))
        )
        Text(
            text = "18º",
            fontWeight = FontWeight.Bold
        )
    }
}