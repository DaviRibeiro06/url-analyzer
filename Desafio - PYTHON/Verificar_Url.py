def verificar_url(url):
    if url.startswith("https://"):
        return "URL segura"
    elif url.startswith("http://"):
        return "URL não segura"
    else:
        return "Formato inválido"

# Entrada do usuário
url = input("Digite a URL do site em questão: ")
resultado = verificar_url(url)

# Exibe o resultado
print(resultado)
