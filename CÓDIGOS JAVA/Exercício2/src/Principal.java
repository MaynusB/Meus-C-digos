
import javax.swing.JOptionPane;

/*2)Crie uma classe para armazenar os atributos nome e email do usuário em um arquivo
texto, em que o nome do arquivo é o mesmo nome do usuário que foi digitado. Essa classe
deverá permitir a sobrecarga de métodos, em que o usuário poderá gravar o nome e o
email no arquivo, ou somente o nome. Crie uma classe Principal para realizar a leitura dos
atributos. Se ambos os atributos forem preenchidos a sobrecarga deverá ser uma. Se
apenas o nome do usuário for preenchido, então a sobrecarga deverá ser outra. Além
disso, ofereça ao usuário a opção de ler o conteúdo do arquivo de acordo com um nome
por ele informado.*/

public class Principal {

    
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Nome e email Digite 1, apenas Nome Digite 2: "));
        Pessoa pessoa = new Pessoa();
        
         switch (num) {

            case 1:                              
               System.out.println("Nome: "+pessoa.Nomear());
               System.out.println("Email: "+ pessoa.digitarEmail());               
               break;

            case 2:
               System.out.println(""+pessoa.Nomear());              
               break;

         }
    }
    
}
