package Problem_03_ReverseArray;
public class ReverseArray_UsingTwoPinter {

    public static void reverse(int arr[]){
        int n = arr.length;
        int start = 0, end = n - 1;

        while(start < end){

            // swap
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
    }
    public static void main(String args[]) {

        int arr[] = {2, 4, 6, 8, 10};
        reverse(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
