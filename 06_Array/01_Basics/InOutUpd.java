import java.util.*;

public class InOutUpd {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        // Creating an Array
        int marks[] = new int[50];

        // input
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();

        // output
        System.out.println("Phy: " + marks[0]);
        System.out.println("Math: " + marks[1]);

        // upadte 
        marks[1] = 100 + 4;
        System.out.println("Math: " + marks[1]);

        // Array length
        System.out.println("Array of length: " + marks.length);

        sc.close();
    }
}
