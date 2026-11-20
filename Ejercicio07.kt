fun main() {
var consumoTotal = 0.0
var bateriaInicial = 100.0

for (periodo in 1..5) {
    print("Porcetaje consumido en el periodo $periodo: ")
    val consumo = readln().toDouble()

    if (consumo < 0 ) {
        println("El consumo no puede ser negaitvo.")
        return
    }

    if (consumoTotal + consumo > bateriaInicial) {
        println("El consumo total no puede superar el 100%.")
        return
    }

    consumoTotal += consumo
}

val bateriaRestante = bateriaInicial - consumoTotal

println("\nRESUMEN DE BATERIA")
println("Consumo total: $consumoTotal%")
println("Bateria restante: $bateriaRestante%")
}