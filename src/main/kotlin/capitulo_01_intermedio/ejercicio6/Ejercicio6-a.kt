package capitulo_01_intermedio.ejercicio6

// Dos bucles for anidados. ¿Cómo salir del bucle externo en una iteración del bucle interno?

fun main() {

   for (i in 1..3) {
       println("Estamos en i = $i --- bucle externo")
        for (j in 1..5) {
            println("Estamos en j = $j -- bucle interno")
            if (j == 2){
                break
            }
        }
    }

    println("\n\n")
    miBucleExterno@for (i in 1..3) {
        println("Estamos en i = $i --- bucle externo")
        for (j in 1..5) {
            println("Estamos en j = $j -- bucle interno")
            if (j == 2){
                break@miBucleExterno
            }
        }
    }
}