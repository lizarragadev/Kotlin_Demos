package k_herencia.ejemplo1

open class Persona(val nombre: String, val edad: Int) {
    open fun imprimir() {
        println("Nombre: $nombre")
        println("Edad: $edad")
    }
}