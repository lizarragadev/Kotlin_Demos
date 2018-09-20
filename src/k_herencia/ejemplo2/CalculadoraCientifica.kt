package k_herencia.ejemplo2

class CalculadoraCientifica(valor1: Double, valor2: Double): Calculadora(valor1, valor2) {
    fun cuadrado() {
        resultado = valor1 * valor1
    }

    fun raiz() {
        resultado = Math.sqrt(valor1)
    }
}