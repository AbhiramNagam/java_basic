import java.util.Scanner;

public class matrixAddition {
    public static void main(String[] args){
        int [][]arr1;
        int [][] arr2;
        int [][] arr3;

        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the matrix : ");
        n=sc.nextInt();
        arr1= new int [n][n];
        arr2= new int[n][n];
        arr3= new int[n][n];

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
              arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix : ");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr2[i][j]=sc.nextInt();
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
            }
    }
}
