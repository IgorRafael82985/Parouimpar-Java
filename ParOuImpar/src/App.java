import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("O número em questão " + "(" + numero + ")" + " é par");
            } else {
                System.out.println("O número em questão" + "(" + numero + ")" + "é ímpar");
            }
        }
    }
}
