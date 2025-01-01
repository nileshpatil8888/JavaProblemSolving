package LeetCode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> hashSet = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    if(!hashSet.contains(nums1[i])){
                        hashSet.add(nums1[i]);
                    }
                    break;
                }
            }
        }
        System.out.println(hashSet);
        return nums1;
    }
}
