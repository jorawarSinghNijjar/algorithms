package canCompleteCircuit;

import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Integer[] A = {1,2,3,4,1};
        Integer[] B = {2,1,2,3,1};

        List<Integer> AL = Arrays.asList(A);
        List<Integer> BL = Arrays.asList(B);
        System.out.println(canCompleteCircuit(AL, BL));
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int canCompleteCircuit(final List<Integer> A, final List<Integer> B) {
        int i=0,
                startIndex=0,
                fit=A.get(i),
                circuitLength=A.size(),
                stationCount=0;

        //Invalid Input Check
        if(A.size() != B.size() || A.size() == 0 || B.size() == 0){
            return -1;
        }

        // One Index Array
        if(A.size() == 1){
            return A.get(0) == B.get(0) ? 0 : -1;
        }
        while(startIndex < circuitLength){

            if(stationCount == circuitLength){
                return startIndex;
            }

            if(stationCount == 0){
                fit = A.get(startIndex);
            }

            if(fit >= B.get(i)){
                fit = fit + A.get(i) - B.get(i);
                stationCount++;
            }
            else{
                stationCount = 0;
                startIndex++;
            }

            if(i+1 > circuitLength - 1){
                i = 0;
            }
            else{
                i++;
            }
        }

        return -1;
    }

}
