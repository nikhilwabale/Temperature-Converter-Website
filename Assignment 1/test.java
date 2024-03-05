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

	public void bark(){
		System.out.println("dancing");
	}

}
public class multilevel{
	public static void main(String[] args){
		dog d=new dog();
		d.eat();
		d.bark();
	}
}