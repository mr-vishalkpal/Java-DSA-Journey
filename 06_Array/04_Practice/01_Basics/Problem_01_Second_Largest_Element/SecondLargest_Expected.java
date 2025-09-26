// Problem: Java program to find the second largest element in the array
// using one traversal

public class SecondLargest_Expected {

    static int SecondLargest(int arr[]){
        int largest = -1, SecondLargest = -1;

        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                SecondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > SecondLargest ){
                SecondLargest = arr[i];
            }
        } return SecondLargest;
    }
    public static void main(String args[]){
        int arr[] = {12, 35, 1, 10, 34, 1, 35};
        System.out.println(SecondLargest(arr));
    }
}
