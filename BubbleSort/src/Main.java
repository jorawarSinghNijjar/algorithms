import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] nums = {3,1,4,5,2};
//        int[] nums = {1,2,3,4,5}; // Best Case -> already sorted
        int[] nums = {5,4,3,2,1}; // Worst Case -> descending sorted
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }

    // Solution 1
    private static int[] bubbleSort(int[] nums){
        int steps = 0; // Just to count the number of loops for performance checking
        for(int i = 0; i < nums.length; i++){
            boolean swapHappened = false;
            for(int j = 1; j < nums.length - i; j++){
                steps++;
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;

                    swapHappened = true;
                }
            }

            if(!swapHappened) {
                System.out.println("Steps:" + steps);
                return nums;
            }
        }
        System.out.println("Steps:" + steps);
        return nums;
    }

    // Solution 2
//    private static int[] bubbleSort(int[] nums){
//        int steps = 0; // Just to count the number of loops for performance checking
//        for(int i = nums.length - 1; i >= 0; i--){
//            boolean swapHappened = false;
//            for(int j = 0; j < i; j++){
//                steps++;
//                if(nums[j] > nums[j+1]){
//                    int temp = nums[j];
//                    nums[j] = nums[j+1];
//                    nums[j+1] = temp;
//
//                    swapHappened = true;
//                }
//            }
//
//            if(!swapHappened) {
//                System.out.println("Steps:" + steps);
//                return nums;
//            }
//        }
//        System.out.println("Steps:" + steps);
//        return nums;
//    }

// Solution 3
//    private static int[] bubbleSort(int[] nums){
//        int steps = 0;
//        for(int i = 0; i < nums.length; i++){
//            for(int j = 1; j < nums.length; j++){
//                steps++;
//                if(nums[j] < nums[j-1]){
//                    int temp = nums[j];
//                    nums[j] = nums[j-1];
//                    nums[j-1] = temp;
//                }
//            }
//        }
//        System.out.println("Steps:" + steps);
//        return nums;
//    }

    // Solution 4
//    private static int[] bubbleSort(int[] nums){
//        int steps = 0;
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i+1; j < nums.length; j++){
//                steps++;
//                if(nums[i] > nums[j]){
//                    int temp = nums[j];
//                    nums[j] = nums[i];
//                    nums[i] = temp;
//                }
//            }
//        }
//        System.out.println("Steps:" + steps);
//        return nums;
//    }

}