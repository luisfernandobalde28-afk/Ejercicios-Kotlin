
fun main() {

    println("VALIDACION DE ACCESO")

    print("Ingresa tu edad: ")
    val edad = readln().toInt()

    if (edad < 0) {
        println("Error: La edad no puede ser negativa.")

    } else if (edad >= 18) {
        println("Acceso permitido. Puedes continuar con el registro.")

    } else {
        println("Acceso denegado. Debes tener al menos 18 años.")
    }
}
