import java.util.Scanner;


public class factorial {

    public static int facto(int n){

        int f = 1;
        for (int i = 1; i <=n ; i++){
            f = f * i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int f = facto(num);
        System.out.println("Factorail of " + num + " " + " is" + " " + f);

        sc.close();
    }
}
