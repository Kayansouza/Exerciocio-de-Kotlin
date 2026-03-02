// Programa: calcular áreas de várias formas geométricas usando entradas inteiras

fun areasMenu() {
    while (true) {
        println("--- Menu de Áreas (entradas inteiras) ---")
        println("1 - Retângulo")
        println("2 - Quadrado")
        println("3 - Losango")
        println("4 - Trapézio")
        println("5 - Paralelogramo")
        println("6 - Triângulo")
        println("7 - Círculo (PI ≈ 3)")
        println("0 - Voltar")
        print("Opção: ")
        val opcao = readLine()?.trim()?.toIntOrNull() ?: -1
        when (opcao) {
            1 -> areaRetangulo()
            2 -> areaQuadrado()
            3 -> areaLosango()
            4 -> areaTrapezio()
            5 -> areaParalelogramo()
            6 -> areaTriangulo()
            7 -> areaCirculo()
            0 -> return
            else -> println("Opção inválida. Tente novamente.")
        }
        println()
    }
}

// Leitura segura de inteiros (não permite valores negativos)
fun readIntPrompt(prompt: String): Int {
    while (true) {
        print(prompt + " ")
        val line = readLine() ?: return 0
        val v = line.trim().toIntOrNull()
        if (v == null) {
            println("Entrada inválida. Digite um número inteiro.")
            continue
        }
        if (v < 0) {
            println("Por favor, digite um número inteiro não negativo.")
            continue
        }
        return v
    }
}

fun areaRetangulo() {
    val base = readIntPrompt("Digite a base do retângulo (inteiro):")
    val altura = readIntPrompt("Digite a altura do retângulo (inteiro):")
    val area = base * altura
    println("Área do retângulo (inteiro) = $area unidades²")
}

fun areaQuadrado() {
    val lado = readIntPrompt("Digite o lado do quadrado (inteiro):")
    val area = lado * lado
    println("Área do quadrado (inteiro) = $area unidades²")
}

fun areaLosango() {
    val D = readIntPrompt("Digite a diagonal MAIOR (D, inteiro):")
    val d = readIntPrompt("Digite a diagonal MENOR (d, inteiro):")
    val numerador = D * d
    val area = numerador / 2 // truncamento inteiro
    println("Área do losango (inteiro) = $area unidades²")
}

fun areaTrapezio() {
    val B = readIntPrompt("Digite a base MAIOR (B, inteiro):")
    val b = readIntPrompt("Digite a base MENOR (b, inteiro):")
    val h = readIntPrompt("Digite a altura (h, inteiro):")
    val numerador = (B + b) * h
    val area = numerador / 2 // truncamento inteiro
    println("Área do trapézio (inteiro) = $area unidades²")
}

fun areaParalelogramo() {
    val base = readIntPrompt("Digite a base do paralelogramo (inteiro):")
    val altura = readIntPrompt("Digite a altura do paralelogramo (inteiro):")
    val area = base * altura
    println("Área do paralelogramo (inteiro) = $area unidades²")
}

fun areaTriangulo() {
    val base = readIntPrompt("Digite a base do triângulo (inteiro):")
    val altura = readIntPrompt("Digite a altura do triângulo (inteiro):")
    val numerador = base * altura
    val area = numerador / 2 // truncamento inteiro
    println("Área do triângulo (inteiro) = $area unidades²")
}

fun areaCirculo() {
    val r = readIntPrompt("Digite o raio do círculo (inteiro):")
    val PI = 3
    val area = PI * r * r
    println("Área do círculo (inteiro, PI≈3) = $area unidades²")
}

