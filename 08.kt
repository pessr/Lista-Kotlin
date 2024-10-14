fun main() {
    // Solicita ao usuário para informar um número
    print("Informe um número: ")
    val numero = readLine()?.toIntOrNull()

    // Verifica se o valor é válido
    if (numero == null) {
        println("Valor inválido. Por favor, informe um número válido.")
        return
    }

    // Converte o número para string, inverte e converte de volta para número
    val numeroInvertido = numero.toString().reversed().toInt()

    // Exibe o resultado
    println("O número $numero invertido é: $numeroInvertido")
}
