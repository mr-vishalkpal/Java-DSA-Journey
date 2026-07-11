import java.util.Scanner;

public class TestPrimeInRange {

    public static void PrimeInRange(int num) {
        for (int i = 2; i <= num; i++) {
            boolean isPrime = true; // assume number is prime

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {   // found a divisor
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for range: ");
        int num = sc.nextInt();

        System.out.println("Prime numbers up to " + num + ":");
        PrimeInRange(num);

        sc.close();
    }
}
