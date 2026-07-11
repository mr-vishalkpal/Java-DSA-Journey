// Problem: Print Sum of all subArrays
// Solution: Using nested loop 

public class SumofAllSubArrays_Brute {

    static int SumofAllSubArrays(int arr[]){
        int n = arr.length;
        int sum = 0, temp = 0;
        for(int i = 0; i < n; i++){
            temp = 0;
            for(int j = i; j < n; j++){
                temp += arr[j];
                sum += temp;
                // Print here temp value you understand loop
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4};

        System.out.println(SumofAllSubArrays(arr));
    }
}
