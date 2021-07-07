package ar.edu.unahur.obj2.impostoresPaises

import io.kotest.core.spec.style.DescribeSpec
import io.mockk.every
import io.mockk.mockk


//Requerimiento 4
class APIImpostoraTest: DescribeSpec({
    val apiImpostora = mockk<RestCountriesAPI>()
    Adaptador.api = apiImpostora


    it("buscarPaisesPorNombre") {
        every { Adaptador.api.buscarPaisesPorNombre("colombia") } returns listOf(
            Country("colombia",
                "COL",
                "bogota",
                "Americas",
                51049498,
                1141748.0,
                listOf("UNASUR"),
                listOf(Language("Español")),
                listOf(RegionalBloc("",""))
            )
        )
        every { Adaptador.api.buscarPaisesPorNombre("cuba") } returns listOf(
            Country("cuba",
                "CUB",
                "La Habana",
                "Antillas Mayores",
                11330000,
                109884.0,
                listOf("paises centroamericanos"),
                listOf(Language("Español")),
                listOf(RegionalBloc("",""))
            )
        )
        every { Adaptador.api.buscarPaisesPorNombre("japon") } returns listOf(
            Country(
                "japon",
                "JAP",
                "Tokio",
                "Asia",
                12615000,
                377975.0,
                listOf("pais"),
                listOf(Language("japones")),
                listOf(RegionalBloc("",""))
            )
        )
    }

    it("paisConCodigo"){
        every { Adaptador.api.paisConCodigo("COL") } returns
                Country("colombia",
                    "COL",
                    "bogota",
                    "Americas",
                    51049498,
                    1141748.0,
                    listOf("UNASUR"),
                    listOf(Language("Español")),
                    listOf(RegionalBloc("",""))
                )

        every { Adaptador.api.paisConCodigo("CUB") } returns
                Country("cuba",
                    "CUB",
                    "La Habana",
                    "Antillas Mayores",
                    11330000,
                    109884.0,
                    listOf("paises centroamericanos"),
                    listOf(Language("Español")),
                    listOf(RegionalBloc("",""))
                )

        every { Adaptador.api.buscarPaisesPorNombre("JAP") } returns listOf(
            Country(
                "japon",
                "JAP",
                "Tokio",
                "Asia",
                12615000,
                377975.0,
                listOf("pais"),
                listOf(Language("japones")),
                listOf(RegionalBloc("",""))
            )
        )
    }
    it("todosLosPaíses") {
        every{ Adaptador.api.todosLosPaises() } returns listOf(
            Country(
                "Cabo Verde",
                "CPV",
                "Praia",
                "Africa",
                531239,
                4033.0,
                emptyList(),
                listOf(Language("Portuguese")),
                listOf(RegionalBloc("AU", "African Union"))
            ),
            Country(
                "japon",
                "JAP",
                "Tokio",
                "Asia",
                12615000,
                377975.0,
                listOf("pais"),
                listOf(Language("japones")),
                listOf(RegionalBloc("",""))
            ),
            Country(
                "nueva zelanda",
                "NZL",
                "Wellington",
                "paises de oceania",
                5644334,
                268838.0,
                listOf("Paises oceanicos"),
                listOf(Language("ingles"),Language("maori")),
                listOf(RegionalBloc("",""))
            ),
            Country(
                "Bolivia (Plurinational State of)",
                "BOL",
                "Sucre",
                "Americas",
                10985059,
                1098581.0,
                listOf("ARG", "BRA", "CHL", "PRY", "PER"),
                listOf(Language("Spanish"), Language("Aymara"), Language("Quechua")),
                listOf(RegionalBloc("USAN", "Union of South American Nations"))
            )

        )
    }

})