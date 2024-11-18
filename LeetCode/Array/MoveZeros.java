package LeetCode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeros {

    public void moveZeroes(int[] nums) {

//        int n = nums.length;
//        int index = 0; // Pointer for non-zero elements
//
//        // Move non-zero elements to the beginning
//        for (int i = 0; i < n; i++) {
//            if (nums[i] != 0) {
//                nums[index++] = nums[i];
//            }
//        }
//
//        // Fill the rest of the array with zeros
//        while (index < n) {
//            nums[index++] = 0;
//        }
//
//        System.out.println(nums);
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for(int i=0; i< nums.length; i++){
            if(nums[i] == 0){
                list.add(nums[i]);
                continue;
            }
            if(nums[i] != 0){
                list1.add(nums[i]);
                continue;
            }
        }
        List<Integer> merged = new ArrayList<>(list1);
        merged.addAll(list);

        Integer[] mergedArray = merged.toArray(new Integer[0]);
        System.out.println(Arrays.toString(mergedArray));
    }
}
