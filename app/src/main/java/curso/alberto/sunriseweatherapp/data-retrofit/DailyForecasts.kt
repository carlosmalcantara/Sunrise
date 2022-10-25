package curso.alberto.sunriseweatherapp.`data-retrofit`

data class DailyForecasts(
    val moon: Moon,
    val temperature: Temperatura_min_max_unidades,
    val realFeelTemperature: Temperatura_min_max_unidades,
    val realFeelTemperatureShade: Temperatura_min_max_unidades,
    val hoursOfSun: Float,
    /*
val DailyForecasts.DegreeDaySummary.Heating.Value	double	Number of degrees that the mean temperature is below 65 degrees F. Displayed in specified units. May be NULL.
val DailyForecasts.DegreeDaySummary.Heating.Unit	string	Type of unit.
val DailyForecasts.DegreeDaySummary.Heating.UnitType	int32	Numeric ID associated with the type of unit being displayed.
val DailyForecasts.DegreeDaySummary.Cooling.Value	double	Number of degrees that the mean temperature is above 65 degrees F. Displayed in specified units. May be NULL.
val DailyForecasts.DegreeDaySummary.Cooling.Unit	string	Type of unit.
val DailyForecasts.DegreeDaySummary.Cooling.UnitType	int32	Numeric ID associated with the type of unit being displayed.
val DailyForecasts.AirAndPollen.Name	string	Name of the pollen or air pollutant.
val DailyForecasts.AirAndPollen.Value	int32	Value of the pollutant. Values associated with mold, grass, weed, and tree are displayed in parts per cubic meter. Air quality and UV index are indices and are unitless. May be NULL.
val DailyForecasts.AirAndPollen.Category	string	Category of the pollution. (low, high, good, moderate, unhealthy, hazardous)
val DailyForecasts.AirAndPollen.CategoryValue	int32	Value associated with the category. These values range from 1 to 6, with 1 implying good conditions and 6 implying hazardous conditions.
val DailyForecasts.AirAndPollen.Type	string	Only exists for air quality. Examples include ozone and particle pollution.
val DailyForecasts.Day.Icon	int32	Numeric value representing an icon that matches the forecast.
val DailyForecasts.Day.IconPhrase	string	Phrase description of the icon.
val DailyForecasts.Day.LocalSource.Id	int32	Numeric identifier, unique to the local data provider.
val DailyForecasts.Day.LocalSource.Name	string	Name of the local data provider. Name is displayed in the language specified by language code in URL, if available. Otherwise, Name is displayed in English or the language in which the name was provided.
val DailyForecasts.Day.LocalSource.WeatherCode	string	Weather code provided by the local data provider. This weather code allows the forecast to be matched to icons provided by the local data provider instead of AccuWeather icons.
val DailyForecasts.Day.HasPrecipitation	Boolean	Boolean value that indicates the presence of any type of precipitation for a given day. Displays true if precipitation is present.
val DailyForecasts.Day.PrecipitationType	String	Indicates if the precipitation is rain, snow, ice, or mixed. Only returned if HasPrecipitation is true.
val DailyForecasts.Day.PrecipitationIntensity	String	Indicates if the precipitation strength is light, moderate, or heavy. Only returned if HasPrecipitation is true.
val DailyForecasts.Day.ShortPhrase	string	Phrase description of the forecast. AccuWeather attempts to keep this phrase under 30 characters in length, but some languages/weather events may result in a phrase exceeding 30 characters.
val DailyForecasts.Day.LongPhrase	string	Phrase description of the forecast. AccuWeather attempts to keep this phrase under 100 characters in length, but some languages/weather events may result in a phrase exceeding 100 characters.
val DailyForecasts.Day.PrecipitationProbability	int32	Percent representing the probability of precipitation. May be NULL.
val DailyForecasts.Day.ThunderstormProbability	int32	Percent representing the probability of a thunderstorm. May be NULL.
val DailyForecasts.Day.RainProbability	int32	Percent representing the probability of rain. May be NULL.
val DailyForecasts.Day.SnowProbability	int32	Percent representing the probability of snow. May be NULL.
val DailyForecasts.Day.IceProbability	int32	Percent representing the probability of ice. May be NULL.
val DailyForecasts.Day.Wind.Speed.Value	double	Rounded value in specified units. May be NULL.
val DailyForecasts.Day.Wind.Speed.Unit	string	Type of unit.
val DailyForecasts.Day.Wind.Speed.UnitType	int32	Numeric ID associated with the type of unit being displayed.
val DailyForecasts.Day.Wind.Direction.Degrees	double	Wind direction in azimuth degrees (for example, 180° indicates wind coming from the south).
val DailyForecasts.Day.Wind.Direction.Localized	string	Direction abbreviation in the specified language.
val DailyForecasts.Day.Wind.Direction.English	string	Direction abbreviation in English.
val DailyForecasts.Day.WindGust.Speed.Value	double	Rounded value in specified units. May be NULL.
val DailyForecasts.Day.WindGust.Speed.Unit	string	Type of unit.
val DailyForecasts.Day.WindGust.Speed.UnitType	int32	Numeric ID associated with the type of unit being displayed.
val DailyForecasts.Day.TotalLiquid.Value	double	Rounded value in specified units. May be NULL.
val DailyForecasts.Day.TotalLiquid.Unit	string	Type of unit.
val DailyForecasts.Day.TotalLiquid.UnitType	int32	Numeric ID associated with the type of unit being displayed.
val DailyForecasts.Day.Rain.Value	double	Rounded value in specified units. May be NULL.
val DailyForecasts.Day.Rain.Unit	string	Type of unit.
val DailyForecasts.Day.Rain.UnitType	int32	Numeric ID associated with the type of unit being displayed.
val DailyForecasts.Day.Snow.Value	double	Rounded value in specified units. May be NULL.
val DailyForecasts.Day.Snow.Unit	string	Type of unit.
val DailyForecasts.Day.Snow.UnitType	int32	Numeric ID associated with the type of unit being displayed.
val DailyForecasts.Day.Ice.Value	double	Rounded value in specified units. May be NULL.
val DailyForecasts.Day.Ice.Unit	string	Type of unit.
val DailyForecasts.Day.Ice.UnitType	int32	Numeric ID associated with the type of unit being displayed.
val DailyForecasts.Day.HoursOfPrecipitation	float	Number of hours of precipitation of any type.
val DailyForecasts.Day.HoursOfRain	float	Number of hours of rain.
val DailyForecasts.Day.CloudCover	int32	Percent representing cloud cover.
val DailyForecasts.Day.Evapotranspiration.Value	double	Rounded value in specified units. May be NULL.
val DailyForecasts.Day.Evapotranspiration.Unit	string	Type of unit.
val DailyForecasts.Day.Evapotranspiration.UnitType	int32	Numeric ID associated with the type of unit being displayed.
val DailyForecasts.Day.SolarIrradiance.Value	double	Rounded value in specified units. May be NULL.
val DailyForecasts.Day.SolarIrradiance.Unit	string	Type of unit.
val DailyForecasts.Day.SolarIrradiance.UnitType	int32	Numeric ID associated with the type of unit being displayed.
val DailyForecasts.Night.Icon	int32	Numeric value representing an icon that matches the forecast.
val DailyForecasts.Night.IconPhrase	string	Phrase description of the icon.
val DailyForecasts.Night.LocalSource.Id	int32	Numeric identifier, unique to the local data provider.
val DailyForecasts.Night.LocalSource.Name	string	Name of the local data provider. Name is displayed in the language specified by language code in URL, if available. Otherwise, Name is displayed in English or the language in which the name was provided.
val DailyForecasts.Night.LocalSource.WeatherCode	string	Weather code provided by the local data provider. This weather code allows the forecast to be matched to icons provided by the local data provider instead of AccuWeather icons.
val DailyForecasts.Night.HasPrecipitation	Boolean	Boolean value that indicates the presence of any type of precipitation for a given night. Displays true if precipitation is present.
val DailyForecasts.Night.PrecipitationType	String	Indicates if the precipitation is rain, snow, ice, or mixed. Only returned if HasPrecipitation is true.
val DailyForecasts.Night.PrecipitationIntensity	String	Indicates if the precipitation strength is light, moderate, or heavy. Only returned if HasPrecipitation is true.
val DailyForecasts.Night.ShortPhrase	string	Phrase description of the forecast. AccuWeather attempts to keep this phrase under 30 characters in length, but some languages/weather events may result in a phrase exceeding 30 characters.
val DailyForecasts.Night.LongPhrase	string	Phrase description of the forecast. AccuWeather attempts to keep this phrase under 100 characters in length, but some languages/weather events may result in a phrase exceeding 100 characters.
val DailyForecasts.Night.PrecipitationProbability	int32	Percent representing the probability of precipitation. May be NULL.
val DailyForecasts.Night.ThunderstormProbability	int32	Percent representing the probability of a thunderstorm. May be NULL.
val DailyForecasts.Night.RainProbability	int32	Percent representing the probability of rain. May be NULL.
val DailyForecasts.Night.SnowProbability	int32	Percent representing the probability of snow. May be NULL.
val DailyForecasts.Night.IceProbability	int32	Percent representing the probability of ice. May be NULL.
val DailyForecasts.Night.Wind.Speed	object	Contains Value, Unit, and UnitType. For details, see DailyForecasts.Day.Wind.Speed.
val DailyForecasts.Night.Wind.Direction	object	Contains Degrees, Localized, and English. For details, see DailyForecasts.Day.Wind.Direction.
val DailyForecasts.Night.WindGust.Speed	object	Contains Value, Unit, and UnitType. For details, see DailyForecasts.Day.WindGust.Speed.
val DailyForecasts.Night.TotalLiquid	object	Contains Value, Unit, and UnitType. For details, see DailyForecasts.Day.TotalLiquid.
val DailyForecasts.Night.Rain	object	Contains Value, Unit, and UnitType. For details, see DailyForecasts.Day.Rain.
val DailyForecasts.Night.Snow	object	Contains Value, Unit, and UnitType. For details, see DailyForecasts.Day.Snow.
val DailyForecasts.Night.Ice	object	Contains Value, Unit, and UnitType. For details, see DailyForecasts.Day.Ice.
val DailyForecasts.Night.HoursOfPrecipitation	float	Number of hours of precipitation of any type.
val DailyForecasts.Night.HoursOfRain	float	Number of hours of rain.
val DailyForecasts.Night.CloudCover	int32	Percent representing cloud cover.
val DailyForecasts.Night.Evapotranspiration.Value	double	Rounded value in specified units. May be NULL.
val DailyForecasts.Night.Evapotranspiration.Unit	string	Type of unit.
val DailyForecasts.Night.Evapotranspiration.UnitType	int32	Numeric ID associated with the type of unit being displayed.
val DailyForecasts.Night.SolarIrradiance.Value	double	Rounded value in specified units. May be NULL.
val DailyForecasts.Night.SolarIrradiance.Unit	string	Type of unit.
val DailyForecasts.Night.SolarIrradiance.UnitType	int32	Numeric ID associated with the type of unit being displayed.
*/
)
