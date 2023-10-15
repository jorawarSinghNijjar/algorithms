package arrays;

public class EvenNumberDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7869,-90};
        System.out.println(findNumbers(nums));
    }
    
    //Brute force
    public static int findNumbers(int[] nums){
        if(nums.length == 0) return 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
//            if(evenNumberOfDigitsUsingString(nums[i])) count++;
            if(evenNumberOfDigitsUsingAlgo(nums[i])) count++;
        }
        return count;
    }

    // Using divide algorithm

    private static boolean evenNumberOfDigitsUsingAlgo(int num) {
        int count = 0;
        num = Math.abs(num);
//        Naive approach
//        while(num  > 0){
//            count++;
//            num /= 10;
//        }
        // Optimized
        count = (int) Math.log10(num) + 1;
        return count % 2 == 0;
    }

    // Using String length
    private static boolean evenNumberOfDigitsUsingString(int num) {
        String s = Integer.toString(num);
        return s.length() % 2 == 0;
    }



}
