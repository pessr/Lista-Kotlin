fun main() {
    // Inicializando uma lista de strings com alguns elementos nulos
    val listaDeStrings: List<String?> = listOf("Kotlin", null, "Java", "Python", null, "C++")

    // Percorrendo a lista e imprimindo apenas os elementos não nulos
    for (string in listaDeStrings) {
        string?.let {
            println(it)
        }
    }
}
