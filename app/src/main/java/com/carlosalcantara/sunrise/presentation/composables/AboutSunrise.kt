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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.carlosalcantara.sunrise.R
import com.carlosalcantara.sunrise.ui.theme.SunriseTheme

data class AboutSunrise(
    val descriptor: String,
    @DrawableRes val logoSunrise: Int,
    val textConsolation1: String,
    val textConsolation2: String,
    val versionApp: String
)

@Composable
fun AboutSunriseCard(
    aboutSunrise: AboutSunrise, modifier: Modifier = Modifier
) = Card(
    modifier = modifier,
) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxHeight()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(id = aboutSunrise.logoSunrise),
            contentDescription = aboutSunrise.descriptor,
            modifier = Modifier
                .size(240.dp)
                .padding(bottom = 32.dp),
            tint = Color.Unspecified
        )
        Text(
            text = aboutSunrise.textConsolation1,
            style = MaterialTheme.typography.body2,
            color = Color.Black
        )
        Text(
            text = aboutSunrise.textConsolation2,
            style = MaterialTheme.typography.body2,
            modifier = Modifier.padding(bottom = 16.dp),
            color = Color.Black
        )
        Text(
            text = aboutSunrise.versionApp,
            fontWeight = FontWeight.SemiBold,
            style = MaterialTheme.typography.body1,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(
    showSystemUi = true
)
@Composable
fun AboutSunriseCardPreview() {
    val aboutSunrise = AboutSunrise(
        descriptor = "Logo",
        logoSunrise = R.drawable.sunriselogo,
        textConsolation1 = "Do not worry about The Weather.",
        textConsolation2 = "We all are here.",
        versionApp = "v1.0.0"
    )
    SunriseTheme() {
        AboutSunriseCard (aboutSunrise = aboutSunrise)
    }
}