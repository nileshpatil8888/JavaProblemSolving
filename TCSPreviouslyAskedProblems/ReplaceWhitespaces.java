package TCSPreviouslyAskedProblems;

public class ReplaceWhitespaces {

    public void replace(String str){
        var A = str.replace(" ","");
        System.out.println(A);
    }

    public void replaceUsingFor(String str){

        String removed = "";
        for(int i=0; i<str.length(); i++){
            char character = str.charAt(i);
            if(character != ' '){
                removed += character;
            }
        }
        System.out.println(removed);
    }
}
