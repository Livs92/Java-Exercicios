import java.util.Scanner;
import java.util.Arrays;

public class CircuitoDeResistencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] resistencias = new double[4];
        double resistenciaTotal = 0;

        for (int i = 0; i < resistencias.length; i++) {
            System.out.printf("Digite o valor da resistência %d: ", i + 1);
            resistencias[i] = scanner.nextDouble();
            resistenciaTotal += resistencias[i];
        }

        double maiorResistencia = Arrays.stream(resistencias).max().orElse(0);
        double menorResistencia = Arrays.stream(resistencias).min().orElse(0);

        System.out.printf("Resistência equivalente: %.2f\n", resistenciaTotal);
        System.out.printf("Maior resistência: %.2f\n", maiorResistencia);
        System.out.printf("Menor resistência: %.2f\n", menorResistencia);

        scanner.close();
    }
}
