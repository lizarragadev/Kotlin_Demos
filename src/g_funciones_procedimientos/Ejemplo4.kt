package g_funciones_procedimientos

fun retornarSuperficie(lado: Int): Int {
    return lado * lado
}

fun main(parametro: Array<String>) {
    print("Ingrese el valor del lado del cuafrado:")
    val la = readLine()!!.toInt()
    val superficie = retornarSuperficie(la)
    println("La superficie del cuadrado es $superficie")
}