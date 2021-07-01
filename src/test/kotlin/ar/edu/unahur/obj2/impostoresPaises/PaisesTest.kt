package ar.edu.unahur.obj2.impostoresPaises

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe

class PaisesTest: DescribeSpec ({
    val argentina = Pais("argentina","ARG", 44400000,2780400.0,"America", mutableSetOf<String>("UNASUR","MERCOSUR"), mutableSetOf<String>("Español"))
    val bolivia = Pais("bolivia","BOL", 10985059,1098581.0,"America", mutableSetOf<String>("UNASUR"), mutableSetOf<String>("Español", "Quechua", "Aymara"))
    val paraguay = Pais("paraguay","PAR", 10985059,1098581.0,"America", mutableSetOf<String>("UNASUR"), mutableSetOf<String>("Español", "Quechua", "Aymara"))
    val brasil = Pais("brasil","BRA", 212216052,	8515770.0,"America", mutableSetOf<String>("UNASUR","MERCOSUR"), mutableSetOf<String>("Portugues"))

    val cuba = Pais("cuba","CUB", 7353672,406752.0,"America", mutableSetOf<String>("paises centroamericanos"), mutableSetOf<String>("Español"))

    val inglaterra = Pais("inglaterra","ENG",7556900 ,130395.0,"Europa", mutableSetOf<String>("Union Europea"), mutableSetOf<String>("Ingles"))

    argentina.paisesLimitrofes.add(bolivia)
    argentina.paisesLimitrofes.add(paraguay)
    argentina.paisesLimitrofes.add(brasil)
    bolivia.paisesLimitrofes.add(argentina)
    bolivia.paisesLimitrofes.add(paraguay)


    describe("un pais") {
        it("esPlurinacional") {
            bolivia.esPlurinacional().shouldBeTrue()
        }
        it("NO esPlurinacional") {
            argentina.esPlurinacional().shouldBeFalse()
        }

        it("esUnaIsla") {
            cuba.esUnaIsla().shouldBeTrue()
        }
        it("NO esUnaIsla") {
            argentina.esUnaIsla().shouldBeFalse()
        }

        it("densidadPoblacional") {
            argentina.densidadPoblacional() shouldBe 15.968925334484247
        }

        it("vecinoMasPoblado") {
            argentina.vecinoMasPoblado() shouldBe brasil
        }
    }

    describe("dos paises"){
        it("son limitrofes"){
            argentina.esLimitrofreDe(bolivia).shouldBeTrue()
        }
        it("NO son limitrofes"){
            argentina.esLimitrofreDe(cuba).shouldBeFalse()
        }

        it("necesitan traduccion"){
            argentina.necesitanTraduccionCon(inglaterra).shouldBeTrue()
        }
        it("NO necesitan traduccion"){
            argentina.necesitanTraduccionCon(bolivia).shouldBeFalse()
        }

        it("son potenciales aliados"){
            argentina.esPotencialAliadosCon(bolivia).shouldBeTrue()
        }
        it("NO son potenciales aliados por no compartir bloque regional"){
            argentina.esPotencialAliadosCon(inglaterra).shouldBeFalse()
        }
        it("NO son potenciales aliados por necesitar traduccion"){
            argentina.esPotencialAliadosCon(brasil).shouldBeFalse()
        }
    }

})