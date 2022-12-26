package BasicProgrammes;

public class FibonisisSeries {
    public static void main(String[] args) {
        int i1=0;
        int i2=1;

        int count=12;
        System.out.println(i1);
        System.out.println(i2);

        for (int j=1;j<=count;j++){
            int k=i1+i2;
            System.out.println(k);
            i1=i2;
            i2=k;
        }
    }
}
