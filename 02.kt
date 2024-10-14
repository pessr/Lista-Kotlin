fun main() {
    // Solicita ao usuário para informar o valor inicial e final da lista
    print("Informe o valor inicial: ")
    val valorInicial = readLine()?.toIntOrNull() ?: return
    print("Informe o valor final: ")
    val valorFinal = readLine()?.toIntOrNull() ?: return

    // Verifica se o valor inicial é menor que o valor final
    if (valorInicial > valorFinal) {
        println("O valor inicial deve ser menor ou igual ao valor final.")
        return
    }

    // Cria uma lista de números de valorInicial a valorFinal
    val listaNumeros = (valorInicial..valorFinal).toList()

    // Calcula o produto de todos os números da lista
    val produto = listaNumeros.fold(1) { acc, num -> acc * num }

    // Exibe o produto
    println("O produto dos números de $valorInicial até $valorFinal é: $produto")
}
