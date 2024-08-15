import java.util.Scanner;
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a URL do site em questão: ");
        String url = scanner.nextLine(); // Lê a entrada do usuário
        scanner.close();
        String resultado = null;
        if (url.startsWith("https://")) {
       // TODO: Atribua para a variável resultado a mensagem adequada:
            resultado = "URL segura";

      //TODO: Implemente a condição necessária para a verificação da URL:
        } else if (url.startsWith("http://")   ) {
       // TODO: Atribua para a variável resultado a mensagem adequada:
            resultado = "URL nao segura";
        } else {
            resultado = "Formato invalido";
        }

        // Exibe o resultado
        System.out.println(resultado);
    }
}