function verificarUrl(url) {
    if (url.startsWith("https://")) {
        return "URL segura";
    } else if (url.startsWith("http://")) {
        return "URL não segura";
    } else {
        return "Formato inválido";
    }
}

// Entrada do usuário
const url = prompt("Digite a URL do site em questão:");
const resultado = verificarUrl(url);

// Exibe o resultado
console.log(resultado);
