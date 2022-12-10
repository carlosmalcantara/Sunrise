package curso.alberto.sunriseweatherapp.presentation

import android.annotation.SuppressLint
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import curso.alberto.sunriseweatherapp.R
import curso.alberto.sunriseweatherapp.presentation.composables.*
import curso.alberto.sunriseweatherapp.ui.theme.GreyCard
import curso.alberto.sunriseweatherapp_.presentation.composables.composables.AppBar.MainViewModel
import curso.alberto.sunriseweatherapp_.presentation.composables.composables.AppBar.SearchWidgetState
import curso.alfredo.controlador.Controlador_Datos.Accesso_API
import curso.alfredo.controlador.Controlador_Datos.Localizacion_IP
import java.time.*
import java.time.format.DateTimeFormatter
import java.util.*


@RequiresApi(Build.VERSION_CODES.O)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "SimpleDateFormat")
@Composable
fun MainScreen(

    MainViewModel: MainViewModel

) {
    /*
        Acceso a los datos climaticos por localización por IP
     */
    var localizacion: Localizacion_IP =  Localizacion_IP()
    val acceso = Accesso_API()
    //acceso.coger_tiempo_posicion_gps(41.3841666667f,2.17611111111f)
    localizacion.localizar()
    while (localizacion.datos_adquiridos == false) {}
    acceso.coger_tiempo_nombre(localizacion.nombre)
    while (acceso.datos_adquiridos == false) {}

    /*
        Creación de la vista
     */

    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxSize()
    ) {

        val searchWidgetState by MainViewModel.searchWidgetState
        val searchTextState by MainViewModel.searchTextState

        Scaffold(
            modifier = Modifier
                .fillMaxSize(),

       //     topBar = { TopBarMenu() },

            topBar = {

                MainAppBar(
                    searchWidgetState = searchWidgetState,
                    searchTextState = searchTextState,
                    onTextChange = {
                        MainViewModel.updateSearchTextState(newValue = it)
                    },
                    onCloseClicked = {
                        MainViewModel.updateSearchWidgetState(newValue = SearchWidgetState.CLOSED)
                    },
                    onSearchClicked = {
                        Log.d("Searched Text", it)
                        acceso.coger_tiempo_nombre(MainViewModel.searchTextState.value)
                    },
                    onSearchTriggered = {
                        MainViewModel.updateSearchWidgetState(newValue = SearchWidgetState.OPENED)
                    }
                )
            }


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





// APPBAR

@Composable
fun MainAppBar(
    searchWidgetState: SearchWidgetState,
    searchTextState: String,
    onTextChange: (String) -> Unit,
    onCloseClicked: () -> Unit,
    onSearchClicked: (String) -> Unit,
    onSearchTriggered: () -> Unit
) {
    when (searchWidgetState) {
        SearchWidgetState.CLOSED -> {
            DefaultAppBar(
                onSearchClicked = onSearchTriggered
            )
        }
        SearchWidgetState.OPENED -> {
            SearchAppBar(
                text = searchTextState,
                onTextChange = onTextChange,
                onCloseClicked = onCloseClicked,
                onSearchClicked = onSearchClicked,

            )
        }
    }
}

@Composable
fun DefaultAppBar(onSearchClicked: () -> Unit) {
    TopAppBar(
        elevation = 0.dp,
        backgroundColor = Color.White,
        title = {
            Text(
                text = "Sunrise Weather"
            )
        },
        actions = {
            IconButton(
                onClick = { onSearchClicked() }
            ) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Search Icon",
                    tint = Color.Black
                )
            }
        }
    )
}

@Composable
fun SearchAppBar(
    text: String,
    onTextChange: (String) -> Unit,
    onCloseClicked: () -> Unit,
    onSearchClicked: (String) -> Unit,
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        elevation = 0.dp,
        color = MaterialTheme.colors.contentColorFor(Color.White)
    ) {
        TextField(
            modifier = Modifier
            .fillMaxWidth()
            .focusable(enabled = true)
            .background(color = Color.White),
            value = text,

            onValueChange = {
                onTextChange(it)
            },
            placeholder = {
                Text(
                    modifier = Modifier
                        .alpha(ContentAlpha.medium),
                    text = "Search here...",
                    color = Color.Black
                )
            },
            textStyle = TextStyle(
                fontSize = MaterialTheme.typography.subtitle1.fontSize
            ),
            singleLine = true,
            leadingIcon = {
                IconButton(
                    modifier = Modifier
                        .alpha(ContentAlpha.medium),
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search Icon",
                        tint = Color.Black
                    )
                }
            },
            trailingIcon = {
                IconButton(
                    onClick = {
                        if (text.isNotEmpty()) {
                            onTextChange("")
                        } else {
                            onCloseClicked()
                        }
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Close Icon",
                        tint = Color.Black
                    )
                }
            },
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    onSearchClicked(text)
                }
            ),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.Transparent,
                cursorColor = Color.Black.copy(alpha = ContentAlpha.medium)
            ))
    }
}


@Composable
@Preview
fun DefaultAppBarPreview() {
    DefaultAppBar(onSearchClicked = {})
}

@Composable
@Preview
fun SearchAppBarPreview() {
    SearchAppBar(
        text = "Some random text",
        onTextChange = {},
        onCloseClicked = {},
        onSearchClicked = {}
    )
}





