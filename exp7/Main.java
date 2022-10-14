package exp7;
abstract class shape
{
    void noofsides()
    {

    }
}
class trapezoid extends shape
{
    void noofsides()
    {
        System.out.println("The no of sides is 4");
    }
}
class triangle extends shape
{
    void noofsides()
    {
        System.out.println("The no of sides is 3");
    }
}
class hexagon extends shape
{
    void noofsides()
    {
        System.out.println("The no of sides is 6");
    }
}
public class Main {
    public static void main(String args[])
    {
        trapezoid t = new trapezoid();
        t.noofsides();
        triangle t1 = new triangle();
        t1.noofsides();
        hexagon h = new hexagon();
        h.noofsides();
    }
}
