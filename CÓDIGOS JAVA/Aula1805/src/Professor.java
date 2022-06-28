
import javax.swing.JOptionPane;

public class Professor {
    //Atributos da classe
    private String nome;
    private int idade;
    private float altura;
    private String cidade;
    private String cpf;

    
    //Métodos getters e setters -> Quando são privates procurar nas configs e botar automático
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setCidade(String didade) {
        this.cidade = didade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCpf() {
        return cpf;
    }
    
    //Método Construtor
    public Professor(){
        nome = JOptionPane.showInputDialog("Nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        cidade = JOptionPane.showInputDialog("Cidade: ");
        cpf = JOptionPane.showInputDialog("CPF: ");
    }
    
}
