// Java program to find the third largest element in an array.
// Solution: using three traversal

public class ThirdLargest_Better {

    static int ThirdLargest(int arr[]){
        int n = arr.length;

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        int thirdlargest = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        for(int i = 0; i < n; i++){
            if(arr[i] > secondlargest && arr[i] < largest){
                secondlargest = arr[i];
            }
        }

        for(int i = 0; i < n; i++){
            if(arr[i] > thirdlargest && arr[i] < secondlargest){
                thirdlargest = arr[i];
            }
        }
        return thirdlargest;
        
    }
    public static void main(String args[]){
        int arr[] = {10, 20, 30, 40, 5, 50};
        System.out.println(ThirdLargest(arr));
    }
}
