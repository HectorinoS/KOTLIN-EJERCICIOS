fun main() {
    println("Introduce un número entero:")
    val numero = readLine()?.toIntOrNull()
    
    if (numero != null) {
        if (numero % 2 == 0) {
            println("El número $numero es par.")
        } else {
            println("El número $numero es impar.")
        }
    } else {
        println("Entrada inválida.")
    }
}
