package h_poo.ejemplo3

class Alumno {
    var nombre: String = ""
    var nota: Int = 0

    fun inicializar() {
        print("Ingrese el nombre del alumno:")
        nombre = readLine()!!.toString()
        print("Ingrese su nota:")
        nota = readLine()!!.toInt()
    }

    fun imprimir() {
        println("Alumno: $nombre tiene una nota de $nota")
    }

    fun mostrarEstado () {
        if (nota >= 4)
            println("$nombre se encuentra en estado REGULAR")
        else
            println("$nombre no está REGULAR")
    }
}