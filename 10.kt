fun main() {
    val a = 10
    val b = 20
    val esIgual = a == b
    val esMayor = a > b
    val esMenorOIgual = a <= b
    val esVeradero = (a < b) && (b > 15)
    val esFalso = !(a == b)

    println("Es igual: $esIgual")
    println("Es mayor: $esMayor")
    println("Es menor o igual: $esMenorOIgual")
    println("Es verdadero: $esVeradero")
    println("Es falso: $esFalso")
}
