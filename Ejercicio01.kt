
fun main() {

    val nombre: String = "Bodoque"
    val correo: String = "bodoque@email.com"
    val telefono: String = "8112345678"
    val satisfaccion: Double = 9.5

    var edad: Int = 20
    var cuentaActiva: Boolean = true

    println("INFORMACION DEL USUARIO")
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Correo: $correo")
    println("Telefono: $telefono")
    println("Cuenta activa: $cuentaActiva")
    println("Satisfaccion: $satisfaccion")

    edad = 21
    cuentaActiva = false

    println("\nINFORMACION ACTUALIZADA")
    println("Nueva edad: $edad")
    println("Cuenta activa: $cuentaActiva")
}

