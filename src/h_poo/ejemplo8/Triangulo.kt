package h_poo.ejemplo8

class Triangulo (var lado1: Int, var lado2: Int, var lado3: Int){

    constructor():this(0, 0, 0) {
        print("Ingrese primer lado:")
        lado1 = readLine()!!.toInt()
        print("Ingrese segundo lado:")
        lado2 = readLine()!!.toInt()
        print("Ingrese tercer lado:")
        lado3 = readLine()!!.toInt()
    }

    fun ladoMayor() {
        print("Lado mayor:")
        when {
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
            else -> println(lado3)
        }
    }

    fun esEquilatero() {
        if (lado1 == lado2 && lado1 == lado3)
            println("Es un triángulo equilátero")
        else
            println("No es un triángulo equilátero")
    }
}