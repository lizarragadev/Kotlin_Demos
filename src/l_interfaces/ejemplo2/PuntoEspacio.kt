package l_interfaces.ejemplo2

class PuntoEspacio(val x: Int, val y: Int, val z: Int): PuntoInterface {
    override fun imprimir() {
        println("Punto en el espacio: ($x,$y,$z)")
    }
}