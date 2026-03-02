// Programa: lê 3 valores inteiros (assuma que não serão iguais) e escreve o maior deles
fun maiorTresNumeros() {
    println("Digite 3 números inteiros (não iguais) e exibirei o maior deles.")
    val a = readIntAllowNegative("Digite o primeiro número:")
    val b = readIntAllowNegative("Digite o segundo número:")
    val c = readIntAllowNegative("Digite o terceiro número:")

    // Determina o maior
    val maior = when {
        a > b && a > c -> a
        b > a && b > c -> b
        c > a && c > b -> c
        else -> { // caso raro se houver igualdade
            maxOf(a, b, c)
        }
    }

    println("O maior número é: $maior")
}

