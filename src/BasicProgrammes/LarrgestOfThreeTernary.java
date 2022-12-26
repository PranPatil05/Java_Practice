package BasicProgrammes;

public class LarrgestOfThreeTernary {
    public static void main(String[] args) {
        int i1=10;
        int i2=30;
        int i3=40;

        int max1=(i1>i2)?i1:i2;
        int max=(max1>i3)?max1:i3;
        System.out.println(max);
    }
}
