public class ConvDecToBin {

    public static void DecToBin(int num){
        int myNum = num;
        int pow = 0;
        int binNum = 0;

        while(num > 0){
            int rem = num % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));

            pow++;
            num = num / 2;

        }
        System.out.println("binary form of " + myNum + " = " + binNum);
    }
    public static void main(String args[]){
        DecToBin(12);
    }
}
