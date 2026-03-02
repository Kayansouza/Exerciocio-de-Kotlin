//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// Menu principal que organiza e executa os pequenos programas fornecidos
fun main() {
    while (true) {
        println("Escolha um programa:")
        println("1 - Comparar números (maior)")
        println("2 - Relógio (contagem regressiva)")
        println("3 - Calculadora simples")
        println("4 - Média de alunos")
        println("5 - Áreas (formas geométricas)")
        println("6 - Média de inteiros em um intervalo")
        println("7 - Média dos inteiros entre 15 e 100")
        println("8 - Imprimir inteiros de 1 até N")
        println("9 - Maior entre dois números")
        println("10 - Calcular peso ideal (M/F)")
        println("11 - Classificar número (positivo/negativo/zero)")
        println("12 - Maior entre três números")
        println("13 - Divisão com validação do segundo número (>0)")
        println("0 - Sair")
        print("Opção: ")
        val opcao = readLine()?.trim()?.toIntOrNull() ?: -1
        when (opcao) {
            1 -> compareNumbers()
            2 -> relogioContagem()
            3 -> calculadoraMenu()
            4 -> calcularMediaAlunos()
            5 -> areasMenu()
            6 -> mediaIntervalo()
            7 -> media15a100()
            8 -> print1ToN()
            9 -> maiorDoisNumeros()
            10 -> calcularPesoIdeal()
            11 -> classificarNumero()
            12 -> maiorTresNumeros()
            13 -> divisaoComValidacao()
            0 -> {
                println("Saindo...")
                return
            }
            else -> println("Opção inválida. Tente novamente.")
        }
        println()
    }
}
