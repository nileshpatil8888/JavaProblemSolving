import LeetCode.Array.ContainsDuplicate;
import LeetCode.Array.RemoveDuplicatesFromSortedArray;
import LeetCode.Array.SingleNumber;
import LeetCode.Array.TwoSum;
import Strings.ConvertStringtoUppercase;
import Strings.RemoveWhitespaceFromString;
import Strings.TwoEqualStrings;

public class Main {

    public static void main(String[] args){
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.hello());

        ConvertStringtoUppercase convertStringtoUppercase = new ConvertStringtoUppercase();
        System.out.println(convertStringtoUppercase.convert());
        RemoveWhitespaceFromString removeWhitespaceFromString = new RemoveWhitespaceFromString();
        removeWhitespaceFromString.removeWhiteSpace();

        TwoEqualStrings twoEqualStrings = new TwoEqualStrings();
        twoEqualStrings.Equals();

        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int[] nums = {1,1,1,2,3,4,4,4,4,5,5,5,7,8,9};
        var element = removeDuplicatesFromSortedArray.removeDuplicates(nums);
        System.out.println(element);

        TwoSum twoSum = new TwoSum();
        int[] num = {2,7,11,15};
        var A = twoSum.twoSum(num, 9);
        System.out.println(A);

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] num1 = {2,2,2,1};
        var c = containsDuplicate.containsDuplicate(num1);
        System.out.println(c);

        SingleNumber singleNumber = new SingleNumber();
        int[] num2 = {4,1,2,1,2};
        var d =  singleNumber.singleNumber(num2);
        System.out.println(d);
    }
}
