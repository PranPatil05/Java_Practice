package ExceptionHandling.CustomizeException;

public class CustomizationExceptionDemo {
    public static void main(String[] args) throws InvalidAgeException {
        //Case 1 -
//        isValidAge(17);

        //Case 2 -
        try{
            isValidAge(16);
        }
        catch (InvalidAgeException e){

            System.out.println("Age should be greater than 18");
        }

    }

    public static void isValidAge(int age) throws InvalidAgeException {
        if (age<18){
            throw new InvalidAgeException();
        }
        else{
            System.out.println("Age is valid");
        }
    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(){
        super("Age is Invalid");
    }

}
