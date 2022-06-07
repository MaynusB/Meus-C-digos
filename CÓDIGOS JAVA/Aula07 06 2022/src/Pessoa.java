import javax.swing.JOptionPane;


public class Pessoa extends Principal {
    private String nome;
    private String email;

    public void setNome() {
        this.nome = JOptionPane.showInputDialog("Informa seu nome:");
    }

    public void setEmail() {
        this.email = JOptionPane.showInputDialog("Informa seu email:");
    }
    
    
    
    public String getNome(){
        return nome;
    }

    public String getEmail() {
        return email;
    }
    
         
}