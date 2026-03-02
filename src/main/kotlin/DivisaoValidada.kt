// Programa: lê dois valores inteiros; o segundo deve ser estritamente positivo (repetir leitura se necessário)
fun divisaoComValidacao() {
    println("Divisão com validação: o segundo número deve ser maior que zero.")

    val num1 = readIntAllowNegative("Digite o número 1:")
    val num2 = readPositiveInt("Digite o número 2 (maior que 0):")

    // Fazer a divisão como Double para não perder fração
    val resultado = num1.toDouble() / num2.toDouble()
    println("Resultado da divisão: ${"%.4f".format(resultado)}")
}

