package curso.alberto.sunriseweatherapp.data.retrofit.models.HomeViewModel

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import curso.alberto.sunriseweatherapp.R
import curso.alberto.sunriseweatherapp.data.retrofit.models.HomeViewModel.WeatherType.WeatherBackground.ClearBg
import curso.alberto.sunriseweatherapp.data.retrofit.models.HomeViewModel.WeatherType.WeatherBackground.CloudyBg
import curso.alberto.sunriseweatherapp.data.retrofit.models.HomeViewModel.WeatherType.WeatherBackground.RainBg
import curso.alberto.sunriseweatherapp.data.retrofit.models.HomeViewModel.WeatherType.WeatherBackground.ShowersBg
import curso.alberto.sunriseweatherapp.data.retrofit.models.HomeViewModel.WeatherType.WeatherBackground.SnowBg
import curso.alberto.sunriseweatherapp.data.retrofit.models.HomeViewModel.WeatherType.WeatherBackground.StormBg
import curso.alberto.sunriseweatherapp.data.retrofit.models.HomeViewModel.WeatherType.WeatherBackground.SunnyBg
import curso.alberto.sunriseweatherapp.ui.theme.*

sealed class WeatherType(
    val IconPhrase: String,
    @DrawableRes val iconRes: Int,
    val background: BgColors
) {
    object Sunny : WeatherType(
        IconPhrase = "Sunny",
        iconRes = R.drawable.ic_1,
        background = SunnyBg
    )
    object MostlySunny : WeatherType(
        IconPhrase = "Mostly Sunny",
        iconRes = R.drawable.ic_2,
        background = SunnyBg
    )
    object 	PartlySunny : WeatherType(
        IconPhrase = "Partly Sunny",
        iconRes = R.drawable.ic_3,
        background = SunnyBg
    )
    object 	IntermittentClouds : WeatherType(
        IconPhrase = "Intermittent Clouds",
        iconRes = R.drawable.ic_4,
        background = ClearBg
    )
    object 	HazySunshine : WeatherType(
        IconPhrase = "Hazy Sunshine",
        iconRes = R.drawable.ic_5 ,
        background = ClearBg
    )
    object 	MostlyCloudy : WeatherType(
        IconPhrase = "Mostly Cloudy",
        iconRes = R.drawable.ic_6,
        background = CloudyBg
    )
    object 	Cloudy : WeatherType(
        IconPhrase = "Cloudy",
        iconRes = R.drawable.ic_7,
        background = CloudyBg
    )
    object 	DrearyOvercast: WeatherType(
        IconPhrase = "Dreary (Overcast)",
        iconRes = R.drawable.ic_8,
        background = CloudyBg
    )
    object 	Fog: WeatherType(
        IconPhrase = "Fog",
        iconRes = R.drawable.ic_11,
        background = CloudyBg
    )
    object 	Showers: WeatherType(
        IconPhrase = "Showers",
        iconRes = R.drawable.ic_12,
        background = ShowersBg
    )
    object 	MostlyCloudyShowers: WeatherType(
        IconPhrase = "Mostly Cloudy w/ Showers",
        iconRes = R.drawable.ic_13,
        background = ShowersBg
    )
    object 	PartlySunnyShowers: WeatherType(
        IconPhrase = "Partly Sunny w/ Showers",
        iconRes = R.drawable.ic_14,
        background = ShowersBg
    )
    object 	TStorms: WeatherType(
        IconPhrase = "T-Storms",
        iconRes = R.drawable.ic_15,
        background = StormBg
    )
    object MostlyCloudyTStorms: WeatherType(
        IconPhrase = "Mostly Cloudy w/ T-Storms",
        iconRes = R.drawable.ic_16,
        background = StormBg
    )
    object PartlySunnyTStorms: WeatherType(
        IconPhrase = "Partly Sunny w/ T-Storms",
        iconRes = R.drawable.ic_17,
        background = StormBg
    )
    object Rain: WeatherType(
        IconPhrase = "Rain",
        iconRes = R.drawable.ic_18,
        background = RainBg
    )
    object Flurries: WeatherType(
        IconPhrase = "Flurries",
        iconRes = R.drawable.ic_19,
        background = CloudyBg
    )
    object MostlyCloudyFlurries: WeatherType(
        IconPhrase = "Mostly Cloudy w/ Flurries",
        iconRes = R.drawable.ic_20,
        background = CloudyBg
    )
    object PartlySunnyFlurries: WeatherType(
        IconPhrase = "Partly Sunny w/ Flurries",
        iconRes = R.drawable.ic_21,
        background = CloudyBg
    )
    object Snow: WeatherType(
        IconPhrase = "Snow",
        iconRes = R.drawable.ic_22,
        background = SnowBg
    )
    object MostlyCloudySnow: WeatherType(
        IconPhrase = "Mostly Cloudy w/ Snow",
        iconRes = R.drawable.ic_23,
        background = SnowBg
    )
    object Ice: WeatherType(
        IconPhrase = "Ice",
        iconRes = R.drawable.ic_24,
        background = SnowBg
    )
    object Sleet: WeatherType(
        IconPhrase = "Sleet",
        iconRes = R.drawable.ic_25,
        background = ShowersBg
    )
    object FreezingRain: WeatherType(
        IconPhrase = "Freezing Rain",
        iconRes = R.drawable.ic_26,
        background = RainBg
    )
    object RainandSnow: WeatherType(
        IconPhrase = "Rain and Snow",
        iconRes = R.drawable.ic_29,
        background = SnowBg
    )
    object Hot: WeatherType(
        IconPhrase = "Hot",
        iconRes = R.drawable.ic_30,
        background = SunnyBg
    )
    object Cold: WeatherType(
        IconPhrase = "Cold",
        iconRes = R.drawable.ic_31,
        background = SnowBg
    )
    object 	Windy: WeatherType(
        IconPhrase = "Windy",
        iconRes = R.drawable.ic_32,
        background = CloudyBg
    )
    object 	Clear: WeatherType(
        IconPhrase = "Clear",
        iconRes = R.drawable.ic_33,
        background = ClearBg
    )
    object 	MostlyClear: WeatherType(
        IconPhrase = "Mostly Clear",
        iconRes = R.drawable.ic_34,
        background = ClearBg
    )
    object PartlyCloudy: WeatherType(
        IconPhrase = "Partly Cloudy",
        iconRes = R.drawable.ic_35,
        background = CloudyBg
    )
    object IntermittentClouds_N: WeatherType(
        IconPhrase = "Intermittent Clouds",
        iconRes = R.drawable.ic_36,
        background = CloudyBg
    )
    object HazyMoonlight: WeatherType(
        IconPhrase = "Hazy Moonlight",
        iconRes = R.drawable.ic_37,
        background = CloudyBg
    )
    object MostlyCloudy_N: WeatherType(
        IconPhrase = "Mostly Cloudy",
        iconRes = R.drawable.ic_38,
        background = CloudyBg
    )
    object 	PartlyCloudyShowers: WeatherType(
        IconPhrase = "Partly Cloudy w/ Showers",
        iconRes = R.drawable.ic_39,
        background = ShowersBg
    )
    object MostlyCloudyShowers_N: WeatherType(
        IconPhrase = "Mostly Cloudy w/ Showers",
        iconRes = R.drawable.ic_40,
        background = ShowersBg
    )
    object PartlyCloudyTStorms: WeatherType(
        IconPhrase = "Partly Cloudy w/ T-Storms",
        iconRes = R.drawable.ic_41,
        background = StormBg
    )
    object MostlyCloudyTStorms_N: WeatherType(
        IconPhrase = "Mostly Cloudy w/ T-Storms",
        iconRes = R.drawable.ic_42,
        background = StormBg
    )
    object 	MostlyCloudyFlurries_N: WeatherType(
        IconPhrase = "	Mostly Cloudy w/ Flurries",
        iconRes = R.drawable.ic_43,
        background = CloudyBg
    )
    object 	MostlyCloudySnow_N: WeatherType(
        IconPhrase = "Mostly Cloudy w/ Snow",
        iconRes = R.drawable.ic_44,
        background = SnowBg
    )


    companion object {
        fun fromWMO(code: Int): WeatherType {
            return when(code) {
                1 -> Sunny
                2 -> MostlySunny
                3 -> PartlySunny
                4 -> IntermittentClouds
                5 -> HazySunshine
                6 -> MostlyCloudy
                7 -> Cloudy
                8 -> DrearyOvercast
                11 -> Fog
                12 -> Showers
                13 -> MostlyCloudyShowers
                14 -> PartlySunnyShowers
                15 -> TStorms
                16 -> MostlyCloudyTStorms
                17 -> PartlySunnyTStorms
                18 -> Rain
                19 -> Flurries
                20 -> MostlyCloudyFlurries
                21 -> PartlySunnyFlurries
                22 -> Snow
                23 -> MostlyCloudySnow
                24 -> Ice
                25 -> Sleet
                26 -> FreezingRain
                29 -> RainandSnow
                30 -> Hot
                31 -> Cold
                32 -> Windy
                33 -> Clear
                34 -> MostlyClear
                35 -> PartlyCloudy
                36 -> IntermittentClouds_N
                37 -> HazyMoonlight
                38 -> MostlyCloudy_N
                39 -> PartlyCloudyShowers
                40 -> MostlyCloudyShowers_N
                41 -> PartlyCloudyTStorms
                42 -> MostlyCloudyTStorms_N
                43 -> MostlyCloudyFlurries_N
                44 -> MostlyCloudySnow_N

                else -> Sunny
            }
        }
    }


    object WeatherBackground {

    val ShowersBg = BgColors(
        teal700,
        Color.LightGray,
        teal900
    )

    val RainBg = BgColors(
        Color.LightGray,
        Color.Gray,
        Color.White
    )

    val CloudyBg = BgColors(
        teal700,
        teal500,
        Color.White
    )

    val SunnyBg = BgColors(
        yellow200,
        teal500,
        yellow500
    )

    val ClearBg = BgColors(
        teal500,
        teal900,
        teal500
    )

    val SnowBg = BgColors(
        Color.LightGray,
        Color.White,
        teal700
    )

    val StormBg = BgColors(
        Color.Black,
        Color.White,
        Color.DarkGray
    )
}


}

typealias BgColors = Triple<Color,Color, Color>
