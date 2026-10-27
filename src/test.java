import java.util.Scanner;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas < 10) {
            System.out.println("Adivinhe o numero secreto!");
            int palpite = scanner.nextInt();
            tentativas++;
            if (palpite ==  numeroSecreto) {
                System.out.println("Parabems! voce acertou!");
                break;
            }
            if (palpite > numeroSecreto) {
                System.out.println("O numero secreto e menor!");
            }
            else if (palpite < numeroSecreto) {
                System.out.println("O numero secreto e maior!");
            }
        }
    }
}


