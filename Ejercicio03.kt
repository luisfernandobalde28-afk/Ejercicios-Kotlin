
fun main() {

    println("REGISTRO DE COMPRA")

    print("Ingresa el nombre del producto: ")
    val nombreProducto = readln()

    print("Ingresa el precio del producto: ")
    val precio = readln().toDouble()

    print("Ingresa la cantidad que deseas comprar: ")
    val cantidad = readln().toInt()

    if (precio >= 0 && cantidad > 0) {

        val subtotal = precio * cantidad
        val iva = subtotal * 0.16
        val total = subtotal + iva

        println("\nDETALLE DE LA COMPRA")
        println("Producto: $nombreProducto")
        println("Precio unitario: $precio")
        println("Cantidad: $cantidad")
        println("Subtotal: $subtotal")
        println("IVA (16%): $iva")
        println("Total a pagar: $total")

    } else {
        println("Error: El precio no puede ser negativo y la cantidad debe ser mayor a cero.")
    }
}
