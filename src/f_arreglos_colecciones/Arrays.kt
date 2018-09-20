package f_arreglos_colecciones
fun main(parametro: Array<String>) {

    //val vec = g_arreglos.llenaVector(5)
    //g_arreglos.imprimeVector(vec)
    //vec.forEach { print("[$it] ") }

    //var vecString = arrayOf(true, "hola", 34)
    //vecString.forEach { println(it) }
    //g_arreglos.imprimeVector(vecString)

    //val ascendente = Array(10) { i -> (i + 1).toString() }
    //ascendente.forEach { println(it) }

    //print(Array(10) { i -> (i + 1).toString() }.forEach { println(it) })

    //crear dos vectores e imprimir el abecedario obtenido desde codigo ascii
    //print(Array(26) { i -> (i + 65).toChar() }.forEach { println(it) })


    //Colecciones
    //Inmutables
    //var lista1: List<String> = listOf("lunes", "martes", "miercoles", "jueves", "viernes", "sábado", "domingo")
    //for(elemento in lista1)
        //print("$elemento ")


    //Mutables
    /*val edades: MutableList<Int> = mutableListOf(23, 67, 12, 35, 12)
    println("Lista de edades")
    println(edades)
    edades[0] = 60

    val a = mutableListOf(true, 22, "hola")
    a.forEach { print(it) }
    a.add(false)
    a.forEach { print(it) }*/



    //Crear una lista mutable de 20 elementos con valores aleatorios comprendidos entre 1 y 6.
    //Contar cuantos elementos tienen almacenado el valor 1.
    //Eliminar los elementos que almacenan un 6.

    /*val lista: MutableList<Int> = MutableList(20) { ((Math.random() * 6) + 1).toInt() }
    println("Lista completa")
    println(lista)
    val cant = lista.count { it == 1 }
    println("Cantidad de elementos con el valor 1: $cant")
    lista.removeAll { it == 6 }
    println("Lista luego de borrar los elementos con el valor 6")
    println(lista)
    lista.removeAt(0)
    println(lista)*/


    //Crear una lista inmutable de 100 elementos enteros con valores aleatorios comprendidos entre 0 y 20.
    //contar cuantos hay comprendidos entre 1 y 4, 5 y 8 y cuantos entre 10 y 13.
    //Imprimir si el valor 20 está presente en la lista.

    /*val lista1 = List(100) { ((Math.random() * 21)).toInt() }
    println(lista1)
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    lista1.forEach { when(it) {
        in 1..4 -> cant1++
        in 5..8 -> cant2++
        in 10..13 -> cant3++
    } }
    println("Cantidad de valores comprendidos entre 1..4: $cant1")
    println("Cantidad de valores comprendidos entre 5..8: $cant2")
    println("Cantidad de valores comprendidos entre 10..13: $cant1")
    if (lista1.contains(20))
        println("La lista contiene el 20")
    else
        println("La lista no contiene el 20")
    */


    // Colecciones, MAP y MUTABLEMAP

    val paises: Map<String, Int> = mapOf(
            Pair("argentina", 40000000),
            Pair("españa", 46000000),
            Pair("uruguay", 3400000))
    println("Listado completo del Map")
    println(paises)
    for ((clave, valor) in paises)
        println("Para la clave $clave tenemos almacenado $valor")
    println("La cantidad de elementos del mapa es ${paises.size}")
    val cantHabitantes1: Int? = paises["argentina"]
    if (cantHabitantes1 != null)
        println("La cantidad de habitantes de argentina es $cantHabitantes1")
    val cantHabitantes2: Int? = paises["brasil"]
    if (cantHabitantes2 != null)
        println("La cantidad de habitantes de brasil es $cantHabitantes2")
    else
        println("brasil no se encuentra cargado en el Map")
    var suma = 0
    paises.forEach { suma += it.value }
    println("Cantidad total de habitantes de todos los paises es $suma")




    /*val p = g_arreglos.Persona("Nom","Ape")
    println(p.nombre + " "+p.apellido)


    p.nombre = "Gus"
    p.apellido = "Liz"

    println(p.nombre + " "+p.apellido)*/

}

fun llenaVector(n: Int): IntArray {
    val vector = IntArray(n)
    for(i in 0 until n) {
        print("Ingrese valor: ")
        vector[i] = readLine()!!.toInt()
    }
    return vector
}

fun imprimeVector(v: IntArray){
    for(i in 0 until v.size) {
        println(v[i])
    }
}

class Persona {
    var nombre: String? = null
    var apellido: String? = null

    constructor(n: String, a: String){
        nombre = n
        apellido = a
    }
}