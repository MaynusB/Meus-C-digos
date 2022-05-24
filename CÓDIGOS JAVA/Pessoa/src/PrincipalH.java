
import javax.swing.JOptionPane;

public class PrincipalH extends SerHumano {

    
    public static void main(String[] args) {
        
        nome = JOptionPane.showInputDialog("Qual o seu nome? ");
        sotaque = JOptionPane.showInputDialog("Qual o seu sotaque? ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade? "));
        
        System.out.println("Nome: "+nome);
        System.out.println("Sotaque: "+sotaque);
        System.out.println("Idade: "+idade);
        
        andar();
    }
    
}
