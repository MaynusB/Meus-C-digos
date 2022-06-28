
package Exercício3;


public class Velho extends Imovel {
     int resultado;
    public void ExibirVelhoValor1 (){
        System.out.println("\nPrimeiro valor: "+ getPreco());
    }
    
    public void ExibirVelhoValor2 (){
        System.out.println("Segundo valor com 15% de desconto: "+(getPreco() - ((getPreco()*15)/100) ));
    }
}
