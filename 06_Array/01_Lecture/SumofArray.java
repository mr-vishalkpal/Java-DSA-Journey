//Problem: Print sum of arrays
// Date: 25-Sep-2025
import java.util.Scanner;
public class SumofArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size of array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];
        System.out.print("Enter " + size + " elements: ");
        int sum = 0;
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
            sum = numbers[i] + sum;
        }

        System.out.println("Sum of arrays: " + sum);

        sc.close();

    }
}
