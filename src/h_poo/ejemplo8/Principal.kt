package h_poo.ejemplo8

fun main(parametro: Array<String>) {
    val triangulo1 = Triangulo()
    triangulo1.ladoMayor()
    triangulo1.esEquilatero()
    val triangulo2 = Triangulo(6, 6, 6)
    triangulo2.ladoMayor()
    triangulo2.esEquilatero()
}