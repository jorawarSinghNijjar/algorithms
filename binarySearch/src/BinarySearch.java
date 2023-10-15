

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 10, 13, 20};

        System.out.println(findIndex(arr,3));
    }

    public static int findIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // Find the middle element
//            int mid = ((start + end) / 2); // Sometimes for large arrays mid crosses integer range value and breaks the code
            int mid = start + (end - start) / 2;

            if( target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
