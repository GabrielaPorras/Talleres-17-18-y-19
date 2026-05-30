package taller17.ejercicio1;

public class Main {

    public static void main(String[] args) {
        Figura miRectangulo = new Rectangulo(5.0, 4.0);
        Figura miCirculo = new Circulo(3.0);

        System.out.println("Area del rectangulo: " + miRectangulo.calcularArea());
        System.out.println("Area del circulo: " + miCirculo.calcularArea());
    }
}