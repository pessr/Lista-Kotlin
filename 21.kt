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
        println("\nNome do Livro: $nome")
        println("Ano de Publicação: $anoPublicacao")
        println("Informações do Autor:")
        autor.exibirInformacoes()
        println("Informações da Editora:")
        editora.exibirInformacoes()
    }
}

// Classe Main
fun main() {
    // Criando instâncias de Autores
    val autor1 = Autor("Gabriel Medrado", "123.456.789-00")
    val autor2 = Autor("Maria Oliveira", "987.654.321-11")
    val autor3 = Autor("Pedro Silva", "456.789.123-22")

    // Criando instâncias de Editoras
    val editora1 = Editora("Editora Kotlin", "Rua das Linguagens, 123", "12.345.678/0001-99")
    val editora2 = Editora("Editora Java", "Avenida dos Compiladores, 456", "98.765.432/0002-88")
    val editora3 = Editora("Editora Python", "Praça da Programação, 789", "11.223.344/0003-77")

    // Criando instâncias de Livros
    val livro1 = Livro("Programação em Kotlin", 2024, autor1, editora1)
    val livro2 = Livro("Estruturas de Dados em Java", 2023, autor2, editora2)
    val livro3 = Livro("Aprendendo Python", 2022, autor3, editora3)

    // Exibindo as informações dos livros
    println("Informações dos Livros:")
    livro1.exibirInformacoes()
    livro2.exibirInformacoes()
    livro3.exibirInformacoes()
}
