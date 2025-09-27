// Problem: print sum of all sub arrays
// Solution: Element Contribution method

public class SumofAllSubArray_Expected {

    static int SumofAllSubArray(int arr[]){
        int n = arr.length;

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += (arr[i] * (i + 1) * (n - i));
        }
        return sum;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4};

        System.out.println(SumofAllSubArray(arr));
    }
}
