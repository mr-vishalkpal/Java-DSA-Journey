// Problem: Given an integer array arr[] and an integer target. The task is to find a subsequence of arr such that the absolute difference between the sum of its elements and target is minimized. Return the minimum possible value of abs(sum - target).
// Solution: Meet in the middle
// Date: 17-03-2026
// Author: Vishal kumar 


import java.util.*;

public class MinAbsDifference {

   
    public static void generateSums(List<Integer> nums,
                                    int start, int end,
                                    List<Integer> sums)
    {
        int n = end - start;
        for (int i = 0; i < (1 << n); ++i) {
            int sum = 0;
            for (int j = 0; j < n; ++j) {
                if ((i & (1 << j)) != 0) {
                    sum += nums.get(start + j);
                }
            }
            sums.add(sum);
        }
    }

    public static int minAbsDifference(List<Integer> nums,
                                       int goal)
    {
        int n = nums.size();
        List<Integer> leftSums = new ArrayList<>();
        List<Integer> rightSums = new ArrayList<>();

       
        generateSums(nums, 0, n / 2, leftSums);
        generateSums(nums, n / 2, n, rightSums);

        
        Collections.sort(rightSums);

        int minDiff
            = Math.abs(goal);
        
        for (int leftSum : leftSums) {
            int remaining = goal - leftSum;
            int pos = Collections.binarySearch(rightSums,
                                               remaining);

            if (pos >= 0) {
               
                return 0;
            }
            else {
                pos = -pos - 1; 
            }

           
            if (pos < rightSums.size()) {
                minDiff = Math.min(
                    minDiff,
                    Math.abs(remaining
                             - rightSums.get(pos)));
            }
            if (pos > 0) {
                minDiff = Math.min(
                    minDiff,
                    Math.abs(remaining
                             - rightSums.get(pos - 1)));
            }
        }

        return minDiff;
    }

    public static void main(String[] args)
    {
        List<Integer> arr = Arrays.asList(5, -7, 3, 5);
        int target = 6;
        System.out.println(minAbsDifference(arr, target));
    }
}

