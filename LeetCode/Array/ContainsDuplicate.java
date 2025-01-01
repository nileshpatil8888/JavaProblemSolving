package LeetCode.Array;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        //bruteforce approach
        //time complexity o(n^2)
        for(int i=0; i<nums.length; i++){
            for(int k=i+1; k < nums.length; k++){
                if(nums[i] == nums[k]){
                    return true;
                }
            }
        }
        return false;

        /* optimized solution
        Time complexity o(1)
            public boolean containsDuplicate(int[] nums) {
               HashSet<Integer> set = new HashSet<>();
               for (int num : nums) {
               if (set.contains(num)) {
                    return true;
                }
                set.add(num);
            }
            return false;
        }*/
    }
}
