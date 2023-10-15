package canCompleteCircuit;

import java.util.Arrays;
import java.util.List;

public class IdealSolution {

    public static void main(String[] args) {
        Integer[] A = {1,2,6,4};
        Integer[] B = {3,1,2,5};
        // Expected Answer = 1
        List<Integer> AL = Arrays.asList(A);
        List<Integer> BL = Arrays.asList(B);
        System.out.println(canCompleteCircuit(AL, BL));
    }
    public static int canCompleteCircuit(final List<Integer> gas, final List<Integer> cost) {
        int n = gas.size();

        if(gas.size() != cost.size() || gas.size() == 0 || cost.size() == 0){
            return -1;
        }

        if(gas.size() == 1) {
            return gas.get(0) == cost.get(0) ? 0 : -1;
        }

        for(int i=0; i < n; i++){
            int gasInTank=0, stationCount=0, j=i;
            while(stationCount < n){
                gasInTank += gas.get(j % n) - cost.get(j % n);
                // j % n will help us get away from out of index
                // problem as j becomes greater than n, thus the remainder will always be less than n

                if(gasInTank < 0 ){
                    break;
                }
                stationCount++;
                j++;
            }
            if(stationCount == n && gasInTank >=0){
                return i;
            }
        }

        return -1;
    }
}
