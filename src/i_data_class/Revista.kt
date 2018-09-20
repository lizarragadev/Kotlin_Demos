package i_data_class

data class Revista(var codigo: Int, var titulo: String, var precio: Float) {
    override fun toString(): String {
        return "$codigo - $titulo - $precio"
    }
}