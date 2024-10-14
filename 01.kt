fun main() {
    // Solicita o valor em dólares
    print("Digite o valor em dólares: ")
    val valorEmDolares = readLine()?.toDoubleOrNull()

    // Solicita a taxa de câmbio atual
    print("Digite a taxa de câmbio (1 USD para BRL): ")
    val taxaDeCambio = readLine()?.toDoubleOrNull()

    if (valorEmDolares != null && taxaDeCambio != null) {
        // Converte o valor de dólares para reais
        val valorEmReais = valorEmDolares * taxaDeCambio
        println("O valor em reais é: R$ %.2f".format(valorEmReais))
    } else {
        println("Entrada inválida! Certifique-se de inserir números válidos.")
    }
} 
