fun main() {
    // Solicita ao usuário para inserir uma string
    print("Digite uma string: ")
    val input = readLine()

    // Utiliza o operador Elvis para fornecer um valor padrão caso a string seja nula ou vazia
    val resultado = input ?: "Valor padrão fornecido"

    // Imprime o valor resultante
    println("O valor resultante é: $resultado")
}
