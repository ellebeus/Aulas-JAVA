package javaSwing;

import javax.swing.JOptionPane;

public class JOptionPaneMessageSimples {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, 
        "Mensagem para o usuário", 
        "Título da janela",
        JOptionPane.ERROR_MESSAGE);
        //JOptionPane.PLAIN_MASSAGE
        //JOptionPane.QUESTION_MASSAGE
        //JOptionPane.INFORMATION_MASSAGE
        //JOptionPane.WARNING_MASSAGE
    }
}
