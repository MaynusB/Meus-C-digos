
import javax.swing.JOptionPane;


public class Pessoa extends Principal {
    String nome;
    String email;
    
    public String Nomear(){
        return JOptionPane.showInputDialog("Digite seu nome: ");
        
    }
    
    public String digitarEmail(){
        return JOptionPane.showInputDialog("Digite seu email: ");
        
    }
         
}

