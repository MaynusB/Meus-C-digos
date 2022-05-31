package Calculadora;

public class Principal extends Pessoa {

    String nome;

    public static void main(String[] args) {
        
        
        Principal p = new Principal();
        p.atribuiNome();
        p.exibeNome();
    }

    @Override
    void atribuiNome() {
        nome = "Matheus Braga";
    }

    @Override
    void exibeNome() {
        System.out.println(nome);
    }

}

