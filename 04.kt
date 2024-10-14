fun main() {
    // Solicita ao usuário para informar um número
    print("Informe um número: ")
    val numero = readLine()?.toIntOrNull()

    // Verifica se o valor é válido
    if (numero == null) {
        println("Valor inválido. Por favor, informe um número válido.")
        return
    }

    // Converte o número para string e soma os dígitos
    val somaDosDigitos = numero.toString().map { it.toString().toInt() }.sum()

    // Exibe a soma dos dígitos
    println("A soma dos dígitos do número $numero é: $somaDosDigitos")
}
