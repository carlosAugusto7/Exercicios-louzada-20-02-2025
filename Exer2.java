import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        double area = 3.14159 * raio * raio;
        System.out.println(area);
        scanner.close();
    }
}
