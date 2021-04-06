object DataBase {
    var productos = mutableListOf<Producto>(
        Gaseosa("001", "Gaseosa Coca-Cola", "001",3.0),
        Gaseosa("002", "Gaseosa Pepsi Cola", "001",3.0),
        Galleta("003", "Galleta Oreo", "002",1.0),
        Galleta("004", "Galleta Chip Ahoy!", "002",2.0),
        Fruta("005", "Manzanas", "003",3.0),
        Fruta("006", "Peras", "003",4.0),
    )

    var categorias = mutableListOf<CategoriaProducto>(
        CategoriaProducto("001", "Gaseosas"),
        CategoriaProducto("002", "Galletas"),
        CategoriaProducto("003", "Frutas")
    )

    var productosAgregados = mutableListOf<Producto>()
}