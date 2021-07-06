package ar.edu.unahur.obj2.impostoresPaises

import io.kotest.core.spec.style.DescribeSpec
import io.mockk.MockKObjectScope
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.mockk
import io.mockk.mockkObject

//Requerimiento 4
class APIImpostoraTest: DescribeSpec({
    val apiImpostora = mockk<RestCountriesAPI>()
    Adaptador.api = apiImpostora

    describe("Para 2 paises del Observatorio"){
        it("Argentina y Paraguay son limitrofres"){
            every { Observatorio.sonLimitrofes("argentina","paraguay") } returns true
        }
        it("Argentina y Nigeria NO son limitrofes"){
            every { Observatorio.sonLimitrofes("argentina","nigeria") } returns false
        }

        it("Argentina e Inglaterra necesitanTraduccion"){
            every { Observatorio.necesitanTraduccion("argentina","inglaterra") } returns true
        }
        it("Colombia y Peru NO necesitanTraduccion"){
            every { Observatorio.necesitanTraduccion("colombia","peru") } returns false
        }


        it("Argentina y Bolivia sonPotencialesAliados"){
            every { Observatorio.sonPotencialesAliados("argentina","bolivia") } returns true
        }
        it("Argentina y Brasil NO sonPotencialesAliados porque necesitan traduccion"){
            every { Observatorio.sonPotencialesAliados("argentina","brasil") } returns false
        }
        it("Argentina y Espania NO sonPotencialesAliados porque no comparten bloque regional"){
            every { Observatorio.sonPotencialesAliados("argentina","españa") } returns false
        }
    }

    describe("Para el total de paises del Observatorio"){
        it("Los ISO de los 5 paises con mayor densidad poblacional"){
            every { Observatorio.ISODeLos5paisesConMayorDensidadPoblacional2() } returns listOf("ARG", "URY", "PRY", "CHI", "BOL")
        }
        it("El continente con mas paises plurinacionales"){
            every { Observatorio.continenteConMasPlurinacionales() } returns "America"
        }
        /*it("El promedio de densidad poblacional de los países-isla"){
            //val paisMock1 = mockk<Pais>()
            //val paisMock2 = mockk<Pais>()
            //val paisMock3 = mockk<Pais>()
            //every { Adaptador.api.todosLosPaises() } returns listOf(paisMock1,paisMock2,paisMock3)
            //every { Adaptador.listaPaisesAdaptados() } returns listOf(paisMock1,paisMock2,paisMock3)
            //every { apiImpostora.todosLosPaises() } returns listOf(paisMock1,paisMock2,paisMock3)
            //every { Observatorio.adaptador.listaPaisesAdaptados().filter { it.esUnaIsla() } } returns listOf(paisMock1,paisMock2,paisMock3)
            every { Observatorio.promedioDensidadPoblacionalIslas() } returns 154 //TODO: Para que no divida por 0 hay que hacer que la funcion paisesConIsla.size en promedioDensidadPoblacionalIslas retorne != 0
        }*/
    }
})