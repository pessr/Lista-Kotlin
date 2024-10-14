    fun main() {
    // Solicita ao usuário para informar a primeira string
    print("Informe a primeira string: ")
    val primeiraString = readLine() ?: ""

    // Solicita ao usuário para informar a segunda string
    print("Informe a segunda string: ")
    val segundaString = readLine() ?: ""

    // Concatena as duas strings
    val stringConcatenada = primeiraString + segundaString

    // Exibe o resultado
    println("A string concatenada é: $stringConcatenada")
}
