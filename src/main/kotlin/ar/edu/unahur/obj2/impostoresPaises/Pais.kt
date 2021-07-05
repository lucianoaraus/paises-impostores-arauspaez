package ar.edu.unahur.obj2.impostoresPaises

class Pais (
    val nombre: String,
    val codigoISO: String,
    val poblacion: Long,
    val superficie: Double,
    val continente: String,
    val bloquesRegionales: MutableSet<String>,
    val idiomas: MutableSet<String>){

    var paisesLimitrofes = mutableSetOf<Pais>()

    fun esPlurinacional() = idiomas.size > 1

    fun esUnaIsla() = paisesLimitrofes.isEmpty()

    fun densidadPoblacional() = poblacion / superficie

    //Busca al limitrofe mas poblado, si es mas poblado que el que consulta va el limitrofe sino va el que consulta
    fun vecinoMasPoblado(): Pais {
        val masPoblado = paisesLimitrofes.maxByOrNull { it.poblacion }

        return if(this.poblacion <= masPoblado!!.poblacion) masPoblado
        else this
    }

    fun esLimitrofreDe(pais: Pais) = paisesLimitrofes.map { it.nombre }.contains(pais.nombre)

    fun necesitanTraduccionCon(pais: Pais) = idiomas.intersect(pais.idiomas).isEmpty()

    fun comparteBloqueRegionalCon(pais: Pais) = bloquesRegionales.intersect(pais.bloquesRegionales).isNotEmpty()

    fun esPotencialAliadosCon(pais: Pais) = !necesitanTraduccionCon(pais) and comparteBloqueRegionalCon(pais)
}