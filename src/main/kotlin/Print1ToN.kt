// Programa: ler um valor N (>0) e imprimir todos os valores inteiros entre 1 e N (inclusive)
fun print1ToN() {
    println("Imprimir inteiros de 1 até N (N > 0)")
    val n = readPositiveInt("Digite um número inteiro N (maior que 0):")
    println("Valores de 1 até $n:")
    for (i in 1..n) {
        println(i)
    }
}

fun readPositiveInt(prompt: String): Int {
    while (true) {
        print(prompt + " ")
        val line = readLine()
        val v = line?.trim()?.toIntOrNull()
        if (v == null || v <= 0) {
            println("Entrada inválida. Digite um inteiro maior que zero.")
            continue
        }
        return v
    }
}

