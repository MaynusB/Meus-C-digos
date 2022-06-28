
import javax.swing.JOptionPane;


public class Pessoa {
    private String nome;
    private int data;
    private String altura;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }

    public int getData() {
        return data;
    }

    public String getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
    
    public Pessoa(){
        this.nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        this.data = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento: "));
        altura = JOptionPane.showInputDialog("Digite a sua altura: ");
        idade = 2022 - data;
    }
    
}
