package capitulo_01_intermedio.ejercicio9

//Quiero devolver una función lambda como resultado de otra función.

fun main() {


    val operacion1 = devolverOperacionArea(Poligono.TRIANGULO)
    val operacion2 = devolverOperacionArea(Poligono.ROMBOIDE)

    println("El áerea de un triángulo con base 7 y altura 3 es = ${operacion1(7.0,3.0)}")
    println("El área de un ${Poligono.ROMBOIDE.name} con base 7 y altura 3 es = ${operacion2(7.0,3.0)}")
}

private fun devolverOperacionArea(poligono: Poligono): (Double, Double) -> Double {
    return when (poligono) {
        Poligono.TRIANGULO, Poligono.ROMBO -> { x, y -> x * y / 2 }
        // Poligono.CUADRADO, Poligono.RECTANGULO, Poligono.ROMBOIDE -> { x, y -> x * y }
        else -> { x, y -> x * y }
    }
}

private enum class Poligono {
    TRIANGULO,
    CUADRADO,
    RECTANGULO,
    ROMBO,
    ROMBOIDE
}

/**
 * triángulo -> (base * altura) / 2
 * cuadrado -> lado * lado
 * rectágulo -> lado * lado
 * rombo -> (diagonal_pequeña * diagonal_grande) / 2
 * romboide -> base * altura
 */