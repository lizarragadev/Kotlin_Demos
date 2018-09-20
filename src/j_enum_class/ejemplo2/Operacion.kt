package j_enum_class.ejemplo2

class Operacion(val valor1: Int, val valor2: Int, val tipoOperacion: TipoOperacion) {
    fun operar() {
        var resultado = 0
        when(tipoOperacion) {
            TipoOperacion.SUMA -> resultado = valor1 + valor2
            TipoOperacion.RESTA -> resultado = valor1 - valor2
            TipoOperacion.MULTIPLICACION -> resultado = valor1 * valor2
            TipoOperacion.DIVISION -> resultado = valor1 / valor2
        }
        println("$valor1 ${tipoOperacion.tipo} $valor2 es igual a: $resultado")
    }
}
