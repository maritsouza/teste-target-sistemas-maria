import java.util.Scanner;

public class Pergunta5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva a palavra: ");
        String palavra = sc.nextLine();

        String palavraInvertida = "";
        char letra;

        for (int i = 0; i < palavra.length(); i++) {
            letra = palavra.charAt(i);
            palavraInvertida = letra + palavraInvertida;
        }
        System.out.println("A palavra invertida é: " + palavraInvertida);
    }
}
