// Programa: calcula a média aritmética dos dois números inteiros informados e de todos os inteiros entre eles
fun mediaIntervalo() {
    println("Média aritmética dos inteiros entre dois números (inclusive)")

    val a = readIntAllowNegative("Digite o número 1 (menor):")
    val b = readIntAllowNegative("Digite o número 2 (maior):")

    if (a >= b) {
        println("Erro: o primeiro número deve ser menor que o segundo.")
        return
    }

    // Use Long para somas grandes e evitar overflow em intervalos grandes
    val n = (b - a + 1).toLong()
    val sum = (a.toLong() + b.toLong()) * n / 2L // soma da progressão aritmética
    val media = sum.toDouble() / n.toDouble()

    println("Soma dos inteiros de $a a $b = $sum")
    println("Quantidade de números = $n")
    println("Média aritmética = ${"%.4f".format(media)}")
}

fun readIntAllowNegative(prompt: String): Int {
    while (true) {
        print(prompt + " ")
        val line = readLine() ?: continue
        val v = line.trim().toIntOrNull()
        if (v == null) {
            println("Entrada inválida. Digite um número inteiro (pode ser negativo).")
            continue
        }
        return v
    }
}

