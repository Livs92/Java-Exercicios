import java.util.Scanner;

public class SistemaDeLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String loginCorreto = "java8";
        int tentativas = 3;

        for (int i = 0; i < tentativas; i++) {
            System.out.print("Digite seu login: ");
            String login = scanner.nextLine();

            if (login.equals(loginCorreto)) {
                System.out.println("Acesso concedido!");
                break;
            } else {
                System.out.printf("Login incorreto. Tentativas restantes: %d\n", tentativas - i - 1);
            }
        }

        scanner.close();
    }
}
