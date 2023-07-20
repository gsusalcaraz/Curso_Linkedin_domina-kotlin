package capitulo_01_intermedio.ejercicio5

// Convertir una escalera if-else-if a una sentencia when.
enum class EstadoDelCielo {
    DESPEJADO,
    MEDIO_NUBLADO,
    NUBLADO
}

fun main() {

    var temperatura = 3 // ºC
    var cielo: EstadoDelCielo = EstadoDelCielo.NUBLADO

    if (cielo == EstadoDelCielo.DESPEJADO) {
        println("Sin precipitaciones")
    } else if (temperatura > 5 && cielo == EstadoDelCielo.NUBLADO) {
        println("Se esperan lluvias")
    } else if (cielo == EstadoDelCielo.MEDIO_NUBLADO) {
        println("50% precipitaciones")
    } else {
        println("Se espera nieve")
    }

    when{
        cielo == EstadoDelCielo.DESPEJADO -> println("Sin precipitaciones")
        cielo == EstadoDelCielo.NUBLADO && temperatura > 5 -> println("Se esperan lluvias")
        cielo == EstadoDelCielo.MEDIO_NUBLADO -> println("50% precipitaciones")
        else -> println("Se espera nieve")
    }
}