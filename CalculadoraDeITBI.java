import java.util.Scanner;

public class CalculadoraDeITBI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de transação do imóvel: ");
        double valorTransacao = scanner.nextDouble();

        System.out.print("Digite o valor venal do imóvel: ");
        double valorVenal = scanner.nextDouble();

        System.out.print("Digite a porcentagem de ITBI: ");
        double porcentagemITBI = scanner.nextDouble();

        double valorBase = Math.max(valorTransacao, valorVenal);
        double impostoITBI = valorBase * (porcentagemITBI / 100);

        System.out.printf("O valor do ITBI é: %.2f\n", impostoITBI);
        
        scanner.close();
    }
}
