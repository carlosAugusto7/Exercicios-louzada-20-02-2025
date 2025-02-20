import java.util.Scanner;

public class ConversaoMoeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double reais = scanner.nextDouble();
        double cotacaoDolar = scanner.nextDouble();
        double dolares = reais / cotacaoDolar;
        System.out.println(dolares);
        scanner.close();
    }
}
