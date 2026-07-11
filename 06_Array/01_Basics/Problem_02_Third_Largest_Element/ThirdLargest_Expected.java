// Problem: // Java program to find the third largest element in an array
// Solution: Using Three variable

public class ThirdLargest_Expected{

    static int ThirdLargest(int arr[]){

        int n = arr.length;
        int largest = -1;
        int secondlargest = -1;
        int thirdlargest =  -1;
        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                thirdlargest = secondlargest;
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondlargest){
                thirdlargest = secondlargest;
                secondlargest = arr[i];
        }
        else if(arr[i] < largest && arr[i] > thirdlargest){
            thirdlargest = arr[i];
        }
        }

        return thirdlargest;

    }
    public static void main(String args[]){
        int[] arr = { 1, 14, 2, 80, 16, 10, 20, 20, 20};
        System.out.println(ThirdLargest(arr));
    }
}