import java.nio.DoubleBuffer

fun main() {
    // Tienda Virtual
    // - Debemos crear clases para la tienda: Producto, Categoria
    //   CarritoDeCompras, Tienda, Cliente
    // - Crear un objeto que simule una Base de Datos
    // - Generar el flujo de nuestra tienda:
    //    - Bienvenida a la tienda
    //    - Pedir un nombre de usuario
    //    - Mostrar Categorias de Productos
    //    - Mostrar Productos
    //    - Agregar Productos al carrito
    //    - Finalizar la compra
    var tienda = Tienda("MiniMarket Online")
    var usuario: Usuario = Usuario()
    var codigoCategoria: String = ""
    var productosEncontrados: List<Producto> = listOf()
    var codigoProducto: String = ""
    var carritoDeCompras: CarritoDeCompras = CarritoDeCompras()
    var cantidadProducto: Double = 0.0
    var continuar = ""
    var finalizarCompra = ""

    // Iniciar Aplicacion
    tienda.iniciarApp()

    // Obtener nombre de usuario
    usuario.nombre = usuario.obtenerNombre()

    // Saludar
    tienda.saludar(usuario.nombre)

    do{
        //Mostrar Categorias
        tienda.mostrarCategorias()

        // Solicitar seleccion de Categoria
        codigoCategoria = tienda.solicitarCodigoCategoria()

        // Buscar Productos por Categoria
        productosEncontrados = tienda.buscarProductosPorIdCategoria(codigoCategoria)

        // Mostrar Productos por Categoria
        tienda.mostrarProductosPorCategoria(productosEncontrados)

        // Solicitar seleccion del producto
        codigoProducto = tienda.solicitarCodigoProducto()

        // Buscar Producto por ID
        var productoEncontrado = carritoDeCompras.buscarProductoPorId(codigoProducto)

        productoEncontrado.solicitarCantidad()
        cantidadProducto = readLine()!!.toDouble()

        // Agregar Producto al carrito
        carritoDeCompras.agregarProducto(productoEncontrado, cantidadProducto)

        // Seguir agregando?
        continuar = tienda.seguirAgregando()
    }while (continuar == "SI")

    // Mostrar los productos agregados al carrito
    carritoDeCompras.mostrarProductosSeleccionados()

    //Solicitar la confirmacion para finalizar la compra
    finalizarCompra = tienda.finalizarCompra()

    if (finalizarCompra == "SI") {
        println("Su compra se ha realizado con exito!")
        println("Gracias por confiar en ${tienda.nombre}!")
    } else {
        println("Su compra no ha podido ser procesada")
    }


}
