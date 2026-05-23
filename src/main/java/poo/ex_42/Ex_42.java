package poo.ex_42;

import javax.swing.JOptionPane;

/**
 *
 * @author Jefferson
 */
public class Ex_42 {

    public static void main(String[] args) {
        int resposta;
        do {
            StringBuilder sb = new StringBuilder("Tabuada\n");
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para calcular a tabuada", "Tabuada JAVA", JOptionPane.INFORMATION_MESSAGE));
            for (int i = 0; i <= 10; i++) {
                int resultado = numero * i;
                sb.append(numero).append(" x ").append(i).append(" = ").append(resultado).append("\n");
            }
            String resultado = sb.toString();
            JOptionPane.showMessageDialog(null, resultado, "Tabuada JAVA", JOptionPane.PLAIN_MESSAGE);
            resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar um novo cálculo?", "Tabuada JAVA", JOptionPane.YES_OPTION);
        } while (resposta == JOptionPane.YES_OPTION);
    }
}
