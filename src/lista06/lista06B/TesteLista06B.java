package lista06B;

public class TesteLista06B {
    public static void main(String[] args) {
        //Implementando interface - Quadrado
        Quadrado q1 = new Quadrado();
        q1.calcularArea();

        //Implementando interface - Retangulo
        Retangulo r1 = new Retangulo();
        r1.calcularArea();

        //Implementando interface - Triangulo
        Triangulo t1 = new Triangulo();
        t1.calcularArea();

        //Implementando interface - Circulo
        Circulo c1 = new Circulo();
        c1.calcularArea();
    }
}
