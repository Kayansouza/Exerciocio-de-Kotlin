// Programa: ler 2 notas de um aluno, calcular a média e perguntar se deseja calcular para outro aluno.
fun calcularMediaAlunos() {
    var aprovados = 0

    do {
        println("Digite o nome do aluno:")
        val nome = readLine()?.trim().takeIf { !it.isNullOrBlank() } ?: "<Sem nome>"

        val nota1 = readDouble("Digite a primeira nota:")
        val nota2 = readDouble("Digite a segunda nota:")

        val media = (nota1 + nota2) / 2.0
        println("Média de $nome: ${"%.2f".format(media)}")

        when {
            media >= 9.5 -> {
                println("Você foi aprovado.")
                aprovados += 1
            }
            media >= 6.0 -> {
                println("Você ainda precisa de nota")
                val falta = 6.0 - media
                println("Falta: ${"%.2f".format(falta)}")
            }
            else -> println("Você foi reprovado.")
        }

        print("Calcular a média de outro aluno Sim/Não? ")
        val resposta = readLine()?.trim()?.uppercase()
    } while (resposta == "S" || resposta == "SIM")

    println("Quantidade de alunos aprovados: $aprovados")
}

