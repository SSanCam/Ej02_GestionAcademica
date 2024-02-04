open class Persona(private val nombre: String, private val edad: Int, private val id: String) {

    open fun mostrarRol(): String {
        return "externo"
    }

    override fun toString(): String {
        return ("Persona $nombre, con edad: $edad e ID: $id es un: ${mostrarRol()}")
    }

}