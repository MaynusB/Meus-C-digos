/*
 Crie uma interface chamada FormaGeometrica que contenha os métodos
calculaArea(), calculaPerimetro();
a) Crie uma classe chamada Quadrado que possua um atributo double lado
implemente a Interface FormaGeometrica realizando a sobrescrita (Overload)
dos calculaArea() e calculaPerimetro() que calcule e exiba os resultados;
b) Crie uma classe chamada Circulo que possua um atributo double raio
implemente a Interface FormaGeometrica realizando a sobrescrita (Overload)
dos calculaArea() e calculaPerimetro() que calcule e exiba os resultados;
c) Em uma classe principal crie um objeto do tipo Quadrado e outro do tipo
Circulo e solicite para o usuário informar seu lado e seu raio
respectivamente. Após isto, exiba o resultado da área e do perímetro de cada
um dos objetos criados.

 */
package Exercício5;


public abstract class Principal5 implements FormaGeometric {
    
     public static void main(String[] args) {
         //a)
         Quadrado quadrado = new Quadrado();
         quadrado.getPerimetro();
         quadrado.getArea();
         System.out.println("Area: " + quadrado.getArea());
         System.out.println("Perímetro: " + quadrado.getPerimetro());
         
         //b)
         Circulo circulo = new Circulo();
         
         circulo.getArea();
         System.out.println("Area: " + circulo.getArea());
          System.out.println("Perímetro: " + circulo.getPerimetro());
         
     }
}
