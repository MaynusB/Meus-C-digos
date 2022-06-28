
package Exercício5;

 public class Circulo implements FormaGeometric {
    
    private double raio = 15;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double getArea() {
        double area = 0;
        area = (3.14*(raio*raio));

        return area;
    }
    @Override
    public double getPerimetro() {
        double perimetro = 0;
        perimetro = (2*3.14*raio);
        return perimetro;
    }
    @Override
    public String getFiguraName() {
        return "FORMA => CIRCULO";
    }
}

