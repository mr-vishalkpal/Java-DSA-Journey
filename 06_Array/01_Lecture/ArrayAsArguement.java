public class ArrayAsArguement {

    public static void update(int marks[], int num){
        num = 10;
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]) {
        int marks[] = {96, 64, 54};

        int num = 5;

        // passing array as arguments
        // Here Array marks is reference type of variable and num is primitive types
        update(marks, num);
        System.out.println(num);

        // print our marks
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }

        System.out.println();
    }
}
