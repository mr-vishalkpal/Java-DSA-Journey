// Problem: Print Subraays
// Solution: Using three loop 

public class PrintSubArrays {

    static void PrintSubArray(int arr[]){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int start = i;
            for(int j = i; j < n; j++){
                int end = j;

                System.out.print("[");
                for(int k = start; k <= end;  k++){
                    System.out.print(arr[k]);

                    if(k < end){    // this only for comma
                        System.out.print(",");
                    }
                }
                System.out.println("]");
            }  
        }
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3};
        PrintSubArray(arr);
        
    }
}
