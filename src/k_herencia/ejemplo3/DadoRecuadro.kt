package k_herencia.ejemplo3

class DadoRecuadro: Dado() {
    override fun imprimir() {
        println("***")
        println("*$valor*")
        println("***")
    }
}