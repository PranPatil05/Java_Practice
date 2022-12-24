package ExceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a=20;
//        System.out.println(a/0); //ArithmeticException- RuntimeExcepion

        String s=null;

//        System.out.println(s.length()); //NullPointerException

        String st="123a5";
//        int i=Integer.parseInt(st); //NumberFormatException

        int b[]=new int[5];
//        b[10]=100; //ArrayIndexOutOfBoundsException

    }
}
