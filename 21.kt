fun main() {
    val numeros = arrayOf(1, 2, 3, 4, 5)
    val buscar = 3
    val indice = numeros.indexOf(buscar)
    
    if (indice != -1) {
        println("El número $buscar está en la posición $indice")
    } else {
        println("El número $buscar no se encuentra en el arreglo")
    }
}
