import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("CADASTRO DIGITAL");

        System.out.println("Quantas pessoas deseja cadastrar?");
        int quantidadeDePessoas = scanner.nextInt();

            for (int i = 1; i <= quantidadeDePessoas; i++){

            scanner.nextLine();

            System.out.println("Insira seu nome: ");
                String inserirNome = scanner.nextLine();
            System.out.println("Insira sua inicial: ");
                char inserirInicial = scanner.next().charAt(0);
            System.out.println("Insira sua idade: ");
                int inserirIdade = scanner.nextInt();
            System.out.println("Insira sua altura: ");
                double inserirAltura = scanner.nextDouble();
            System.out.println("Você estuda java?: ");
                boolean inserirJava = scanner.nextBoolean();

            System.out.println("DADOS CADASTRADOS ABAIXO:");
            System.out.println("Nome: " + inserirNome);
            System.out.println("Inicial: " + inserirInicial);
            System.out.println("Idade: " + inserirIdade);
            System.out.println("Altura: " + inserirAltura);
            System.out.println("Estuda java?: " + inserirJava);

            if (inserirIdade >= 18) {
                System.out.println("ACESSO AUTORIZADO! seja bem vindo(a)! " + inserirNome);
            } else {
                System.out.println("ACESSO NEGADO! pessoa menor de idade");
            }

            if (inserirAltura >= 1.70) {
                System.out.println("Você tem 1,70m ou mais");
            } else {
                System.out.println("Você tem menos de 1,70m");
            }

            if (inserirJava) {
                System.out.println("Continue estudado Java!");
            } else {
                System.out.println("Que tal começar a estudar Java?");
            }

            double decimal = (double) inserirIdade;
            System.out.println("idade em double: " + decimal);
        }
    }
}