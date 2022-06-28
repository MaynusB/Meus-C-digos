/*
 Crie uma classe Calculadora com três métodos de soma (Overload - os métodos
devem possuir o mesmo nome), um que retorne a soma de dois inteiros x e y, outro
que retorne a soma três inteiros x,y,z e por fim um que retorne a soma dois double x
e y. Em uma classe principal crie um objeto a partir da classe calculadora e exiba o
resultado das 3 opções.

 */
package Exercício4;

import javax.swing.JOptionPane;


public class Principal4 {
    
     public static void main(String[] args) {
       
       Calculadora calculadora = new Calculadora(); 
         
       int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° valor: "));
       int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° valor: "));
       int z = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3° valor: "));
       
       double a = x; 
       double b = y; 
       
       calculadora.Soma1(x, y);
       calculadora.exibirResultado1();
       
       calculadora.Soma1(x, y, z);
       calculadora.exibirResultado2();
       
       calculadora.Soma1(a, b);
       calculadora.exibirResultado3();
               
     }
}
