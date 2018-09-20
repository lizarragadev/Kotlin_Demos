package l_interfaces.ejemplo2

class PuntoPlano(val x: Int, val y: Int): PuntoInterface {
    override fun imprimir() {
        println("Punto en el plano: ($x,$y)")
    }
}