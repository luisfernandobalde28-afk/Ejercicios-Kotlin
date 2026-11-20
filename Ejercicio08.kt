
fun sumar(numero1: Double, numero2: Double): Double {
    return numero1 + numero2
}

fun restar(numero1: Double, numero2: Double): Double {
    return numero1 - numero2
}

fun multiplicar(numero1: Double, numero2: Double): Double {
    return numero1 * numero2
}

fun dividir(numero1: Double, numero2: Double): Double {
    return numero1 / numero2
}

fun main() {

    println("CALCULADORA MEDIANTE FUNCIONES")

    print("Ingresa el primer numero: ")
    val numero1 = readln().toDouble()

    print("Ingresa el segundo numero: ")
    val numero2 = readln().toDouble()

    println("\nOPERACIONES")
    println("1. Sumar")
    println("2. Restar")
    println("3. Multiplicar")
    println("4. Dividir")

    print("Selecciona una operacion: ")
    val opcion = readln().toInt()

    when (opcion) {

        1 -> println("Resultado: ${sumar(numero1, numero2)}")

        2 -> println("Resultado: ${restar(numero1, numero2)}")

        3 -> println("Resultado: ${multiplicar(numero1, numero2)}")

        4 -> {
            if (numero2 != 0.0) {
                println("Resultado: ${dividir(numero1, numero2)}")
            } else {
                println("Error: No se puede dividir entre cero.")
            }
        }

        else -> println("Opcion no valida.")
    }
}
