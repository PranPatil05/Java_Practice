package ExceptionHandling.throwandthrowsDemo;

public class Child extends Parent {


    public int method4() throws ArithmeticException{
        System.out.println("Inside int child method4");
//        int a=20;
//        int res=a/0;
//        return res;
        return 0;
        // Primitve Data type should be same for both parent and child
    }

    public static void main(String[] args) throws Exception {
//        Parent par=new Child();
//        par.method4();

        Parent pa=new Parent();
        pa.method4();
    }



}
