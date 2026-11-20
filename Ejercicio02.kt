
fun main() {

    println("CALCULADORA DE ALMACENAMIENTO")

    print("Ingresa la capacidad total del dispositivo (GB): ")
    val capacidadTotal = readln().toDouble()

    print("Ingresa el espacio ocupado por aplicaciones (GB): ")
    val aplicaciones = readln().toDouble()

    print("Ingresa el espacio ocupado por fotografias (GB): ")
    val fotografias = readln().toDouble()

    print("Ingresa el espacio ocupado por videos (GB): ")
    val videos = readln().toDouble()

    val espacioUtilizado = aplicaciones + fotografias + videos

    if (capacidadTotal > 0 && espacioUtilizado <= capacidadTotal && aplicaciones >= 0 && fotografias >= 0 && videos >= 0) {

        val espacioDisponible = capacidadTotal - espacioUtilizado
        val porcentajeOcupado = (espacioUtilizado / capacidadTotal) * 100

        println("\nRESULTADOS")
        println("Espacio utilizado: $espacioUtilizado GB")
        println("Espacio disponible: $espacioDisponible GB")
        println("Porcentaje ocupado: $porcentajeOcupado%")

    } else {
        println("Error: Verifica los datos ingresados.")
    }
}
