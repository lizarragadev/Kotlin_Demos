package k_herencia.ejemplo3

fun main(parametro: Array<String>) {
    val dado1 = Dado()
    dado1.tirar()
    dado1.imprimir()

    val dado2 = DadoRecuadro()
    dado2.tirar()
    dado2.imprimir()
}
