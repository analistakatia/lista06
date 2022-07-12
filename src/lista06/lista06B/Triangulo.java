package lista06B;

import java.util.Scanner;

public class Triangulo implements FiguraGeometrica{
    double base;
    double altura;
    double areaTriangulo;

    @Override
    public void calcularArea() {
        System.out.print("\n\nDigite a medida da base do triângulo em cms: ");
        Scanner input = new Scanner(System.in);
        base = input.nextDouble();
        System.out.print("Digite a medida da altura do triângulo em cms: ");
        altura = input.nextDouble();

        areaTriangulo = (base * altura) / 2;

        System.out.println("A área total desse Triângulo é "+areaTriangulo+" cms");
    }
}
