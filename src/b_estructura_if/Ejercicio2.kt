package b_estructura_if

fun main(parametro: Array<String>) {
    print("Ingrese primer valor:")
    val valor1 = readLine()!!.toInt()
    print("Ingrese segundo valor:")
    val valor2 = readLine()!!.toInt()
    if (valor1 > valor2)
        print("El mayor valor es $valor1")
    else
        print("El mayor valor es $valor2")
}