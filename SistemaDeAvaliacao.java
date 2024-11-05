import javax.swing.JOptionPane;

public class SistemaDeAvaliacao {
    public static void main(String[] args) {
        double notaProva1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da primeira prova:"));
        double notaProva2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da segunda prova:"));
        double notaTrabalho = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho:"));

        double media = (notaProva1 + notaProva2 + notaTrabalho) / 3;

        String status = (media >= 6) ? "Aprovado" : "Reprovado";
        JOptionPane.showMessageDialog(null, String.format("Média: %.2f - Status: %s", media, status));
    }
}
