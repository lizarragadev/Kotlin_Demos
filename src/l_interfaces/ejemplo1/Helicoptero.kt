package l_interfaces.ejemplo1

class Helicoptero(var cantidadPasajeros: Int): ComportamientoInterface {
    override fun volar() {
        println("Comportamiento de mi Helicoptero con $cantidadPasajeros pasajeros")
    }

}
