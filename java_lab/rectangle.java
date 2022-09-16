import java.util.*;
class Rect_{
	int length,breadth;
	public void setData(int l,int b){
	this.length=l;
	this.breadth=b;
	}
	public int getPerimeter(){
		return 2*(this.length + this.breadth);
	}
	public int getArea(){
		return this.length * this.breadth;
	}

}
public class rectangle{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle : ");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		if(length==0 || breadth==0 || length<0 || breadth<0){
			System.out.println("Given dimensions doesn't form a rectangle");
			return;
		}

		if(length<0)
			length*=-1;
		else if(breadth<0)
			breadth*=-1;
		
		Rect_ r= new Rect_();
		r.setData(length,breadth);
		int perimeter=r.getPerimeter();
		int area=r.getArea();
		System.out.println("Perimeter of Rectangle = "+perimeter);
		System.out.println("Area of Rectangle = " +area);
	}
}
