package h_poo.ejemplo1

class Persona {
    var nombre: String = ""
    var edad: Int = 0

    fun inicializar(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
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