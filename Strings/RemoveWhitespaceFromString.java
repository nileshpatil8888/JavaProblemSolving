package Strings;

public class RemoveWhitespaceFromString {

    public void removeWhiteSpace(){
        String str = "Nil esh";
        var replaceWhiteSpace = str.replaceAll("\\s","");
        System.out.println("old:" + str);
        System.out.println(replaceWhiteSpace);
    }
}
