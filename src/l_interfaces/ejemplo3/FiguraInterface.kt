package l_interfaces.ejemplo3

interface FiguraInterface {
    fun calcularSuperficie(): Int
    fun calcularPerimetro(): Int
    fun tituloResultado() {
        println("Datos de la figura")
    }
}