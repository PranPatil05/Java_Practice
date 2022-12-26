package BasicProgrammes;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number =");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();

        int count=0;

        for(int j=1;j<=i;j++){
            if(i%j ==0){
                count=count+1;
            }
        }
        System.out.println("Count ="+count);

        if (count==2){
            System.out.println("Number "+i+" is Prime");
        }
        else System.out.println("Number "+i+" is not Prime");
    }
}
