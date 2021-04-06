class Galleta(id: String, nombre: String, idCategoria: String, precio: Double) :
    Producto(id, nombre, idCategoria, precio) {
    override fun solicitarCantidad() {
        println("Ingresa la cantidad en paquetes: ")
        println("Por ejm: ")
        println("- 1.0")
        println("- 2.0")
        println("- 3.0")
        println("- 6.0")
    }
}