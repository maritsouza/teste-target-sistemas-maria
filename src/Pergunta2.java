import java.util.Scanner;

public class Pergunta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque um número positivo:");
        int numeroDigitado = sc.nextInt();

        int primeiroNumero = 0;
        int segundoNumero = 1;
        int numeroAuxiliar = 0;

        while (numeroAuxiliar < numeroDigitado) {
            numeroAuxiliar = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = numeroAuxiliar;
        }

        if (numeroAuxiliar == numeroDigitado) {
            System.out.println("O número pertence a sequência");
        } else {
            System.out.println("O número não pertence a sequência");
        }
    }
}
