/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laboratorio
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Soma soma = new Soma();
        soma.calcular(2, 3);
        soma.exibeResultado();
        Multiplicacao multiplicacao = new Multiplicacao();
        multiplicacao.calcular(2, 3);
        multiplicacao.exibeResultado();
    }
   
}
