package leetcodeprob;

public class FindTheDifference {
    public static void main(String[] args) {
        String t="y";
        String s="";
        

        int result=0;
                 for(int i=0;i<t.length();i++) {
            result=result+t.toCharArray()[i];
        }

        for(int j=0;j<s.length();j++) {
            result=result-s.toCharArray()[j];
        }

        char ele = (char) result;
        System.out.println("Added character: " + ele);
    }
}
