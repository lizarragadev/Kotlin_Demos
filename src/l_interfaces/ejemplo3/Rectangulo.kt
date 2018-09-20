package l_interfaces.ejemplo3

class Rectangulo(val ladoMayor:Int, val ladoMenor: Int): FiguraInterface {
    override fun calcularSuperficie(): Int {
        return ladoMayor * ladoMenor
    }

    override fun calcularPerimetro(): Int {
        return (ladoMayor * 2) + (ladoMenor * 2)
    }
}