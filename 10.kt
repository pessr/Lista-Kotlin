fun main() {
    // Solicita ao usuário para escolher o tipo de conversão
    println("Escolha o tipo de conversão:")
    println("1 - Converter metros para quilômetros")
    println("2 - Converter quilômetros para metros")
    print("Informe a sua escolha: ")
    val escolha = readLine()?.toIntOrNull()

    // Verifica se a escolha é válida
    if (escolha == null || (escolha != 1 && escolha != 2)) {
        println("Escolha inválida. Por favor, escolha 1 ou 2.")
        return
    }

    // Solicita ao usuário para informar o valor para conversão
    print("Informe o valor: ")
    val valor = readLine()?.toDoubleOrNull()

    // Verifica se o valor é válido
    if (valor == null || valor < 0) {
        println("Valor inválido. Por favor, informe um número positivo.")
        return
    }

    // Realiza a conversão com base na escolha do usuário
    when (escolha) {
        1 -> {
            val quilometros = valor / 1000
            println("$valor metros equivalem a $quilometros quilômetros.")
        }
        2 -> {
            val metros = valor * 1000
            println("$valor quilômetros equivalem a $metros metros.")
        }
    }
}
