import LeetCode.Array.*;
import Strings.ConvertStringtoUppercase;
import Strings.RemoveWhitespaceFromString;
import Strings.TwoEqualStrings;

import java.util.Arrays;

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

        PlusOne plusOne = new PlusOne();
        int[] num3 = {4,1,2,1,2};
        int[] plusone = plusOne.plusOne(num3);
        System.out.println(Arrays.toString(plusone));

        MoveZeros moveZeros = new MoveZeros();
        int[] num4 = {0,1,0,0,3,12,0,1,0,0,3,120,1,0,0,3,12};
        moveZeros.moveZeroes(num4);
    }
}
