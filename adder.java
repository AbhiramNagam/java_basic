import java.util.Scanner;

class Arithmetic{
    int add(int a,int b){
        return a+b;
    }
}
class Adder extends Arithmetic{
    double add(double a,double b){
        return a+b;
    }

    String add(String a,String b){
        return a+b;
    }

}
public class adder{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Adder a=new Adder();
        System.out.println("Parent class is : "+a.getClass().getSuperclass().getName());

        System.out.print("Enter two Strings to sum : ");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        System.out.println("The sum of "+n1+ " and "+n2+" is "+a.add(n1,n2));

        System.out.print("Enter two Strings to concatenate : ");
        String n1_str= sc.next();
        String n2_str= sc.next();
        System.out.println("The concatenation of "+n1_str+ " and "+n2_str+" is "+a.add(n1_str,n2_str));

        System.out.println("Enter two decimals to sum :  ");
        double n1_double=sc.nextDouble();
        double n2_double=sc.nextDouble();
        System.out.println("The sum of "+n1_double+ " and "+n2_double+" is "+a.add(n1_double,n2_double));

    }
}
