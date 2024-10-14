class Editora(val nome: String, val endereco: String, val cnpj: String) {

    // Método para exibir as informações da editora
    fun exibirInformacoes() {
        println("Nome da Editora: $nome")
        println("Endereço da Editora: $endereco")
        println("CNPJ da Editora: $cnpj")
    }
}

fun main() {
    // Criando uma instância da classe Editora
    val editora = Editora("Editora Kotlin", "Rua das Linguagens, 123", "12.345.678/0001-99")

    // Exibindo as informações da editora
    editora.exibirInformacoes()
}
