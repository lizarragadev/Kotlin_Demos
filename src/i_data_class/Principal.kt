package i_data_class

fun main(abc: Array<String>) {
    var revista1 = Revista(1, "Mi Revista", 10f)
    var revista2 = Revista(2, "Mi segunda revista", 23f)

    println(revista1)
    println(revista2)
    println(if(revista1==revista2) "Son iguales" else "Son distintos")

    revista2.codigo = 1
    revista2.titulo = "Mi Revista"
    revista2.precio = 10f

    println(revista1)
    println(revista2)
    println(if(revista1==revista2) "Son iguales" else "Son distintos")


    var dado = Dado(5)
    println(dado)

}