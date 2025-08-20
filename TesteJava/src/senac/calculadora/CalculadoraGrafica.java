package calculadora;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class CalculadoraGrafica extends JFrame{

    public CalculadoraGrafica(){
        setSize(300, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        JLabel tituloJLabel = new JLabel("Bem vindo a calculadora!");
        tituloJLabel.setBounds(75, 20, 200, 30);
        add(tituloJLabel);

        JButton botaoIniciar = new JButton("Iniciar");
        botaoIniciar.setBounds(50, 50, 200, 30);
        add(botaoIniciar);

        botaoIniciar.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                try{
                    String opicao = JOptionPane.showInputDialog(
                        "Escolha uma opção: \n"+
                        "1: somar\n"+
                        "2: subtrair\n"+
                        "3: multiplicar\n"+
                        "4: dividir");
                    int escolha = Integer.parseInt(opicao);

                    double num1 = 0;
                    double num2 = 0;

                    if(escolha > 0 && escolha < 5){
                    num1 = Double.parseDouble(
                        JOptionPane.showInputDialog("Informe o primeiro número: "));

                    num2 = Double.parseDouble(
                        JOptionPane.showInputDialog("Informe o segundo número: "));  
                    }
                        double resultado = 0;
                        
                        switch (escolha) {
                            case 1:
                                resultado = Operacoes.adicionar(num1, num2);
                                break;
                            case 2: 
                                resultado = Operacoes.subtrair(num1, num2);
                                break;
                            case 3:
                                resultado = Operacoes.multiplicar(num1, num2);
                                break;
                            case 4:
                                resultado = Operacoes.dividir(num1, num2);
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida");
                        }
                        JOptionPane.showMessageDialog(null, "Resultado final: "+ resultado);
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                }

                JOptionPane.showMessageDialog(null, "Iniciando a calculadora");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculadoraGrafica();
    }
}
