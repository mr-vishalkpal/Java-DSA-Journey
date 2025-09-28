// Problem: Traped Rain Water
// Solution: Brute Approach

public class TrappedRainWater_Brute {
    static int trappedRainwater(int height[]){

        int trappedWater = 0;
        int n = height.length;

        for(int i = 1; i < n-1; i++){

            int left = height[i];
            for(int j = 0; j < i; j++){
                left = Math.max(left, height[j]);         
            }
            
            int right = height[i];
            for(int j = i + 1; j < n; j++){
                right = Math.max(right, height[j]);
            }

            trappedWater += Math.min(left, right)  - height[i];
        }
        return trappedWater;
    }

    public static void main(String args[]){
        int height[] = {2, 1, 5, 3, 1, 0 ,4};
        System.out.println(trappedRainwater(height));
    }
}
