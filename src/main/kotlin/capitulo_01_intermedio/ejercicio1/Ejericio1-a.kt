package capitulo_01_intermedio.ejercicio1

// ¿Cómo comprobar el tipo de un objeto en kotlin? ¿Cómo hacer un casteo seguro?

fun main() {
    val miVariable: Any = "Hola, mundo"
    val esString = miVariable is String
    val esInt = miVariable is Int
    println("Es mi variable de tipo String = $esString")
    println("Es mi variable de tipo Int = $esInt")

    when(miVariable){
        is String -> {
            println("Mi variable tiene ${miVariable.length} caracteres")
        }
        is Int -> {
            println("Dividimos mi variable entre 2 = ${miVariable.div(2)}")
        }
        else -> {}
    }

    // Operador de conversión "as"
    val miString = miVariable as? String
    println("MiString = $miString")
}