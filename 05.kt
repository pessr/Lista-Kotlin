fun main() {
    // Solicita ao usuário para informar um número
    print("Informe um número: ")
    val numero = readLine()?.toIntOrNull()

    // Verifica se o valor é válido
    if (numero == null) {
        println("Valor inválido. Por favor, informe um número válido.")
        return
    }

    // Converte o número para string e verifica se é palíndromo
    val numeroStr = numero.toString()
    val isPalindromo = numeroStr == numeroStr.reversed()

    // Exibe o resultado
    if (isPalindromo) {
        println("O número $numero é um palíndromo.")
    } else {
        println("O número $numero não é um palíndromo.")
    }
}
