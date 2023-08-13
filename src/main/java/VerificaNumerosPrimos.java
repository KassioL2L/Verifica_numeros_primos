import java.util.Scanner;

public class VerificaNumerosPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira os números separados por espaço: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] numbers = input.split(" ");
        for (String numStr : numbers) {
            int number = Integer.parseInt(numStr);
            String result = isPrime(number) ? "é primo." : "não é primo.";
            System.out.println("O número " + number + " " + result);
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
