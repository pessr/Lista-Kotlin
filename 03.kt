fun main() {
    // Solicita ao usuário para informar um número
    print("Informe um número: ")
    val numero = readLine()?.toDoubleOrNull()

    // Verifica se o valor é válido
    if (numero == null) {
        println("Valor inválido. Por favor, informe um número válido.")
        return
    }

    // Verifica se o número é positivo, negativo ou zero
    when {
        numero > 0 -> println("O número $numero é positivo.")
        numero < 0 -> println("O número $numero é negativo.")
        else -> println("O número é zero.")
    }
}
