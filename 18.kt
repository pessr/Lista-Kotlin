class Autor(val nome: String, val cpf: String) {

    // Método para exibir as informações do autor
    fun exibirInformacoes() {
        println("Nome do Autor: $nome")
        println("CPF do Autor: $cpf")
    }
}

fun main() {
    // Criando uma instância da classe Autor
    val autor = Autor("Gabriel Medrado", "123.456.789-00")

    // Exibindo as informações do autor
    autor.exibirInformacoes()
}
