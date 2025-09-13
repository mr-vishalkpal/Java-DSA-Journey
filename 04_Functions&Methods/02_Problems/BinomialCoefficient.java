import java.util.Scanner;

public class BinomialCoefficient {

    public static int facto(int n){
        
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }

    public static int binCoeff(int n, int r){
        int fact_n = facto(n);
        int fact_r = facto(r);
        int fact_nmr = facto(n-r);

        int binCoeff = fact_n/(fact_r * fact_nmr);
        return binCoeff;
    }
    public static void main(String args[]){

        System.out.println("Binomaial Coefficient : " + binCoeff(5,2));
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for n: ");
        int n = sc.nextInt();

        System.out.print("Enter a number for r: ");
        int r = sc.nextInt();

        int a = facto(n);
        int b = facto(r);
        int c = facto(n - r);

        int bc = a/b*c;
        System.out.println("Binomaial Coefficient : " + bc);
        sc.close();
         
    }
}
