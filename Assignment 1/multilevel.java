class animal{

	public void eat(){
		System.out.println("Eating");
	}

}
class dog extends animal{

	public void bark(){
		System.out.println("Barking");
	}

}
class cat extends dog{

	public void fight(){
		System.out.println("Fighting");
	}

}
public class multilevel{
	public static void main(String[] args){
		cat d=new cat();
		d.eat();
		d.bark();
		d.fight();
	}
}