package l_interfaces.ejemplo3

fun main(parametro: Array<String>) {
    val cuadrado1 = Cuadrado(10)
    cuadrado1.tituloResultado()
    println("Perimetro del cuadrado : ${cuadrado1.calcularPerimetro()}")
    println("Superficie del cuadrado : ${cuadrado1.calcularSuperficie()}")
    val rectangulo1 = Rectangulo(10, 5)
    rectangulo1.tituloResultado()
    println("Perimetro del rectangulo : ${rectangulo1.calcularPerimetro()}")
    println("Superficie del cuadrado : ${rectangulo1.calcularSuperficie()}")
}

