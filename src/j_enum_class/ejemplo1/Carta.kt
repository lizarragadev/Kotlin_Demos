package j_enum_class.ejemplo1

class Carta(val tipo: TipoCarta, val valor: Int) {
    fun imprimir() {
        println("Carta: $tipo y su valor es: $valor")
    }
}