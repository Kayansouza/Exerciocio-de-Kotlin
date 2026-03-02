// Programa: contador regressivo (relógio) com espera
object Util {
    fun aguarde(millis: Long) {
        try {
            Thread.sleep(millis)
        } catch (_: InterruptedException) {
            Thread.currentThread().interrupt()
        }
    }
}

fun relogioContagem() {
    var contador = 20
    while (contador > 0) {
        // Limpa a tela não é trivial em console multiplataforma; apenas imprime linhas vazias
        repeat(50) { println() }
        println("Relógio se iniciando em... $contador")
        contador -= 1
        Util.aguarde(1000)
    }
    repeat(50) { println() }
    println("BOOM!")
}
