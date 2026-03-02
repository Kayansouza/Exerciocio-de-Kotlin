// Programa: lê dois inteiros e imprime o maior (ou informa se são iguais)
fun maiorDoisNumeros() {
    println("Informe dois números inteiros e eu direi qual é o maior.")
    val a = readIntAllowNegative("Digite o primeiro número:")
    val b = readIntAllowNegative("Digite o segundo número:")

    when {
        a > b -> println("O maior é: $a")
        b > a -> println("O maior é: $b")
        else -> println("Os dois números são iguais: $a")
    }
}

