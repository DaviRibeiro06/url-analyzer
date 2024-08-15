fun verificarUrl(url: String): String {
    return when {
        url.startsWith("https://") -> "URL segura"
        url.startsWith("http://") -> "URL não segura"
        else -> "Formato inválido"
    }
}

fun main() {
    print("Digite a URL do site em questão: ")
    val url = readLine().orEmpty()  // Usa orEmpty() para garantir que a string não seja nula
    val resultado = verificarUrl(url)

    println(resultado)
}
