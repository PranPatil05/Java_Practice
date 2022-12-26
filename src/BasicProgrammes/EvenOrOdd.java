package BasicProgrammes;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();

        if(i%2==0){
            System.out.println("Number "+i+" is even");
        }
        else System.out.println("Number "+i+" is Odd");
    }
}
