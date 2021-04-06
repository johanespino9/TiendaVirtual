class Usuario {

    var id: String = ""
    var nombre: String = ""

    fun obtenerNombre(): String {
        print("Ingrese un nombre de usuario: ")
        var nombre = readLine().toString()

        return nombre
    }
}