using System;

class Program
{
    static void Main()
    {
        Console.WriteLine("Digite a URL do site em questão: ");
        string url = Console.ReadLine();

        string resultado = VerificarUrl(url);

        // Exibe o resultado
        Console.WriteLine(resultado);
    }

    static string VerificarUrl(string url)
    {
        if (url.StartsWith("https://"))
        {
            return "URL segura";
        }
        else if (url.StartsWith("http://"))
        {
            return "URL não segura";
        }
        else
        {
            return "Formato inválido";
        }
    }
}
