package Calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
       Soma soma = new Soma();
       Subtração subtração = new Subtração();
       Multiplicação multiplicação = new Multiplicação();
       Divisao divisao = new Divisao();
       
       
       int v1 = Integer.parseInt(JOptionPane.showInputDialog("Nível: "));
       int v2 = Integer.parseInt(JOptionPane.showInputDialog("Nível: "));
       
       soma.calcular(v1, v2);
       soma.exibirResultado();
       
       subtração.calcular(v1, v2);
       subtração.exibirResultado();
       
       multiplicação.calcular(v1, v2);
       multiplicação.exibirResultado();
       
       divisao.calcular(v1, v2);
       divisao.exibirResultado();
    }
    
}
