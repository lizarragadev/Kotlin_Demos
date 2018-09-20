package c_estructura_while_do_while

fun main(parametro: Array<String>) {
    do {
        print("Ingrese un valor comprendido entre 0 y 999:")
        val valor = readLine()!!.toInt()
        if (valor < 10)
            println("El valor ingresado tiene un dígito")
        else
            if (valor < 100)
                println("El valor ingresado tiene dos dígitos")
            else
                println("El valor ingresado tiene tres dígitos")
    } while (valor != 0)
}