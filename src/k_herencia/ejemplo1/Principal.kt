package k_herencia.ejemplo1

fun main(parametro: Array<String>) {
    val persona1 = Persona("Jose", 22)
    println("Datos de la persona")
    persona1.imprimir()

    val empleado1 = Empleado("Ana", 30, 5000.0)
    println("Datos del empleado")
    empleado1.imprimir()
    empleado1.pagaImpuestos()
}
