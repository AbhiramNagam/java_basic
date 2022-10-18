 import java.util.*;
class p6
{
public static void main(String args[])
{
//a=5,b=0;
Scanner sc =new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
double c;

try{
	c=a/b;
dou ble var=(double) b;
c=a/var;

	System.out.println(c);
}
catch(Exception e){
	System.out.println(" division with 0 is not possible");
}
}
}
