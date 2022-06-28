
import javax.swing.JOptionPane;


public class Principal {

   
    public static void main(String[] args) {
        String nome1, nome2;
        
        nome1 = pedirNomes();
        nome2 = pedirNomes();
        exibirNomes(nome1);
        exibirNomes(nome2);
            
    }
    
    public static String pedirNomes(){
        
        return JOptionPane.showInputDialog("Digite o seu nome: ");
    }
    
    public static void exibirNomes(String nome){
        
        System.out.println("Nome: "+ nome);
        
    }
    
    
        
}
