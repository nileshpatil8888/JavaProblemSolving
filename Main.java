import LeetCode.Array.*;
import LeetCode.Array.String.FirstUniqueChar;
import LeetCode.Array.String.ReverseInteger;
import LeetCode.Array.String.ReversedString;
import Strings.ConvertStringtoUppercase;
import Strings.RemoveWhitespaceFromString;
import Strings.TwoEqualStrings;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.hello());
        System.out.println("-----------------------------------ConvertStringToUppercase--------------------------------------------------------------");
        ConvertStringtoUppercase convertStringtoUppercase = new ConvertStringtoUppercase();
        System.out.println(convertStringtoUppercase.convert());
        RemoveWhitespaceFromString removeWhitespaceFromString = new RemoveWhitespaceFromString();
        removeWhitespaceFromString.removeWhiteSpace();
        System.out.println("---------------------------------------------TwoEqualStrings----------------------------------------------------");
        TwoEqualStrings twoEqualStrings = new TwoEqualStrings();
        twoEqualStrings.Equals();
        System.out.println("------------------------------------------RemoveDuplicatesFromSortedArray-------------------------------------------------------");
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int[] nums = {1,1,1,2,3,4,4,4,4,5,5,5,7,8,9};
        var element = removeDuplicatesFromSortedArray.removeDuplicates(nums);
        System.out.println(element);
        System.out.println("----------------------------------------------TwoSum---------------------------------------------------");
        TwoSum twoSum = new TwoSum();
        int[] num = {2,7,11,15};
        var A = twoSum.twoSum(num, 9);
        System.out.println(A);
        System.out.println("-----------------------------------------------ContainsDuplicate--------------------------------------------------");
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] num1 = {2,2,2,1};
        var c = containsDuplicate.containsDuplicate(num1);
        System.out.println(c);
        System.out.println("------------------------------------------SingleNumber-------------------------------------------------------");
        SingleNumber singleNumber = new SingleNumber();
        int[] num2 = {4,1,2,1,2};
        var d =  singleNumber.singleNumber(num2);
        System.out.println(d);
        System.out.println("-----------------------------------------PlusOne--------------------------------------------------------");
        PlusOne plusOne = new PlusOne();
        int[] num3 = {4,1,2,1,2};
        int[] plusone = plusOne.plusOne(num3);
        System.out.println(Arrays.toString(plusone));
        System.out.println("---------------------------------------MoveZeros moveZeros----------------------------------------------------------");
        MoveZeros moveZeros = new MoveZeros();
        int[] num4 = {0,1,0,0,3,12,0,1,0,0,3,120,1,0,0,3,12};
        moveZeros.moveZeroes(num4);
        System.out.println("--------------------------------------------ReverseNumberOfArray-----------------------------------------------------");
        ReverseNumberOfArray reverseNumberOfArray = new ReverseNumberOfArray();
        int[] num5 = {1,2,3,4};
        int[] reversedArray = reverseNumberOfArray.reverse(num5);
        System.out.print("Reversed array: ");
        for (int num6 : reversedArray) {
            System.out.print(num6 + " ");
        }
        System.out.println("---------------------------------------ReversedString----------------------------------------------------------");
        ReversedString reversedString = new ReversedString();
        var rev = reversedString.reverseString("Nilesh");
        System.out.println("ReversedNumberString :" + rev);
        reversedString.reverseStringUsingBuilder("Mayur");

        System.out.println("-------------------------------------------------------------------------------------------------");
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        int[] number1 = {1,2,2,1};
        int[] number2 = {2,2};
        intersectionOfTwoArrays.intersect(number1, number2);

        System.out.println("------------------------------------------------------------ReversedInteger------------------------------------------------------------");
        ReverseInteger reverseInteger = new ReverseInteger();
        var integer = reverseInteger.reverse(123);
        System.out.println(integer);
        System.out.println("------------------------------------------------------------firstUniqueChar------------------------------------------------------------");
        FirstUniqueChar firstUniqueChar = new FirstUniqueChar();
        var A1 = firstUniqueChar.firstUniqChar("loveleetcode");
        System.out.println(A1);
    }
}
