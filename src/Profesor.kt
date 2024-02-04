class Profesor(
    private val departamento: String,
    private val nombre: String,
    private val edad: Int,
    private val id: String
) : Persona(nombre, edad, id) {
    override fun mostrarRol(): String {
        return "Profesor"
    }


    private fun mostrarExperiencia(): Int {
        return 25
    }

    override fun toString(): String {
        return ("Persona $nombre, con edad: $edad e ID: $id es un: ${mostrarRol()} con una experiencia de ${mostrarExperiencia()}años en el departamento: $departamento.")
    }
}