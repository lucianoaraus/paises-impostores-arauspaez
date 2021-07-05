package ar.edu.unahur.obj2.impostoresPaises

object Observatorio {
    //Falta: que conoce a todos los países y debe poder responder las consultas que se enuncian a continuación.
    val adaptador = Adaptador


    //REVISAR
    //fun listaPaisesAdaptados() = adaptador.api.todosLosPaises().map { adaptador.adaptarAPais(it) }
    //private val listaPaisesAdaptados = adaptador.api.todosLosPaises().map { adaptador.adaptarAPais(it) }

    fun tomarPais(pais: String) = adaptador.adaptarAPais(adaptador.ubicarPais(pais))


    //transformar pais1 y pais2 de String a Obj con el Adaptador
    fun sonLimitrofes(pais1nombre: String,pais2nombre: String): Boolean {
        val pais1 = tomarPais(pais1nombre)
        val pais2 = tomarPais(pais2nombre)
        return pais1.esLimitrofreDe(pais2)
    }

    fun necesitanTraduccion(pais1nombre: String,pais2nombre: String): Boolean {
        val pais1 = tomarPais(pais1nombre)
        val pais2 = tomarPais(pais2nombre)
        return pais1.necesitanTraduccionCon(pais2)
    }

    fun sonPotencialesAliados(pais1nombre: String,pais2nombre: String): Boolean {
        val pais1 = tomarPais(pais1nombre)
        val pais2 = tomarPais(pais2nombre)
        return pais1.esPotencialAliadosCon(pais2)
    }

    fun ISODeLos5paisesConMayorDensidadPoblacional2(): List<String> {
        val listaPaisesAlterna = adaptador.listaPaisesAdaptados()
        listaPaisesAlterna.sortedByDescending { it.densidadPoblacional() }
        return listaPaisesAlterna.take(5).map { it.codigoISO }
    }

    //Indicar el nombre del continente con más paises plurinacionales.
    fun cantidadDePlurinacionalesPorContinente(continente: String) =
        adaptador.listaPaisesAdaptados().filter { it.continente == continente }.filter { it.esPlurinacional() }.size

    fun continenteConMasPlurinacionales() : String? {
        val continentes = adaptador.listaPaisesAdaptados().map { it.continente }.toSet()
        return continentes.maxByOrNull { cantidadDePlurinacionalesPorContinente(it)}
    }

    //Conocer el promedio de densidad poblacional de los países-isla.
    fun promedioDensidadPoblacionalIslas() : Int {
        val paisesConIsla = adaptador.listaPaisesAdaptados().filter { it.esUnaIsla() }
        return paisesConIsla.sumBy { it.densidadPoblacional().toInt() } / paisesConIsla.size
    }
}