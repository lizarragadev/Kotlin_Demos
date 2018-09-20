package c_estructura_while_do_while

fun main(parametro: Array<String>) {
    print("Ingrese un valor:")
    val valor = readLine()!!.toInt()
    var x = 1
    while (x <= valor) {
        println(x)
        x = x + 1
    }
}