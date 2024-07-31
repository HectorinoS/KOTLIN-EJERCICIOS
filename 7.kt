fun main() {
    println("Introduce una cadena de texto:")
    val texto = readLine() ?: ""
    val concatenado = texto + " - Cadena añadida"
    
    println("Cadena concatenada: $concatenado")
}