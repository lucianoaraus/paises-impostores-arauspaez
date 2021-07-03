package ar.edu.unahur.obj2.impostoresPaises

import io.kotest.core.spec.style.DescribeSpec
import io.mockk.every
import io.mockk.mockk

class APIImpostoraTest: DescribeSpec({
    val ObservatorioImpostor = mockk<Observatorio>()

    describe("Para 2 paises del Observatorio"){
        it("Argentina y Paraguay son limitrofres"){
            every { ObservatorioImpostor.sonLimitrofes("argentina","paraguay") } returns true
        }
        it("Argentina y Nigeria NO son limitrofes"){
            every { ObservatorioImpostor.sonLimitrofes("argentina","nigeria") } returns false
        }

        it("Argentina e Inglaterra necesitanTraduccion"){
            every { ObservatorioImpostor.necesitanTraduccion("argentina","inglaterra") } returns true
        }
        it("Colombia y Peru NO necesitanTraduccion"){
            every { ObservatorioImpostor.necesitanTraduccion("colombia","peru") } returns false
        }


        it("Argentina y Bolivia sonPotencialesAliados"){
            every { ObservatorioImpostor.sonPotencialesAliados("argentina","bolivia") } returns true
        }
        it("Argentina y Brasil NO sonPotencialesAliados porque necesitan traduccion"){
            every { ObservatorioImpostor.sonPotencialesAliados("argentina","brasil") } returns false
        }
        it("Argentina y Espania NO sonPotencialesAliados porque no comparten bloque regional"){
            every { ObservatorioImpostor.sonPotencialesAliados("argentina","españa") } returns false
        }
    }

    describe("Para el total de paises del Observatorio"){
        /*it("Los ISO de los 5 paises con mayor densidad poblacional"){
            every { ObservatorioImpostor.ISODeLos5paisesConMayorDensidadPoblacional2() } returnsMany ("ARG", "URY", "PRY", "CHI", "BOL") //Hay que buscar alguno para devolver lista
        }*/

        it("El continente con mas paises plurinacionales"){
            every { ObservatorioImpostor.continenteConMasPlurinacionales() } returns "America"
        }

        it("El promedio de densidad poblacional de los países-isla"){
            every { ObservatorioImpostor.promedioDensidadPoblacionalIslas() } returns 154
        }
    }
})