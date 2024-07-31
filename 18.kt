fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun imprimirEnMayusculas(texto: String) {
    println(texto.uppercase())
}

fun main() {
    val suma = sumar(7, 15)
    println("La suma es: $suma")
    
    imprimirEnMayusculas("esto es una prueba")
}
