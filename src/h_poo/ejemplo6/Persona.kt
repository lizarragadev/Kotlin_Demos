package h_poo.ejemplo6

class Persona (var nombre: String, var edad: Int) {

    init {
        if (edad < 0)
            edad = 0
    }

    fun imprimir() {
        println("Nombre: $nombre y tiene una edad de $edad")
    }

    fun esMayorEdad() {
        if (edad >= 18)
            println("Es mayor de edad $nombre")
        else
            println("No es mayor de edad $nombre")
    }
}