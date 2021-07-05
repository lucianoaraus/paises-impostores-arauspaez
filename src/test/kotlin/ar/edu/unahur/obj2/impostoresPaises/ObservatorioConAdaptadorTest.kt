package ar.edu.unahur.obj2.impostoresPaises

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.collections.shouldBeEmpty
import io.kotest.matchers.collections.shouldContainExactlyInAnyOrder
import io.kotest.matchers.shouldBe

class ObservatorioConAdaptadorTest: DescribeSpec({

    describe("Para 2 paises del Observatorio"){

        it("Argentina y Paraguay son limitrofres"){
            Observatorio.sonLimitrofes("argentina","paraguay").shouldBeTrue()
        }
        it("Argentina y Nigeria NO son limitrofes"){
            Observatorio.sonLimitrofes("argentina","nigeria").shouldBeFalse()
        }

        it("Argentina y Japón necesitanTraduccion"){
            Observatorio.necesitanTraduccion("argentina","japan").shouldBeTrue()
        }
        it("Colombia y Peru NO necesitanTraduccion"){
            Observatorio.necesitanTraduccion("colombia","perú").shouldBeFalse()
        }


        it("Argentina y Bolivia sonPotencialesAliados"){
            Observatorio.sonPotencialesAliados("argentina","bolivia").shouldBeTrue()
        }
        it("Cabo Verde y Nigeria NO sonPotencialesAliados porque necesitan traduccion"){
            Observatorio.sonPotencialesAliados("Cabo Verde","Nigeria").shouldBeFalse()
        }
        it("Argentina y Espania NO sonPotencialesAliados porque no comparten bloque regional"){
            Observatorio.sonPotencialesAliados("argentina","españa").shouldBeFalse()
        }
    }

    describe("Para el total de paises del Observatorio"){

        it("Los ISO de los 5 paises con mayor densidad poblacional"){
            Observatorio.ISODeLos5paisesConMayorDensidadPoblacional2().shouldContainExactlyInAnyOrder("AFG", "ALA", "ALB", "DZA", "ASM")
        }

        it("El continente con mas paises plurinacionales"){
            Observatorio.continenteConMasPlurinacionales().shouldBe("Africa")
        }

        it("El promedio de densidad poblacional de los países-isla"){
            Observatorio.promedioDensidadPoblacionalIslas().shouldBe(317)
        }
    }
})
