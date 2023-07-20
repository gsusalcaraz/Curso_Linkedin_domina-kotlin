package capitulo_01_intermedio.ejercicio8

// Cómo pasar una función cómo parámetro a otra función.

fun main() {
    val multiplicar: (Int, Int) -> Int = { y, x -> y * x }
    mostrarResultado(2, 3, multiplicar)
    mostrarResultado(2, 3) { it, it2 -> it * it2 }
}

private fun mostrarResultado(operando1: Int, operando2: Int, operacion: (Int, Int) -> Int) {
    val resultado = operacion(operando1, operando2)
    println("El resultado es $resultado")
}
