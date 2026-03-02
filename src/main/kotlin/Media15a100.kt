// Programa: calcula e escreve a média aritmética dos números inteiros entre 15 e 100 (inclusive)
fun media15a100() {
    val inicio = 15
    val fim = 100
    var soma = 0
    var quantidade = 0

    for (num in inicio..fim) {
        soma += num
        quantidade++
    }

    val media = soma.toDouble() / quantidade.toDouble()

    println("Soma dos inteiros de $inicio a $fim = $soma")
    println("Quantidade de números = $quantidade")
    println("A média é: ${"%.4f".format(media)}")
}

