fun main() {
    println("Introduce un número del 1 al 3:")
    val opcion = readLine()?.toIntOrNull()
    
    when (opcion) {
        1 -> println("Elegiste la opción 1")
        2 -> println("Elegiste la opción 2")
        3 -> println("Elegiste la opción 3")
        else -> println("Opción inválida")
    }
}
