// Interface Animal
interface Animal {
    fun fazerSom()
    fun mover()
}

// Classe Cachorro que implementa a interface Animal
class Cachorro : Animal {
    override fun fazerSom() {
        println("O cachorro faz: Au Au!")
    }

    override fun mover() {
        println("O cachorro está correndo.")
    }
}

// Classe Gato que implementa a interface Animal
class Gato : Animal {
    override fun fazerSom() {
        println("O gato faz: Miau!")
    }

    override fun mover() {
        println("O gato está andando silenciosamente.")
    }
}

// Função main para testar as classes
fun main() {
    // Criando uma instância de Cachorro
    val cachorro = Cachorro()
    println("Ações do Cachorro:")
    cachorro.fazerSom()
    cachorro.mover()

    // Criando uma instância de Gato
    val gato = Gato()
    println("\nAções do Gato:")
    gato.fazerSom()
    gato.mover()
}
