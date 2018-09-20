package a_tipo_dato_entrada_por_teclado

fun main(parametro: Array<String>) {
    print("Ingrese el precio del producto:")
    val precio = readLine()!!.toDouble()
    print("Ingrese la cantidad de productos:")
    val cantidad = readLine()!!.toInt()
    val total = precio * cantidad
    println("El total a pagar es $total")
}