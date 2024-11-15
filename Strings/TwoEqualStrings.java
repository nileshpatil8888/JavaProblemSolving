package Strings;

public class TwoEqualStrings {

    public void Equals(){
        String str = "Nilesh";
        String str1 = "NILESH";
        String str2 = "NILESH";

        if (str.equalsIgnoreCase(str1)){
            System.out.println("equal string");
        } else if (str1.equals(str2)){
            System.out.println("equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
