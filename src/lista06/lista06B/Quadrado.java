package lista06B;

import java.util.Scanner;

public class Quadrado implements FiguraGeometrica{
    double lado;
    double comprimento;
    double areaQuadrado;

    @Override
    public void calcularArea() {
        System.out.print("\nDigite a medida do lado do quadrado em cms: ");
        Scanner input = new Scanner(System.in);
        lado = input.nextDouble();
        System.out.print("Digite a medida do comprimento do quadrado em cms: ");
        comprimento = input.nextDouble();

        areaQuadrado = lado * comprimento;

        System.out.println("A área total desse Quadrado é "+areaQuadrado+" cms");

    }
}
