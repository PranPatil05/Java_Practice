package ExceptionHandling.throwandthrowsDemo;

public class throwsExceptionDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("Inside Main Method");
        try {
            child1();
        }
        catch (ArithmeticException e){
            System.out.println("Inside Catch Block");
        }

        System.out.println("Inside Main Method after");

    }
    public static void child1() throws ArithmeticException{
        System.out.println("Inside child 1");
        child2();
    }

    public static void child2() throws ArithmeticException{
        System.out.println("Inside child 2");
        int a=20;
        int res=a/0;
        System.out.println("Ater Excetion");
    }
}
