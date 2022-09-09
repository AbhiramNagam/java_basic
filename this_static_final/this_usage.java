class A{
    int a,b,c;
    void setA(int a, int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void display(){
        System.out.println("a : "+a + "\nb : "+b + "\nc : "+c);
    }
}

public class this_usage {
    public static void main(String[] args){
        A a= new A();
        a.setA(10,20,30);
        a.display();
    }
}
