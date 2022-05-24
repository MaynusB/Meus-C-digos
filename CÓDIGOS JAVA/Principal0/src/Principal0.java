
import javax.swing.JOptionPane;


public class Principal0 extends Usuario {

    
    public static void main(String[] args) {
        
       nome = JOptionPane.showInputDialog("Qual o seu nome? ");
       email = JOptionPane.showInputDialog("Qual o seu email? ");
       telefone = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu telefone? "));
       
       System.out.println("Nome: "+ nome);
       System.out.println("Email : "+ email);
       System.out.println("Telefone : "+ telefone);
    }
    
}
