
import javax.swing.JOptionPane;

public class PrincipalH extends Pessoa {

    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.nome = JOptionPane.showInputDialog("Nome do 1° funcionário: ");
        p1.telefone = Integer.parseInt(JOptionPane.showInputDialog("Telefone do 1° funcionário: "));
        p1.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do 1° funcionário: "));
        
        Pessoa p2 = new Pessoa();
        p2.nome = JOptionPane.showInputDialog("Nome do 2° funcionário: ");
        p2.telefone = Integer.parseInt(JOptionPane.showInputDialog("Telefone do 2° funcionário: "));
        p2.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do 3° funcionário: "));
        
        Pessoa p3 = new Pessoa();
        p3.nome = JOptionPane.showInputDialog("Nome do 3° funcionário: ");
        p3.telefone = Integer.parseInt(JOptionPane.showInputDialog("Telefone do 3° funcionário: "));
        p3.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do 3° funcionário: "));
        
        System.out.println("Nome do 1° funcionário: "+p1.nome);
        System.out.println("Telefone do 1° funcionário: "+p1.telefone);
        System.out.println("Idade 1° funcionário: "+p1.idade);
        
        System.out.println("\nNome do 2° funcionário: "+p2.nome);
        System.out.println("Telefone do 2° funcionário: "+p2.telefone);
        System.out.println("Idade do 2° funcionário: "+p2.idade);
        
        System.out.println("\nNome do 3° funcionário: "+p3.nome);
        System.out.println("Telefone do 3° funcionário: "+p3.telefone);
        System.out.println("Idade do 3° funcionário: "+p3.idade);
        
        System.out.println("\nFuncionário 1: "+ p1.nome);
        funcao1();
        
        System.out.println("\nFuncionário 2: "+ p2.nome);
        funcao2();
        
        System.out.println("\nFuncionário 3: "+ p3.nome);
        funcao3();
    }
    
}
