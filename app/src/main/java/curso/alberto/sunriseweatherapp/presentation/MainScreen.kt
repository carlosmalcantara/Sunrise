package curso.alberto.sunriseweatherapp.presentation

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import curso.alberto.sunriseweatherapp.Controlador_Datos.Accesso_API
import curso.alberto.sunriseweatherapp.R
import curso.alberto.sunriseweatherapp.presentation.composables.*
import curso.alberto.sunriseweatherapp.ui.theme.GreyCard
import java.time.*
import java.time.format.DateTimeFormatter
import java.util.*


@RequiresApi(Build.VERSION_CODES.O)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "SimpleDateFormat")
@Composable
fun MainScreen() {
    val acceso = Accesso_API()
    acceso.coger_tiempo_nombre("")
    while (acceso.datos_adquiridos == false) {
    }


    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxSize()
    ) {


        Scaffold(
            modifier = Modifier
                .fillMaxSize(),

            topBar = { TopBarMenu() },
        ) {


            Column(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .padding(20.dp)
                    .verticalScroll(rememberScrollState())

            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth(),
                    backgroundColor = GreyCard,
                    elevation = 0.dp,
                    shape = RoundedCornerShape(10.dp)
                ) {
                    WeatherDisplayDailyCard(acceso.resultado)
                }


                Row(
                    modifier = Modifier
                        .padding(
                            top = 5.dp,
                            bottom = 0.dp
                        )
                        .align(Alignment.CenterHorizontally),
                    horizontalArrangement = Arrangement.SpaceBetween,


                    ) {

                    DetailsItem(
                        details = WeatherDetails(
                            units = "Pressure",
                            data = "${acceso.resultado.presion.toString()} mb",
                            R.drawable.pressure,
                            color = GreyCard
                        )
                    )
                    DetailsItem(
                        details = WeatherDetails(
                            units = "Wind",
                            data = "${acceso.resultado.viento.toString()} km/h",
                            R.drawable.wind2,
                            color = GreyCard
                        )
                    )
                }

                Row(
                    modifier = Modifier
                        // .fillMaxWidth()
                        .padding(
                            top = 0.dp,
                            bottom = 0.dp
                        )
                        .align(Alignment.CenterHorizontally),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {


                    DetailsItem(
                        details = WeatherDetails(
                            units = "UV Index",
                            data = acceso.resultado.uv_text.toString(),
                            R.drawable.rays,
                            color = GreyCard
                        )
                    )
                    DetailsItem(
                        details = WeatherDetails(
                            units = "Humidity",
                            data = "${acceso.resultado.humedad_relativa.toString()} %",
                            R.drawable.water,
                            color = GreyCard
                        )
                    )


                }




                Spacer(modifier = Modifier.height(16.dp))

                var hour_1 = acceso.resultado.hora_1;
                var hour_2 = acceso.resultado.hora_2;
                var hour_3 = acceso.resultado.hora_3;
                var hour_4 = acceso.resultado.hora_4;
                var hour_5 = acceso.resultado.hora_5;
                var hour_6 = acceso.resultado.hora_6;
                var hour_7 = acceso.resultado.hora_7;
                var hour_8 = acceso.resultado.hora_8;
                var hour_9 = acceso.resultado.hora_9;
                var hour_10 = acceso.resultado.hora_10;
                var hour_11 = acceso.resultado.hora_11;
                var hour_12 = acceso.resultado.hora_12;
                val formatterHour = DateTimeFormatter.ISO_DATE_TIME
                val time1: LocalTime? = LocalTime.parse(hour_1,formatterHour)
                val time2: LocalTime? = LocalTime.parse(hour_2,formatterHour)
                val time3: LocalTime? = LocalTime.parse(hour_3,formatterHour)
                val time4: LocalTime? = LocalTime.parse(hour_4,formatterHour)
                val time5: LocalTime? = LocalTime.parse(hour_5,formatterHour)
                val time6: LocalTime? = LocalTime.parse(hour_6,formatterHour)
                val time7: LocalTime? = LocalTime.parse(hour_7,formatterHour)
                val time8: LocalTime? = LocalTime.parse(hour_8,formatterHour)
                val time9: LocalTime? = LocalTime.parse(hour_9,formatterHour)
                val time10: LocalTime? = LocalTime.parse(hour_10,formatterHour)
                val time11: LocalTime? = LocalTime.parse(hour_11,formatterHour)
                val time12: LocalTime? = LocalTime.parse(hour_12,formatterHour)




                HourlyForecastSheet(


                    hourlyForecast = listOf(
                        HourlyDetails(
                            hour = time1.toString(),
                            icon = acceso.resultado.icono_hora_1,
                            temperature = acceso.resultado.temperatura_hora_1
                        ),
                        HourlyDetails(
                            hour = time2.toString(),
                            icon = acceso.resultado.icono_hora_2,
                            temperature = acceso.resultado.temperatura_hora_2
                        ),
                        HourlyDetails(
                            hour = time3.toString(),
                            icon = acceso.resultado.icono_hora_3,
                            temperature = acceso.resultado.temperatura_hora_3
                        ),
                        HourlyDetails(
                            hour = time4.toString(),
                            icon = acceso.resultado.icono_hora_4,
                            temperature = acceso.resultado.temperatura_hora_4
                        ),
                        HourlyDetails(
                            hour = time5.toString(),
                            icon = acceso.resultado.icono_hora_5,
                            temperature = acceso.resultado.temperatura_hora_5
                        ),
                        HourlyDetails(
                            hour = time6.toString(),
                            icon = acceso.resultado.icono_hora_6,
                            temperature = acceso.resultado.temperatura_hora_6
                        ),
                        HourlyDetails(
                            hour = time7.toString(),
                            icon = acceso.resultado.icono_hora_7,
                            temperature = acceso.resultado.temperatura_hora_7
                        ),
                        HourlyDetails(
                            hour = time8.toString(),
                            icon = acceso.resultado.icono_hora_8,
                            temperature = acceso.resultado.temperatura_hora_8
                        ),
                        HourlyDetails(
                            hour = time9.toString(),
                            icon = acceso.resultado.icono_hora_9,
                            temperature = acceso.resultado.temperatura_hora_9
                        ),
                        HourlyDetails(
                            hour = time10.toString(),
                            icon = acceso.resultado.icono_hora_10,
                            temperature = acceso.resultado.temperatura_hora_10
                        ),
                        HourlyDetails(
                            hour = time11.toString(),
                            icon = acceso.resultado.icono_hora_11,
                            temperature = acceso.resultado.temperatura_hora_11
                        ),
                        HourlyDetails(
                            hour = time12.toString(),
                            icon = acceso.resultado.icono_hora_12,
                            temperature = acceso.resultado.temperatura_hora_12
                        ),

                        )
                )



                Spacer(modifier = Modifier.height(8.dp))





                Column()


                {
                    val date_1 = acceso.resultado.fecha_dia_1
                    val date_2 = acceso.resultado.fecha_dia_2
                    val date_3 = acceso.resultado.fecha_dia_3
                    val date_4 = acceso.resultado.fecha_dia_4
                    val date_5 = acceso.resultado.fecha_dia_5
                    val formatterDate = DateTimeFormatter.ISO_DATE_TIME
                    val day_1: OffsetDateTime = OffsetDateTime.parse(date_1, formatterDate)
                    val day_2: OffsetDateTime = OffsetDateTime.parse(date_2, formatterDate)
                    val day_3: OffsetDateTime = OffsetDateTime.parse(date_3, formatterDate)
                    val day_4: OffsetDateTime = OffsetDateTime.parse(date_4, formatterDate)
                    val day_5: OffsetDateTime = OffsetDateTime.parse(date_5, formatterDate)
                    val date1: DayOfWeek? = LocalDate.from(day_1).dayOfWeek
                    val date2: DayOfWeek? = LocalDate.from(day_2).dayOfWeek
                    val date3: DayOfWeek? = LocalDate.from(day_3).dayOfWeek
                    val date4: DayOfWeek? = LocalDate.from(day_4).dayOfWeek
                    val date5: DayOfWeek? = LocalDate.from(day_5).dayOfWeek


                    Next5daysForecastItem(
                        Next5daysForecast(
                            date_5days = date1.toString(),
                            icon_5days = acceso.resultado.icono_dia_1,
                            temperature_min_5days = acceso.resultado.Temp_min_dia_1,
                            temperature_max_5days = acceso.resultado.Temp_max_dia_1,
                            icon_frase_5days = acceso.resultado.frase_dia_1,
                        )
                    )
                    Next5daysForecastItem(
                        Next5daysForecast(
                            date_5days = date2.toString(),
                            icon_5days = acceso.resultado.icono_dia_2,
                            temperature_min_5days = acceso.resultado.Temp_min_dia_2,
                            temperature_max_5days = acceso.resultado.Temp_max_dia_2,
                            icon_frase_5days = acceso.resultado.frase_dia_2,
                        )
                    )
                    Next5daysForecastItem(
                        Next5daysForecast(
                            date_5days = date3.toString(),
                            icon_5days = acceso.resultado.icono_dia_3,
                            temperature_min_5days = acceso.resultado.Temp_min_dia_3,
                            temperature_max_5days = acceso.resultado.Temp_max_dia_3,
                            icon_frase_5days = acceso.resultado.frase_dia_3,
                        )
                    )
                    Next5daysForecastItem(
                        Next5daysForecast(
                            date_5days = date4.toString(),
                            icon_5days = acceso.resultado.icono_dia_4,
                            temperature_min_5days = acceso.resultado.Temp_min_dia_4,
                            temperature_max_5days = acceso.resultado.Temp_max_dia_4,
                            icon_frase_5days = acceso.resultado.frase_dia_4,
                        )
                    )
                    Next5daysForecastItem(
                        Next5daysForecast(

                            date_5days = date5.toString(),
                            icon_5days = acceso.resultado.icono_dia_5,
                            temperature_min_5days = acceso.resultado.Temp_min_dia_5,
                            temperature_max_5days = acceso.resultado.Temp_max_dia_5,
                            icon_frase_5days = acceso.resultado.frase_dia_5,
                        )
                    )
                }
            }


        }


    }
}







