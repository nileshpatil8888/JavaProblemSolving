package TCSPreviouslyAskedProblems;

public class FindTheMissingNumber {

    public int missingNumber(){
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int total = 0;
        for(int i=0; i <=8; i++){
            total += i;
        }

        int sum =0;
        for(int num : arr){
            sum += num;
        }

        return total - sum;
    }
}

class run1 {
    public static void main(String[] args) {
        FindTheMissingNumber findTheMissingNumber =new FindTheMissingNumber();
        System.out.println(findTheMissingNumber.missingNumber());

    }
}