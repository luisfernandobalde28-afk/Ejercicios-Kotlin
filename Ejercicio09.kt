
fun validarNombre(nombre: String): Boolean {
    return nombre.isNotBlank()
}

fun validarCorreo(correo: String): Boolean {
    return correo.contains("@")
}

fun validarEdad(edad: Int): Boolean {
    return edad >= 18
}

fun validarContrasena(contrasena: String): Boolean {
    return contrasena.length >= 8
}

fun main() {

    println("VALIDACION DE REGISTRO")

    print("Ingresa tu nombre: ")
    val nombre = readln()

    print("Ingresa tu correo electronico: ")
    val correo = readln()

    print("Ingresa tu edad: ")
    val edad = readln().toInt()

    print("Ingresa tu contrasena: ")
    val contrasena = readln()

    println("\nRESULTADOS DE VALIDACION")

    println("Nombre valido: ${validarNombre(nombre)}")
    println("Correo valido: ${validarCorreo(correo)}")
    println("Edad valida: ${validarEdad(edad)}")
    println("Contrasena valida: ${validarContrasena(contrasena)}")
}
