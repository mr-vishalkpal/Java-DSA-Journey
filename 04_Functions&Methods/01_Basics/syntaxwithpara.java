import java.util.*;

public class syntaxwithpara{
    public static int calculatesum(int num1, int num2){    // Parameters or formal param
        int sum = num1 + num2;
        return sum;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a, b);    // Arguments or actual param
        System.out.println("sum is: " + sum);

        sc.close();
    }
}