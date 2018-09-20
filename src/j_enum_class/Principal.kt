package j_enum_class

import j_enum_class.ejemplo1.Carta
import j_enum_class.ejemplo1.TipoCarta
import j_enum_class.ejemplo2.Operacion
import j_enum_class.ejemplo2.TipoOperacion

fun main(abc: Array<String>) {
    val carta1 = Carta(TipoCarta.CORAZON, 4)
    val carta2 = Carta(TipoCarta.DIAMANTE, 3)
    val carta3 = Carta(TipoCarta.TREBOL, 2)
    carta1.imprimir()
    carta2.imprimir()
    carta3.imprimir()

    val enum1 = TipoCarta.PICA
    println(enum1)
    println(enum1.name)
    println(enum1.ordinal)

    val operacion1 = Operacion(10, 4, TipoOperacion.SUMA)
    operacion1.operar()
}
