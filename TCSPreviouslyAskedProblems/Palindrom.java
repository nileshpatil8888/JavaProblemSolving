package TCSPreviouslyAskedProblems;

public class Palindrom {

    public void pali(String s){

        String reversed ="";
        for(int i=s.length() -1; i >=0; i--){
            reversed += s.charAt(i);
        }

        if(reversed.equals(s)){
            System.out.println("it is palindrome");
        } else {
            System.out.println("Not Plaindrome");
        }
    }
}

class run6 {
    public static void main(String[] args) {
        Palindrom palindrom = new Palindrom();
        palindrom.pali("Nilesh");
    }
}