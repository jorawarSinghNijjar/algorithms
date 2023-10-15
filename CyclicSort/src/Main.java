import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Numbers are 1 to n;
        int[] nums = {5,4,1,3,2};
        System.out.println(Arrays.toString(cyclicSort(nums)));
    }

    private static int[] cyclicSort(int[] nums) {
        int steps = 0;
        int i = 0;
        while(i < nums.length){
            steps++;
            int correct = nums[i] - 1;
            if(nums[i] == nums[correct]){
                i++;
            }
            else{
                swap(nums, i, nums[i] - 1);
            }
        }
        System.out.println("Steps :" + steps);
     return nums;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}