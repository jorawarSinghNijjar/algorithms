package arrays;

import java.util.Arrays;

public class ConcatenateArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(Arrays.toString(concatArr(arr)));
    }

    public static int[] concatArr(int[] nums){
        int n = nums.length;
        int[] ans = new int[2 * n];
        for(int i=0; i < n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }

        return ans;
    }
}
