// Problem: Java program to find the second largest element in the array
// Solution: using two traversals

public class SecondLargest_Better {
    static int getSecondLargest(int arr[]){
        int n = arr.length;

        int largest = -1, secondLargest = -1;

        // Finding the largest element
        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        // finding second largest
        for(int i = 0; i < n; i++){
            if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }


    public static void main(String args[]){
        int[] arr = {12, 35, 1, 10, 34, 1, 34,35};
        System.out.println(getSecondLargest(arr));
    }
}
