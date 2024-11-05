import java.util.Scanner;

public class SistemaDeAvaliacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova: ");
        double notaProva1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double notaProva2 = scanner.nextDouble();

        System.out.print("Digite a nota do trabalho: ");
        double notaTrabalho = scanner.nextDouble();

        double media = (notaProva1 + notaProva2 + notaTrabalho) / 3;

        String status = (media >= 6) ? "Aprovado" : "Reprovado";
        System.out.printf("Média: %.2f - Status: %s\n", media, status);

        scanner.close();
    }
}
