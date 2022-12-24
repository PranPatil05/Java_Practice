package ExceptionHandling;

public class TryCatchDemo {
    public static void main(String[] args) {
//        trycatch();
//        trycatchMultiple();
        trycatchfinallydepedancy();




    }
    public static void trycatch(){
        int a=20;
        try {
            int j=a/0;
        }
        catch (Exception e){
            System.out.println("Method to Display Exception Information");
//            e.printStackTrace();
            System.out.println(e.getStackTrace());
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println("Can not divide by zero");
        }
        finally {
            System.out.println("\nAlways Execute Finally");
        }

        System.out.println("\nOut of tryCatch.....");
    }

    public static void trycatchMultiple(){

        int a=20;

        try {
            //Case 1- ArithmeticException
//            int res=a/0;

            //Case 2 - NullPointerException
//            String s=null;
//            System.out.println(s.length());

            //Case 3 - Exception
            int d[]=new int[4];
            d[5]=10;
        }
        //Shows Alredy ArithmeticException and NullPointerException is Caught
//        catch (Exception e){
//            System.out.println("Inside Exception");
//        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Inside ArithmeticException");
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println("Inside NullPointerException");
        }
        catch (Exception e){
            System.out.println("Inside Exception");
        }
        finally {
            System.out.println("Inside Finally");
        }
        System.out.println("Outside Try Catch Finally");
        System.out.println("\nNotes : In the case of try with multiple catch blocks the order of catch blocks is important. And it should be from \n" +
                "child to parent other wise Compiler Error. Saying Exception xxx has already been caught");
    }

    public static void trycatchfinallydepedancy(){
        int a=20;
        try {
            int res=a/0;
        }
        finally {
            System.out.println("Inside Finally");
        }
        System.out.println("\nNotes: Possible Combinations \n1.try....catch \n2.try....finally \ntry....catch...finally");
    }
}
