// Proble: Print Inverted right triangle pattern
// Author: Vishal Kumar Pal
// Date: 10-Sep-2025


import java.util.Scanner;

public class PatternMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menu
        System.out.println("Choose a Pattern to Print:");
        System.out.println("1. Pyramid");
        System.out.println("2. Inverted Pyramid");
        System.out.println("3. Diamond");
        System.out.println("4. Hollow Pyramid");
        System.out.println("5. Hollow Diamond");
        System.out.println("6. Butterfly");
        System.out.println("7. Sandglass");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        switch (choice) {
            case 1: PyramidPattern.print(n); break;
            case 2: InvertedPyramidPattern.print(n); break;
            case 3: DiamondPattern.print(n); break;
            case 4: HollowPyramidPattern.print(n); break;
            case 5: HollowDiamondPattern.print(n); break;
            case 6: ButterflyPattern.print(n); break;
            case 7: SandglassPattern.print(n); break;
            default: System.out.println("Invalid choice!");
        }

        sc.close();
    }
}