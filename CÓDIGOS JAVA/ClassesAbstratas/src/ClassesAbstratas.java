
public class ClassesAbstratas extends Pessoa {

    String nome;

    public static void main(String[] args) {
        ClasssesAbstratas p = new ClassesAbstratas();
        p.atribuiNome();
        p.exibeNome();
    }

    @Override
    void atribuiNome() {
        nome = "CryptoBrbas";
    }

    @Override
    void exibeNome() {
        System.out.println(nome);
    }

}


