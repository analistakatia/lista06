package lista06B;

import java.util.Scanner;

public class Retangulo implements FiguraGeometrica{
    double base;
    double altura;
    double areaRetangulo;

    @Override
    public void calcularArea() {
        System.out.print("\n\nDigite a medida da base do retângulo em cms: ");
        Scanner input = new Scanner(System.in);
        base = input.nextDouble();
        System.out.print("Digite a medida da altura do retângulo em cms: ");
        altura = input.nextDouble();

        areaRetangulo = base * altura;

        System.out.println("A área total desse Retângulo é "+areaRetangulo+" cms");
    }
}
