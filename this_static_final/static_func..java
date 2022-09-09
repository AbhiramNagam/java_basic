class c{
    static int a=40;
    int b;
    c(int x){
        this.b=x;
    }
    public static void display1(){
        System.out.println("First display");
        System.out.println("Static a:"+a);
        display2();
    }
    public static void display2(){
        System.out.println("Second display");
    }
    public void display3(){
        System.out.println("Third display");
        System.out.println("Class variable b : "+b);
    }
}

public class static_func {
    public static void main(String[] args){
        c c1= new c(100);
        c.display1();
        c.display2();
        c1.display3();
    }
}

//     ========= OUTPUT ===========
//        First display
//        Static a:40
//        Second display
//        Second display
//        Third display
//        Class variable b : 100

