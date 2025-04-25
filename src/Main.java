import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Usando Scanner para ler a escolha do usuário
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma figura geométrica: ");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Triângulo");
        System.out.println("3 - Losango");

        int escolha = sc.nextInt();  // Lê a escolha do usuário (1, 2 ou 3)

        switch (escolha) {
            case 1:
                // Criando uma instância de um quadrado
                Quadrado quadrado = new Quadrado();

                // Solicita o valor do lado do quadrado
                System.out.print("Digite o valor do lado do quadrado: ");
                double ladoQuadrado = sc.nextDouble();
                quadrado.setLado(ladoQuadrado);

                // Calculando e exibindo a área do quadrado
                double areaQuadrado = quadrado.getArea();
                System.out.println("Área do Quadrado: " + areaQuadrado);

                // Calculando e exibindo o perímetro do quadrado
                double perimetroQuadrado = quadrado.getPerimetro();
                System.out.println("Perímetro do Quadrado: " + perimetroQuadrado);
                break;

            case 2:
                // Criando uma instância de um Triângulo
                Triangulo triangulo = new Triangulo();

                // Solicita os valores dos lados e da base/altura do triângulo
                System.out.print("Digite a base do triângulo: ");
                double baseTriangulo = sc.nextDouble();
                System.out.print("Digite a altura do triângulo: ");
                double alturaTriangulo = sc.nextDouble();
                System.out.print("Digite o lado A do triângulo: ");
                double ladoATriangulo = sc.nextDouble();
                System.out.print("Digite o lado B do triângulo: ");
                double ladoBTriangulo = sc.nextDouble();
                System.out.print("Digite o lado C do triângulo: ");
                double ladoCTriangulo = sc.nextDouble();

                triangulo.setBase(baseTriangulo);
                triangulo.setAltura(alturaTriangulo);
                triangulo.setLadoA(ladoATriangulo);
                triangulo.setLadoB(ladoBTriangulo);
                triangulo.setLadoC(ladoCTriangulo);

                // Calculando e exibindo a área do triângulo
                double areaTriangulo = triangulo.getArea();
                System.out.println("Área do Triângulo: " + areaTriangulo);

                // Calculando e exibindo o perímetro do triângulo
                double perimetroTriangulo = triangulo.getPerimetro();
                System.out.println("Perímetro do Triângulo: " + perimetroTriangulo);
                break;

            case 3:
                // Criando uma instância de um Losango
                Losango losango = new Losango();

                // Solicita os valores das diagonais e do lado do losango
                System.out.print("Digite a diagonal maior do losango: ");
                double diagMaior = sc.nextDouble();
                System.out.print("Digite a diagonal menor do losango: ");
                double diagMenor = sc.nextDouble();
                System.out.print("Digite o valor do lado do losango: ");
                double ladoLosango = sc.nextDouble();

                losango.setDiagonalMaior(diagMaior);
                losango.setDiagonalMenor(diagMenor);
                losango.setLado(ladoLosango);

                // Calculando e exibindo a área do losango
                double areaLosango = losango.getArea();
                System.out.println("Área do Losango: " + areaLosango);

                // Calculando e exibindo o perímetro do losango
                double perimetroLosango = losango.getPerimetro();
                System.out.println("Perímetro do Losango: " + perimetroLosango);
                break;

            default:
                System.out.println("Escolha inválida!");
                break;
        }

        sc.close(); // Fecha o Scanner
    }
}
