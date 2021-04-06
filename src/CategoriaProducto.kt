class CategoriaProducto {
    var id: String = ""
    var nombre: String = ""

    constructor(id: String, nombre: String){
        this.id = id
        this.nombre = nombre
    }

    fun obtenerInformacion(){
        println("Codigo: $id - Nombre: $nombre")
    }
}