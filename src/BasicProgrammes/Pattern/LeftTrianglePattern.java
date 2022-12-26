package BasicProgrammes.Pattern;

public class LeftTrianglePattern {
    public static void main(String[] args) {
        int row=4;

        for (int i=0;i<row;i++){
//            System.out.println("i = "+i);
            for (int j=(row-(i+1));j>=1;j--){
                System.out.print(" ");
//                System.out.println("j ="+j);
            }
            for (int k=0;k<=i;k++){
                System.out.print("*");
//                System.out.println("k ="+k);
            }
            System.out.println();
        }
    }
}
