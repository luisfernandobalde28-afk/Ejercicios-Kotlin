
fun main() {

    val contrasenaCorrecta = "kotlin123"
    var intentos = 0
    var accesoPermitido = false

    println("INICIO DE SESION")

    while (intentos < 3 && !accesoPermitido) {

        print("Ingresa tu contrasena: ")
        val contrasenaIngresada = readln()

        intentos++

        if (contrasenaIngresada == contrasenaCorrecta) {

            accesoPermitido = true
            println("Acceso permitido. Bienvenido.")

        } else {

            println("Contrasena incorrecta.")

            if (intentos < 3) {
                println("Intentos restantes: ${3 - intentos}")
            }
        }
    }

    if (!accesoPermitido) {
        println("Cuenta bloqueada. Agotaste los tres intentos.")
    }
}
