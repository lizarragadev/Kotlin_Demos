package l_interfaces.ejemplo3

class Cuadrado(val lado: Int): FiguraInterface {
    override fun calcularSuperficie(): Int {
        return lado * lado
    }

    override fun calcularPerimetro(): Int{
        return lado * 4
    }
}