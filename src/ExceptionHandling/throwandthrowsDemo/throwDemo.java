package ExceptionHandling.throwandthrowsDemo;

public class throwDemo extends Exception {
    public static void main(String[] args) throws Myexception {
        int a=20;
        try{
            int res=a/0;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
//            throw e;
//            throw new ArithmeticException("Arithamatic Exception");
            throw new Myexception();
        }
    }


}

class Myexception extends Exception{
    @Override
    public String toString() {
        return "This is an Exception in MyException of toString()";
    }
}
