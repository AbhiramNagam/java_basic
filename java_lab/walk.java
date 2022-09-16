class Animal{
	public void walkingAbility(){
		System.out.println("Can Walk");
	}
}
class bird extends Animal{
	public void flyingAbility(){
		System.out.println("Can Fly");
	}
}


public class walk{
	public static void main(String[] args){
		bird b=new bird();
		b.flyingAbility();
		b.walkingAbility();
	}
}
