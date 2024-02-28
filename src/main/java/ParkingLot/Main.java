package ParkingLot;

public class Main {
    static void getPalindrome(int startIndex, int endIndex, String s){

        while(startIndex<endIndex){
            if(isPalindrome(startIndex,endIndex,s)){
               // System.out.println("Substring");
                System.out.println(s.substring(startIndex,endIndex+1));
            }

            startIndex++;
            endIndex--;
        }

    }

    static boolean isPalindrome(int startIndex, int endIndex, String s){
        // System.out.println(startIndex);
        // System.out.println(endIndex);
        while(startIndex<endIndex){
//            System.out.println("startIndex : " + s.charAt(startIndex));
//            System.out.println("last : " + s.charAt(endIndex));
            if(s.charAt(startIndex)!=s.charAt(endIndex))
                return false;
            startIndex++;
            endIndex--;
        }
//        System.out.println("returning true");
        return true;
    }


    public static void main(String[] args) {
        String s = "abcababaa";
        getPalindrome(0,s.length()-1,"abcababaa");


    }
}
