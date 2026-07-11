package Problem_03_ReverseArray;
// Problem: Reverse array
// Solution: Using temporary array

public class ReverseArray_UsingTemp {

    static void reverseArray(int arr[]){
        int n = arr.length;

        int temp[] = new int[n];

        for(int i = 0; i < n; i++){
            temp[i] = arr[n - i - 1];
        }

        for(int i = 0; i < n; i++){
            arr[i] = temp[i];
        }
    }
    public static void main(String ags[]){
        int arr[] = {1, 2, 3, 4, 5, 6};
        reverseArray(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +  " ");
        }
    }
}
