package LeetCode.Array;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int k = 1;

        for (int i = 1; i< nums.length; i++){
            //check if the current element is different from the previous unique element.
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i]; //place the unique element at index k.
                k++;   //increment k to next unique position.
            }
        }
        return k; //k is the count of unique elements
    }
}
