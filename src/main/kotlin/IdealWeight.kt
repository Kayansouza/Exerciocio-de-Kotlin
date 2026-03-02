// Programa: calcula o peso ideal a partir da altura e do gênero (M/F)
fun calcularPesoIdeal() {
    println("Cálculo de peso ideal (fórmula por gênero)")

    val h = readDouble("Digite sua altura em metros (ex: 1.75):")

    // Ler e validar o gênero (aceita M ou F, maiúsculo/minúsculo)
    var generoChar: Char? = null
    while (generoChar == null) {
        print("Digite seu gênero (M/F): ")
        val g = readLine()?.trim()
        if (g.isNullOrEmpty()) {
            println("Entrada inválida. Digite 'M' para masculino ou 'F' para feminino.")
            continue
        }
        val c = g.uppercase().first()
        if (c == 'M' || c == 'F') generoChar = c else println("Entrada inválida. Use 'M' ou 'F'.")
    }

    val pesoIdeal = if (generoChar == 'M') {
        72.7 * h - 58.0
    } else {
        62.1 * h - 44.7
    }

    println("Seu peso ideal (aproximado) é: ${"%.2f".format(pesoIdeal)} kg")
}

