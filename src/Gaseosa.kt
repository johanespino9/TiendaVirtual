class Gaseosa(id: String, nombre: String, idCategoria: String, precio: Double) :
    Producto(id, nombre, idCategoria, precio) {
    override fun solicitarCantidad() {
        println("Ingrese la cantidad en litros")
        println("Por ejm: ")
        println("- 0.5")
        println("- 1.0")
        println("- 1.5")
        println("- 2.0")
        println("- 3.0")
    }
}