public class jaggedArray {
    public static void main(String[] Args){
        int [][] Arr;
        Arr=new int[3][0];
        Arr[0]=new int[1];
        Arr[1]=new int[2];
        Arr[2]=new int[3];

        for (int i=0;i<3;i++)
            for (int j=0;j<=i;j++)
                Arr[i][j]=i*j +1;

        for (int i=0;i<3;i++){
            for (int j=0;j<=i;j++){
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
