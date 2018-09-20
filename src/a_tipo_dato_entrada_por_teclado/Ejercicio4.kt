package a_tipo_dato_entrada_por_teclado

fun main(argumento: Array<String>) {
    print("Ingrese primer valor:")
    val valor1 = readLine()!!.toInt()
    print("Ingrese segundo valor:")
    val valor2 = readLine()!!.toInt()
    val suma = valor1 + valor2
    println("La suma de $valor1 y $valor2 es $suma")
    val producto = valor1 * valor2
    println("El producto de $valor1 y $valor2 es $producto")}