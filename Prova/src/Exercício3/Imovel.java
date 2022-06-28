
package Exercício3;


public class Imovel {
    private String endereco = "Rua Bosque";
    private int preco = 100000;

    public String getEndereco() {
        return endereco;
    }

    public int getPreco() {
        return preco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
    
    public void exibirEndereco(){
        System.out.println("Endereço: " + endereco);
    }
}
