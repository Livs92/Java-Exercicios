import javax.swing.JOptionPane;

public class CalculadoraDeITBI {
    public static void main(String[] args) {
        double valorTransacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de transação do imóvel:"));
        double valorVenal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor venal do imóvel:"));
        double porcentagemITBI = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem de ITBI:"));

        double valorBase = Math.max(valorTransacao, valorVenal);
        double impostoITBI = valorBase * (porcentagemITBI / 100);

        JOptionPane.showMessageDialog(null, String.format("O valor do ITBI é: %.2f", impostoITBI));
    }

