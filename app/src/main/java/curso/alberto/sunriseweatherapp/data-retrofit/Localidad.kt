package alfredo.retrofit.data
import com.example.pruebarestapi.data.*
import java.sql.Time
import java.util.*
import java.util.TimeZone

data class Localidad(
    val Version: Int,
    val Key: String,
    val Type: String,
    val Rank: Int,
    val LocalizedName: String,
    val EnglishName: String,
    val PrimaryPostalCode: String,
    val Region: Region_Paises,
    val Country: Pais,
    val AdministrativeArea: AdministrativeArea,
    val TimeZone: TimeZone,
    val GeoPosition: GeoPosition,
    val IsAlias: Boolean,
    val ParentCity: ParentCity,
    val SupplementalAdminAreas: List<SupplementalAdminAreas>,
    val DataSets: List<String>
)
