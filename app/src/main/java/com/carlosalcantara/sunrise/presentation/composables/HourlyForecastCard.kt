package com.carlosalcantara.sunrise.presentation.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.carlosalcantara.sunrise.ui.theme.SunriseTheme
import dagger.hilt.internal.aggregatedroot.codegen._com_carlosalcantara_sunrise_SunriseApp


data class HourlyForecast(
    val descriptor : String,
    @DrawableRes val icon : Int,
    val hour : String,
    val temperature : String
)

@Composable
fun HourlyForecastCard(
    hourlyForecast: HourlyForecast,
    modifier: Modifier = Modifier
) = Card(
    modifier = modifier,
) {
    Column (
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Icon(
            painter = painterResource(id = hourlyForecast.icon),
            contentDescription = hourlyForecast.descriptor,
            modifier = Modifier.size(36.dp),
            tint = Color.Unspecified
        )
        Text(
            text = hourlyForecast.hour,
            style = MaterialTheme.typography.body2,
            color = Color.LightGray
        )
        Text(
            text = hourlyForecast.temperature,
            fontWeight = FontWeight.SemiBold,
            style = MaterialTheme.typography.body1
        )
    }
}

@Preview
@Composable
fun HourlyForecastCardPreview(){
    val hourlyForecast = HourlyForecast(
        descriptor = "Cloudy",
        icon = com.carlosalcantara.sunrise.R.drawable.cloudy,
        hour = "19:00",
        temperature = "20º"
    )
    SunriseTheme(){
       HourlyForecastCard(hourlyForecast = hourlyForecast)
   }
}

@Preview
@Composable
fun HourlyForecastCardPreviewDark(){
    val hourlyForecast = HourlyForecast(
        descriptor = "Cloudy",
        icon = com.carlosalcantara.sunrise.R.drawable.cloudy,
        hour = "19:00",
        temperature = "20º"
    )
    SunriseTheme(darkTheme = true){
       HourlyForecastCard(hourlyForecast = hourlyForecast)
   }
}