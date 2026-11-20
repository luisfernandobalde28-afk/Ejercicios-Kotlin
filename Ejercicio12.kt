
class Bateria {

    private var porcentaje: Int = 100

    fun consultarPorcentaje(): Int {
        return porcentaje
    }

    fun consumir(cantidad: Int): Boolean {

        if (cantidad <= 0 || cantidad > porcentaje) {
            println("Error: Consumo no valido.")
            return false
        }

        porcentaje -= cantidad
        println("Bateria consumida correctamente.")
        return true
    }

    fun cargar(cantidad: Int): Boolean {

        if (cantidad <= 0 || porcentaje + cantidad > 100) {
            println("Error: La carga no es valida o supera el 100%.")
            return false
        }

        porcentaje += cantidad
        println("Bateria cargada correctamente.")
        return true
    }
}

fun main() {

    val bateria = Bateria()

    println("CONTROL DE BATERIA")

    println("Porcentaje inicial: ${bateria.consultarPorcentaje()}%")

    println("\nCONSUMIR BATERIA")
    bateria.consumir(30)
    println("Porcentaje actual: ${bateria.consultarPorcentaje()}%")

    println("\nINTENTAR CONSUMO NO VALIDO")
    bateria.consumir(80)
    println("Porcentaje actual: ${bateria.consultarPorcentaje()}%")

    println("\nCARGAR BATERIA")
    bateria.cargar(20)
    println("Porcentaje actual: ${bateria.consultarPorcentaje()}%")

    println("\nINTENTAR SOBRECARGAR")
    bateria.cargar(20)
    println("Porcentaje actual: ${bateria.consultarPorcentaje()}%")
}
