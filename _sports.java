class Sports{
    String getName(){
        return "Tennis";
    }
    int getNumberOfPlayers(){
        return 2;
    }
}
class Soccer extends Sports{
    String getName(){
        return "Soccer";
    }
    int getNumberOfPlayers(){
        return 20;
    }
}
public class _sports{
    public static void main(String[] args){
        Soccer s1=new Soccer();
        Object o1 = new Object();
        o1=s1;
        System.out.println(s1.getName());
        System.out.println(s1.getNumberOfPlayers());

        System.out.println("The class running is "+o1.getClass());
        System.out.println("The parent class running is "+o1.getClass().getSuperclass());
        System.out.println("The string of class running is "+o1.toString());
        System.out.println("The hashcode of class running is "+o1.hashCode());

    }
}
