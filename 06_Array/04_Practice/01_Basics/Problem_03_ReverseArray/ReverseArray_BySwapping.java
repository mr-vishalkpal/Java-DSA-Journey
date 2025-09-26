package Problem_03_ReverseArray;
// Problem: Reverse array
// Solution: By swapping half of the element

public class ReverseArray_BySwapping {

    static void reverseArray(int arr[]){
        int n = arr.length;

        for(int i = 0; i < n / 2; i++){
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 5, 7, 3};

        reverseArray(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
