import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        System.out.println(Arrays.toString(selectionSort(nums)));
    }

    private static int[] selectionSort(int[] nums) {
        int steps = 0;
        int maxIndex;
        for(int i=0; i < nums.length; i++){
            maxIndex = 0;
            for(int j=0; j < nums.length - i; j++){
                steps++;
               if(nums[j] > nums[maxIndex]){
                   maxIndex = j;
               }
            }
            // Swap max value to the end of the array
            int temp = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = nums[maxIndex];
            nums[maxIndex] = temp;
        }
        System.out.println("Steps: "+ steps);
        return nums;
    }
}