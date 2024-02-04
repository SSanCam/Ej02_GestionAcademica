class Estudiante(curso: String, calificacionPromedio: Double, nombre: String, edad: Int, id: String) :
    Persona(nombre, edad, id) {
    override fun mostrarRol(): String{
        val rol = "Estudiante"
        return rol
    }
}