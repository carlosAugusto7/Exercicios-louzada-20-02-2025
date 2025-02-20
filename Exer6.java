import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioBruto = scanner.nextDouble();
        double descontoINSS = scanner.nextDouble();
        double salarioLiquido = salarioBruto - descontoINSS;
        System.out.println(salarioLiquido);
        scanner.close();
    }
}
