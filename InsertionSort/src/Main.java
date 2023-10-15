import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] nums = {2,3,7,1,4};
        int[] nums = {1,2,4,5,6}; // Best case (n-1) comparisons =>  O(N)
        System.out.println(Arrays.toString(insertionSort(nums)));
    }

    private static int[] insertionSort(int[] nums) {
        int steps = 0;
        for(int i=0; i < nums.length - 1; i++){
            for(int j = i+1; j >=1; j--){
                steps++;
                if(nums[j] < nums[j-1]){
                    swap(nums, j, j-1);
                }
                else{
                    break;
                }
            }
        }
        System.out.println("Steps: " + steps);
        return nums;
    }

    private static void swap(int[] nums, int one, int two){
        int temp = nums[one];
        nums[one] = nums[two];
        nums[two] = temp;
    }
}