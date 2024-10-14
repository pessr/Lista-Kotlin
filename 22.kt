fun main() {
    // Solicita ao usuário para inserir uma string
    print("Digite uma string: ")
    val input = readLine()

    // Usa o operador de chamada segura para verificar se a string é nula
    val comprimento = input?.length

    // Verifica se a string é nula e exibe o comprimento ou uma mensagem de aviso
    if (comprimento != null) {
        println("O comprimento da string é: $comprimento")
    } else {
        println("Nenhuma string foi fornecida.")
    }
}
