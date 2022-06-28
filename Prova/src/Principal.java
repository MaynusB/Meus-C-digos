/*Crie uma classe para representar uma pessoa, com os atributos privados de nome,
data de nascimento e altura. Crie os métodos públicos necessários para sets e gets
e também um método para imprimir todos dados de uma pessoa e outro para
calcular a idade da pessoa. Crie uma classe principal com um método main e crie 2
objetos do tipo pessoa, solicite ao usuário para preencher as informações nome,
data de nascimento e altura, em seguida utilizando os métodos da classe pessoa,
imprima os dados do objeto criado junto a sua idade*/
public class Principal {

    
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Nascimento: " + pessoa1.getData());
        System.out.println("Altura: " + pessoa1.getAltura());
        System.out.println("Idade: " + pessoa1.getIdade());
        
        Pessoa pessoa2 = new Pessoa();
        System.out.println("\nNome: " + pessoa2.getNome());
        System.out.println("Nascimento: " + pessoa2.getData());
        System.out.println("Altura: " + pessoa2.getAltura());
        System.out.println("Idade: " + pessoa2.getIdade());
    }
    
}
