import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anos = scanner.nextInt();
        int dias = anos * 365;
        System.out.println(dias);
        scanner.close();
    }
}
