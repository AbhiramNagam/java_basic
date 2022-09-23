import java.util.Scanner;
import java.util.StringTokenizer;

public class usingStringTokenizer {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int sum=0,n;
        System.out.println("Enter space separated input of numbers : ");
        String s= sc.nextLine();
        StringTokenizer st= new StringTokenizer(s," ");
        while (st.hasMoreTokens()){
            String temp=st.nextToken();
            n=Integer.parseInt(temp);
            System.out.println(n);
            sum+=n;
        }
        System.out.println("The sum of integers is : "+sum);
        sc.close();
    }
}
