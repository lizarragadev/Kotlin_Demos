package l_interfaces.ejemplo1

class Avion(var empresa: String) : ComportamientoInterface {
    override fun volar() {
        println("Este es el comportamiento de mi avion: $empresa")
    }

}