// Programa que lê dois números do usuário e exibe o maior.
fun compareNumbers() {
    println("Escreva um programa em que o usuário informe dois números. Então escreva em tela o maior deles.")

    val primeiro = readDouble("Digite o primeiro número:")
    val segundo = readDouble("Digite o segundo número:")

    when {
        primeiro > segundo -> println("O maior é: $primeiro")
        segundo > primeiro -> println("O maior é: $segundo")
        else -> println("Os dois números são iguais: $primeiro")
    }
}

// Lê um número (Double) do console, repetindo até que a entrada seja válida.
fun readDouble(prompt: String): Double {
    while (true) {
        print(prompt + " ")
        val line = readLine()
        if (line == null) {
            println("Entrada finalizada. Usando 0 como valor padrão.")
            return 0.0
        }
        val normalized = line.trim().replace(',', '.')
        val value = normalized.toDoubleOrNull()
        if (value != null) return value
        println("Entrada inválida. Por favor, digite um número válido (ex: 3.14).")
    }
}

