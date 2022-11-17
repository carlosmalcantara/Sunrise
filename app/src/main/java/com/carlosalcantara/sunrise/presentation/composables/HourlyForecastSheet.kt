package com.carlosalcantara.sunrise.presentation.composables

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.carlosalcantara.sunrise.presentation.composables.HourlyForecast
import com.carlosalcantara.sunrise.presentation.composables.HourlyForecastCard
import com.carlosalcantara.sunrise.ui.theme.SunriseTheme


@Composable
fun HourlyForecastSheet(
    hourlyForecast: List<HourlyForecast>,
    modifier: Modifier = Modifier
) = Card(
    modifier = modifier
        .fillMaxWidth()
        .padding(top = 4.dp),
    //backgroundColor = LightGray

) {
    Column (modifier = Modifier.padding(top=4.dp, bottom = 4.dp)){
        Text(modifier = Modifier.padding(start=8.dp), text = "Hourly")
        LazyRow(
            contentPadding = PaddingValues(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(hourlyForecast) { forecast ->
                HourlyForecastCard(hourlyForecast = forecast)

            }

        }
    }

}

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
        text = stringResource(id = com.carlosalcantara.sunrise.R.string.today),
        style = MaterialTheme.typography.h6.copy(fontSize = 16.sp),

        )
    Text(
        text = stringResource(id = com.carlosalcantara.sunrise.R.string.next_12_hours),
        style = MaterialTheme.typography.subtitle2.copy(fontSize = 12.sp),
    )
}


@Preview
@Composable
fun HourlyForecastSheetPreview() {
    val forecast = List(12) {
        HourlyForecast(
            descriptor = "Cloudy",
            icon = com.carlosalcantara.sunrise.R.drawable.cloudy,
            hour = "19:00",
            temperature = "20"
        )
    }
    SunriseTheme() {
        HourlyForecastSheet(hourlyForecast = forecast)
    }

}

@Preview
@Composable
fun HourlyForecastSheetPreviewDark() {
    val forecast = List(12) {
        HourlyForecast(
            descriptor = "Cloudy",
            icon = com.carlosalcantara.sunrise.R.drawable.cloudy,
            hour = "19:00",
            temperature = "20"
        )
    }
    SunriseTheme(darkTheme = true) {
        HourlyForecastSheet(hourlyForecast = forecast)
    }

}

