package TCSPreviouslyAskedProblems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public void sum(int[]arr, int target){
        Map<Integer,Integer> map = new HashMap<>();

        for(var num : arr){
            int rem = target - num;
            if(map.containsKey(rem)){
                System.out.println("(" + rem + ", " + num + ")");
            }
            map.put(num, 1);
        }
    }

}


class run3{
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 10};
        TwoSum twoSum = new TwoSum();
        twoSum.sum(arr,12);
    }
}