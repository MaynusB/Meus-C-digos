/*
 Crie a classe Imovel, que possui um endereço = “Rua Bosque” e um preço = 100000
(valores default)
a) Crie uma classe Novo, que herda Imovel e possui um adicional de 40% no
preço. Crie métodos de acesso e impressão deste valor adicional.
b) Crie uma classe Velho, que herda Imovel e possui um desconto de 15% no
preço. Crie métodos de acesso e impressão para este desconto.
c) Em uma classe Principal crie um objeto do tipo Novo e outro do tipo Velho,
em seguida exiba seu respectivo endereço e valor.
 */
package Exercício3;

public class Principal3 {
    
   public static void main(String[] args){
       Imovel imovel = new Imovel();
       
       //c)
       Novo novo = new Novo();
       Velho velho = new Velho();
       
       //a)
       novo.ExibirPrimValor(100000);
       novo.ExibirSegValor(100000);
       imovel.exibirEndereco();
       
       //b)
       velho.ExibirVelhoValor1();
       velho.ExibirVelhoValor2();
       imovel.exibirEndereco();
        
   }
     
}
