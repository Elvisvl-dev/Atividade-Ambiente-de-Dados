import java.util.Scanner;

public class DadosDeArea {
    private Scanner scanner;
    private CalculoDeArea calculoDeArea;

    public DadosDeArea() {
        scanner = new Scanner(System.in);
        calculoDeArea = new CalculoDeArea();
    }

    public void solicitarForma() {
        System.out.println("Insira a forma que deseja calcular a área");
        System.out.println("1 - Retangulo");
        System.out.println("2 - Circulo");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                solicitarRetangulo();
                break;
            case 2:
                solicitarCirculo();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    public void solicitarRetangulo() {
        System.out.println("Insira a base do retangulo");
        float base = scanner.nextFloat();
        System.out.println("Insira a altura do retangulo");
        float altura = scanner.nextFloat();
        float area = calculoDeArea.retangulo(base, altura);
        System.out.println("A área do retangulo é " + area);
    }

    public void solicitarCirculo() {
        System.out.println("Insira o raio do circulo");
        float raio = scanner.nextFloat();
        float area = calculoDeArea.circulo(raio);
        System.out.println("A área do circulo é " + area);
    }
}