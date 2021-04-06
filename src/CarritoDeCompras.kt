class CarritoDeCompras {
    var precioTotal: Double = 0.0

    fun lineaDivisora(){
        println("---------------------------------------------------------------")
    }
    // agregarProducto
    fun agregarProducto(producto: Producto, cantidad: Double){ 
        producto.cantidad = cantidad
        DataBase.productosAgregados.add(producto)
    }
    // buscarProducto
    fun buscarProductoPorId(idProducto: String) : Producto{
        var productoEncontrado = DataBase.productos.find { it.id == idProducto }
        return productoEncontrado!!
    }

    // mostrarProductosSeleccionados
    fun mostrarProductosSeleccionados(){
        lineaDivisora()
        println("Productos en Carrito de Compras")
        lineaDivisora()
        for (producto in DataBase.productosAgregados){
            println("Codigo: ${producto.id}")
            println("Nombre: ${producto.nombre}")
            println("Cantidad: ${producto.cantidad}")
            println("SubTotal: ${producto.cantidad * producto.precio}")
            lineaDivisora()
            precioTotal += producto.cantidad * producto.precio
        }
        println("TOTAL: $precioTotal")
        lineaDivisora()
    }
}