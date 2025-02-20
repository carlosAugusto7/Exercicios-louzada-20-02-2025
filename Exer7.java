import java.util.Scanner;

public class PerimetroAreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        double altura = scanner.nextDouble();
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        System.out.println(area);
        System.out.println(perimetro);
        scanner.close();
    }
}
