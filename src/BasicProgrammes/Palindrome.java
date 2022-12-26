package BasicProgrammes;

public class Palindrome {
    public static void main(String[] args) {
        boolean res=isPalindrome("Anuj");
        System.out.println("Is Palindrome ="+res);

        boolean res1=isPalindromStringBuffer("ABBA");
        System.out.println("Is Palindrom StringBuffer ="+res1);



    }
    public static boolean isPalindrome(String inp){
        String input=inp;
        char[] cha=inp.toCharArray();
        char[] reccha=new char[cha.length];
        int i=0;


        for (int j=cha.length-1;j>=0;j--){
            reccha[i]=cha[j];
            i++;
        }

        String rev=new String(reccha);

        System.out.println("String ="+input);
        System.out.println("Reverse String ="+rev);

        if(input.equals(rev)){
            return true;
        }
        else return false;

    }

    public static boolean isPalindromStringBuffer(String inp){
        String str=inp;
        StringBuffer input=new StringBuffer(inp);
        StringBuffer revString=input.reverse();

        String rev=new String(revString);
        System.out.println("String ="+str);
        System.out.println("RevString ="+rev);

        if(str.equals(rev)){
            return true;
        }
        else return false;
    }
}
