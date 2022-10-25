package curso.alberto.sunriseweatherapp.presentation

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import curso.alberto.sunriseweatherapp.R
import curso.alberto.sunriseweatherapp.presentation.composables.*
import curso.alberto.sunriseweatherapp.ui.theme.GreyCard


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {

    Scaffold(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        topBar = { TopBarMenu() },
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                backgroundColor = GreyCard,
                elevation = 0.dp,
                shape = RoundedCornerShape(10.dp)
            ) {
                WeatherDisplayDailyCard()
            }
            WeatherDataInfo(

                details = listOf(
                    WeatherDetails(
                        data = 18,
                        units = "Pressure",
                        R.drawable.pressure,
                        color = GreyCard
                    ),
                    WeatherDetails(
                        data = 18,
                        units = "Wind",
                        R.drawable.wind2,
                        color = GreyCard
                    ),
                    WeatherDetails(
                        data = 18,
                        units = "UV Index",
                        R.drawable.rays,
                        color = GreyCard
                    ),
                    WeatherDetails(
                        data = 18,
                        units = "Humidity",
                        R.drawable.water,
                        color = GreyCard
                    )

                )
            )
            Spacer(modifier = Modifier.height(16.dp))


            /***
             *  TODO -> WeatherForecastHourly()
             */


        }


    }
}



