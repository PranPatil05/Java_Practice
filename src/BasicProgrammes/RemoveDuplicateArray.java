package BasicProgrammes;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        char[] ch={'a','b','c','d','a','e','b'};

        for (int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    ch=RemoveDuplicate(ch,j);
                }
            }
        }
        for (int i=0;i< ch.length;i++){
            System.out.println(ch[i]);
        }
    }

    public static char[] RemoveDuplicate(char[]arr,int index){
        if (arr == null || index < 0 || index >= arr.length) {

            return arr;
        }
        char[] arrnew=new char[arr.length-1];
        int k=0;
        for (int i=0;i< arr.length;i++){
            if(i==index){
                continue;
            }
            arrnew[k++]=arr[i];
        }
        return arrnew;
    }
}
