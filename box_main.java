class Box{
    double width,height,depth;

    Box(){ width=height=depth=10;}

    Box(double x){width=height=depth=x;}

    Box(double x,double y,double z){
        width=x;
        height=y;
        depth=z;
    }

    double volume(){
        return width*height*depth;
    }
}

public class box_main {
    public static void main(String[] args){
        Box var=new Box();
        System.out.println(var.width);
    }
}
