abstract class Producto {
    var id: String = ""
    var nombre: String = ""
    var idCategoria: String = ""
    var precio: Double = 0.0
    var cantidad: Double = 0.0

    constructor(id: String, nombre: String, idCategoria: String, precio: Double) {
        this.id = id
        this.nombre = nombre
        this.idCategoria = idCategoria
        this.precio = precio
    }

    fun obtenerInformacion(){
        println("Codigo: $id - Nombre: $nombre - Precio: $precio")
    }

    abstract fun solicitarCantidad()
}