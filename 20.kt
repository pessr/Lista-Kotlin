// Classe Autor
class Autor(val nome: String, val cpf: String) {

    // Método para exibir as informações do autor
    fun exibirInformacoes() {
        println("Nome do Autor: $nome")
        println("CPF do Autor: $cpf")
    }
}

// Classe Editora
class Editora(val nome: String, val endereco: String, val cnpj: String) {

    // Método para exibir as informações da editora
    fun exibirInformacoes() {
        println("Nome da Editora: $nome")
        println("Endereço: $endereco")
        println("CNPJ: $cnpj")
    }
}

// Classe Livro
class Livro(val nome: String, val anoPublicacao: Int, val autor: Autor, val editora: Editora) {

    // Método para exibir as informações do livro
    fun exibirInformacoes() {
        println("Nome do Livro: $nome")
        println("Ano de Publicação: $anoPublicacao")
        println("Informações do Autor:")
        autor.exibirInformacoes()
        println("Informações da Editora:")
        editora.exibirInformacoes()
    }
}

fun main() {
    // Criando uma instância da classe Autor
    val autor = Autor("Gabriel Medrado", "123.456.789-00")

    // Criando uma instância da classe Editora
    val editora = Editora("Editora Kotlin", "Rua das Linguagens, 123", "12.345.678/0001-99")

    // Criando uma instância da classe Livro
    val livro = Livro("Programação em Kotlin", 2024, autor, editora)

    // Exibindo as informações do livro
    livro.exibirInformacoes()
}
    