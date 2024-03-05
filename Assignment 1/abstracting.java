abstract class animal{
	abstract void eat();

}

class dog extends animal{
	void eat(){
		System.out.println("eating");
	}

}

public class abstracting{
	public static void main(String[] args){
		dog d= new dog();

	 	d.eat();

		
	}
}