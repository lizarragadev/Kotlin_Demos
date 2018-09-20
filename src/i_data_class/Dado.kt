package i_data_class

data class Dado(var valor: Int) {
    override fun toString(): String {
        var concatena = ""
        for (i in 1..valor)
            concatena+= "* "
        return concatena
    }
}