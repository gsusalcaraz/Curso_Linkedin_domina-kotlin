package capitulo_01_intermedio.ejercicio7

// Añadir un parámetro opcional en mi función


fun main() {
    calculoSueldoMensual("Pepe", 12, 40000)
    calculoSueldoMensual(nPagas = 12, sueldoAnualTotal = 40_000)
}

fun calculoSueldoMensual(nombreEmpleado: String? = "Anónimo", nPagas: Int = 12, sueldoAnualTotal: Int) {
    //calculo del sueldo mensual
    val sueldoMensual = sueldoAnualTotal / nPagas
    println("El sueldo mensual de $nombreEmpleado es: $sueldoMensual")
}