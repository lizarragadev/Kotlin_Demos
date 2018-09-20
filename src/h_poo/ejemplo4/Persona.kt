package h_poo.ejemplo4

class Persona constructor(nombre: String, edad: Int) {
    var nombre: String = nombre
    var edad: Int = edad

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