package capitulo_01_intermedio.ejercicio4

// ¿Cómo usar el operador ternario en kotlin?

fun main() {

    // val  x = condicion ? valor1 : valor2
    val hora = 6

    val momentoDelDia = if (hora > 12) "Es por la tarde" else "Es por la mañana"
    println(momentoDelDia)
}
