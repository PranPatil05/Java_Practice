package BasicProgrammes;

import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] args) {
        System.out.println("Enter Integer = ");
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();

        double fact=1;

        for(int i=1;i<num;i++){
            fact=fact*(i+1);
        }

        System.out.println("Factorial of Given Number ="+fact);
    }
}
