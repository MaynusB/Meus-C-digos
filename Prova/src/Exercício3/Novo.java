package Exercício3;


public class Novo extends Imovel {
    
    int resultado;
    public void ExibirPrimValor (int preco){
        System.out.println("Primeiro valor: "+ preco);
    }
    
    public void ExibirSegValor (int preco){
        System.out.println("Segundo valor com 40%: "+(preco + ((preco*40)/100) ));
    }
    
}
