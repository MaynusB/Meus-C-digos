
import javax.swing.JOptionPane;



public class Principal {

    
    public static void main(String[] args) {
        int v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° valor: "));
        int v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° valor: "));
        
        Multiplicacao multiplicacao = new Multiplicacao();
        multiplicacao.calcular(v1, v2);
        multiplicacao.exibeResultado();
        
        Soma soma = new Soma();
        soma.calcular(v1, v2);
        soma.exibeResultado();
        
        Divisao divisao = new Divisao();
        divisao.calcular(v1, v2);
        divisao.exibeResultado();
        
        Subtracao subtracao = new Subtracao();
        subtracao.calcular(v1, v2);
        subtracao.exibeResultado();
        
        
    }
    
}
