package com.carlosalcantara.sunrise.presentation.composables


import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.carlosalcantara.sunrise.ui.theme.GreyCard
import com.carlosalcantara.sunrise.ui.theme.SunriseTheme

public data class WeatherDetails(
    val data: Int,
    val units:String,
    @DrawableRes val icon: Int,
    //val color: Color

)

@Composable
fun WeatherDataInfo(
    details: List<WeatherDetails>
) {

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(
            horizontal = 0.dp,
            vertical = 16.dp
        ),


        content = {
            items(details.size) {
                DetailsItem(details = details[it])

            }
        })
}


@Composable
fun DetailsItem(
    details: WeatherDetails,
    modifier: Modifier = Modifier
) {
    Box(
        modifier
            .background(GreyCard)
            .border(1.dp, Color.Red, RoundedCornerShape(8.dp))
            .padding(8.dp)

    ){
    Row() {
        Icon(
            painter = painterResource(id = details.icon),
            contentDescription = details.units,
            modifier = Modifier
                .size(64.dp)
                .padding(end = 8.dp)
        )
        Column(
            modifier = Modifier
        ) {
            /*  Text (
                text = details.data,
                lineHeight = 15.sp
            ) */

            Text(
                text = details.units,
                lineHeight = 11.sp,
            )
        }

    }
}}


@Preview
@Composable
fun DetailsItemPreview() {
    val details = WeatherDetails(
        data = 1,
        units = "mb",
        icon = com.carlosalcantara.sunrise.R.drawable.pressure,
        //color = Color.Black
    )

    SunriseTheme {
        DetailsItem(details)
    }
}




