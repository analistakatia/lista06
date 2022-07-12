package lista06B;

import java.util.Scanner;

public class Circulo implements FiguraGeometrica{
    double pi = 3.14;
    double diametro;
    double raio;
    double areaCirculo;

    @Override
    public void calcularArea() {
        System.out.print("\n\nDigite a medida do diâmetro do círculo em cms: ");
        Scanner input = new Scanner(System.in);
        diametro = input.nextDouble();
        raio = diametro / 2;

        areaCirculo = pi * (raio * raio);

        System.out.println("Considerando que a área total de um círculo é o Pi x Raio², temos portanto que, a área desse circulo é "+areaCirculo+" cms");

    }
}
