//Problem: java a program to find the third largest element in an array.
// Solution: Brute force Using sorting

public class ThirdLargest_Brute {

    static int ThirdLargest(int arr[]){
        int n = arr.length;

        // Sorted the array
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        int count = 1;
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] != arr[i + 1]){
                count ++;
            }
            if(count == 3){
                return arr[i];
            }
        } 

        // If no third largest distinct element exists
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1, 14, 2, 16, 10, 20, 20, 20, 16};
        System.out.println(ThirdLargest(arr));
    }
}

