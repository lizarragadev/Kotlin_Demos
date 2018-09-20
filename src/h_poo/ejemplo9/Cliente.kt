package h_poo.ejemplo9

class Cliente(var nombre: String, var monto: Float) {

    fun depositar(monto: Float) {
        this.monto += monto
    }

    fun extraer(monto: Float) {
        this.monto -= monto
    }

    fun imprimir() {
        println("$nombre tiene depositado la suma de $monto")
    }
}