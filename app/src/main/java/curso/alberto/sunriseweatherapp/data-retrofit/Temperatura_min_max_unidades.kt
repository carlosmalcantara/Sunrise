package curso.alberto.sunriseweatherapp.`data-retrofit`

data class Temperatura_min_max_unidades(
    val Minimum: Dato_temperatura,
    val Maximum: Dato_temperatura
)

data class Dato_temperatura(
    val value: Double,
    val unit: String,
    val unitType: Int
)