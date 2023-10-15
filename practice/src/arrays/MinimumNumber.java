package arrays;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {2,9,-4,12,13};
        System.out.println(minNum(arr));
    }

    static int minNum(int[] arr){
        if(arr.length == 0){
            return -1;
        }

        if(arr.length == 1){
            return arr[0];
        }

        int min = arr[0];

        for(int i=0; i < arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }

        return min;
    }
}
