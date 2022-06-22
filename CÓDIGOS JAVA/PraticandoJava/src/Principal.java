
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
                     
        Pessoa pessoa = new Pessoa(); //1°Chamei a classe com "Pessoa" || 2° Atribui a um novo nome em "pessoa" e coloquei como uma nova variável de "new Pessoa"
        Saudacoes saudacoes = new Saudacoes();
        
        saudacoes.saudacoes = "Olá";
        saudacoes.instrucoes = "siga as instruções abaixo: ";
        
        pessoa.nome = JOptionPane.showInputDialog("Digite o seu nome: "); //Aqui chamei a nova string da classe "Pessoa" e atribui um valor ao seu atributo
        pessoa.idade = JOptionPane.showInputDialog("Digite sua idade: ");
        pessoa.cpf = JOptionPane.showInputDialog("Digite seu cpf: ");
        pessoa.ano = JOptionPane.showInputDialog("Digite seu ano de nascimento: ");
                
        System.out.println("Nome: "+ pessoa.nome);
        System.out.println("Idade: "+ pessoa.idade);
        System.out.println("CPF: "+pessoa.cpf);
        System.out.println("ANO: "+pessoa.ano);
        
        System.out.println("--------------------------------------------------------------------------------------");
        
    }
    
}
