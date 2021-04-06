class Tienda {
    var nombre: String = ""

    constructor(nombre: String){
        this.nombre = nombre
    }

    fun lineaDivisora(){
        println("---------------------------------------------------------------")
    }

    fun iniciarApp(){
        lineaDivisora()
        println("TIENDA VIRTUAL - 2.0")
        lineaDivisora()
    }

    fun saludar(nombreUsuario: String){
        lineaDivisora()
        println("Bienvenido/a ${nombreUsuario} a la tienda ${nombre}")
        lineaDivisora()
    }

    fun mostrarCategorias(){
        println("Les mostramos las siguientes categorias: ")
        DataBase.categorias

        for(categoria in DataBase.categorias){
            println("Codigo: ${categoria.id} - Nombre: ${categoria.nombre}")
        }

        lineaDivisora()
    }

    fun buscarProductosPorIdCategoria(codigoCategoria: String) : List<Producto> {
        var productosEncontrados = DataBase.productos.filter { it.idCategoria == codigoCategoria }
        return productosEncontrados
    }

    fun solicitarCodigoCategoria() : String{
        var codigoCategoria = ""
        print("Ingrese el codigo de categoria para ver los productos: ")
        codigoCategoria = readLine().toString()
        lineaDivisora()
        return codigoCategoria
    }

    fun mostrarProductosPorCategoria(productosEncontrados: List<Producto>) {
        println("Les mostramos los productos segun la Categoria ingresada: ")
        lineaDivisora()
        for (producto in productosEncontrados){
            producto.obtenerInformacion()
        }
        lineaDivisora()
    }

    fun solicitarCodigoProducto() : String {
        print("Ingrese el codigo del producto que desea comprar: ")
        var codigoProducto = readLine().toString()
        return codigoProducto
    }

    fun seguirAgregando() : String {
        println("Desea agregar otro producto al carrito de compras? ")
        println("Escriba SI o NO")
        var continuar = readLine().toString().toUpperCase()

        return continuar
    }


    fun finalizarCompra() : String {
        println("Esta seguro que desea realizar esta compra?")
        println("Escriba SI o NO: ")
        var finalizarCompra = readLine().toString()
        return  finalizarCompra
    }

}