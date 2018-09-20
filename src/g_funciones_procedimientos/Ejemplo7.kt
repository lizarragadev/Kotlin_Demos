package g_funciones_procedimientos

fun retornarSuperficie2(lado: Int) = lado * lado

fun main(parametro: Array<String>) {
    print("Ingrese el valor del lado del cuafrado:")
    val la = readLine()!!.toInt()
    println("La superficie del cuadrado es ${retornarSuperficie2(la)}")
}