
fun main() {

    var notificaciones = false
    var modoOscuro = false

    println("MENU DE CONFIGURACION")
    println("1. Activar notificaciones")
    println("2. Desactivar notificaciones")
    println("3. Activar modo oscuro")
    println("4. Consultar informacion de la aplicacion")
    println("5. Salir")

    print("Selecciona una opcion: ")
    val opcion = readln().toInt()

    when (opcion) {

        1 -> {
            notificaciones = true
            println("Notificaciones activadas.")
        }

        2 -> {
            notificaciones = false
            println("Notificaciones desactivadas.")
        }

        3 -> {
            modoOscuro = true
            println("Modo oscuro activado.")
        }

        4 -> {
            println("Informacion de la aplicacion")
            println("Notificaciones: $notificaciones")
            println("Modo oscuro: $modoOscuro")
        }

        5 -> {
            println("Saliendo de la aplicacion...")
        }

        else -> {
            println("Opcion no valida.")
        }
    }
}
