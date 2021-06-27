package ar.edu.unahur.obj2.impostoresPaises

object Observatorio {
    //Falta: que conoce a todos los países y debe poder responder las consultas que se enuncian a continuación.
    val paises = mutableSetOf<Pais>()
    //transformar pais1 y pais2 de String a Obj con el Adaptador
    fun sonLimitrofes(pais1nombre: String,pais2nombre: String): Boolean {
        val pais1 = paises.find { it.nombre == pais1nombre}
        val pais2 = paises.find { it.nombre == pais2nombre}
        return pais1!!.esLimitrofreDe(pais2!!)
    }

    fun necesitanTraduccion(pais1nombre: String,pais2nombre: String): Boolean{
        val pais1 = paises.find { it.nombre == pais1nombre}
        val pais2 = paises.find { it.nombre == pais2nombre}
        return pais1!!.necesitanTraduccionCon(pais2!!)
    }

    fun sonPotencialesAliados(pais1nombre: String,pais2nombre: String): Boolean{
        val pais1 = paises.find { it.nombre == pais1nombre}
        val pais2 = paises.find { it.nombre == pais2nombre}
        return pais1!!.esPotencialAliadosCon(pais2!!)
    }

    fun ISODeLos5paisesConMayorDensidadPoblacional2(): List<String>{
        val listaPaisesAlterna = mutableListOf<Pais>()
        listaPaisesAlterna.addAll(this.paises)
        listaPaisesAlterna.sortedByDescending { it.densidadPoblacional() }
        val listaFinal = mutableListOf<String>()

        var i = 0
        repeat (5) {
            listaFinal += listaPaisesAlterna[i].codigoISO
            i += 1
        }
        return listaFinal
    }

    fun continenteConMasPlurinacionales() = ""//Indicar el nombre del continente con más paises plurinacionales.

    fun promedioDensidadPoblacionalIslas() = 1 //Conocer el promedio de densidad poblacional de los países-isla.
}