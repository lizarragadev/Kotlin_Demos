package a_tipo_dato_entrada_por_teclado

fun main(parametro: Array<String>) {
    print("Ingrese la medida del lado del cuadrado:")
    val lado = readLine()!!.toInt()
    val perimetro = lado * 4
    println("El perímetro del cuadrado es $perimetro")
}