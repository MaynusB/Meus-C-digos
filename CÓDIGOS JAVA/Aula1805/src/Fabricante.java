
import javax.swing.JOptionPane;

public class Fabricante {
    String nomeFab;
    double idade;
    private float altura;
    
    public Fabricante(String nome, double valor){
        nomeFab = JOptionPane.showInputDialog("Digite o seu nome: ");
        idade = valor;
    }

    
    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    
}
