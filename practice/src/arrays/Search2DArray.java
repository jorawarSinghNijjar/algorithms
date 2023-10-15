package arrays;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        
        int[][] arr2 = {
                {2,9,18,1},
                {1,3},
                {10,100,3333,44,59},
                {-10,11,4,6}
        };

        System.out.println(Arrays.toString(search(arr2, 100)));
        
    }

    private static int[] search(int[][] arr2, int target) {
        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                if(arr2[row][col] == target) return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }
}
