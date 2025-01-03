package TCSPreviouslyAskedProblems;

public class ReverseString {

    //String = "Nilesh" o/p= hseliN

    public String reverse(String s){
        String reversed = "";   //this initialization store the reversed version of string.
        for(int i=s.length()-1; i >= 0; i--){  //Loop to traverse through characters, so this loops starts from last untill it reaches to first.
            var str = s.charAt(i); //here we use charAt(i) to get the character at the current position of i.
            reversed += str; //concatenate to form the string.
        }
        return reversed;
    }

    //using recursion
    public String reversed(String s){
        if(s.isEmpty()){
            return s;
        }
        return reversed(s.substring(1)) + s.charAt(0);
    }
}

class run {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse("Nilesh"));
        System.out.println(reverseString.reversed("Nilesh"));
    }
}