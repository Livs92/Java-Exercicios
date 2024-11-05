import java.util.Scanner;

public class CalculadoraDeAposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu sexo (M/F): ");
        String sexo = scanner.next();

        System.out.print("Digite os anos de contribuição: ");
        int anosContribuicao = scanner.nextInt();

        int idadeMinima = sexo.equalsIgnoreCase("M") ? 65 : 60;
        int anosMinimoContribuicao = 35;

        if (idade >= idadeMinima || anosContribuicao >= anosMinimoContribuicao) {
            System.out.println("Você já pode se aposentar.");
        } else {
            int anosRestantes = Math.min(idadeMinima - idade, anosMinimoContribuicao - anosContribuicao);
            System.out.printf("Faltam %d anos para se aposentar.\n", anosRestantes);
        }

        scanner.close();
    }
}
