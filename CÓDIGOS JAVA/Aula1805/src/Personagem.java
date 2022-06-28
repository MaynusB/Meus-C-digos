
import javax.swing.JOptionPane;


public class Personagem {
    
    // ATRIBUTOS DA CLASSE
    private String mensagem;
    private String nome;
    private String classe;
    private int nivel;
    private int vida;

    //MÉTODOS GETTER E SETTER
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    //MÉTODOS CONSTRUTORES
    public Personagem(){   
        this.nome = JOptionPane.showInputDialog("Nome: ");
        this.classe = JOptionPane.showInputDialog("Classe: ");
        nivel = Integer.parseInt(JOptionPane.showInputDialog("Nível: "));
        vida = nivel * 1000;
    }
    
    //MÉTODOS ESPECÍFICOS
    public void mostrarStatus(){
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
    }
}
