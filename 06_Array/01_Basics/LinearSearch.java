public class LinearSearch {

    // for the Integer array 
    public static int LineSearch(int numbers[], int key){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // for String array
    public static int LineSearch(String fruits[], String name) {
        for (int i = 0; i < fruits.length; i++){
            if (fruits[i].equals(name)){
                return i;
            } 
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 20;

        int index = LineSearch(numbers, key);
        if(index == -1) {
            System.out.println("Not Found");
        } else{
            System.out.println("Key is at index : " + index);
        }

        String fruits[] = {"apple", "banana", "Orange", "grapes"};
        String name = "Orange";

        int index1 = LineSearch(fruits, name);
        if(index1 == -1){
            System.out.println("Not Found");
        } else{
            System.out.println("name is at index: " + index1);
        }
    }
}
