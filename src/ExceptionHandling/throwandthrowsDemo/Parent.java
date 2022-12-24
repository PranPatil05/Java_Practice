package ExceptionHandling.throwandthrowsDemo;

import java.security.PublicKey;

public class Parent {

    public int method4() throws Exception{
        System.out.println("Inside int method of Parent");
        int a=20;
        int res=a/0;
        return res;
//        return 0;
    }


}
