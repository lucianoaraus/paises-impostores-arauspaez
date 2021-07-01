package ar.edu.unahur.obj2.impostoresPaises
/*
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.collections.shouldContainExactlyInAnyOrder
import io.kotest.matchers.shouldBe

class ObservatorioTest: DescribeSpec({

    val argentina = Pais("argentina","ARG", 44464434,278000.0,"America", mutableSetOf<String>("UNASUR","MERCOSUR"), mutableSetOf<String>("español"))
    val uruguay = Pais("uruguay","URY", 3564434,176215.0,"America", mutableSetOf<String>("UNASUR","MERCOSUR"), mutableSetOf<String>("español"))
    val paraguay = Pais("paraguay","PRY", 7464434,406752.0,"America", mutableSetOf<String>("UNASUR","MERCOSUR"), mutableSetOf<String>("español","guarani"))
    val chile = Pais("chile","CHI", 19164434,756950.0,"America", mutableSetOf<String>("UNASUR","MERCOSUR"), mutableSetOf<String>("español"))
    val bolivia = Pais("bolivia","BOL",11664434, 1099000.0,"America", mutableSetOf<String>("UNASUR","MERCOSUR"), mutableSetOf<String>("español","quechua","aimara","guarani"))
    val venezuela = Pais("venezuela","VEN", 28434434,916445.0,"America", mutableSetOf<String>("UNASUR"), mutableSetOf<String>("español"))
    val peru = Pais("peru","PER", 33464434,1285000.0,"America", mutableSetOf<String>("UNASUR"), mutableSetOf<String>("español"))
    val colombia = Pais("colombia","COL", 50464434,1143000.0,"America", mutableSetOf<String>("UNASUR"), mutableSetOf<String>("español"))
    val brasil = Pais("brasil","BRA", 212464434,8516000.0,"America", mutableSetOf<String>("UNASUR","MERCOSUR"), mutableSetOf<String>("portugues"))

    val espania = Pais("españa","ESP", 47464434,505990.0,"Europa", mutableSetOf<String>("Union Europea"), mutableSetOf<String>("castellano"))
    val italia = Pais("italia","ITA", 60464434,301340.0,"Europa", mutableSetOf<String>("Union Europea"), mutableSetOf<String>("italiano"))
    val portugal = Pais("portugal","POR", 10464434,92090.0,"Europa", mutableSetOf<String>("Union Europea"), mutableSetOf<String>("portugues","mirandes"))
    val inglaterra = Pais("inglaterra","ENG", 56464434,130395.0,"Europa", mutableSetOf<String>("Union Europea"), mutableSetOf<String>("ingles"))

    val japon = Pais("japon","JPN", 126644334,377975.0,"Asia", mutableSetOf<String>("Paises asiaticos"), mutableSetOf<String>("japones"))
    val china = Pais("china","CHN", 1339644334,9596960.0,"Asia", mutableSetOf<String>("Paises asiaticos"), mutableSetOf<String>("chino","mandarin"))
    val india = Pais("india","IND", 1372644334,3287263.0,"Asia", mutableSetOf<String>("Paises asiaticos"), mutableSetOf<String>("hindi","ingles"))

    val sudafrica = Pais("sudafrica","RSA", 58644334,1219090.0,"Africa", mutableSetOf<String>("Paises africanos"), mutableSetOf<String>("zulu","ingles","afrikaans"))
    val nigeria = Pais("nigeria","NGR", 159644334,923768.0,"Africa", mutableSetOf<String>("Paises africanos"), mutableSetOf<String>("ingles"))

    val australia = Pais("australia","AUS", 25644334,7741220.0,"oceania", mutableSetOf<String>("Paises oceanicos"), mutableSetOf<String>("ingles"))
    val nuevaZelanda = Pais("nueva zelanda","NZL", 5644334,	268838.0,"oceania", mutableSetOf<String>("Paises oceanicos"), mutableSetOf<String>("ingles","maori"))

    //Agregamos los limitrofes
    argentina.paisesLimitrofes.add(paraguay)
    argentina.paisesLimitrofes.add(uruguay)
    argentina.paisesLimitrofes.add(chile)
    argentina.paisesLimitrofes.add(bolivia)
    argentina.paisesLimitrofes.add(brasil)
    brasil.paisesLimitrofes.add(uruguay)
    brasil.paisesLimitrofes.add(paraguay)
    brasil.paisesLimitrofes.add(bolivia)
    brasil.paisesLimitrofes.add(peru)
    brasil.paisesLimitrofes.add(colombia)
    brasil.paisesLimitrofes.add(venezuela)
    venezuela.paisesLimitrofes.add(colombia)
    colombia.paisesLimitrofes.add(peru)
    peru.paisesLimitrofes.add(bolivia)
    peru.paisesLimitrofes.add(chile)
    chile.paisesLimitrofes.add(bolivia)
    bolivia.paisesLimitrofes.add(paraguay)

    //Agregamos los paises al Observatorio
    Observatorio.paises.addAll(setOf(argentina,uruguay,paraguay,chile,bolivia,venezuela,peru,colombia,brasil,espania,italia,portugal,inglaterra,japon,china,india,sudafrica,nigeria,australia,nuevaZelanda))

    describe("Para 2 paises del Observatorio"){
        it("Argentina y Bolivia son limitrofres"){
            Observatorio.sonLimitrofes("argentina","bolivia").shouldBeTrue()
        }
        it("Argentina y Nigeria NO son limitrofes"){
            Observatorio.sonLimitrofes("argentina","nigeria").shouldBeFalse()
        }

        it("Argentina e Inglaterra necesitanTraduccion"){
            Observatorio.necesitanTraduccion("argentina","inglaterra").shouldBeTrue()
        }
        it("Colombia y Peru NO necesitanTraduccion"){
            Observatorio.necesitanTraduccion("colombia","peru").shouldBeFalse()
        }


        it("Argentina e Bolivia sonPotencialesAliados"){
            Observatorio.sonPotencialesAliados("argentina","bolivia").shouldBeTrue()
        }
        it("Argentina y Brasil NO sonPotencialesAliados porque necesitan traduccion"){
            Observatorio.sonPotencialesAliados("argentina","brasil").shouldBeFalse()
        }
        it("Argentina y Espania NO sonPotencialesAliados porque no comparten bloque regional"){
            Observatorio.sonPotencialesAliados("argentina","españa").shouldBeFalse()
        }
    }

    describe("Para el total de paises del Observatorio"){
        it("Los ISO de los 5 paises con mayor densidad poblacional"){
            Observatorio.ISODeLos5paisesConMayorDensidadPoblacional2().shouldContainExactlyInAnyOrder("ARG", "URY", "PRY", "CHI", "BOL")
        }

        it("El continente con mas paises plurinacionales"){
            Observatorio.continenteConMasPlurinacionales().shouldBe("America")
        }

        it("El promedio de densidad poblacional de los países-isla"){
            Observatorio.promedioDensidadPoblacionalIslas().shouldBe(154)
        }
    }
})*/
