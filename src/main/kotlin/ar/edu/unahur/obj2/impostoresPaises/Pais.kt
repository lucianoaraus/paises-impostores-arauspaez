package ar.edu.unahur.obj2.impostoresPaises

class Pais (
    val nombre: String,
    val codigoISO: String,
    val poblacion: Int,
    val superficie: Double,
    val continente: String,
    val bloquesRegionales: MutableSet<String>,
    val idiomas: MutableSet<String>
        ){
    var paisesLimitrofes = mutableSetOf<Pais>()

    fun esPlurinacional() = idiomas.size > 1

    fun esUnaIsla() = paisesLimitrofes.isEmpty()

    fun densidadPoblacional() = poblacion / superficie

    //fun vecinoMasPoblado() = "Busca al limitrofe mas poblado, si es mas poblado que el que consulta va el limitrofe sino va el que consulta"
}