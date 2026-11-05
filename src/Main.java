import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //interface system

        System.out.println("Cadastro Digital");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Fazer login");
        System.out.println("3 - Sair");

        int options = 1;
        scanner.nextLine();

        //register (CPF and Password)

        if (options == 1) {
            System.out.println("Insira seus dados: ");

            System.out.println("Digite seu CPF: ");
            String insertCpf = scanner.nextLine();
            System.out.println("Digite sua senha: ");
            String insertPsswrd = scanner.nextLine();
            boolean validCpf = insertCpf.length() == 11 && insertCpf.matches("[0-9]+");
            boolean validPsswrd = insertPsswrd.length() >= 8;
            if (validCpf && validPsswrd) {
                System.out.println("Cadastro realizado com sucesso!");

                //remake register for validation (login system)

                System.out.println("Digite novamente seu CPF: ");
                String loginCpf = scanner.nextLine();
                System.out.println("Digite novamente sua senha: ");
                String loginPsswrd = scanner.nextLine();

                if (insertCpf.equals(loginCpf) && insertPsswrd.equals(loginPsswrd)) {
                    System.out.println("Login correto!");
                } else {
                    System.out.println("Login incorreto!");
                }
            }
        } else {
            System.out.println("Cadastro inválido!");
        }
    }
}


/*
features to implement:
1 - fix menu loop (while)
2 - implement model system

last updated: 2026-11-05
 */