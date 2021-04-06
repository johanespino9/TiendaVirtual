class Fruta(id: String, nombre: String, idCategoria: String, precio: Double) :
    Producto(id, nombre, idCategoria, precio) {
    override fun solicitarCantidad() {
        println("Ingresa la cantidad en kg: ")
        println("Por Ejemplo: ")
        println("- 0.250")
        println("- 0.500")
        println("- 1.0")
        println("- 1.5")
        println("- 2.0")
        println("- 3.0")
    }
}