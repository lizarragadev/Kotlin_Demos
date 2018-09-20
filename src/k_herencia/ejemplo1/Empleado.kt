package k_herencia.ejemplo1

class Empleado(nombre: String, edad: Int, val sueldo: Double): Persona(nombre, edad) {
    override fun imprimir() {
        super.imprimir()
        println("Sueldo: $sueldo")
    }

    fun pagaImpuestos() {
        if (sueldo > 3000)
            println("El empleado $nombre paga impuestos")
        else
            println("El empleado $nombre no paga impuestos")
    }
}