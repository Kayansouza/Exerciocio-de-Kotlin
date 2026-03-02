// Programa: lê um número (aceita decimais) e informa se é positivo, negativo ou zero
fun classificarNumero() {
    println("Classificar número: positivo, negativo ou zero")
    val n = readDouble("Digite um número (ex: 3.5 ou -2):")

    when {
        n > 0.0 -> println("O número $n é positivo.")
        n < 0.0 -> println("O número $n é negativo.")
        else -> println("O número é zero.")
    }
}
