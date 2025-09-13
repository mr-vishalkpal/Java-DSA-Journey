public class functionOverloading {

    public static int sum(int a, int b){
        return a + b;

    }

    public static float sum(float a, float b){
        return a + b;
    }
    public static void main(String args[]){
        System.out.println("sum of a + b = "+ sum(4,6));
        System.out.println("Sum of a + b + c = "+ sum(5f,6f));
    }
}
