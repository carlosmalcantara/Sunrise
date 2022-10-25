package com.example.pruebarestapi.data

data class Previccion_Hora(
    val datetime: String,
    val EpochTime: Long,
    val WeatherIcon: Int,
    val IconPhrase: String,
    val HasPrecipitation:Boolean,
    val PrecipitationType: String,
    val PrecipitationIntensity:	String,
    val IsDaylight: Boolean,
    /*
Temperature.Value	double	Rounded value in specified units. May be NULL.
Temperature.Unit	string	Type of unit.
Temperature.UnitType	int32	Numeric ID associated with the type of unit being displayed.
RealFeelTemperature.Value	double	Rounded value in specified units. May be NULL.
RealFeelTemperature.Unit	string	Type of unit.
RealFeelTemperature.UnitType	int32	Numeric ID associated with the type of unit being displayed.
RealFeelTemperatureShade.Value	double	Rounded value in specified units. May be NULL.
RealFeelTemperatureShade.Unit	string	Type of unit.
RealFeelTemperatureShade.UnitType	int32	Numeric ID associated with the type of unit being displayed.
WetBulbTemperature.Value	double	The temperature to which air may be cooled by evaporating water into it at constant pressure until it reaches saturation. Rounded value in specified units. May be NULL.
WetBulbTemperature.Unit	string	Type of unit.
WetBulbTemperature.UnitType	int32	Numeric ID associated with the type of unit being displayed.
DewPoint.Value	double	Dew Point temperature. Rounded value in specified units. May be NULL.
DewPoint.Unit	string	Type of unit.
DewPoint.UnitType	int32	Numeric ID associated with the type of unit being displayed.
Wind.Speed.Value	double	Rounded value in specified units. May be NULL.
Wind.Speed.Unit	string	Type of unit.
Wind.Speed.UnitType	int32	Numeric ID associated with the type of unit being displayed.
Wind.Direction.Value	double	Rounded value in specified units. May be NULL.
Wind.Direction.Unit	string	Type of unit.
Wind.Direction.UnitType	int32	Numeric ID associated with the type of unit being displayed.
WindGust.Speed.Value	double	Rounded value in specified units. May be NULL.
WindGust.Speed.Unit	string	Type of unit.
WindGust.Speed.UnitType	int32	Numeric ID associated with the type of unit being displayed.
Visibility.Value	double	Rounded value in specified units. May be NULL.
Visibility.Unit	string	Type of unit.
Visibility.UnitType	int32	Numeric ID associated with the type of unit being displayed.
Ceiling.Value	double	Rounded value in specified units. May be NULL.
Ceiling.Unit	string	Type of unit.
Ceiling.UnitType	int32	Numeric ID associated with the type of unit being displayed.
PrecipitationProbability	int32	Percent representing the probability of precipitation. May be NULL.
RainProbability	int32	Percent representing the probability of rain. May be NULL.
SnowProbability	int32	Percent representing the probability of snow. May be NULL.
IceProbability	int32	Percent representing the probability of ice. May be NULL.
TotalLiquid.Value	double	Rounded value in specified units. May be NULL.
TotalLiquid.Unit	string	Type of unit.
TotalLiquid.UnitType	int32	Numeric ID associated with the type of unit being displayed.
Rain.Value	double	Rounded value in specified units. May be NULL.
Rain.Unit	string	Type of unit.
Rain.UnitType	int32	Numeric ID associated with the type of unit being displayed.
Snow.Value	double	Rounded value in specified units. May be NULL.
Snow.Unit	string	Type of unit.
Snow.UnitType	int32	Numeric ID associated with the type of unit being displayed.
Ice.Value	double	Rounded value in specified units. May be NULL.
Ice.Unit	string	Type of unit.
Ice.UnitType	int32	Numeric ID associated with the type of unit being displayed.
Evapotranspiration.Value	double	Rounded value in specified units. May be NULL.
Evapotranspiration.Unit	string	Type of unit.
Evapotranspiration.UnitType	int32	Numeric ID associated with the type of unit being displayed.
SolarIrradiance.Value	double	Rounded value in specified units. May be NULL.
SolarIrradiance.Unit	string	Type of unit.
SolarIrradiance.UnitType	int32	Numeric ID associated with the type of unit being displayed.
*/
    val RelativeHumidity: Int,
    val UVIndex: Int,
    val UVIndexText:Int,
    val CloudCover:Int,
    val MobileLink: String,
    val Link: String
)
