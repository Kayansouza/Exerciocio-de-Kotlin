// Programa: calculadora simples que opera com inteiros
fun calculadoraMenu() {
    println("Digite o primeiro valor:")
    val valor1 = readIntOrRetry()
    println("Digite o segundo valor:")
    val valor2 = readIntOrRetry()

    println("Escolha sua operação aritmética:\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão")
    val opcao = readIntOrRetry()

    val resultado = when (opcao) {
        1 -> valor1 + valor2
        2 -> valor1 - valor2
        3 -> valor1 * valor2
        4 -> {
            if (valor2 == 0) {
                println("Divisão por zero não é permitida.")
                return
            }
            valor1 / valor2
        }
        else -> {
            println("Opção inválida")
            return
        }
    }
    println("Resultado: $resultado")
}

fun readIntOrRetry(): Int {
    while (true) {
        print("-> ")
        val line = readLine() ?: return 0
        val value = line.trim().toIntOrNull()
        if (value != null) return value
        println("Entrada inválida. Digite um número inteiro.")
    }
}
