package ar.edu.unahur.obj2.impostoresPaises

object Adaptador {

    val api: RestCountriesAPI = RestCountriesAPI()

    fun listaPaisesAdaptados() = api.todosLosPaises().map { this.adaptarAPais(it) }


    fun adaptarAPais(country: Country): Pais{
        val pais = Pais(
            country.name,
            country.alpha3Code,
            country.population,
            country.area!!,
            country.region,
            adaptarBloqueRegional(country.regionalBlocs),
            adaptarIdiomas(country.languages)
        )
        pais.paisesLimitrofes.addAll(adaptarLimitrofes(country.borders))
        return pais
    }

    private fun adaptarBloqueRegional(regionalBloc: List<RegionalBloc>): MutableSet<String> =
        regionalBloc.map { it.acronym }.toMutableSet()

    private fun adaptarIdiomas(languages: List<Language>): MutableSet<String> =
        languages.map { it.name }.toMutableSet()

    private fun adaptarLimitrofes(borders: List<String>): MutableSet<Pais> =
        borders.map { convertirAPaisIsla(api.paisConCodigo(it)) }.toMutableSet()

    private fun convertirAPaisIsla(country: Country): Pais {
        return Pais(
            country.name,
            country.alpha3Code,
            country.population,
            country.area!!,
            country.region,
            adaptarBloqueRegional(country.regionalBlocs),
            adaptarIdiomas(country.languages)
        )
    }

    fun ubicarPais(pais: String): Country {
        var country = this.api.buscarPaisesPorNombre(pais)

        if(country.isEmpty()) {
            country = listOf(
                Country(
                    name = "",
                    alpha3Code = "",
                    capital = "",
                    region = "",
                    population = 0,
                    area = 0.0,
                    emptyList(),
                    languages = listOf(Language("")),
                    regionalBlocs = listOf(RegionalBloc("",""))
                )
            )
        }
        return country.first()
    }
}