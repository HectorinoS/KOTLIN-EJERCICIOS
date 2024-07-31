fun main() {
    println("Introduce un número entero:")
    val numero = readLine()?.toIntOrNull()
    
    if (numero != null) {
        println("Número ingresado: $numero")
        println("Cuadrado: ${numero * numero}")
    } else {
        println("Entrada inválida.")
    }
}
