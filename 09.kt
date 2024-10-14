fun main() {
    // Solicita ao usuário para informar os números, separados por espaço
    print("Informe uma lista de números, separados por espaço: ")
    val input = readLine()

    // Verifica se o valor é válido
    if (input.isNullOrEmpty()) {
        println("Entrada inválida. Por favor, forneça uma lista de números.")
        return
    }

    // Converte a entrada do usuário em uma lista de números
    val numeros = input.split(" ").mapNotNull { it.toDoubleOrNull() }.sorted()

    // Verifica se a lista não está vazia
    if (numeros.isEmpty()) {
        println("Nenhum número válido foi fornecido.")
        return
    }

    // Calcula a mediana
    val mediana = if (numeros.size % 2 == 0) {
        val meio = numeros.size / 2
        (numeros[meio - 1] + numeros[meio]) / 2
    } else {
        numeros[numeros.size / 2]
    }

    // Exibe o resultado
    println("A mediana da lista é: $mediana")
}
