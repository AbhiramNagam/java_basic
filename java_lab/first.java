import java.util.Scanner;
public class first {
    public static void first_menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the following : \n" +
                "a : Know my balance\n" +
                "b : Know my validity date\n" +
                "c : Know number of free calls available\n" +
                "d : More\n" +
                "e : To Exit" );
        System.out.print("Enter your preference : ");
        String s;
        char ch;
        s=sc.nextLine();
        ch=s.charAt(0);
        if (ch=='a'){
            System.out.println("------------------------------");
            System.out.println("Your balance is XXXXXX");
            System.out.println("------------------------------");
            first_menu();
        }
        else if(ch=='b'){
            System.out.println("------------------------------");
            System.out.println("Your validity date is XX-XX-XXXX");
            System.out.println("------------------------------");
            first_menu();
        }
        else if(ch=='c'){
            System.out.println("------------------------------");
            System.out.println("You have X number of free calls available");
            System.out.println("------------------------------");
            first_menu();
        }
        else if(ch=='d'){
            System.out.println("------------------------------");
            more_menu();
        }
        else if(ch=='e'){
            return;
        }
        else{
            System.out.print("-----ENTER A VALID INPUT-----\n");
            more_menu();
        }

    }
    public static void more_menu(){
        System.out.println("Choose the following : \n" +
                "1 : Prepaid Bill Request\n" +
                "2 : Customer Preferences\n" +
                "3 : GPRS Activation\n" +
                "4 : Special Message Offers\n" +
                "5 : Special GPRS Offers\n" +
                "6 : 3G Activation\n" +
                "7 : To exit\n" +
                "0 : Go Back to Previus menu");
        System.out.print("Enter your preference : ");

        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        char ch;
        ch=s.charAt(0);
        if(ch=='1'){
            System.out.println("------------------------------");
            System.out.println("Pre paid Bill Request : Service Unavailable");
            System.out.println("------------------------------");
            more_menu();
        }
        else if(ch=='2'){
            System.out.println("------------------------------");
            System.out.println("Customer prefereces : ");
            System.out.println("------------------------------");
            more_menu();
        }
        else if(ch=='3'){
            System.out.println("------------------------------");
            System.out.println("GPRS Activation ");
            System.out.println("------------------------------");
            more_menu();
        }
        else if(ch=='4'){
            System.out.println("------------------------------");
            System.out.println("Visit our website for Special Message Offers ");
            System.out.println("------------------------------");
            more_menu();
        }
        else if(ch=='5'){
            System.out.println("------------------------------");
            System.out.println("Visit our webstie to access special GPRS Offers ");
            System.out.println("------------------------------");
            more_menu();
        }
        else if(ch=='6'){
            System.out.println("------------------------------");
            System.out.println(" we are temporarily not accepting 3G Activation requests");
            System.out.println("------------------------------");
            more_menu();
        }
        else if(ch=='7'){
            return;
        }
        else if(ch=='0'){
            first_menu();
        }
        else{
            System.out.print("Enter a valid input : ");
            more_menu();
        }

    }
    public static void main(String[] args){
        System.out.println("#####   WELCOME TO POWERED AIR SERVICES   #####");
        first_menu();
    }
}
