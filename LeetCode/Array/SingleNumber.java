package LeetCode.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isSingle = true;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isSingle = false;
                    break;
                }
            }
            if (isSingle) {
                return nums[i];
            }
        }
        return -1;
    }
}
